package dal;

import connection.ConnectionFactory;
import model.Banca;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            if(banca.getId() == null){
                em.persist(banca);
            }else{
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

    public Banca findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        Banca banca = null;
        
        try {
            banca = em.find(Banca.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return banca;
    }
    
    public List<Banca> findAll(){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Banca> bancas = null;
        
        try {
            bancas = em.createQuery("from Banca").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return bancas;
    }

//    private Database bd;
//
//    public BancaDAL() {
//        bd = new Database("localhost", "pfcmanager", "root", "root");
//
//    }
//
//    public void inserir(Banca banca) throws SQLException {
//        String COLUNAS = "orientador, gta, docente";
//        String VALORES = "'" + banca.getOrientador() + "',"
//                + "'" + banca.getGta() + "',"
//                + "'" + banca.getDocente() + "'";
//
//        bd.inserir("bancas", COLUNAS, VALORES);
//        bd.fecharConexao();
//    }
//
//    public ArrayList<Banca> consultarTodos() {
//
//        ArrayList<Banca> bancas = new ArrayList<Banca>();
//
//        try {
//
//            ResultSet rs = bd.consultar("select * from bancas");
//
//            while (rs.next()) {
//                Banca b = new Banca();
//
//                b.setId(rs.getInt("id"));
//                b.setOrientador(rs.getString("orientador"));
//                b.setGta(rs.getString("gta"));
//                b.setDocente(rs.getString("docente"));
//
//                bancas.add(b);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(BancaDAL.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            bd.fecharConexao();
//        }
//        return bancas;
//    }

}
