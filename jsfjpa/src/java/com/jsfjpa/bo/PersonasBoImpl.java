/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.bo;

import com.jsfjpa.bean.PersonaBean;
import com.jsfjpa.bean.dto.PersonaDto;
import com.jsfjpa.bean.dto.TipoDocumentoDto;
import com.jsfjpa.dao.IPersonaDao;
import com.jsfjpa.dao.ITipoDocumentoDao;
import com.jsfjpa.dao.PersonaDaoImpl;
import com.jsfjpa.dao.TipoDocumentoDaoImpl;
import com.jsfjpa.mapper.PersonaMapper;
import com.jsfjpa.mapper.TipoDocumentoMapper;
import com.jsfjpa.model.Personas;
import com.jsfjpa.util.PersistenceSingleton;
import java.util.List;
import java.util.stream.Collectors;
import javax.faces.context.FacesContext;

public class PersonasBoImpl implements IPersonasBo {
    
    private IPersonaDao personaDao = new PersonaDaoImpl();
    private ITipoDocumentoDao tipoDocumentoDao = new TipoDocumentoDaoImpl();
    
    @Override
    public void save(PersonaBean bean) throws Exception {
        try {
            
            Personas persona = PersonaMapper.to(bean.getPersonaAdd());
            
            PersistenceSingleton.getInstance().getTransaction().begin();
            
            //validar la existencia de un registro similar
            Personas personas = getPersonaDao().findByDocAndEmail(persona.getTipId(), bean.getPersonaAdd().getPerDocumento(), bean.getPersonaAdd().getPerCorreo());
            if(personas != null){
                bean.messagge("Documento o correo existente");
                return;
            }
            
            //registrar persona
            getPersonaDao().save(persona);
            PersistenceSingleton.getInstance().getTransaction().commit();
            bean.redireccion(FacesContext.getCurrentInstance().getExternalContext().getApplicationContextPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void list(PersonaBean bean) throws Exception {
        try {
            List<PersonaDto> lista = getPersonaDao().list()
                    .stream()
                    .map(obj -> PersonaMapper.to(obj))
                    .collect(Collectors.toList());
            
            List<TipoDocumentoDto> listaTipoDocumento = getTipoDocumentoDao().listar()
                    .stream()
                    .map(obj -> TipoDocumentoMapper.to(obj))
                    .collect(Collectors.toList());
            bean.setListaPersona(lista);
            bean.setListaTipoDocumento(listaTipoDocumento);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void find(PersonaBean bean) throws Exception {
        Personas personas = getPersonaDao().find(bean.getIdPerson());
        if (personas != null) {
            bean.setPersonaEdit(PersonaMapper.to(personas));
        } else {
            bean.setPersonaEdit(new PersonaDto());
            bean.getPersonaEdit().setTipId(new TipoDocumentoDto());
        }
    }
    
    @Override
    public void update(PersonaBean bean) throws Exception {
        PersistenceSingleton.getInstance().getTransaction().begin();
        getPersonaDao().update(PersonaMapper.to(bean.getPersonaEdit()));
        PersistenceSingleton.getInstance().getTransaction().commit();
        bean.redireccion(FacesContext.getCurrentInstance().getExternalContext().getApplicationContextPath());
    }
    
    public IPersonaDao getPersonaDao() {
        return personaDao;
    }
    
    public void setPersonaDao(IPersonaDao personaDao) {
        this.personaDao = personaDao;
    }
    
    public ITipoDocumentoDao getTipoDocumentoDao() {
        return tipoDocumentoDao;
    }
    
    public void setTipoDocumentoDao(ITipoDocumentoDao tipoDocumentoDao) {
        this.tipoDocumentoDao = tipoDocumentoDao;
    }
    
}
