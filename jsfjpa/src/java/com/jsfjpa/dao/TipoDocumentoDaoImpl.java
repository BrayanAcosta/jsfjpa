/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.dao;

import com.jsfjpa.model.TiposDocumento;
import com.jsfjpa.util.PersistenceSingleton;
import java.util.List;
import javax.persistence.Query;


public class TipoDocumentoDaoImpl implements ITipoDocumentoDao {

    @Override
    public List<TiposDocumento> listar() throws Exception {
        Query query = PersistenceSingleton.getInstance().createQuery("select t from TiposDocumento t",TiposDocumento.class);
        return query.getResultList();
    }
    
}
