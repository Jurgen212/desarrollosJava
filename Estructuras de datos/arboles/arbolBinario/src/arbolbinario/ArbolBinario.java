/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author mac20
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Arbol arbol = new Arbol();
        
        arbol.insertar (9,"Manzanas");
        arbol.insertar(3,"Peras");
        arbol.insertar(5,"Uvas");
        arbol.insertar(2,"Naranjas");
        
        arbol.recorrer(arbol.raiz);
    }
    
}
