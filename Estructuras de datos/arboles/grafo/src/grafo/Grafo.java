/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafo;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mac20
 */
public class Grafo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Lista de adyacencia de cada arista
        List<Edge> edges = Arrays.asList( new Edge ( 0, 1 ), new Edge(1, 2 ),
                new Edge(2, 0 ), new Edge( 2, 1 ), new Edge( 3, 2 ), 
                new Edge(4,   5 ), new Edge( 5, 4 ), new Edge( 4, 2 ), new Edge( 4, 3 ) );
        
        
        //Creamos grafo con la lista de adyacencias
        Graph grafo = new Graph( edges );
        
        grafo.imprimirGrafo(grafo);
    }
    
}
