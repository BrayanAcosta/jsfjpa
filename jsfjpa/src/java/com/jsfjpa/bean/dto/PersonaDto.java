/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.bean.dto;

import java.io.Serializable;

/**
 *
 * @author Brayan
 */
public class PersonaDto implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String perPrimerNombre;
    private String perSegundoNombre;
    private String perPrimerApellido;
    private String perSegundoApellido;
    private String perCorreo;
    private String perDireccion;
    private String perTelefono;
    private String perDocumento;
    
    private Integer perId;
    private TipoDocumentoDto tipId;

    public PersonaDto() {
    }

    public PersonaDto(Integer perId) {
        this.perId = perId;
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getPerPrimerNombre() {
        return perPrimerNombre;
    }

    public void setPerPrimerNombre(String perPrimerNombre) {
        this.perPrimerNombre = perPrimerNombre;
    }

    public String getPerSegundoNombre() {
        return perSegundoNombre;
    }

    public void setPerSegundoNombre(String perSegundoNombre) {
        this.perSegundoNombre = perSegundoNombre;
    }

    public String getPerPrimerApellido() {
        return perPrimerApellido;
    }

    public void setPerPrimerApellido(String perPrimerApellido) {
        this.perPrimerApellido = perPrimerApellido;
    }

    public String getPerSegundoApellido() {
        return perSegundoApellido;
    }

    public void setPerSegundoApellido(String perSegundoApellido) {
        this.perSegundoApellido = perSegundoApellido;
    }

    public String getPerCorreo() {
        return perCorreo;
    }

    public void setPerCorreo(String perCorreo) {
        this.perCorreo = perCorreo;
    }

    public String getPerDireccion() {
        return perDireccion;
    }

    public void setPerDireccion(String perDireccion) {
        this.perDireccion = perDireccion;
    }

    public String getPerTelefono() {
        return perTelefono;
    }

    public void setPerTelefono(String perTelefono) {
        this.perTelefono = perTelefono;
    }

    public String getPerDocumento() {
        return perDocumento;
    }

    public void setPerDocumento(String perDocumento) {
        this.perDocumento = perDocumento;
    }

    public TipoDocumentoDto getTipId() {
        return tipId;
    }

    public void setTipId(TipoDocumentoDto tipId) {
        this.tipId = tipId;
    }
    
}
