package dal;
import connection.ConnectionFactory;
import model.Equipe;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;

public class EquipeDAL {
    
    public Equipe save(Equipe equipe) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(equipe);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return equipe;
    }

    public Equipe update(Equipe equipe) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            if(equipe.getId() == null){
                em.persist(equipe);
            }else{
                em.merge(equipe);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return equipe;
    }
    
    public Equipe remove(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Equipe equipe = null;

        try {
            equipe = em.find(Equipe.class, id);
            em.getTransaction().begin();
            em.remove(equipe);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return equipe;
    } 

    public Equipe findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        Equipe equipe = null;
        
        try {
            equipe = em.find(Equipe.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return equipe;
    }
    
    public List<Equipe> findAll(){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Equipe> equipes = null;
        
        try {
            equipes = em.createQuery("from Equipe").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return equipes;
    }
    
//    private Database bd;
//    
//    public EquipeDAL (){
//        bd = new Database("localhost", "pfcmanager", "root", "root");
//    }
//
//    public void inserir(Equipe equip) throws SQLException{
//        String COLUNAS = "gestor, equipe1, equipe2, equipe3, turma";
//        String VALORES = "'" + equip.getGestor()+ "'," +
//                         "'" + equip.getAluno1()+ "'," +
//                         "'" + equip.getAluno2()+ "'," +
//                         "'" + equip.getAluno3()+ "'," +
//                         "'" + equip.getTurma()+ "'";
//        bd.inserir("equipes", COLUNAS, VALORES);
//        bd.fecharConexao();
//    }
}
