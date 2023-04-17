/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.time.LocalDateTime;
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
@Table(name = "ventes")
@NamedQueries({
    @NamedQuery(name = "Vente.findAll", query = "SELECT v FROM Vente v"),
    @NamedQuery(name = "Vente.findById", query = "SELECT v FROM Vente v WHERE v.id = :id"),
    @NamedQuery(name = "Vente.findByDateVente", query = "SELECT v FROM Vente v WHERE v.dateVente = :dateVente"),
    @NamedQuery(name = "Vente.findByPrixDeVente", query = "SELECT v FROM Vente v WHERE v.prixDeVente = :prixDeVente"),
    @NamedQuery(name = "Vente.findByQuantiteVendu", query = "SELECT v FROM Vente v WHERE v.quantiteVendu = :quantiteVendu")})
public class Vente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "date_vente")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "prix_de_vente")
    private double prixDeVente;
    @Basic(optional = false)
    @Column(name = "quantite_vendu")
    private int quantiteVendu;
    @JoinColumn(name = "article_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Article articleId;
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Client clientId;
    

    public Vente() {
    }

    public Vente(Integer id) {
        this.id = id;
    }

    public Vente(Integer id, Date dateVente, double prixDeVente, int quantiteVendu) {
        this.id = id;
        this.dateVente = dateVente;
        this.prixDeVente = prixDeVente;
        this.quantiteVendu = quantiteVendu;
    }
    

    public Vente(double prixDeVente, int quantiteVendu, Article articleId, Client clientId) {
        this.prixDeVente = prixDeVente;
        this.quantiteVendu = quantiteVendu;
        this.articleId = articleId;
        this.clientId = clientId;
    }

    public Vente(Date dateVente, double prixDeVente, int quantiteVendu, Article articleId, Client clientId) {
        this.dateVente = dateVente;
        this.prixDeVente = prixDeVente;
        this.quantiteVendu = quantiteVendu;
        this.articleId = articleId;
        this.clientId = clientId;
    }

    public Vente(Integer id, Date dateVente, double prixDeVente, int quantiteVendu, Article articleId, Client clientId) {
        this.id = id;
        this.dateVente = dateVente;
        this.prixDeVente = prixDeVente;
        this.quantiteVendu = quantiteVendu;
        this.articleId = articleId;
        this.clientId = clientId;
    }

    public Vente(int quantiteVendu, Article articleId, Client clientId) {
        this.quantiteVendu = quantiteVendu;
        this.articleId = articleId;
        this.clientId = clientId;
    }

    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateVente() {
        return dateVente;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }

    public double getPrixDeVente() {
        return prixDeVente;
    }

    public void setPrixDeVente(double prixDeVente) {
        this.prixDeVente = prixDeVente;
    }

    public int getQuantiteVendu() {
        return quantiteVendu;
    }

    public void setQuantiteVendu(int quantiteVendu) {
        this.quantiteVendu = quantiteVendu;
    }

    public Article getArticleId() {
        return articleId;
    }

    public void setArticleId(Article articleId) {
        this.articleId = articleId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
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
        if (!(object instanceof Vente)) {
            return false;
        }
        Vente other = (Vente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Vente[ id=" + id + " ]";
    }
    
}
