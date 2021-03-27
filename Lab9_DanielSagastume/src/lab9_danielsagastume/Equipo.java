package lab9_danielsagastume;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String slogan;
    private String pais;
    private int campeonatos;
    private ArrayList<Jugador> jugadores=new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, String slogan, String pais, int campeonatos,ArrayList<Jugador>jugadores) {
        this.nombre = nombre;
        this.slogan = slogan;
        this.pais = pais;
        this.campeonatos = campeonatos;
        this.jugadores=jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
