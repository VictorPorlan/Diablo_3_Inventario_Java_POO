package edu.pingpong.personajes;

import edu.pingpong.armas.Arma;

public interface Personaje {
    void equiparArmaDerecha(Arma arma);
    void equiparArmaIzquierda(Arma arma);

    void desequiparArmaDerecha();
    void desequiparArmaIzquierda();

    int atacar();
}
