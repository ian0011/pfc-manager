package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cliente;
    private String tipoProjeto;
    private String tipoEmpresa;
    private String tipoNegocio;
    private String macrotema;
    private String riscoProjeto;
    private double retornoFin;
    private String status;
    @OneToOne
    private Equipe equipe;
    @ManyToOne
    private Banca banca;

}
