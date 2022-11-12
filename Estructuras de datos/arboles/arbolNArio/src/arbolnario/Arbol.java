/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolnario;

/**
 *
 * @author mac20
 */
public class Arbol {
    
    
    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return this.raiz;
    }

   Nodo resultado = null;
   
   
   public Nodo buscarRecursivo( String padre ){
       resultado = null;
       return buscarRecursivo( raiz, padre );
   }
   
   
   public Nodo buscarRecursivo( Nodo nodo, String padre ){
       
       if( nodo == null ) resultado = null;
       
       System.out.println("Buscando, nodo actual: " + nodo.getNombre() + " nodo Padre: " + padre );
       
       if( padre == nodo.getNombre() ) resultado = nodo;
       
       
       for( Nodo hijo: nodo.getHijos() ){
           if( resultado != null ) break;
           else buscarRecursivo( hijo, padre );
       }
       
       return resultado;
   }
    
   
   
   
   public void insertarNodo( String nombre, String padre ){
       
       if( getRaiz() == null ){
           
           System.out.println("Insertando nodo raiz");
           this.raiz = new Nodo( nombre );
       }
       else{
           
           Nodo nodoPadre = buscarRecursivo(padre );
           
           System.out.println("Nodo padre: " + nodoPadre.getNombre() );
           
           if( nodoPadre != null ) { 
               nodoPadre.agregarHijo( new Nodo( nombre ) );    
           }
           else raiz.getHijos().add( new Nodo( nombre ) );
       }
   }
   
   
   
}
