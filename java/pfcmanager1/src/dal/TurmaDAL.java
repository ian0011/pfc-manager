package dal;

import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.Turma;

public class TurmaDAL {

    public Turma save(Turma turma) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(turma);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return turma;
    }

    public Turma update(Turma turma) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            if(turma.getId() == null){
                em.persist(turma);
            }else{
                em.merge(turma);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return turma;
    }
    
    public Turma remove(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Turma turma = null;

        try {
            turma = em.find(Turma.class, id);
            em.getTransaction().begin();
            em.remove(turma);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return turma;
    } 

    public Turma findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        Turma turma = null;
        
        try {
            turma = em.find(Turma.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return turma;
    }
    
    public List<Turma> findAll(){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Turma> turmas = null;
        
        try {
            turmas = em.createQuery("from Turma").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return turmas;
    }
    
}
