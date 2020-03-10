package dal;

import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.Aluno;

public class AlunoDAL {

    public Aluno save(Aluno aluno) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(aluno);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return aluno;
    }

    public Aluno update(Aluno aluno) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            if(aluno.getId() == null){
                em.persist(aluno);
            }else{
                em.merge(aluno);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return aluno;
    }
    
    public Aluno remove(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Aluno aluno = null;

        try {
            aluno = em.find(Aluno.class, id);
            em.getTransaction().begin();
            em.remove(aluno);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return aluno;
    } 

    public Aluno findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        Aluno aluno = null;
        
        try {
            aluno = em.find(Aluno.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return aluno;
    }
    
    public List<Aluno> findAll(){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Aluno> alunos = null;
        
        try {
            alunos = em.createQuery("from Aluno").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return alunos;
    }
    
}
