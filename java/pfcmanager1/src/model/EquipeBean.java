/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


/**
 *
 * @author Caio
 */
public class EquipeBean {
    private int id;
    private String titulo;
    private String gestor;
    private String aluno1;
    private String aluno2;
    private String aluno3;
    private String turma; 

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

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

    public String getAluno1() {
        return aluno1;
    }

    public void setAluno1(String aluno1) {
        this.aluno1 = aluno1;
    }

    public String getAluno2() {
        return aluno2;
    }

    public void setAluno2(String aluno2) {
        this.aluno2 = aluno2;
    }

    public String getAluno3() {
        return aluno3;
    }

    public void setAluno3(String aluno3) {
        this.aluno3 = aluno3;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
}