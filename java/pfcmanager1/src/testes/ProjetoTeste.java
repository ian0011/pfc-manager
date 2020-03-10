package testes;

import dal.ProjetoDAL;
import java.util.Scanner;
import model.Equipe;
import model.Banca;
import model.Projeto;

public class ProjetoTeste {

    public static void main(String[] args) {

        ProjetoDAL dal = new ProjetoDAL();

        Equipe equipe = new Equipe();
        Banca banca = new Banca();
        Projeto projeto = new Projeto();

        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        int x = scan.nextInt();

        switch (x) {
            case 0:
                equipe.setId(4);
                banca.setId(1);
                projeto.setCliente("Senai Cimatec");
                projeto.setTipoProjeto("Interno");
                projeto.setTipoEmpresa("Desenvolvimento de Produto");
                projeto.setTipoNegocio("CIMATEC");
                projeto.setMacrotema("Otimização de Processo");
                projeto.setRiscoProjeto("Baixo");
                projeto.setRetornoFin(10000);
                projeto.setStatus("Ativo");
                projeto.setEquipe(equipe);
                projeto.setBanca(banca);
                dal.save(projeto);
                break;
            case 1:
                equipe.setId(4);
                banca.setId(1);
                projeto.setCliente("Senai Cimatec");
                projeto.setTipoProjeto("Interno");
                projeto.setTipoEmpresa("Desenvolvimento de Produto");
                projeto.setTipoNegocio("CIMATEC");
                projeto.setMacrotema("Otimização de Processo");
                projeto.setRiscoProjeto("Baixo");
                projeto.setRetornoFin(10000);
                projeto.setStatus("Ativo");
                projeto.setEquipe(equipe);
                projeto.setBanca(banca);
                dal.update(projeto);
                break;
            case 2:
                projeto = dal.findById(2);
                System.out.println("Cliente: " + projeto.getCliente());
                System.out.println("Tipo de Projeto: " + projeto.getTipoProjeto());
                System.out.println("Tipo de Empresa: " + projeto.getTipoEmpresa());
                System.out.println("Tipo de Negócio: " + projeto.getTipoNegocio());
                System.out.println("Macrotema: " + projeto.getMacrotema());
                System.out.println("Risco: " + projeto.getRiscoProjeto());
                System.out.println("Retorno Financeiro: " + projeto.getRetornoFin());
                System.out.println("Status: " + projeto.getStatus());
                System.out.println("Equipe: " + projeto.getEquipe().getId());
                System.out.println("Banca: " + projeto.getBanca().getId());
                break;
            case 3:
                for (Projeto proj : dal.findAll()) {
                    System.out.println("Cliente: " + projeto.getCliente());
                    System.out.println("Tipo de Projeto: " + projeto.getTipoProjeto());
                    System.out.println("Tipo de Empresa: " + projeto.getTipoEmpresa());
                    System.out.println("Tipo de Negócio: " + projeto.getTipoNegocio());
                    System.out.println("Macrotema: " + projeto.getMacrotema());
                    System.out.println("Risco: " + projeto.getRiscoProjeto());
                    System.out.println("Retorno Financeiro: " + projeto.getRetornoFin());
                    System.out.println("Status: " + projeto.getStatus());
                    System.out.println("Equipe: " + projeto.getEquipe().getGestor());
                    System.out.println("Banca: " + projeto.getBanca().getOrientador());
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
