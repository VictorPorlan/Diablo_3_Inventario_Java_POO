package edu.pingpong.armas;

public class Espada implements Arma{
    private int ataque;
    private final String nombre;
    private final boolean unaMano;

    public Espada(int ataque, String nombre, boolean unaMano) {
        this.ataque = ataque;
        this.nombre = nombre;
        this.unaMano = unaMano;
    }

    @Override
    public int getAtaque() {
        return this.ataque;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public boolean unaMano() {
        return this.unaMano;
    }
}
