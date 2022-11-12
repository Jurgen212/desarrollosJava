/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author mac20
 */
public class Arbol {
    
    Nodo raiz;
    
    public Arbol(){
        raiz = null;
    }
    
    //Metodo para insertar 
    
    
    public void insertar( int i, Object content ){
        
        Nodo node = new Nodo( i );
        
        node.contenido  = content;
        
        if( raiz == null ) raiz = node;
        else{
            
            //Creamos un nodo auxiliar para buscar donde colocar el real
            
            Nodo aux = raiz;
            
            while( aux != null ){
                
                node.padre = aux;
                
                //Si el indice es mayor va a la derecha, de lo contrario a la izquierda ( vamos recorriendo y buscando binario )
                
                if( node.llave > aux.llave ){
                    aux = aux.derecha;
                }
                else{
                    aux = aux.izquierda;
                }  
            }
            
            
            //Si la llave del nodo actual es menor al indice del padre entonces se enlaza a la izquierda dentro del arbol
            if( node.llave < node.padre.llave ){
                node.padre.izquierda = node;
            }
            else{
                node.padre.derecha = node;
            }
        }
    }
    
    
    //Recorrido inorden 
    
    public void recorrer( Nodo n ){
        
        if( n != null ){
            recorrer(n.izquierda);
            System.out.println("Indice: " + n.llave + " contenido " + n.contenido );
            recorrer( n.derecha );
        }
    }
    
    
    
    
    
    // CREAMOS UN CONSTRUCTOR
    private class Nodo{
    
        public Nodo padre, derecha, izquierda;
        public int llave;
        public Object contenido;
        
        //CREAMOS UN CONSTRUCTOR QUE RECIBA UN INDICE PERO NO LOS DEMAS ATRIBUTOS
        
        public Nodo(int indice){
            
        llave       =   indice;
        derecha     =null;
        izquierda   =null;
        padre       =null;
        contenido   =null;
    }

    }
}
