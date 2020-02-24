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
public class Projeto {
    private int id;
    private String cliente;
    private String tipoProjeto;
    private String tipoEmpresa;
    private String tipoNegocio;
    private String macrotema;
    private String riscoProjeto;
    private double retornoFin;
    private EquipeBean equipe;
    private BancaBean banca;
    private String status;
    private BaremaBean barema;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipoProjeto() {
        return tipoProjeto;
    }

    public void setTipoProjeto(String tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    public String getMacrotema() {
        return macrotema;
    }

    public void setMacrotema(String macrotema) {
        this.macrotema = macrotema;
    }

    public String getRiscoProjeto() {
        return riscoProjeto;
    }

    public void setRiscoProjeto(String riscoProjeto) {
        this.riscoProjeto = riscoProjeto;
    }

    public double getRetornoFin() {
        return retornoFin;
    }

    public void setRetornoFin(double retornoFin) {
        this.retornoFin = retornoFin;
    }

    public EquipeBean getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipeBean equipe) {
        this.equipe = equipe;
    }

    public BancaBean getBanca() {
        return banca;
    }

    public void setBanca(BancaBean banca) {
        this.banca = banca;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BaremaBean getBarema() {
        return barema;
    }

    public void setBarema(BaremaBean barema) {
        this.barema = barema;
    }

    
}
