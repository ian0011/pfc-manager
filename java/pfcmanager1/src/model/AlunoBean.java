/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Caio
 */
public class AlunoBean {
    private int id;
    private String nome;
    private CursoBean curso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CursoBean getCurso() {
        return curso;
    }

    public void setCurso(CursoBean curso) {
        this.curso = curso;
    }
    
    
    
}
