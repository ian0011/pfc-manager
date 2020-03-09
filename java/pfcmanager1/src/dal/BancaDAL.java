package dal;

import connection.ConnectionFactory;
import model.Banca;
import java.util.List;
import javax.persistence.EntityManager;

public class BancaDAL {

    public Banca save(Banca banca) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(banca);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return banca;
    }

    public Banca update(Banca banca) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            if (banca.getId() == null) {
                em.persist(banca);
            } else {
                em.merge(banca);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return banca;
    }

    public Banca remove(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Banca banca = null;

        try {
            banca = em.find(Banca.class, id);
            em.getTransaction().begin();
            em.remove(banca);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return banca;
    }

    public Banca findById(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Banca banca = null;

        try {
            banca = em.find(Banca.class, id);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return banca;
    }

    public List<Banca> findAll() {

        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Banca> bancas = null;

        try {
            bancas = em.createQuery("from Banca").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return bancas;
    }

}
