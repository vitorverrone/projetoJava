package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

public class ProdutoDAO {
    
    public void create(Produto p) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produtos (nomeProd, estoque, tamanho, descricao, ativo, foto, preco) VALUES(?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, p.getNomeProd());
            stmt.setInt(2, p.getEstoque());
            stmt.setString(3, p.getTamanho());
            stmt.setString(4, p.getDescricao());
            stmt.setInt(5, p.getAtivo());
            stmt.setString(6, p.getFoto());
            stmt.setString(7, p.getPreco());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!");
        } catch (SQLException ex) {
            
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto: "+ex);
            
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
}
