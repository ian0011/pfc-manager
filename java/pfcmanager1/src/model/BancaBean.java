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
public class BancaBean {
    private int id;
    private String orientador;
    private String gta;
    private String docente;
    private BaremaBean barema;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getGta() {
        return gta;
    }

    public void setGta(String gta) {
        this.gta = gta;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public BaremaBean getBarema() {
        return barema;
    }

    public void setBarema(BaremaBean barema) {
        this.barema = barema;
    }

    
    
    
}
