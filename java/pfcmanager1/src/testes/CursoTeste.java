package testes;

import dal.CursoDAL;
import java.util.Scanner;
import model.Docente;
import model.Curso;

public class CursoTeste {

    public static void main(String[] args) {

        CursoDAL dal = new CursoDAL();
        Docente docente = new Docente();
        Curso curso = new Curso();

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int x = scan.nextInt();

        switch (x) {
            case 0:
                docente.setId(3);
                curso.setCurso("Redes");
                curso.setCoordenador(docente);
                dal.save(curso);
                break;
            case 1:
                docente.setId(1);
                curso.setId(1);
                curso.setCurso("Desenvolvimento de Sistemas");
                curso.setCoordenador(docente);
                dal.update(curso);
                break;
            case 2:
                curso = dal.findById(2);
                System.out.println("Curso: " + curso.getCurso());
                System.out.println("Coordenador: " + curso.getCoordenador().getNome());
                break;
            case 3:
                for (Curso curs : dal.findAll()) {
                    System.out.println("Curso: " + curs.getCurso());
                System.out.println("Coordenador: " + curs.getCoordenador().getNome());
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
