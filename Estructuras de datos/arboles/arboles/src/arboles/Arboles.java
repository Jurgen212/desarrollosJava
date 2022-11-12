/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arboles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author mac20
 */
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nodo raiz   = new Nodo("Menu principal "        , "A", null , true );
        Nodo hijo1  = new Nodo("Calculadoras tipo 1 "   , "B", raiz , false);
        Nodo hijo2  = new Nodo("Caluladoras tipo 2 "    , "C", raiz , true );
        Nodo hijo3  = new Nodo("Calculadora de bases"   , "D", hijo2, false);
        
        
        raiz.setHijos( hijo1 );
        raiz.setHijos( hijo2 );
        hijo2.setHijos( hijo3 );
        raiz.recorrerHjosNodoRaiz();
        
    }
    
}
