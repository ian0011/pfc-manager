package dal;

import connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.Projeto;

public class ProjetoDAL {
    
    public Projeto save(Projeto projeto) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(projeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return projeto;
    }

   public Projeto update(Projeto projeto) {

        EntityManager em = new ConnectionFactory().getEntityManager();

        try {
            em.getTransaction().begin();
            if(projeto.getId() == null){
                em.persist(projeto);
            }else{
                em.merge(projeto);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return projeto;
    }
    
    public Projeto remove(Integer id) {

        EntityManager em = new ConnectionFactory().getEntityManager();
        Projeto projeto = null;

        try {
            projeto = em.find(Projeto.class, id);
            em.getTransaction().begin();
            em.remove(projeto);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return projeto;
    } 

    public Projeto findById(Integer id){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        Projeto projeto = null;
        
        try {
            projeto = em.find(Projeto.class, id);
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return projeto;
    }
    
    public List<Projeto> findAll(){
        
        EntityManager em = new ConnectionFactory().getEntityManager();
        List<Projeto> projetos = null;
        
        try {
            projetos = em.createQuery("from Projeto").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally{
            em.close();
        }
        return projetos;
    }
    
//    private Database bd;
//    
//    public ProjetoDAL(){
//        bd = new Database("localhost", "pfcmanager", "root", "root");
//    }
//    
//    public void inserir(Projeto p) throws SQLException{
//        String COLUNAS = "cliente, tipoProjeto, tipoEmpresa, tipoNegocio, macrotema, risco, retornoFin, status";
//        String VALORES =    "'" + p.getCliente()+ "'," +
//                            "'" + p.getTipoProjeto()+ "'," +
//                            "'" + p.getTipoEmpresa()+ "'," +
//                            "'" + p.getTipoNegocio()+ "'," +
//                            "'" + p.getMacrotema()+ "'," +
//                            "'" + p.getRiscoProjeto()+ "'," +
//                            "'" + p.getRetornoFin()+ "'," +
//                            "'" + p.getStatus()+ "'";
//        bd.inserir("projetos", COLUNAS, VALORES);
//        bd.fecharConexao();
//    }
    
}
