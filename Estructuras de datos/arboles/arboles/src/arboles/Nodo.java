/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac20
 */


public class Nodo {
    
    private String nombre,  ruta ;
    private Nodo            padre;
    private List<Nodo>      hijos;
    
    
    public Nodo(){}

    public Nodo(String nombre, String ruta, Nodo padre, boolean hijos ) {
        this.nombre = nombre;
        this.ruta   = ruta  ;
        this.padre  = padre ;
        
        if( hijos ) this.hijos = new ArrayList<Nodo>();
        else this.hijos = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Nodo getPadre() {
        return padre;
    }
    
    public List<Nodo> getHijos(){
        return this.hijos;
    }
    
    public void setHijos( Nodo e  ){
        this.hijos.add( e );
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    @Override
    public String toString() {
        return "Nodo{" + "nombre=" + nombre + ", ruta=" + ruta + ", padre=" + padre + ", hijos=" + hijos + '}';
    }  
    
    
    public void recorrerHjosNodoRaiz(){
        String nombre;
        
        if( this.getHijos() == null ){
            System.out.println("Nodo: " + this.getNombre() + " padre: " + this.getPadre().getNombre() + " Ruta: " + this.getRuta() );
            return;
        }
        else{
            if( this.getPadre() == null ) nombre = "Raiz ";
            else nombre = this.getPadre().getNombre();
            
            System.out.println("Nodo: " + this.getNombre() + " Padre: "+ nombre + " Ruta: " + this.getRuta() );
            System.out.println("");
            
            int size = this.getHijos().size();
            
            for( int i = 0; i < size; i ++ ){
                this.getHijos().get( i ).recorrerHjosNodoRaiz();
            }
        }
    }
}
