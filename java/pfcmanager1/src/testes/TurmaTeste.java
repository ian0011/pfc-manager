package testes;

import dal.TurmaDAL;
import java.util.Scanner;
import model.Curso;
import model.Docente;
import model.Turma;

public class TurmaTeste {

    public static void main(String[] args) {

        TurmaDAL dal = new TurmaDAL();
        Curso curso = new Curso();
        Turma turma = new Turma();
        Docente docente = new Docente();

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int x = scan.nextInt();

        switch (x) {
            case 0:
                curso.setId(1);
                docente.setId(1);
                turma.setCodigo("B64084");
                turma.setCurso(curso);
                turma.setOrientador(docente);
                turma.setGta(docente);
                dal.save(turma);
                break;
            case 1:
                curso.setId(1);
                docente.setId(1);
                turma.setCodigo("B64082");
                turma.setCurso(curso);
                turma.setOrientador(docente);
                turma.setGta(docente);
                dal.save(turma);
                break;
            case 2:
                turma = dal.findById(1);
                System.out.println("Código: " + turma.getCodigo());
                System.out.println("Curso: " + turma.getCurso().getId());
                System.out.println("Orientador: " + turma.getOrientador().getId());
                System.out.println("Gta: " + turma.getGta().getId());
                break;
            case 3:
                for (Turma turm : dal.findAll()) {
                    System.out.println("Código: " + turm.getCodigo());
                    System.out.println("Curso: " + turm.getCurso().getCurso());
                    System.out.println("Orientador: " + turm.getOrientador().getNome());
                    System.out.println("Gta: " + turm.getGta().getNome());
                }
                break;
            case 4:
                dal.remove(2);
                break;
            //optional
            default:
                System.out.println("Invalid Input!");
        }

    }

}
