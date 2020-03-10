package testes;

import dal.EquipeDAL;
import java.util.Scanner;
import model.Aluno;
import model.Equipe;

public class EquipeTeste {

    public static void main(String[] args) {

        EquipeDAL dal = new EquipeDAL();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
        Equipe equipe = new Equipe();

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int x = scan.nextInt();

        switch (x) {
            case 0:
                aluno1.setId(1);
                aluno2.setId(2);
                aluno3.setId(3);
                aluno4.setId(4);
                equipe.setGestor(aluno1);
                equipe.setAluno1(aluno2);
                equipe.setAluno2(aluno3);
                equipe.setAluno3(aluno4);
                dal.save(equipe);
                break;
            case 1:
                aluno1.setId(1);
                aluno2.setId(2);
                aluno3.setId(3);
                aluno4.setId(4);
                equipe.setGestor(aluno1);
                equipe.setAluno1(aluno2);
                equipe.setAluno2(aluno3);
                equipe.setAluno3(aluno4);
                dal.update(equipe);
                break;
            case 2:
                equipe = dal.findById(4);
                System.out.println("Gestor: " + equipe.getGestor().getNome());
                System.out.println("Aluno1: " + equipe.getAluno1().getNome());
                System.out.println("Aluno2: " + equipe.getAluno2().getNome());
                System.out.println("Aluno3: " + equipe.getAluno3().getNome());
                break;
            case 3:
                for (Equipe equip : dal.findAll()) {
                    System.out.println("Gestor: " + equip.getGestor().getNome());
                    System.out.println("Aluno1: " + equip.getAluno1().getNome());
                    System.out.println("Aluno2: " + equip.getAluno2().getNome());
                    System.out.println("Aluno3: " + equip.getAluno3().getNome());
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
