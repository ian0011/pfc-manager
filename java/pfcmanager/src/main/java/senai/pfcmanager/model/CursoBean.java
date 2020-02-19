/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senai.pfcmanager.model;

/**
 *
 * @author Caio
 */
public class CursoBean {
    private int id;
    private String curso;
    private String turma;
    private int semestre;
    private String modalidade;
    private String areaTecnica;
    private DocenteBean coordCurso;
    private DocenteBean orientador;
    private DocenteBean gta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getAreaTecnica() {
        return areaTecnica;
    }

    public void setAreaTecnica(String areaTecnica) {
        this.areaTecnica = areaTecnica;
    }

    public DocenteBean getCoordCurso() {
        return coordCurso;
    }

    public void setCoordCurso(DocenteBean coordCurso) {
        this.coordCurso = coordCurso;
    }

    public DocenteBean getOrientador() {
        return orientador;
    }

    public void setOrientador(DocenteBean orientador) {
        this.orientador = orientador;
    }

    public DocenteBean getGta() {
        return gta;
    }

    public void setGta(DocenteBean gta) {
        this.gta = gta;
    }
    
    
}
