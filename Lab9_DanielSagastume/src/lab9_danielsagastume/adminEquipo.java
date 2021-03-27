/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_danielsagastume;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class adminEquipo {

    private ArrayList<Equipo> equipos = new ArrayList();
    private File archivo = null;

    public adminEquipo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Equipo t : equipos) {
                bw.write(t.getNombre()+";");
                bw.write(t.getSlogan()+";");
                bw.write(t.getPais()+";");
                bw.write(t.getCampeonatos()+";");
                for (int i = 0; i < t.getJugadores().size(); i++) {
                    bw.write(t.getJugadores().get(i).getNombre()+";");
                    bw.write(t.getJugadores().get(i).getApellido()+";");
                    bw.write(t.getJugadores().get(i).getNacionalidad()+";");
                    bw.write(t.getJugadores().get(i).getEdad()+";");
                    bw.write(t.getJugadores().get(i).getSexo()+";");
                    bw.write(t.getJugadores().get(i).getBalones_oro()+";");
                    bw.write(t.getJugadores().get(i).getCant_medallas()+";");
                    bw.write(t.getJugadores().get(i).getIsAtleta()+";");
                }
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        equipos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ArrayList<Jugador> jugadores = new ArrayList();
                    String nom_equipo = sc.next();
                    String slogan = sc.next();
                    String pais = sc.next();
                    int campeonato=sc.nextInt();
                    while (sc.hasNext()) {
                       jugadores.add(new Jugador(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next()));
                    }
                    equipos.add(new Equipo(nom_equipo,
                                slogan,
                                pais,
                                campeonato,
                                jugadores
                                )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
