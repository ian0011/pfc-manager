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
public class BancaBean {
    private int id;
    private DocenteBean orientador;
    private DocenteBean gta;
    private BaremaBean barema;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public BaremaBean getBarema() {
        return barema;
    }

    public void setBarema(BaremaBean barema) {
        this.barema = barema;
    }
    
    
    
}
