package dal;

import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.Curso;

public class CursoDAL {

    public Curso save(Curso curso) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(curso);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return curso;
    }

    public Curso update(Curso curso) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            if(curso.getId() == null){
                em.persist(curso);
            }else{
                em.merge(curso);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return curso;
    }
    
    public Curso remove(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Curso curso = null;

        try {
            curso = em.find(Curso.class, id);
            em.getTransaction().begin();
            em.remove(curso);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return curso;
    } 

    public Curso findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        Curso curso = null;
        
        try {
            curso = em.find(Curso.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return curso;
    }
    
    public List<Curso> findAll(){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Curso> cursos = null;
        
        try {
            cursos = em.createQuery("from Curso").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return cursos;
    }
    
}
