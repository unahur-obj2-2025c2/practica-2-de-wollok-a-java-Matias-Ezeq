package me.gonzager.ex.operaciones.Drones.Misiones;

import me.gonzager.ex.operaciones.Drones.Dron;

public class Exploracion extends Mision{
    private static final Exploracion instance = new Exploracion();

    public Exploracion () {}

    public static Exploracion getInstance() {
        return instance;
    }

    @Override
    public Integer eficienciaOperativa() {
        return 0;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return (dron.eficienciaOperativa()%2 == 0);
    }

}
