package testes;

import dal.AlunoDAL;
import java.util.Scanner;
import model.Curso;
import model.Aluno;

public class AlunoTeste {

    public static void main(String[] args) {

        AlunoDAL dal = new AlunoDAL();
        Curso curso = new Curso();
        Aluno aluno = new Aluno();

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int x = scan.nextInt();

        switch (x) {
            case 0:
                curso.setId(1);
                aluno.setNome("Wilson");
                aluno.setCurso(curso);
                dal.save(aluno);
                break;
            case 1:
                curso.setId(1);
                aluno.setId(2);
                aluno.setNome("Caio");
                aluno.setCurso(curso);
                dal.update(aluno);
                break;
            case 2:
                aluno = dal.findById(2);
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Curso: " + aluno.getCurso().getId());
                break;
            case 3:
                for (Aluno alun : dal.findAll()) {
                    System.out.println("Descrição: " + alun.getNome());
                    System.out.println("Curso: " + alun.getCurso().getId());
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
