/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.EquipeBean;
import java.sql.SQLException;

/**
 *
 * @author Caio
 */
public class EquipeDAO {
    
    private Database bd;
    
    public EquipeDAO (){
        bd = new Database("localhost", "pfcmanager", "root", "root");
    }

    public void inserir(EquipeBean equip) throws SQLException{
        String COLUNAS = "gestor, aluno1, aluno2, aluno3, turma";
        String VALORES = "'" + equip.getGestor()+ "'," +
                         "'" + equip.getAluno1()+ "'," +
                         "'" + equip.getAluno2()+ "'," +
                         "'" + equip.getAluno3()+ "'," +
                         "'" + equip.getTurma()+ "'";
        bd.inserir("equipes", COLUNAS, VALORES);
        bd.fecharConexao();
    }
}
