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
    
    private String tipoProjeto;
    private String tipoEmpresa;
    private String tipoNegocio;
    private String macrotema;
    private String riscoProjeto;
    private Double retornoFin;
    private String status;
    private Double semestre;
    @Temporal(TemporalType.DATE)
    private Date entregavel1;
    @Temporal(TemporalType.DATE)
    private Date entregavel2;
    @Temporal(TemporalType.DATE)
    private Date entregavel3;    
    @OneToOne
    private Equipe equipe;
    @ManyToOne
    private Banca banca;
    @ManyToOne
    private Cliente cliente;

}
