/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usbcali.lista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac20
 */
public class Listas {
    
    private List<Jugador> jugadoresIniciales;
    private List<Jugador> jugadoresSuplentes;
    
    
    
    public Listas() {
        
        this.jugadoresIniciales = new ArrayList<Jugador>();
        this.jugadoresSuplentes = new ArrayList<Jugador>();
    }
    
    public void agregarJugadorInicial( Jugador jugador ){
        
        this.jugadoresIniciales.add( jugador );
    }
    
    public void agregarJugadorSuplente( Jugador jugador ){
        
        this.jugadoresSuplentes.add( jugador );
    }
    
    
    public void imprimirListasIniciales(){
        
        for( int i = 0; i < this.jugadoresIniciales.size(); i ++ ){
            
            System.out.println( this.jugadoresIniciales.get( i ).getNumero()+ " - " + this.jugadoresIniciales.get( i ).getNombre()  );
        }
        
        System.out.println("\n");
        
        
        for( int i = 0; i < this.jugadoresSuplentes.size(); i ++ ){
            
            System.out.println(  this.jugadoresSuplentes.get( i ).getNumero()+ " - " + this.jugadoresSuplentes.get( i ).getNombre()  );
        }
    }
    
    
    
    public void hacerCambio( int camisetaTitular, int camisetaSuplente ){
        
       int posicionTitular = buscarPosicionIniciales(camisetaTitular);
       int posicionSuplente= buscarPosicionSuplentes(camisetaSuplente);
       
       
       Jugador jugadorPivote = this.jugadoresIniciales.get( posicionTitular );
       this.jugadoresIniciales.set( posicionTitular, this.jugadoresSuplentes.get(posicionSuplente) );
       this.jugadoresSuplentes.set( posicionSuplente, jugadorPivote );
    }
    
    private int buscarPosicionIniciales( int numeroCamiseta ){
       
        for( int i = 0; i < this.jugadoresIniciales.size(); i++ ){
            
            if( numeroCamiseta == this.jugadoresIniciales.get(i).getNumero() ){
                return i;
            }
        }
        return -1;
    }
    
    
    
    private int buscarPosicionSuplentes( int numeroCamiseta ){

        
        for( int i = 0; i < this.jugadoresSuplentes.size(); i++ ){
            
            if( numeroCamiseta == this.jugadoresSuplentes.get(i).getNumero() ){
                return i;
            }
        }
        return -1;
    }
    
    
    
    
    public void organizarMayorAMenorTitulares(){
        
        int n        = this.jugadoresIniciales.size();
        Jugador temp = new Jugador();
        
        
        for (int i = 0; i < n; i++) {
            
          for (int j = 1; j < (n - i); j++) {
              
            if ( this.jugadoresIniciales.get( j - 1 ).getNumero() < this.jugadoresIniciales.get( j ).getNumero()  ) {
                
              //Code to swap the elements
              
              temp = this.jugadoresIniciales.get( j - 1 );
              this.jugadoresIniciales.set( (j - 1 ), this.jugadoresIniciales.get( j ) );
              this.jugadoresIniciales.set( j, temp );
            }
          }
          
        }
    }
    
    
    
    
    
    public void organizarMayorAMenorSuplentes(){
        
        int n        = this.jugadoresSuplentes.size();
        Jugador temp = new Jugador();
        
        
        for (int i = 0; i < n; i++) {
            
          for (int j = 1; j < (n - i); j++) {
              
            if ( this.jugadoresSuplentes.get( j - 1 ).getNumero() < this.jugadoresSuplentes.get( j ).getNumero()  ) {
                
              //Code to swap the elements
              
              temp = this.jugadoresSuplentes.get( j - 1 );
              this.jugadoresSuplentes.set( (j - 1 ), this.jugadoresSuplentes.get( j ) );
              this.jugadoresSuplentes.set( j, temp );
            }
          }
          
        }
    }
}
