package testes;

import dal.BancaDAL;
import java.util.Scanner;
import model.Docente;
import model.Banca;

public class BancaTeste {

    public static void main(String[] args) {

        BancaDAL dal = new BancaDAL();
        Docente docente1 = new Docente();
        Docente docente2 = new Docente();
        Docente docente3 = new Docente();
        Docente docente4 = new Docente();
        Banca banca = new Banca();

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int x = scan.nextInt();

        switch (x) {
            case 0:
                banca.setRepresentanteClinete("Carlos Cajazeira");
                docente1.setId(1);
                docente2.setId(2);
                docente3.setId(3);
                docente4.setId(4);
                banca.setOrientador(docente1);
                banca.setDocente(docente2);
                banca.setGta(docente3);
                banca.setPedagogia(docente4);
                dal.save(banca);
                break;
            case 1:
                banca.setRepresentanteClinete("Carlos Cajazeira");
                docente1.setId(1);
                docente2.setId(2);
                docente3.setId(3);
                docente4.setId(4);
                banca.setOrientador(docente1);
                banca.setDocente(docente2);
                banca.setGta(docente3);
                banca.setPedagogia(docente4);
                dal.update(banca);
                break;
            case 2:
                banca = dal.findById(1);
                System.out.println("Representante Cliente: " + banca.getRepresentanteClinete());
                System.out.println("Orientador: " + banca.getOrientador().getNome());
                System.out.println("Docente: " + banca.getDocente().getNome());
                System.out.println("Gta: " + banca.getGta().getNome());
                System.out.println("Pedagogia: " + banca.getPedagogia().getNome());
                break;
            case 3:
                for (Banca banc : dal.findAll()) {
                    System.out.println("Representante Cliente: " + banca.getRepresentanteClinete());
                System.out.println("Orientador: " + banca.getOrientador().getNome());
                System.out.println("Docente: " + banca.getDocente().getNome());
                System.out.println("Gta: " + banca.getGta().getNome());
                System.out.println("Pedagogia: " + banca.getPedagogia().getNome());
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
