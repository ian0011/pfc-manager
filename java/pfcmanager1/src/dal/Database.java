package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    
    private String url;
    private String usuario;
    private String senha;
    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public Database(String local, String banco, String usuario, String senha) {
        try {            
            this.usuario = usuario;
            this.senha = senha;
            this.url = "jdbc:mysql://" + local + ":3306/" + banco;
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método responsável por abrir uma conexão com o banco e criar o Statement
    private ResultSet executar(String sql, int tipo) throws SQLException {
        con = DriverManager.getConnection(url, usuario, senha);
        stm = con.createStatement();
        rs = null;

        if (tipo == 1) {
            stm.execute(sql);
        } else {
            rs = stm.executeQuery(sql);
        }

        return rs;
    }

    public void inserir(String TABELA, String COLUNAS, String VALORES) throws SQLException {
        String tmp = "INSERT INTO " + TABELA + "(" + COLUNAS + ") VALUES (" + VALORES + ")";
        System.out.println(tmp);
        executar(tmp, 1);
    }

    public void inserir(String TABELA, String VALORES) throws SQLException {
        String tmp = "INSERT INTO " + TABELA + " VALUES (" + VALORES + ")";
        System.out.println(tmp);
        executar(tmp, 1);
    }

    public void atualizar(String TABELA, String SET, String WHERE) throws SQLException {
        String tmp;
        if (WHERE.equals("")) {
            tmp = "UPDATE " + TABELA + " SET " + SET;
        } else {
            tmp = "UPDATE " + TABELA + " SET " + SET + " WHERE " + WHERE;
        }
        System.out.println(tmp);
        executar(tmp, 1);
    }

    public void excluir(String TABELA, String WHERE) throws SQLException {
        String tmp;
        if (WHERE.equals("")) {
            tmp = "DELETE FROM " + TABELA;
        } else {
            tmp = "DELETE FROM " + TABELA + " WHERE " + WHERE;
        }
        System.out.println(tmp);
        executar(tmp, 1);
    }

    public void consultar(String SELECT, String FROM, String WHERE) throws SQLException {
        String tmp;
        if (WHERE.equals("")) {
            tmp = "SELECT " + SELECT + " FROM " + FROM;
        } else {
            tmp = "SELECT " + SELECT + " FROM " + FROM + " WHERE " + WHERE;
        }
        System.out.println(tmp);
        executar(tmp, 1);
    }

    public ResultSet consultar(String SQL) throws SQLException {
        executar(SQL, 0);
        return rs;
    }

    public void inserirAtualizarExcluir(String SQL) throws SQLException {
        executar(SQL, 0);
    }

    public void fecharConexao() {
        try {
            stm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
