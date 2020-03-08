package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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

}
