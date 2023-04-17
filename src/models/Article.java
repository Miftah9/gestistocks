/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Miftah
 */
@Entity
@Table(name = "articles")
@NamedQueries({
    @NamedQuery(name = "Article.findAll", query = "SELECT a FROM Article a"),
    @NamedQuery(name = "Article.findById", query = "SELECT a FROM Article a WHERE a.id = :id"),
    @NamedQuery(name = "Article.findByNom", query = "SELECT a FROM Article a WHERE a.nom = :nom"),
    @NamedQuery(name = "Article.findByQuantite", query = "SELECT a FROM Article a WHERE a.quantite = :quantite"),
    @NamedQuery(name = "Article.findByGain", query = "SELECT a FROM Article a WHERE a.gain = :gain")})
public class Article implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articleId", fetch = FetchType.EAGER)
    private List<Achat> achatList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "quantite")
    private int quantite;
    @Basic(optional = false)
    @Column(name = "gain")
    private float gain;
    @JoinColumn(name = "categorie_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Categorie categorieId;

    public Article() {
    }

    public Article(Integer id) {
        this.id = id;
    }

    public Article(Integer id, String nom, int quantite, float gain) {
        this.id = id;
        this.nom = nom;
        this.quantite = quantite;
        this.gain = gain;
    }

    public Article(Integer id, String nom, int quantite, float gain, Categorie categorieId) {
        this.id = id;
        this.nom = nom;
        this.quantite = quantite;
        this.gain = gain;
        this.categorieId = categorieId;
    }

    public Article(String nom, int quantite, float gain, Categorie categorieId) {
        this.nom = nom;
        this.quantite = quantite;
        this.gain = gain;
        this.categorieId = categorieId;
    }

    public Article(String nom, int quantite, float gain) {
        this.nom = nom;
        this.quantite = quantite;
        this.gain = gain;
    }
    
    public Article(String nom, int quantite, Categorie categorieId) {
        this.nom = nom;
        this.quantite = quantite;
        this.categorieId = categorieId;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getGain() {
        return gain;
    }

    public void setGain(float gain) {
        this.gain = gain;
    }

    public Categorie getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Categorie categorieId) {
        this.categorieId = categorieId;
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
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nom;
    }

    public List<Achat> getAchatList() {
        return achatList;
    }

    public void setAchatList(List<Achat> achatList) {
        this.achatList = achatList;
    }

 
    
}
