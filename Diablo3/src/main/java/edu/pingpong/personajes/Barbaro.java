package edu.pingpong.personajes;
import edu.pingpong.armas.Arma;
import edu.pingpong.armas.Espada;

import java.util.HashMap;
import java.util.Map;

public class Barbaro implements Personaje{
    private String nombre;
    private Map<String, Arma> armas = new HashMap();

    public Barbaro(String nombre) {
        this.nombre = nombre;
        armas.put("Mano derecha", null);
        armas.put("Mano Izquierda", null);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void equiparArmaDerecha(Arma arma) {
        if (arma instanceof Espada) {
            this.armas.put("Mano Derecha", arma);
        }
    }

    @Override
    public void equiparArmaIzquierda(Arma arma) {
        if (arma instanceof Espada) {
            this.armas.put("Mano Izquierda", arma);
        }
    }

    @Override
    public void desequiparArmaDerecha() {
        this.armas.put("Mano Derecha", null);
    }

    @Override
    public void desequiparArmaIzquierda() {
        this.armas.put("Mano Izquierda", null);
    }

    @Override
    public int atacar() {
        return armas.get("Mano Derecha").getAtaque() + armas.get("Mano Izquierda").getAtaque();
    }

    public String getNombreManoDerecha(){
        if (armas.get("Mano Derecha") != null) {
            return armas.get("Mano Derecha").getNombre();
        }
        else
            return "Mano vacia";
    }
    public String getNombreManoIzquierda(){
        if (armas.get("Mano Izquierda") != null) {
            return armas.get("Mano Izquierda").getNombre();
        }
        else
            return "Mano vacia";
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + '\n' +
                "Mano Derecha: " + getNombreManoDerecha() + '\n'+
                "Mano Izquierda" + getNombreManoIzquierda() + '\n';
    }
}
