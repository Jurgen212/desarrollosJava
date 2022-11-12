/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.usbcali.lista;

/**
 * s
 * @author mac20
 */
public class Main {

    public static void main(String[] args) {
        Listas listaJugadores = new Listas();
        
        listaJugadores.agregarJugadorInicial( new Jugador( 1, "David Ospina" , "Arquero"     ) );
        listaJugadores.agregarJugadorInicial( new Jugador( 2, "Pepe1"        , "Delantero"   ) );
        listaJugadores.agregarJugadorInicial( new Jugador( 3, "Pepe2"        , "Central"     ) );
        listaJugadores.agregarJugadorInicial( new Jugador( 4, "Pepe3"        , "Lateral"     ) );
        listaJugadores.agregarJugadorInicial( new Jugador( 5, "Pepe4"        , "Lateral"     ) );
        listaJugadores.agregarJugadorInicial( new Jugador( 11, "Pepe5"        , "Central"     ) );
        listaJugadores.agregarJugadorInicial( new Jugador( 7, "Pepe6"        , "Medio"       ) );
        listaJugadores.agregarJugadorInicial( new Jugador( 8, "Pepe7"        , "Medio"       ) );

       
        listaJugadores.agregarJugadorSuplente( new Jugador( 1, "David OspinaSuplente" , "Arquero"     ) );
        listaJugadores.agregarJugadorSuplente( new Jugador( 2, "Pepe1Suplente"        , "Delantero"   ) );
        listaJugadores.agregarJugadorSuplente( new Jugador( 3, "Pepe2Suplente"        , "Central"     ) );
        listaJugadores.agregarJugadorSuplente( new Jugador( 4, "Pepe3Suplente"        , "Lateral"     ) );
        listaJugadores.agregarJugadorSuplente( new Jugador( 5, "Pepe4Suplente"        , "Lateral"     ) );
        listaJugadores.agregarJugadorSuplente( new Jugador( 6, "Pepe5Suplente"        , "Central"     ) );
        listaJugadores.agregarJugadorSuplente( new Jugador( 12, "Pepe6Suplente"        , "Medio"       ) );
        listaJugadores.agregarJugadorSuplente( new Jugador( 8, "Pepe7Suplente"        , "Medio"       ) );

        
        listaJugadores.imprimirListasIniciales();
        
        System.out.println("\n Invertidas");
        
        listaJugadores.hacerCambio( 3, 8);
        listaJugadores.organizarMayorAMenorTitulares();
        listaJugadores.organizarMayorAMenorSuplentes();
        
        listaJugadores.imprimirListasIniciales();
       
    }
}
