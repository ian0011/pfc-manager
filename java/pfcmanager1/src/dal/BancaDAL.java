/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import model.Banca;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Caio
 */
public class BancaDAL {

    private Database bd;

    public BancaDAL() {
        bd = new Database("localhost", "pfcmanager", "root", "root");

    }

    public void inserir(Banca banca) throws SQLException {
        String COLUNAS = "orientador, gta, docente";
        String VALORES = "'" + banca.getOrientador() + "',"
                + "'" + banca.getGta() + "',"
                + "'" + banca.getDocente() + "'";

        bd.inserir("bancas", COLUNAS, VALORES);
        bd.fecharConexao();
    }

    public ArrayList<Banca> consultarTodos() {
        
        ArrayList<Banca> bancas = new ArrayList<Banca>();
        
        try {
            

            ResultSet rs = bd.consultar("select * from bancas");

            while (rs.next()) {
                Banca b = new Banca();

                b.setId(rs.getInt("id"));
                b.setOrientador(rs.getString("orientador"));
                b.setGta(rs.getString("gta"));
                b.setDocente(rs.getString("docente"));

                bancas.add(b);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BancaDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            bd.fecharConexao();
        }
        return bancas;
    }

}
