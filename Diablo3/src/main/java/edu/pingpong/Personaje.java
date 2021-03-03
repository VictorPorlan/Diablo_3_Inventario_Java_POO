package edu.pingpong;

public interface Personaje {
    void equiparArmaDerecha(Arma arma);
    void equiparArmaIzquierda(Arma arma);

    void desequiparArmaDerecha();
    void desequiparArmaIzquierda();

    int atacar();
}
