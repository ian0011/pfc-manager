package testes;

import dal.ClienteDAL;
import java.util.Scanner;
import model.Cliente;

public class ClienteTeste {

    public static void main(String[] args) {

        ClienteDAL dal = new ClienteDAL();
        Cliente cliente = new Cliente();

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int x = scan.nextInt();

        switch (x) {
            case 0:
                cliente.setRazaoSocial("Cliente Teste");
                cliente.setNomeFantasia("Cliente Teste");
                cliente.setEndereço("Cliente Teste");
                cliente.setNomeRepresentante("Cliente Teste");
                cliente.setEmailRepresentante("Cliente Teste");
                cliente.setTelefoneRepresentante("Cliente Teste");
                cliente.setProblema("Cliente Teste");
                cliente.setSolucaoDesejada("Cliente Teste");
                cliente.setResultadoEsperado("Cliente Teste");
                dal.save(cliente);
                break;
            case 1:
                cliente.setId(1);
                cliente.setRazaoSocial("Cliente Teste");
                cliente.setNomeFantasia("Cliente Teste");
                cliente.setEndereço("Cliente Teste");
                cliente.setNomeRepresentante("Cliente Teste");
                cliente.setEmailRepresentante("Cliente Teste");
                cliente.setTelefoneRepresentante("Cliente Teste");
                cliente.setProblema("Cliente Teste");
                cliente.setSolucaoDesejada("Cliente Teste");
                cliente.setResultadoEsperado("Cliente Teste");
                dal.update(cliente);
                break;
            case 2:
                cliente = dal.findById(2);
                System.out.println("RazaoSocial: " + cliente.getRazaoSocial());
                System.out.println("NomeFantasia: " + cliente.getNomeFantasia());
                System.out.println("Endereço: " + cliente.getEndereço());
                System.out.println("NomeRepresentante: " + cliente.getNomeRepresentante());
                System.out.println("EmailRepresentante: " + cliente.getEmailRepresentante());
                System.out.println("TelefoneRepresentante: " + cliente.getTelefoneRepresentante());
                System.out.println("Problema: " + cliente.getProblema());
                System.out.println("SolucaoDesejada: " + cliente.getSolucaoDesejada());
                System.out.println("ResultadoEsperado: " + cliente.getResultadoEsperado());
                break;
            case 3:
                for (Cliente c : dal.findAll()) {
                    System.out.println("RazaoSocial: " + c.getRazaoSocial());
                    System.out.println("NomeFantasia: " + c.getNomeFantasia());
                    System.out.println("Endereço: " + c.getEndereço());
                    System.out.println("NomeRepresentante: " + c.getNomeRepresentante());
                    System.out.println("EmailRepresentante: " + c.getEmailRepresentante());
                    System.out.println("TelefoneRepresentante: " + c.getTelefoneRepresentante());
                    System.out.println("Problema: " + c.getProblema());
                    System.out.println("SolucaoDesejada: " + c.getSolucaoDesejada());
                    System.out.println("ResultadoEsperado: " + c.getResultadoEsperado());
                }
                break;
            case 4:
                dal.remove(1);
                break;
            //optional
            default:
                System.out.println("Invalid Input!");
        }

    }

}
