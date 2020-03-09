package testes;

import dal.UsuarioDAL;
import java.util.Scanner;
import model.Usuario;

public class UsuarioTeste {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        UsuarioDAL dal = new UsuarioDAL();

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int x = scan.nextInt();

        switch (x) {
            case 0:
                usuario.setNome("Test");
                usuario.setEmail("test");
                usuario.setSenha("test");
                usuario.setPerfil("test");
                dal.save(usuario);
                break;
            case 1:
                usuario.setId(1);
                usuario.setNome("Test");
                usuario.setEmail("test");
                usuario.setSenha("test");
                usuario.setPerfil("test");
                dal.update(usuario);
                break;
            case 2:
                usuario = dal.findById(2);
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("Senha: " + usuario.getSenha());
                System.out.println("Perfil: " + usuario.getPerfil());
                break;
            case 3:
                for (Usuario u : dal.findAll()) {
                    System.out.println("Nome: " + u.getNome());
                    System.out.println("Email: " + u.getEmail());
                    System.out.println("Senha: " + u.getSenha());
                    System.out.println("Perfil: " + u.getPerfil());
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
