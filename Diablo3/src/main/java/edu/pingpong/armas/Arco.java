package edu.pingpong.armas;

public class Arco implements Arma{
    private int ataque;
    private final String nombre;
    private final boolean unaMano;

    public Arco(int ataque, String nombre, boolean unaMano) {
        this.ataque = ataque;
        this.nombre = nombre;
        this.unaMano = false;
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
