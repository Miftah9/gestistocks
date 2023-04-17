/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.Client;

/**
 *
 * @author Miftah
 */
public interface IClient {
Client updateClient(Client client);
void deleteClient(Client client);
Client findClientById(Long id);
List<Client> allClient();
Client addClient(Client client) ;
    
}
