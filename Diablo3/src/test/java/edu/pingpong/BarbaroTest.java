package edu.pingpong;

import edu.pingpong.armas.Arco;
import edu.pingpong.armas.Arma;
import edu.pingpong.armas.Espada;
import edu.pingpong.personajes.Barbaro;
import edu.pingpong.personajes.Personaje;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BarbaroTest {
    Personaje barbaro;
    Arma espada1;
    Arma espada2;
    Arma arco;

    @Before
    public void setUpBarbaro(){
         barbaro = new Barbaro("Víctor");
         espada1 = new Espada(25,"Espada larga", true);
         espada2 = new Espada(30,"Espada curva", true);
         arco = new Arco(20,"Arco curvo", false);
    }

    @Test
    public void equiparArmaDerechaBienTest(){
        barbaro.equiparArmaDerecha(espada1);
        assertEquals("Nombre: " + "Víctor" + '\n' +
                "Mano Derecha: " + "Espada larga" + '\n'+
                "Mano Izquierda: " + "Mano vacia" + '\n',barbaro.toString());
    }

    @Test
    public void equiparArmaDerechaErrorTest(){
        barbaro.equiparArmaDerecha(arco);
        assertEquals("Nombre: " + "Víctor" + '\n' +
                "Mano Derecha: " + "Mano vacia" + '\n'+
                "Mano Izquierda: " + "Mano vacia" + '\n',barbaro.toString());
    }

    @Test
    public void equiparArmaIzquierdaBienTest(){
        barbaro.equiparArmaIzquierda(espada1);
        assertEquals("Nombre: " + "Víctor" + '\n' +
                "Mano Derecha: " + "Mano vacia" + '\n'+
                "Mano Izquierda: " + "Espada larga" + '\n',barbaro.toString());
    }

    @Test
    public void equiparArmaIzquierdaErrorTest(){
        barbaro.equiparArmaIzquierda(arco);
        assertEquals("Nombre: " + "Víctor" + '\n' +
                "Mano Derecha: " + "Mano vacia" + '\n'+
                "Mano Izquierda: " + "Mano vacia" + '\n',barbaro.toString());
    }
}
