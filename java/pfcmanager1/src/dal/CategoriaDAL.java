package dal;

import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.Categoria;

public class CategoriaDAL {

    public Categoria save(Categoria categoria) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(categoria);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return categoria;
    }
    
    public Categoria update(Categoria categoria) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(categoria);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return categoria;
    }
    
    public Categoria remove(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Categoria categoria = null;

        try {
            categoria = em.find(Categoria.class, id);
            em.getTransaction().begin();
            em.remove(categoria);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return categoria;
    }
    
    public Categoria findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        Categoria categoria = null;
        
        try {
            categoria = em.find(Categoria.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return categoria;
    }
    
    public List<Categoria> findAll(){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Categoria> categorias = null;
        
        try {
            categorias = em.createQuery("from Categoria c").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return categorias;
    }

}
