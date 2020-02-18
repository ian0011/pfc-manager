package senai.pfcmanager.dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import senai.pfcmanager.model.Usuario;

public class usuarioDAO {

    private Database bd;

    public usuarioDAO() {
        bd = new Database("localhost", "pfcmanager", "root", "root");
    }

    public Usuario consultarPorLoginSenha(String login, String senha) {
        try {
            ResultSet rs = bd.consultar("select * from usuario where login = '" + login + "' and senha = " + senha + "'");

            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                return usuario;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            bd.fecharConexao();
        }
        return null;

    }

}
