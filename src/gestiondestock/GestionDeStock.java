/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondestock;

import dao.ICategorie;
import models.Categorie;
import services.CategorieService;
import utils.EntityManagerUtil;

/**
 *
 * @author Miftah
 */
public class GestionDeStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Créer une instance de CategorieService
          ICategorie ic = new CategorieService();
        
        // Créer 4 catégories
        //Categorie categorie1 = new Categorie("Electronique","Materiel Electronique");
        //Categorie categorie2 = new Categorie("Vêtements","Changer votre garde robe");
        //Categorie categorie3 = new Categorie("Maison","Equiper votre maison");
       // Categorie categorie4 = new Categorie("Alimentation","Choisissez la bonne alimentation");

        // Ajouter les catégories à la base de données
        //ic.addCategorie(categorie1);
        //ic.addCategorie(categorie2);




        // Fermer l'EntityManagerFactory à la fin de l'exécution
        EntityManagerUtil.closeEntityManagerFactory();
    }
    
}
