/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.Utilisateur;

/**
 *
 * @author Miftah
 */
public interface IUtilisateur {
    
    
    Utilisateur addUtilisateur(Utilisateur utilisateur);
    
     /**
     * Récupère la liste de tous les utilisateurs stockés dans la base de données.
     *
     * @return Une liste d'objets Utilisateur représentant tous les produits
     *         enregistrés dans la base de données.
     */
    List<Utilisateur> allUtilisateurs();
    void updateUtilisateur(Utilisateur utilisateur);

}
