/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;

import models.Vente;

/**
 *
 * @author Miftah
 */
public interface IVente {
        Vente addVente(Vente v);
         List<Vente> allVentes();

     List<Vente> allVente();
    
}
