/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Domain.Cliente;
import java.util.LinkedList;


/**
 *
 * @author francisco
 */
public class ClienteData {
    
    private LinkedList<Cliente> clientes;

    public ClienteData() {
        clientes = new LinkedList<Cliente>();
    }
    
    public boolean insertarCliente(Cliente cliente){
        clientes.push(cliente);
        System.out.println(toString());
        return true;
    }

    @Override
    public String toString() {
        String mensaje = "\n\nLista de clientes\n\n";
        for(int i=0; i<clientes.size(); i++){
            mensaje += "Cédula: "+ clientes.get(i).getCedula();
            mensaje += "\nNombre: "+ clientes.get(i).getNombre();
            mensaje += "\nApellidos: "+ clientes.get(i).getApellidos();
            mensaje += "\nTelefono: "+ clientes.get(i).getTelefono();
            mensaje += "\nEmail: "+ clientes.get(i).getEmail();
        }
        return mensaje;
    }
    
}
