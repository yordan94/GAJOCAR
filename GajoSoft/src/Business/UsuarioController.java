/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Domain.Automovil;
import Domain.Cliente;
import Entidad.AutoData;
import Entidad.ClienteData;

/**
 *
 * @author yordan
 */
public class UsuarioController {

    public UsuarioController() {
    }
    
    public boolean InsertarAuto(Automovil auto){
        AutoData autoData = new AutoData();
        autoData.insertarAuto(auto);
        return true;
    }//InsertarAuto
    
    public boolean InsertarCliente(Cliente cliente){
        ClienteData clienteData = new ClienteData();
        clienteData.insertarCliente(cliente);
        return true;
    }//InsertarAuto
}
