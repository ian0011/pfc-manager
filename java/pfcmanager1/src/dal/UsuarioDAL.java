/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

/**
 *
 * @author rpmen
 */
public class UsuarioDAL {
    
    private Database bd;

    public UsuarioDAL() {
        bd = new Database("localhost", "pfcmanager", "root", "root");
    }

    public Usuario consultarPorEmailSenha(String email, String senha) {
        try {
            ResultSet rs = bd.consultar("select * from usuarios where email_usuario = '" + email + "' and senha_usuario = '" + senha + "'");

            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id_usuario"));
                usuario.setEmail(rs.getString("email_usuario"));
                usuario.setSenha(rs.getString("senha_usuario"));
                return usuario;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            bd.fecharConexao();
        }
        return null;
    }
    
    public void inserir(Usuario u) throws SQLException{
        String COLUNAS = "nome_usuario, email_usuario, senha_usuario, perfil_usuario";
        String VALORES =    "'" + u.getNome() + "'," +
                            "'" + u.getEmail()+ "'," +
                            "'" + u.getSenha()+ "'," +
                            "'" + u.getPerfil()+ "'";
        bd.inserir("usuarios", COLUNAS, VALORES);
        bd.fecharConexao();
    }
    
}
