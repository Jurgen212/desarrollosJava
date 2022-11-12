/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolnario;

/**
 *
 * @author mac20
 */
public class ArbolNArio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Arbol arbol = new Arbol();
        
        arbol.insertarNodo("raiz", null);
        arbol.insertarNodo("a", "raiz");
        arbol.insertarNodo("b", "a");
        arbol.insertarNodo("c", "a");
        arbol.insertarNodo("d", "a");
        arbol.insertarNodo("e", "d");
        arbol.insertarNodo("f", "e");
        arbol.insertarNodo("g", "e");
        arbol.insertarNodo("1", "raiz");
        arbol.insertarNodo("2", "1");
        arbol.insertarNodo("3", "raiz");
        
        System.out.println( arbol.toString() );
    }
    
}
