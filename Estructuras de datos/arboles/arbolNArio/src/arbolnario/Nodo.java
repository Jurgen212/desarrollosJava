/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolnario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac20
 */
public class Nodo {
    
    private String nombre;
    
    private List<Nodo> hijos = new ArrayList<>();

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    public Nodo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(List<Nodo> hijos) {
        this.hijos = hijos;
    }
       
    public void agregarHijo( Nodo hijoNuevo ){
        this.hijos.add( hijoNuevo );
    }

    @Override
    public String toString() {
        return "Nodo{" + "nombre=" + nombre + ", hijos=" + hijos + '}';
    }
    
    
    
}
