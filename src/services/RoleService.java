/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.IRole;
import java.util.List;
import javax.persistence.*;
import models.Role;
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
public class RoleService implements IRole {

    private EntityManager EM = null;

    // Constructeur qui initialise l'EntityManager
    public RoleService() {
        EM =  EntityManagerUtil.getEntityManagerFactory().createEntityManager();
    }

    // Ajouter une nouvelle catégorie dans la base de données
    @Override
    public Role addRole(Role r) {
        EntityTransaction et = null;
        Role roleSaved;
        try {
            // Récupération de l'objet de transaction
            et = EM.getTransaction();
            // Début de la transaction
            et.begin();
            // Persistance de la catégorie dans la base de données
            EM.persist(r);
            EM.flush();
            // Validation de la transaction
            et.commit();
            // Affectation de la catégorie persistée à la variable categorieSaved
            roleSaved = r;
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
        return roleSaved;
    }

    // Récupérer toutes les catégories depuis la base de données
    @Override
    public List<Role> allRoles() {
        List<Role> roleList;
        try {
            // Récupération de toutes les catégories de la base de données
            roleList = EM.createNamedQuery("Role.findAll", Role.class).getResultList();
        } catch (PersistenceException ex) {
            // Gestion des erreurs et affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la recuperation des Role " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
        // Retourne la liste des catégories récupérées
        return roleList;
    }

    // Récupérer une catégorie par son nom depuis la base de données
    @Override
    public Role getRoleByName(String name) {
        Role role;
        try {
            // Récupération de la catégorie par son nom depuis la base de données
            role = EM.createNamedQuery("Role.findByNom", Role.class)
                    .setParameter("nom", name)
                    .getSingleResult();
        } catch (PersistenceException ex) {
            // Gestion des erreurs et affichage d'un message d'erreur approprié
            System.err.println("Erreur lors de la recuperation de la Role " + ex.getMessage());
            // Relance de l'exception pour permettre une gestion plus avancée par l'appelant
            throw ex;
        }
        // Retourne la catégorie récupérée
        return role;
    }
}
