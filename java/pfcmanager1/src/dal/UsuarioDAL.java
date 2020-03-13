package dal;

import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Usuario;

public class UsuarioDAL {

    public Usuario save(Usuario usuario) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return usuario;
    }

    public Usuario update(Usuario usuario) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return usuario;
    }

    public Usuario remove(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Usuario usuario = null;

        try {
            usuario = em.find(Usuario.class, id);
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return usuario;
    }

    public Usuario findById(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Usuario usuario = null;

        try {
            usuario = em.find(Usuario.class, id);
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return usuario;
    }

    public boolean ValidarUsuario(Usuario usuario) throws Exception {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            Query query = em.createQuery("from Usuario u where u.email=:email and u.senha=:senha");
            query.setParameter("email", usuario.getEmail());
            query.setParameter("senha", usuario.getSenha());
            List result = query.getResultList();

            if (result.size() == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        return false;
    }

    public List<Usuario> findAll() {

        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Usuario> usuarios = null;

        try {
            usuarios = em.createQuery("from Usuario").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return usuarios;
    }

    private Database bd;

    public UsuarioDAL() {
        bd = new Database("localhost", "pfcmanager", "root", "root");
    }

}
