/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac20
 */
public class Graph {
    
    //Lista con sublistas, donde cada sublista son la salida y entrada de cada arista ( lista de adyacentes )
    List <List  <Integer> > adjList = new ArrayList<>();

    
    //Constructor que recibe los aristas ( cada arista contiene su adyacencia )
    
    public Graph( List<Edge> edges ) {
        
        int n = valorMaximoVertice( edges  );
        asignarMemoriaAdyacencia( n );
        agregarBordesGrafo( edges );
    }
    
    
    public void imprimirGrafo( Graph graph ){
        
        //n es numero de vertices y src van a ser desde donde salen aristas
        int src = 0;
        int n = graph.adjList.size();
        
        //Cuando sean iguales es porque el ultimo vertice tiene un arista que le sale
        while( src < n ){
            
            
            //El get src nos devuelve el destino de la arista, y src va aumentando para ir cambiando de vertice, basicamente
            //Hallamos todos los aristas que salen desde el vertice src y luego en el while cambiamos de src vertice
            for( int dest: graph.adjList.get( src ) ){
                System.out.print("(" + src + " -----> " + dest  + ")\t");
            }
            System.out.println();
            src ++;
        }
        
    }
    
    
    
    //Encuentra el vertice con maximo valor
    private int valorMaximoVertice( List<Edge> edges ){
        int n = 0;
        for( Edge e: edges ){
            
            //Cada arista se pregunta si el mayor es su src o dest, y lo compara con las anteriores aristas
            n = Integer.max(n, Integer.max( e.src, e.dest) );
        }
        return n;
    }
    
    
    //Asignar memoria para la lista de adyacencia ( crear instancias en la lista de listas, el numero de instancias es el numero de aristas )
    private void asignarMemoriaAdyacencia( int nVertices ){
        
         for (int i = 0; i <= nVertices; i++) {
            adjList.add(i, new ArrayList<>());
        }
    }
    
    
    private void agregarBordesGrafo( List<Edge> edges ){
        
        for (Edge current: edges){
            // asignar un nuevo nodo en la lista de adyacencia de src a dest
            adjList.get(current.src).add(current.dest);
 
            // elimine el comentario debajo de la línea para el graph no dirigido
            // asignar un nuevo nodo en la lista de adyacencia de dest a src
            //adjList.get(current.dest).add(current.src);
        }
    }
}
