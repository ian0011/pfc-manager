package testes;

import dal.DocenteDAL;
import java.util.Scanner;
import model.Docente;

public class DocenteTeste {

    public static void main(String[] args) {

        DocenteDAL dal = new DocenteDAL();
        Docente docente = new Docente();

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int x = scan.nextInt();

        switch (x) {
            case 0:
                docente.setNome("Docente Teste");
                dal.save(docente);
                break;
            case 1:
                docente.setId(1);
                docente.setNome("Sidney");
                dal.update(docente);
                break;
            case 2:
                docente = dal.findById(2);
                System.out.println("Nome: " + docente.getNome());
                break;
            case 3:
                for (Docente docen : dal.findAll()) {
                    System.out.println("Nome: " + docen.getNome());
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
