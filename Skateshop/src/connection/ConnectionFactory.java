package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    
    private String DRIVER = "con.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://179.188.16.206:3306/veskateshop";
    private String USER = "veskateshop";
    private String PASS = "mamute09*/";
    public Connection CONN; // Responsavel por realizar a conexão com o banco de dados
    public Statement STM; // responsavel por preparar e realizar pesquisas no banco de dados
    public ResultSet RS; // responsavel por armazenar o resultado de uma pesquisa passada para o static
    
    public void conecta () {
        try {
            System.setProperty ("jdbc.Drivers", DRIVER); // seta a propriedade do Driver de conexão
            CONN = DriverManager.getConnection (URL, USER, PASS); // realiza a conexão com o mySQL
            JOptionPane.showMessageDialog (null, "MySQL conectado com sucesso!"); // Valida a conexão (True)
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro de conexão: "+ex); // False
        }
    }
    
    public void executaSQL(String sql) throws SQLException{
        STM = (Statement) CONN.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        RS = STM.executeQuery(sql);
    }

    
    public static void closeConnection(Connection con) {
        if(con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {
            if(stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        try {
            if(rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Statement createStatement(int TYPE_SCROLL_INSENSITIVE, int CONCUR_READ_ONLY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
