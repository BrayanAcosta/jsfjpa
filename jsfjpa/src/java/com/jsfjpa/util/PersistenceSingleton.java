/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;



/**
 *
 * @author Brayan
 */
public class PersistenceSingleton {
    
    private static EntityManager entityManager;
    private static final String nameUnit = "jsfjpaPU";
    
    public static EntityManager getInstance(){
        if(entityManager == null){
            entityManager = Persistence.createEntityManagerFactory(nameUnit).createEntityManager();
        }
        return entityManager;
    }
   
    
}
