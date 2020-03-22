package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String razaoSocial;
    private String nomeFantasia;
    private String endereço;
    private String nomeRepresentante;
    private String emailRepresentante;
    private String telefoneRepresentante;
    private String problema;
    private String solucaoDesejada;
    private String resultadoEsperado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public String getEmailRepresentante() {
        return emailRepresentante;
    }

    public void setEmailRepresentante(String emailRepresentante) {
        this.emailRepresentante = emailRepresentante;
    }

    public String getTelefoneRepresentante() {
        return telefoneRepresentante;
    }

    public void setTelefoneRepresentante(String telefoneRepresentante) {
        this.telefoneRepresentante = telefoneRepresentante;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucaoDesejada() {
        return solucaoDesejada;
    }

    public void setSolucaoDesejada(String solucaoDesejada) {
        this.solucaoDesejada = solucaoDesejada;
    }

    public String getResultadoEsperado() {
        return resultadoEsperado;
    }

    public void setResultadoEsperado(String resultadoEsperado) {
        this.resultadoEsperado = resultadoEsperado;
    }

    @Override
    public String toString() {
        return getRazaoSocial(); //To change body of generated methods, choose Tools | Templates.
    }

}
