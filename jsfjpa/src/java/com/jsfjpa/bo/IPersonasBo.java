/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.bo;

import com.jsfjpa.bean.PersonaBean;


/**
 *
 * @author Brayan
 */
public interface IPersonasBo {

    void save(PersonaBean bean) throws Exception;

    void list(PersonaBean bean) throws Exception;

    void find(PersonaBean bean) throws Exception;

    void update(PersonaBean bean) throws Exception;

}
