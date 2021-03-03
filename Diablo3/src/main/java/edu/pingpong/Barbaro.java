package edu.pingpong;

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

    @Override
    public void equiparArmaDerecha(Arma arma) {
        this.armas.put("Mano Derecha", arma);
    }

    @Override
    public void equiparArmaIzquierda(Arma arma) {
        this.armas.put("Mano Izquierda", arma);
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
        return 0;
    }
}
