/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usbcali.lista;

/**
 *
 * @author mac20
 */
public class Jugador {
    
    private int     numero;
    private String  nombre;
    private String  posiion;

    public Jugador(int numero, String nombre, String posiion) {
        this.numero = numero;
        this.nombre = nombre;
        this.posiion = posiion;
    }

    public Jugador() {
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "numero=" + numero + ", nombre=" + nombre + ", posiion=" + posiion + '}';
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosiion() {
        return posiion;
    }

    public void setPosiion(String posiion) {
        this.posiion = posiion;
    }
    
    
}
