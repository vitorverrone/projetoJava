package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

public class ProdutoDAO {
        
    private static Statement stmt = null;
    ConnectionFactory con = new ConnectionFactory();
    
    public void create(Produto p) {
        
        
        con.conecta();
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        try {
            
            con.executaSQL("");
            
            /*String select = "INSERT INTO produtos (nomeProd, estoque, tamanho, descricao, ativo, foto, preco) VALUES(?, ?, ?, ?, ?, ?, ?)";
            stmt.setString(1, p.getNomeProd());
            stmt.setInt(2, p.getEstoque());
            stmt.setString(3, p.getTamanho());
            stmt.setString(4, p.getDescricao());
            stmt.setInt(5, p.getAtivo());
            stmt.setString(6, p.getFoto());
            stmt.setString(7, p.getPreco());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!");*/
        } catch (SQLException ex) {
            
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto: "+ex);
            
        } finally {
            //ConnectionFactory.closeConnection(con, stmt);
        }
    }    
}
