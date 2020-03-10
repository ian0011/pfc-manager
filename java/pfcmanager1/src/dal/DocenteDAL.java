package dal;

import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.Docente;

public class DocenteDAL {

    public Docente save(Docente docente) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(docente);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return docente;
    }

    public Docente update(Docente docente) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            if(docente.getId() == null){
                em.persist(docente);
            }else{
                em.merge(docente);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return docente;
    }
    
    public Docente remove(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Docente docente = null;

        try {
            docente = em.find(Docente.class, id);
            em.getTransaction().begin();
            em.remove(docente);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return docente;
    } 

    public Docente findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        Docente docente = null;
        
        try {
            docente = em.find(Docente.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return docente;
    }
    
    public List<Docente> findAll(){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Docente> docentes = null;
        
        try {
            docentes = em.createQuery("from Docente").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return docentes;
    }
    
}
