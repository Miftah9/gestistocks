/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.ICategorie;
import java.util.List;
import javax.persistence.*;
import models.Categorie;
import utils.EntityManagerUtil;

/**
 *
 * @author HP
 */


/**
 * Classe CategorieService implémentant l'interface ICategorie pour gérer les
 * entités de type Categorie. Cette classe utilise l'EntityManager pour
 * interagir avec la base de données.
 */
public class CategorieService implements ICategorie {

    private EntityManager EM = null;

    // Constructeur qui initialise l'EntityManager
    public CategorieService() {
        EM =  EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    // Ajouter une nouvelle catégorie dans la base de données
    @Override
    public Categorie addCategorie(Categorie c) {
        EntityTransaction et = null;
        Categorie categorieSaved;
        try {
            // Récupération de l'objet de transaction
            et = EM.getTransaction();
            // Début de la transaction
            et.begin();
            // Persistance de la catégorie dans la base de données
            EM.persist(c);
            EM.flush();
            // Validation de la transaction
            et.commit();
            // Affectation de la catégorie persistée à la variable categorieSaved
            categorieSaved = c;
        } catch (Exception ex) {
            // Gestion des erreurs : annulation de la transaction en cas d'échec
            if (et != null && et.isActive()) {
                et.rollback();
            }
            // Affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de l'insertion de la categorie " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
        // Retourne la catégorie persistée
        return categorieSaved;
    }

    // Récupérer toutes les catégories depuis la base de données
    @Override
    public List<Categorie> allCategories() {
        List<Categorie> categorieList;
        try {
            // Récupération de toutes les catégories de la base de données
            categorieList = EM.createNamedQuery("Categorie.findAll", Categorie.class).getResultList();
        } catch (PersistenceException ex) {
            // Gestion des erreurs et affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la recuperation des categories " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
        // Retourne la liste des catégories récupérées
        return categorieList;
    }

    // Récupérer une catégorie par son nom depuis la base de données
    @Override
    public Categorie getCategorieByName(String name) {
        Categorie categorie;
        try {
            // Récupération de la catégorie par son nom depuis la base de données
            categorie = EM.createNamedQuery("Categorie.findByNom", Categorie.class)
                    .setParameter("nom", name)
                    .getSingleResult();
        } catch (PersistenceException ex) {
            // Gestion des erreurs et affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la recuperation de la categorie " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
        // Retourne la catégorie récupérée
        return categorie;
    }
}
