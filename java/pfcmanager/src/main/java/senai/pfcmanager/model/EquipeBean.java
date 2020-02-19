/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senai.pfcmanager.model;

import java.util.ArrayList;


/**
 *
 * @author Caio
 */
public class EquipeBean {
    private int id;
    private String titulo;
    private AlunoBean gestor;
    private ArrayList<AlunoBean> alunos;
    private CursoBean curso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AlunoBean getGestor() {
        return gestor;
    }

    public void setGestor(AlunoBean gestor) {
        this.gestor = gestor;
    }

    public ArrayList<AlunoBean> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<AlunoBean> alunos) {
        this.alunos = alunos;
    }

    public CursoBean getCurso() {
        return curso;
    }

    public void setCurso(CursoBean curso) {
        this.curso = curso;
    }
    
    

 
}
