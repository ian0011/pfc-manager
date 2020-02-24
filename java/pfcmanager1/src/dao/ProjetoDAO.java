/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import model.Projeto;

/**
 *
 * @author rpmen
 */
public class ProjetoDAO {
    
    private Database bd;
    
    public ProjetoDAO(){
        bd = new Database("localhost", "pfcmanager", "root", "root");
    }
    
    public void inserir(Projeto p) throws SQLException{
        String COLUNAS = "cliente, tipoProjeto, tipoEmpresa, tipoNegocio, macrotema, risco, retornoFin, status";
        String VALORES =    "'" + p.getCliente()+ "'," +
                            "'" + p.getTipoProjeto()+ "'," +
                            "'" + p.getTipoEmpresa()+ "'," +
                            "'" + p.getTipoNegocio()+ "'," +
                            "'" + p.getMacrotema()+ "'," +
                            "'" + p.getRiscoProjeto()+ "'," +
                            "'" + p.getRetornoFin()+ "'," +
                            "'" + p.getStatus()+ "'";
        bd.inserir("projetos", COLUNAS, VALORES);
        bd.fecharConexao();
    }
    
}
