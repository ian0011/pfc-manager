package dal;

import connection.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import model.Usuario;

public class UsuarioDAL {
    
    public Usuario save(Usuario usuario) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();            
        } catch (Exception e) {
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
    
    public Usuario findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        Usuario usuario = null;
        
        try {
            usuario = em.find(Usuario.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return usuario;
    }
    
    public List<Usuario> findAll(){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Usuario> usuarios = null;
        
        try {
            usuarios = em.createQuery("from Usuario u").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return usuarios;
    }
    
    private Database bd;

    public UsuarioDAL() {
        bd = new Database("localhost", "pfcmanager", "root", "root");
    }

    public Usuario consultarPorEmailSenha(String email, String senha) {
        try {
            ResultSet rs = bd.consultar("select * from usuarios where email_usuario = '" + email + "' and senha_usuario = '" + senha + "'");

            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id_usuario"));
                usuario.setEmail(rs.getString("email_usuario"));
                usuario.setSenha(rs.getString("senha_usuario"));
                return usuario;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            bd.fecharConexao();
        }
        return null;
    }
    
    public void inserir(Usuario u) throws SQLException{
        String COLUNAS = "nome_usuario, email_usuario, senha_usuario, perfil_usuario";
        String VALORES =    "'" + u.getNome() + "'," +
                            "'" + u.getEmail()+ "'," +
                            "'" + u.getSenha()+ "'," +
                            "'" + u.getPerfil()+ "'";
        bd.inserir("usuarios", COLUNAS, VALORES);
        bd.fecharConexao();
    }
    
}
