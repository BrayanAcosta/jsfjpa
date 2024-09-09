/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.mapper;

import com.jsfjpa.bean.dto.PersonaDto;
import com.jsfjpa.bean.dto.TipoDocumentoDto;
import com.jsfjpa.model.Personas;
import com.jsfjpa.model.TiposDocumento;

/**
 *
 * @author Brayan
 */
public class PersonaMapper {
    
    public static Personas to(PersonaDto personaDto){
        Personas personas = new Personas();
        personas.setPerId(personaDto.getPerId());
        personas.setPerPrimerNombre(personaDto.getPerPrimerNombre());
        personas.setPerSegundoNombre(personaDto.getPerSegundoNombre());
        personas.setPerPrimerApellido(personaDto.getPerPrimerApellido());
        personas.setPerSegundoApellido(personaDto.getPerSegundoApellido());
        personas.setPerCorreo(personaDto.getPerCorreo());
        personas.setPerDireccion(personaDto.getPerDireccion());
        personas.setPerTelefono(personaDto.getPerTelefono());
        personas.setPerDocumento(personaDto.getPerDocumento());
        personas.setTipId(new TiposDocumento(personaDto.getTipId().getTipId(),personaDto.getTipId().getTipNombre()));
        return personas;
    }
    
     public static PersonaDto to(Personas personas){
        PersonaDto personaDto = new PersonaDto();
        personaDto.setPerId(personas.getPerId());
        personaDto.setPerPrimerNombre(personas.getPerPrimerNombre());
        personaDto.setPerSegundoNombre(personas.getPerSegundoNombre());
        personaDto.setPerPrimerApellido(personas.getPerPrimerApellido());
        personaDto.setPerSegundoApellido(personas.getPerSegundoApellido());
        personaDto.setPerCorreo(personas.getPerCorreo());
        personaDto.setPerDireccion(personas.getPerDireccion());
        personaDto.setPerTelefono(personas.getPerTelefono());
        personaDto.setPerDocumento(personas.getPerDocumento());
        personaDto.setTipId(new TipoDocumentoDto(personas.getTipId().getTipNombre(),personas.getTipId().getTipId()));
        return personaDto;
    }
    
}
