package me.gonzager.ex.operaciones.Drones.Misiones;

import me.gonzager.ex.operaciones.Drones.Dron;

public class Transporte extends Mision{
    private static final Transporte instance = new Transporte();

    public Transporte(){};

    public Transporte getInstance(){
        return instance;
    };

    @Override
    public Integer eficienciaOperativa() {
        return 100;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return dron.getAutonomia() >= 50;
    }
}
