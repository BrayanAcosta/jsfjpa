/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.bean.dto;

/**
 *
 * @author Brayan
 */
public class TipoDocumentoDto {
 
     private String tipNombre;

    private static final long serialVersionUID = 1L;
    private Integer tipId;

    public TipoDocumentoDto() {
    }

    public TipoDocumentoDto(Integer tipId) {
        this.tipId = tipId;
    }

    public TipoDocumentoDto(String tipNombre, Integer tipId) {
        this.tipNombre = tipNombre;
        this.tipId = tipId;
    }
    
    

    public Integer getTipId() {
        return tipId;
    }

    public void setTipId(Integer tipId) {
        this.tipId = tipId;
    }

    public String getTipNombre() {
        return tipNombre;
    }

    public void setTipNombre(String tipNombre) {
        this.tipNombre = tipNombre;
    }

    
}
