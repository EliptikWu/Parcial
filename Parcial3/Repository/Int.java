package Parcial3.Repository;

import java.io.IOException;
import Parcial3.Modelo.Juego;
import java.util.List;

public interface Int {
    Juego findByNum(int var1);

    List<Juego> findAll() throws IOException, ClassNotFoundException;

    void save(Juego var1) throws IOException;

    void update(Juego var1) throws IOException, ClassNotFoundException;

    void delete(Juego var1) throws IOException;
}