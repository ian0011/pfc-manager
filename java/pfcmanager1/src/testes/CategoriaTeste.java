package testes;

import dal.CategoriaDAL;
import model.Categoria;

public class CategoriaTeste {

    public static void main(String[] args) {

        Categoria c = new Categoria();
        CategoriaDAL dal = new CategoriaDAL();

        ////teste SAVE        
        //c.setDescricao("Material");          
        //dal.save(c);
        
        ////teste UPDATE
        //c.setId(4);
        //c.setDescricao("Materiais");          
        //dal.update(c);
        
        ////teste REMOVE
        dal.remove(4);
        
        ////teste FIND BY ID
        //Categoria c = dal.findById(2);
        //System.out.println("Descrição: "+c.getDescricao());
        
        ////teste FIND ALL
        //for(Categoria c: dal.findAll()){
        //System.out.println("Descrição: "+c.getDescricao());
        
        
        
    }

}
