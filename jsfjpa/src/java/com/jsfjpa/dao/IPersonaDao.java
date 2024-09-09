/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.dao;

import com.jsfjpa.model.Personas;
import com.jsfjpa.model.TiposDocumento;
import java.util.List;

/**
 *
 * @author Brayan
 */
public interface IPersonaDao {
    
    void save(Personas personas) throws Exception;
    
    List<Personas> list() throws Exception;
    
    Personas find(Integer id) throws Exception;
    
    Personas update(Personas personas) throws Exception;
    
    Personas findByDocAndEmail(TiposDocumento tip,String documento,String email) throws Exception;
}
