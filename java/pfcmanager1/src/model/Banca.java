package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Banca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String representanteClinete;
    @ManyToOne
    private Docente orientador;
    @ManyToOne
    private Docente docente;
    @ManyToOne
    private Docente gta;
    @ManyToOne
    private Docente pedagogia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepresentanteClinete() {
        return representanteClinete;
    }

    public void setRepresentanteClinete(String representanteClinete) {
        this.representanteClinete = representanteClinete;
    }

    public Docente getOrientador() {
        return orientador;
    }

    public void setOrientador(Docente orientador) {
        this.orientador = orientador;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Docente getGta() {
        return gta;
    }

    public void setGta(Docente gta) {
        this.gta = gta;
    }

    public Docente getPedagogia() {
        return pedagogia;
    }

    public void setPedagogia(Docente pedagogia) {
        this.pedagogia = pedagogia;
    }

    @Override
    public String toString() {
        return "Orientador: " + getOrientador() + " / " + "GPE: " + getGta(); //To change body of generated methods, choose Tools | Templates.
    }

}
