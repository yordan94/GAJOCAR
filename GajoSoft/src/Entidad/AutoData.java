/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Domain.Automovil;
import java.util.LinkedList;

/**
 *
 * @author yordan
 */
public class AutoData {
    private LinkedList<Automovil> automoviles;

    public AutoData() {
        automoviles = new LinkedList<Automovil>();
    }
    
    public boolean insertarAuto(Automovil auto){
        automoviles.push(auto);
        System.out.println(toString());
        return true;
    }

    @Override
    public String toString() {
        String mensaje = "\n\nLista de carros\n\n";
        for(int i=0; i<automoviles.size(); i++){
            mensaje += "Marca: "+ automoviles.get(i).getMarca();
            mensaje += "\nModelo: "+ automoviles.get(i).getModelo();
            mensaje += "\nPrecio: "+ automoviles.get(i).getPrecioRenta();
        }
        return mensaje;
    }
    
    
}
