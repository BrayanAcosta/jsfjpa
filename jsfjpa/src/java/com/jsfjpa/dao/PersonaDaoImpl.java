/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.dao;

import com.jsfjpa.model.Personas;
import com.jsfjpa.model.TiposDocumento;
import com.jsfjpa.util.PersistenceSingleton;
import java.util.List;
import javax.persistence.Query;

public class PersonaDaoImpl implements IPersonaDao {

    @Override
    public void save(Personas personas) throws Exception {
        PersistenceSingleton.getInstance().persist(personas);
    }

    @Override
    public List<Personas> list() throws Exception {
        Query query = PersistenceSingleton.getInstance().createQuery("select p from Personas p",Personas.class);
        return query.getResultList();
    }

    @Override
    public Personas find(Integer id) throws Exception {
        return PersistenceSingleton.getInstance().find(Personas.class, id);
    }

    @Override
    public Personas update(Personas personas) throws Exception {
        return PersistenceSingleton.getInstance().merge(personas);
    }

    @Override
    public Personas findByDocAndEmail(TiposDocumento tip, String documento, String email) throws Exception {
        Query query = PersistenceSingleton.getInstance().createQuery("select p from Personas p where (p.tipId = :tip and p.perDocumento = :doc) or p.perCorreo = :corr",Personas.class);
        query.setParameter("tip", tip);
        query.setParameter("doc", documento);
        query.setParameter("corr", email);
        List<Personas> list = query.getResultList();
        return !list.isEmpty() ? list.get(0):null;
    }
    
}
