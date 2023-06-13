package Parcial3.Repository;

import Parcial3.Modelo.Juego;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

abstract class Imp implements Int {
    private List<Juego> juegos = new ArrayList();

    public Imp() throws IOException, ClassNotFoundException {
    }

    public Juego findByNum(int juegoNum) {
        return (Juego)this.juegos.stream().filter((juego) -> {
          return juego.JuegoNum == juegoNum;
        }).findFirst().orElse((Juego) null);
    }

    public List<Juego> findAll() throws IOException, ClassNotFoundException {
        this.juegos = (List)Serializacion.reader("Juego.ax");
        return this.juegos;
    }

    public void save(Juego juego) throws IOException {
        this.juegos.add(juego);
        Serializacion.writer(this.juegos, "Juego.ax");
    }

    public void update(Juego juego) throws IOException, ClassNotFoundException {
        Juego oldJuego = this.findByNum(juego.getJuegoNum());
        if (oldJuego != null) {
            this.juegos.remove(oldJuego);
            this.juegos.add(juego);
        }

        Serializacion.writer(this.juegos, "Juego.ax");
    }

    public void delete(Juego juego) throws IOException {
        this.juegos.remove(juego);
        Serializacion.writer(this.juegos, "Juego.ax");
    }
}