/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.Role;

/**
 *
 * @author Miftah
 */
public interface IRole {
       /**
     * Ajoute une nouvelle catégorie à la base de données.
     *
     * @param r
     * @return L'objet Categorie ajouté et persisté dans la base de données.
     */
    Role addRole(Role r);

    /**
     * Récupère la liste de toutes les catégories stockées dans la base de données.
     *
     * @return Une liste d'objets Categorie représentant toutes les catégories
     *         enregistrées dans la base de données.
     */
    List<Role> allRoles();

    /**
     * Récupère une catégorie par son nom.
     *
     * @param name Le nom de la catégorie à récupérer.
     * @return L'objet Categorie correspondant au nom donné, ou null si aucune
     *         catégorie avec ce nom n'existe dans la base de données.
     */
    Role getRoleByName(String name);
    
}
