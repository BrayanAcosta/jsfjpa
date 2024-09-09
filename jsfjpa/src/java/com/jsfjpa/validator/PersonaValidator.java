/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsfjpa.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UISelectOne;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Brayan
 */
@FacesValidator("formPerson")
public class PersonaValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

        String message = "";

        if (component.getId().equals("tipDoc")) {
            if (value == null || value.equals("")) {
                message = "Ingrese el tipo de documento";
            }
        }

        if (component.getId().equals("doc")) {
            String valueString = (String) value;
            if (value == null || value.equals("")) {
                message = "Ingrese el documento";
            } else if (valueString.length() > 12) {
                message = "El documento solo puede tener 12 digitos";
            }
        }
        if (component.getId().equals("primNom")) {
            if (value == null || value.equals("")) {
                 message = "Ingrese el Primer nombre";
            }
        }
        if (component.getId().equals("segNom")) {
            if (value == null || value.equals("")) {
                message = "Ingrese el Segundo Nombre";
            }
        }
        if (component.getId().equals("primApe")) {
            if (value == null || value.equals("")) {
                message = "Ingrese el Primer Apellido";
            }
        }
        if (component.getId().equals("segApe")) {
            if (value == null || value.equals("")) {
                 message = "Ingrese el Segundo Apellido";
            }
        }
        
        if (component.getId().equals("emal")) {
            if (value == null || value.equals("")) {
                 message = "Ingrese el Correo";
            }
        }


        if (!message.isEmpty()) {
            FacesMessage mess = new FacesMessage(FacesMessage.SEVERITY_ERROR, message, "");
            throw new ValidatorException(mess);
        }

    }

}
