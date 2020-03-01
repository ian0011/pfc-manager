/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.BancaBean;
import java.sql.SQLException;


/**
 *
 * @author Caio
 */
public class BancaDAO {
    
    private Database bd;
    
    public BancaDAO(){
        bd = new Database("localhost", "pfcmanager", "root", "root");
        
    }
    
    public void inserir(BancaBean banca)throws SQLException{
        String COLUNAS = "orientador, gta, docente";
        String VALORES = "'" + banca.getOrientador()+ "'," +
                         "'" + banca.getGta()+ "'," +
                         "'" + banca.getDocente()+ "'";
        
        bd.inserir("bancas", COLUNAS, VALORES);
        bd.fecharConexao();
    }
}
