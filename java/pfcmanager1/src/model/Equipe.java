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
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Aluno gestor;
    @OneToOne
    private Aluno aluno1;
    @OneToOne
    private Aluno aluno2;
    @OneToOne
    private Aluno aluno3;
    @ManyToOne
    private Docente orientador;
    @ManyToOne
    private Docente gpe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aluno getGestor() {
        return gestor;
    }

    public void setGestor(Aluno gestor) {
        this.gestor = gestor;
    }

    public Aluno getAluno1() {
        return aluno1;
    }

    public void setAluno1(Aluno aluno1) {
        this.aluno1 = aluno1;
    }

    public Aluno getAluno2() {
        return aluno2;
    }

    public void setAluno2(Aluno aluno2) {
        this.aluno2 = aluno2;
    }

    public Aluno getAluno3() {
        return aluno3;
    }

    public void setAluno3(Aluno aluno3) {
        this.aluno3 = aluno3;
    }

    public Docente getOrientador() {
        return orientador;
    }

    public void setOrientador(Docente orientador) {
        this.orientador = orientador;
    }

    public Docente getGpe() {
        return gpe;
    }

    public void setGpe(Docente gpe) {
        this.gpe = gpe;
    }

}
