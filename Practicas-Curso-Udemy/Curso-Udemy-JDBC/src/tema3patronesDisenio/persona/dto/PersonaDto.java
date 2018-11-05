/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3patronesDisenio.persona.dto;

import java.io.Serializable;

/**
 *
 * @author pablo
 */
public class PersonaDto implements Serializable{
    private int midPersona;
    private String mNombre;
    private String mApellido;

    public PersonaDto() {
    }

    public PersonaDto(int midPersona, String mNombre, String mApellido) {
        this.midPersona = midPersona;
        this.mNombre = mNombre;
        this.mApellido = mApellido;
    }

    public PersonaDto(int midPersona) {
        this.midPersona = midPersona;
    }

    public int getMidPersona() {
        return midPersona;
    }

    public void setMidPersona(int midPersona) {
        this.midPersona = midPersona;
    }

    public String getmNombre() {
        return mNombre;
    }

    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    public String getmApellido() {
        return mApellido;
    }

    public void setmApellido(String mApellido) {
        this.mApellido = mApellido;
    }

    @Override
    public String toString() {
        return "PersonaDto{" + "midPersona=" + midPersona + ", mNombre=" + mNombre + ", mApellido=" + mApellido + '}';
    }
    
    
}
