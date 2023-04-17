/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Miftah
 */
@Entity
@Table(name = "achats")
@NamedQueries({
    @NamedQuery(name = "Achat.findAll", query = "SELECT a FROM Achat a"),
    @NamedQuery(name = "Achat.findById", query = "SELECT a FROM Achat a WHERE a.id = :id"),
    @NamedQuery(name = "Achat.findByDateAchat", query = "SELECT a FROM Achat a WHERE a.dateAchat = :dateAchat"),
    @NamedQuery(name = "Achat.findByPrix", query = "SELECT a FROM Achat a WHERE a.prix = :prix"),
    @NamedQuery(name = "Achat.findByQuantiteAchetee", query = "SELECT a FROM Achat a WHERE a.quantiteAchetee = :quantiteAchetee")})
public class Achat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "date_achat")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAchat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "prix")
    private double prix;
    @Basic(optional = false)
    @Column(name = "quantite_achetee")
    private int quantiteAchetee;
    @JoinColumn(name = "fournisseur_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Fournisseur fournisseurId;
    @JoinColumn(name = "article_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Article articleId;

    public Achat() {
    }

    public Achat(Integer id) {
        this.id = id;
    }

    public Achat(Integer id, Date dateAchat, double prix, int quantiteAchetee) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.quantiteAchetee = quantiteAchetee;
    }

    public Achat(Integer id, Date dateAchat, double prix, int quantiteAchetee, Fournisseur fournisseurId, Article articleId) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.quantiteAchetee = quantiteAchetee;
        this.fournisseurId = fournisseurId;
        this.articleId = articleId;
    }

    public Achat(Date dateAchat, double prix, int quantiteAchetee, Article articleId) {
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.quantiteAchetee = quantiteAchetee;
        this.articleId = articleId;
    }
    

  
    public Achat(double prix, int quantiteAchetee, Fournisseur fournisseurId, Article articleId) {
        this.prix = prix;
        this.quantiteAchetee = quantiteAchetee;
        this.fournisseurId = fournisseurId;
        this.articleId = articleId;
    }

    public Achat(Integer id, double prix, int quantiteAchetee, Fournisseur fournisseurId, Article articleId) {
        this.id = id;
        this.prix = prix;
        this.quantiteAchetee = quantiteAchetee;
        this.fournisseurId = fournisseurId;
        this.articleId = articleId;
    }

    public Achat(double prix, int quantiteAchetee, Fournisseur fournisseurId, Article articleId, Date dateAchat) {
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.quantiteAchetee = quantiteAchetee;
        this.fournisseurId = fournisseurId;
        this.articleId = articleId;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantiteAchetee() {
        return quantiteAchetee;
    }

    public void setQuantiteAchetee(int quantiteAchetee) {
        this.quantiteAchetee = quantiteAchetee;
    }

    public Fournisseur getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(Fournisseur fournisseurId) {
        this.fournisseurId = fournisseurId;
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
        if (!(object instanceof Achat)) {
            return false;
        }
        Achat other = (Achat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Achat[ id=" + id + " ]";
    }
    
}
