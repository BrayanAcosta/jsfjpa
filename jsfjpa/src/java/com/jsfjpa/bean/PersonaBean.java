package com.jsfjpa.bean;

import com.jsfjpa.bean.dto.PersonaDto;
import com.jsfjpa.bean.dto.TipoDocumentoDto;
import com.jsfjpa.bo.IPersonasBo;
import com.jsfjpa.bo.PersonasBoImpl;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Brayan
 */
@ViewScoped
@Named
public class PersonaBean implements Serializable{
    
    private IPersonasBo personaBo = new PersonasBoImpl();
    
    private List<PersonaDto> listaPersona = new ArrayList();
    private List<TipoDocumentoDto> listaTipoDocumento = new ArrayList();
    
    private Integer idPerson;
    
    private PersonaDto personaAdd = new PersonaDto();
    private PersonaDto personaEdit = new PersonaDto();
    
    @PostConstruct
    public void init() {
        try {
            Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
            if (!params.isEmpty()) {
                setIdPerson(Integer.valueOf(params.get("id")));
                getPersonaBo().find(this);
            }
            getPersonaBo().list(this);
            getPersonaAdd().setTipId(new TipoDocumentoDto());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Agregar Persona
    public void agregar() throws Exception {
        getPersonaBo().save(this);
    }

    //Actualizar
    public void actualizar() throws Exception {
        getPersonaBo().update(this);
    }

    //redireccionar
    public void redireccion(String text) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect(text);
    }
    
    //mostrar mensaje
    public void messagge(String text){
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR,text,"");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }
    
    public IPersonasBo getPersonaBo() {
        return personaBo;
    }
    
    public void setPersonaBo(IPersonasBo personaBo) {
        this.personaBo = personaBo;
    }
    
    public List<PersonaDto> getListaPersona() {
        return listaPersona;
    }
    
    public void setListaPersona(List<PersonaDto> listaPersona) {
        this.listaPersona = listaPersona;
    }
    
    public List<TipoDocumentoDto> getListaTipoDocumento() {
        return listaTipoDocumento;
    }
    
    public void setListaTipoDocumento(List<TipoDocumentoDto> listaTipoDocumento) {
        this.listaTipoDocumento = listaTipoDocumento;
    }
    
    public PersonaDto getPersonaAdd() {
        return personaAdd;
    }
    
    public void setPersonaAdd(PersonaDto personaAdd) {
        this.personaAdd = personaAdd;
    }
    
    public PersonaDto getPersonaEdit() {
        return personaEdit;
    }
    
    public void setPersonaEdit(PersonaDto personaEdit) {
        this.personaEdit = personaEdit;
    }
    
    public Integer getIdPerson() {
        return idPerson;
    }
    
    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }
    
}
