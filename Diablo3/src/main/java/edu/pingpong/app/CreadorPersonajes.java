package edu.pingpong.app;

import edu.pingpong.armas.Arco;
import edu.pingpong.armas.Arma;
import edu.pingpong.armas.Espada;
import edu.pingpong.personajes.Barbaro;
import edu.pingpong.personajes.Personaje;

public class CreadorPersonajes
{
    public static void main( String[] args )
    {
        /** Creamos un nuevo personaje y 2 armas para equiparle */

        Personaje barbaro = new Barbaro("Víctor");
        Arma espada1 = new Espada(25, "Espada larga", true);
        Arma espada2 = new Espada(30, "Espada curva", true);
        Arma arco = new Arco(35, "Arco curvo", false);

        /** Le equipamos un arma en la mano derecha */

        barbaro.equiparArmaDerecha(espada1);

        /** Comprobamos sus armas equipadas*/
        System.out.println(barbaro.toString());

        barbaro.equiparArmaIzquierda(arco);

        System.out.println(barbaro.toString());
    }
}
