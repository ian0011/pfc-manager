package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

}
