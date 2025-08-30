package me.gonzager.ex.operaciones.Drones;

import me.gonzager.ex.operaciones.Drones.Misiones.Mision;

public class DronComercial extends Dron {

    public DronComercial(Double autonomia, Mision mision, Integer procesamiento) {
        super(autonomia, mision, procesamiento);
    }

    @Override
    public Double eficienciaOperativa() {
        return super.eficienciaOperativa() * 1.1;
    }

    @Override
    public Boolean esAvanzadoSegunTipo() {
        return false;
    }

}
