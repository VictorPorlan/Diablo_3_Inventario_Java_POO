package edu.pingpong;

import edu.pingpong.armas.Arco;
import edu.pingpong.armas.Arma;
import edu.pingpong.armas.Espada;
import edu.pingpong.personajes.Barbaro;
import edu.pingpong.personajes.Personaje;
import org.junit.Before;

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
    public void equiparArmaDerechaBienTest(){
        barbaro.equiparArmaDerecha(espada1);
        assertEquals("Nombre: " + "Víctor" + '\n' +
                "Mano Derecha: " + "Espada Larga" + '\n'+
                "Mano Izquierda" + "Mano vacia" + '\n',barbaro.toString());
    }
}
