/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3patronesDisenio.laboratorioFinal.jdbc;
import java.sql.SQLException;
import java.util.List;
import tema3patronesDisenio.laboratorioFinal.dto.UsuarioDTO;
/**
 *
 * @author pablo
 */
public interface IUsuarioDAO {
    
    public abstract int insertar(UsuarioDTO user)throws SQLException;
    public abstract int update(UsuarioDTO user)throws SQLException;
    public abstract int eliminar(UsuarioDTO user)throws SQLException;
    public abstract List<UsuarioDTO>lista()throws SQLException;
    
}
