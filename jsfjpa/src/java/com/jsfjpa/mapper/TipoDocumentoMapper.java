/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.mapper;

import com.jsfjpa.bean.dto.TipoDocumentoDto;
import com.jsfjpa.model.TiposDocumento;

/**
 *
 * @author Brayan
 */
public class TipoDocumentoMapper {

    public static TiposDocumento to(TipoDocumentoDto tipoDocumentoDto) {
        TiposDocumento tiposDocumento = new TiposDocumento();
        tiposDocumento.setTipId(tipoDocumentoDto.getTipId());
        tiposDocumento.setTipNombre(tipoDocumentoDto.getTipNombre());
        return tiposDocumento;
    }
    
    public static TipoDocumentoDto to(TiposDocumento tiposDocumento) {
        TipoDocumentoDto tipoDocumentoDto = new TipoDocumentoDto();
        tipoDocumentoDto.setTipId(tiposDocumento.getTipId());
        tipoDocumentoDto.setTipNombre(tiposDocumento.getTipNombre());
        return tipoDocumentoDto;
    }

}
