package dal;

import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.Produto;

public class ProdutoDAL {

    public Produto save(Produto produto) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return produto;
    }

    public Produto update(Produto produto) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            if(produto.getId() == null){
                em.persist(produto);
            }else{
                em.merge(produto);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return produto;
    }
    
    public Produto remove(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Produto produto = null;

        try {
            produto = em.find(Produto.class, id);
            em.getTransaction().begin();
            em.remove(produto);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return produto;
    } 

    public Produto findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        Produto produto = null;
        
        try {
            produto = em.find(Produto.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return produto;
    }
    
    public List<Produto> findAll(){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Produto> produtos = null;
        
        try {
            produtos = em.createQuery("from Produto p").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return produtos;
    }
    
}
