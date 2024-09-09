/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jsfjpa.dao;

import com.jsfjpa.model.TiposDocumento;
import java.util.List;

/**
 *
 * @author Brayan
 */
public interface ITipoDocumentoDao {

    List<TiposDocumento> listar() throws Exception;

}
