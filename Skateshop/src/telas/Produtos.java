/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "produtos", catalog = "veskateshop", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p")
    , @NamedQuery(name = "Produtos.findById", query = "SELECT p FROM Produtos p WHERE p.id = :id")
    , @NamedQuery(name = "Produtos.findByEstoque", query = "SELECT p FROM Produtos p WHERE p.estoque = :estoque")
    , @NamedQuery(name = "Produtos.findByTamanho", query = "SELECT p FROM Produtos p WHERE p.tamanho = :tamanho")
    , @NamedQuery(name = "Produtos.findByAtivo", query = "SELECT p FROM Produtos p WHERE p.ativo = :ativo")
    , @NamedQuery(name = "Produtos.findByPreco", query = "SELECT p FROM Produtos p WHERE p.preco = :preco")})
public class Produtos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Column(name = "nomeProd")
    private String nomeProd;
    @Column(name = "estoque")
    private Integer estoque;
    @Column(name = "tamanho")
    private String tamanho;
    @Lob
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "ativo")
    private Integer ativo;
    @Lob
    @Column(name = "foto")
    private byte[] foto;
    @Column(name = "preco")
    private String preco;

    public Produtos() {
    }

    public Produtos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        String oldNomeProd = this.nomeProd;
        this.nomeProd = nomeProd;
        changeSupport.firePropertyChange("nomeProd", oldNomeProd, nomeProd);
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        Integer oldEstoque = this.estoque;
        this.estoque = estoque;
        changeSupport.firePropertyChange("estoque", oldEstoque, estoque);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        String oldTamanho = this.tamanho;
        this.tamanho = tamanho;
        changeSupport.firePropertyChange("tamanho", oldTamanho, tamanho);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        Integer oldAtivo = this.ativo;
        this.ativo = ativo;
        changeSupport.firePropertyChange("ativo", oldAtivo, ativo);
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        byte[] oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        String oldPreco = this.preco;
        this.preco = preco;
        changeSupport.firePropertyChange("preco", oldPreco, preco);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telas.Produtos[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
