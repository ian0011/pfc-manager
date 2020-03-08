package testes;

import dal.UsuarioDAL;
import model.Usuario;

public class UsuarioTeste {

    public static void main(String[] args) {

        Usuario u = new Usuario();
        UsuarioDAL dal = new UsuarioDAL();

//        teste SAVE        
        u.setNome("Test");          
        u.setEmail("test");          
        u.setSenha("test");          
        u.setPerfil("test");          
        dal.save(u);
        
        ////teste UPDATE
        //c.setId(4);
        //c.setDescricao("Materiais");          
        //dal.update(c);
        
        ////teste REMOVE
        //dal.remove(4);
        
        ////teste FIND BY ID
        //Categoria c = dal.findById(2);
        //System.out.println("Descrição: "+c.getDescricao());
        
        ////teste FIND ALL
        //for(Categoria c: dal.findAll()){
        //System.out.println("Descrição: "+c.getDescricao());
        
        
        
    }

}
