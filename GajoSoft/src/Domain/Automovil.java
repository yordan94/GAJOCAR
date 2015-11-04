/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author yordan
 */
public class Automovil {
    
    private String tipoMarcha;
    private String tipoCombustible;
    private String marca;
    private String modelo;
    private String placa;
    private String precioRenta;

    public Automovil() {
    }

    public String getTipoMarcha() {
        return tipoMarcha;
    }

    public void setTipoMarcha(String tipoMarcha) {
        this.tipoMarcha = tipoMarcha;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPrecioRenta() {
        return precioRenta;
    }

    public void setPrecioRenta(String precioRenta) {
        this.precioRenta = precioRenta;
    }
    
    
}
