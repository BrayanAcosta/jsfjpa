/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Brayan
 */
@Entity
@Table(name = "personas")
@XmlRootElement
public class Personas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PER_ID")
    private Integer perId;
    @Size(max = 45)
    @Column(name = "PER_PRIMER_NOMBRE")
    private String perPrimerNombre;
    @Size(max = 45)
    @Column(name = "PER_SEGUNDO_NOMBRE")
    private String perSegundoNombre;
    @Size(max = 45)
    @Column(name = "PER_PRIMER_APELLIDO")
    private String perPrimerApellido;
    @Size(max = 45)
    @Column(name = "PER_SEGUNDO_APELLIDO")
    private String perSegundoApellido;
    @Size(max = 150)
    @Column(name = "PER_CORREO")
    private String perCorreo;
    @Size(max = 100)
    @Column(name = "PER_DIRECCION")
    private String perDireccion;
    @Size(max = 45)
    @Column(name = "PER_TELEFONO")
    private String perTelefono;
    @Size(max = 45)
    @Column(name = "PER_DOCUMENTO")
    private String perDocumento;
    @JoinColumn(name = "TIP_ID", referencedColumnName = "TIP_ID")
    @ManyToOne
    private TiposDocumento tipId;

    public Personas() {
    }

    public Personas(Integer perId) {
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

    public TiposDocumento getTipId() {
        return tipId;
    }

    public void setTipId(TiposDocumento tipId) {
        this.tipId = tipId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perId != null ? perId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.perId == null && other.perId != null) || (this.perId != null && !this.perId.equals(other.perId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jsfjpa.model.Personas[ perId=" + perId + " ]";
    }
    
}
