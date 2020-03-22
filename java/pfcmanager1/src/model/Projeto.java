package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipoProjeto;         //requisito
    private String tipoEmpresa;         //requisito
    private String tipoNegocio;         //requisito
    private String macrotema;           //requisito
    private String riscoProjeto;        //requisito
    private Double retornoFinanceiro;   //requisito
    private String status;              //requisito
    private Double semestre;            //filtro
    @Temporal(TemporalType.DATE)
    private Date entregavel1;           //controle do andamento
    @Temporal(TemporalType.DATE)
    private Date entregavel2;           //controle do andamento
    @Temporal(TemporalType.DATE)
    private Date entregavel3;           //controle do andamento
    @OneToOne
    private Equipe equipe;              
    @ManyToOne
    private Banca banca;                
    @ManyToOne
    private Cliente cliente;            //requisito
    
}
