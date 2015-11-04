/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Domain.Automovil;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author yordan
 */
public class AutoData {
    private LinkedList<Automovil> automoviles;

    public AutoData() {
        automoviles = new LinkedList<Automovil>();
    }
    
    public void insertarAuto(Automovil auto){
        automoviles.push(auto);
        JOptionPane.showMessageDialog(null, "Automovil ingresado con éxito");
    }
}
