package testes;

import dal.ProdutoDAL;
import java.util.Scanner;
import model.Categoria;
import model.Produto;

public class ProdutoTeste {

    public static void main(String[] args) {

        ProdutoDAL dal = new ProdutoDAL();
        Categoria c = new Categoria();
        Produto p = new Produto();

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int x = scan.nextInt();

        switch (x) {
            case 0:
                c.setId(2);
                p.setDescricao("Carne");
                p.setQuantidade(15);
                p.setValor(11.50);
                p.setCategoria(c);
                dal.save(p);
                break;
            case 1:
                c.setId(2);
                p.setId(1);
                p.setDescricao("Arroz 2");
                p.setQuantidade(10);
                p.setValor(4.50);
                p.setCategoria(c);
                dal.update(p);
                break;
            case 2:
                p = dal.findById(2);
                System.out.println("Descrição: " + p.getDescricao());
                System.out.println("QTD: " + p.getQuantidade());
                System.out.println("Valor: " + p.getValor());
                System.out.println("Categoria: " + p.getCategoria().getId());
                break;
            case 3:
                for (Produto prod : dal.findAll()) {
                    System.out.println("Descrição: " + prod.getDescricao());
                    System.out.println("QTD: " + prod.getQuantidade());
                    System.out.println("Valor: " + prod.getValor());
                    System.out.println("Categoria: " + prod.getCategoria().getDescricao());
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
