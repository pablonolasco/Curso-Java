/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3patronesDisenio.laboratorioFinal.dto;

import java.io.Serializable;

/**
 *
 * @author pablo
 */
public class UsuarioDTO implements Serializable{
    private int mIdUsuario;
    private String mUsuario;
  private String mPassword;
    public UsuarioDTO() {
    }

    public UsuarioDTO(int mIdUsuario) {
        this.mIdUsuario = mIdUsuario;
    }
    
    

    public UsuarioDTO(int mIdUsuario, String mUsuario, String mPassword) {
        this.mIdUsuario = mIdUsuario;
        this.mUsuario = mUsuario;
        this.mPassword = mPassword;
    }

    
    public int getmIdUsuario() {
        return mIdUsuario;
    }

    public void setmIdUsuario(int mIdUsuario) {
        this.mIdUsuario = mIdUsuario;
    }

    public String getmUsuario() {
        return mUsuario;
    }

    public void setmUsuario(String mUsuario) {
        this.mUsuario = mUsuario;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }
  

    @Override
    public String toString() {
        return "Usuario{" + "mIdUsuario=" + mIdUsuario + ", mUsuario=" + mUsuario + ", mPassword=" + mPassword + '}';
    }
    
    
}
