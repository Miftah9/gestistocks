/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Miftah
 */
@Entity
@Table(name = "limite_stocks")
@NamedQueries({
    @NamedQuery(name = "LimiteStock.findAll", query = "SELECT l FROM LimiteStock l"),
    @NamedQuery(name = "LimiteStock.findById", query = "SELECT l FROM LimiteStock l WHERE l.id = :id"),
    @NamedQuery(name = "LimiteStock.findByStockMin", query = "SELECT l FROM LimiteStock l WHERE l.stockMin = :stockMin"),
    @NamedQuery(name = "LimiteStock.findByStockMax", query = "SELECT l FROM LimiteStock l WHERE l.stockMax = :stockMax")})
public class LimiteStock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "stock_min")
    private int stockMin;
    @Basic(optional = false)
    @Column(name = "stock_max")
    private int stockMax;
    @JoinColumn(name = "article_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Article articleId;

    public LimiteStock() {
    }

    public LimiteStock(Integer id) {
        this.id = id;
    }

    public LimiteStock(Integer id, int stockMin, int stockMax) {
        this.id = id;
        this.stockMin = stockMin;
        this.stockMax = stockMax;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public int getStockMax() {
        return stockMax;
    }

    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }

    public Article getArticleId() {
        return articleId;
    }

    public void setArticleId(Article articleId) {
        this.articleId = articleId;
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
        if (!(object instanceof LimiteStock)) {
            return false;
        }
        LimiteStock other = (LimiteStock) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.LimiteStock[ id=" + id + " ]";
    }
    
}
