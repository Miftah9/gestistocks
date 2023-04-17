/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import javax.persistence.*;
import models.Article;
import utils.EntityManagerUtil;
import dao.IArticle;

/**
 *
 * @author HP
 */

/**
 * Classe ArticleService implémentant l'interface IArticle pour gérer les
 * entités de type Categorie. Cette classe utilise l'EntityManager pour
 * interagir avec la base de données.
 */
public class ArticleService implements IArticle {

    // Initialisation de l'EntityManager à null
    private EntityManager EM = null;

    // Initialisation de l'EntityManager dans le constructeur en utilisant la classe EntityManagerUtil
    public ArticleService() {
        EM =  EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    // Ajout d'un nouveau article dans la base de données
    @Override
    public Article addArticle(Article a) {
        EntityTransaction et = null;
        Article articleSaved;
        try {
            // Récupération de l'objet de transaction
            et = EM.getTransaction();
            // Début de la transaction
            et.begin();
            // Persistance du article dans la base de données
            EM.persist(a);
            EM.flush(); // Synchronisation de l'état de l'entité avec la base de données
            // Validation de la transaction
            et.commit();
            // Affectation du article persisté à la variable articleSaved
            articleSaved = a;
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (et == null && et.isActive()) {
                et.rollback();
            }
            // Affichage d'un message d'erreur et relance de l'exception
            System.err.println("Erreur lors de l'insertion de la article " + ex.getMessage());
            throw ex;
        }
        // Retour du article persisté
        return articleSaved;
    }
     // supprimer dans la base de données
    @Override
    public Article deleteArticle(Article a) {
EntityTransaction et = null;
Article articleSaved = null; //initialisation de la variable articleSaved à null
try {
// Récupération de l'objet de transaction
et = EM.getTransaction();
// Début de la transaction
et.begin();
// Recherche de l'article correspondant dans la base de données
articleSaved = EM.find(Article.class, a.getId());
if (articleSaved != null) {
// Suppression de l'article dans la base de données
EM.remove(articleSaved);
// Synchronisation de l'état de l'entité avec la base de données
EM.flush();
// Validation de la transaction
et.commit();
}
} catch (Exception ex) {
// Gestion des erreurs : annulation de la transaction en cas d'échec
if (et != null && et.isActive()) { // Correction : Vérification que et n'est pas null avant d'appeler isActive()
et.rollback();
}
// Affichage d'un message d'erreur et relance de l'exception
System.err.println("Erreur lors de la suppression de l'article " + ex.getMessage());
throw ex;
}
// Retour de l'article supprimé ou null si l'article n'a pas été trouvé dans la base de données
return articleSaved;
}
    
        @Override
    public Article updateArticle(Article a) {
EntityTransaction et = null;
Article articleSaved = null; //initialisation de la variable articleSaved à null
try {
// Récupération de l'objet de transaction
et = EM.getTransaction();
// Début de la transaction
et.begin();
// Recherche de l'article correspondant dans la base de données
articleSaved = EM.find(Article.class, a.getId());
if (articleSaved != null) {
// Suppression de l'article dans la base de données
EM.merge(articleSaved);
// Synchronisation de l'état de l'entité avec la base de données
EM.flush();
// Validation de la transaction
et.commit();
}
} catch (Exception ex) {
// Gestion des erreurs : annulation de la transaction en cas d'échec
if (et != null && et.isActive()) { // Correction : Vérification que et n'est pas null avant d'appeler isActive()
et.rollback();
}
// Affichage d'un message d'erreur et relance de l'exception
System.err.println("Erreur lors de la suppression de l'article " + ex.getMessage());
throw ex;
}
// Retour de l'article supprimé ou null si l'article n'a pas été trouvé dans la base de données
return articleSaved;
}

    // Retourner la liste de tous les articles
    @Override
    public List<Article> allArticles() {
        List<Article> articleList;

        try {
            // Exécution de la requête pour récupérer tous les articles
            articleList = EM.createNamedQuery("Article.findAll", Article.class).getResultList();
        } catch (PersistenceException ex) {
            // Gestion des erreurs et affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la récupération des articles " + ex.getMessage());
            throw ex;
        }
        // Retour de la liste de tous les articles
        return articleList;
    }

}
