package me.gonzager.ex.operaciones.Drones.Misiones;

import me.gonzager.ex.operaciones.Drones.Dron;

public class Exploracion extends Mision{

    @Override
    public Integer eficienciaOperativa() {
        return 0;
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return (dron.eficienciaOperativa().even()); //no se
    }

}
