/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author vanes
 */
public class Mascota {
    private String _nombreMascota;
    private char _sexoMascota;
    
    public Mascota() {
    }

    public Mascota(String _nombreMascota, char _sexoMascota) {
        this._nombreMascota = _nombreMascota;
        this._sexoMascota = _sexoMascota;
    }

    public String getNombreMascota() {
        return _nombreMascota;
    }

    public char getSexoMascota() {
        return _sexoMascota;
    }

    public void setNombreMascota(String _nombreMascota) {
        this._nombreMascota = _nombreMascota;
    }

    public void setSexoMascota(char _sexoMascota) {
        this._sexoMascota = _sexoMascota;
    }
}
