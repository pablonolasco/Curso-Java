/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3patronesDisenio.laboratorioFinal.test;

import java.sql.SQLException;
import java.util.List;
import tema3patronesDisenio.laboratorioFinal.dto.UsuarioDTO;
import tema3patronesDisenio.laboratorioFinal.jdbc.IUsuarioDAO;
import tema3patronesDisenio.laboratorioFinal.jdbc.UsuarioDaoJDBC;

/**
 *
 * @author pablo
 */
public class Test {
    public static void main(String[] args)throws SQLException{
        IUsuarioDAO usuarioDAO= new UsuarioDaoJDBC();
        UsuarioDTO usuarioDTO= new UsuarioDTO(1, "prueba","prueba");
        UsuarioDTO usuarioDTO1= new UsuarioDTO(3);
        
        usuarioDTO1.setmUsuario("hola");
        usuarioDTO1.setmPassword("hola");
        
      //  usuarioDAO.insertar(usuarioDTO1);
       // usuarioDAO.update(usuarioDTO);
        usuarioDAO.eliminar(usuarioDTO1);
        List<UsuarioDTO>lista=usuarioDAO.lista();
        System.out.println(lista);
    }
    
}
