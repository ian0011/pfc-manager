package dal;

import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.Cliente;

public class ClienteDAL {

    public Cliente save(Cliente cliente) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return cliente;
    }

    public Cliente update(Cliente cliente) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            if(cliente.getId() == null){
                em.persist(cliente);
            }else{
                em.merge(cliente);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return cliente;
    }
    
    public Cliente remove(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Cliente cliente = null;

        try {
            cliente = em.find(Cliente.class, id);
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return cliente;
    } 

    public Cliente findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        Cliente cliente = null;
        
        try {
            cliente = em.find(Cliente.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return cliente;
    }
    
    public List<Cliente> findAll(){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Cliente> clientes = null;
        
        try {
            clientes = em.createQuery("from Cliente").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return clientes;
    }
    
}
