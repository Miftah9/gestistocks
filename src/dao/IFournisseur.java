/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import java.util.List;
import models.Fournisseur;
/**
 *
 * @author Miftah
 */
public interface IFournisseur {
    Fournisseur addFournisseur(Fournisseur fournisseur);
    List<Fournisseur> allFournisseur();
    Fournisseur updateFournisseur(Fournisseur fournisseur);
    void deleteFournisseur(Fournisseur fournisseur);
    Fournisseur findFournisseurById(Long id);

}
