/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.LimiteStock;

/**
 *
 * @author Miftah
 */
public interface ILimiteStock {
    
    LimiteStock addLimiteStock(LimiteStock ls);
    List<LimiteStock> allLimiteStocks();
    
}
