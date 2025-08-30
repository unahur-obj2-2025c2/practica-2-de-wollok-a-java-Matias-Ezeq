package me.gonzager.ex.operaciones.Drones;

import me.gonzager.ex.operaciones.Drones.Misiones.Mision;

public class DronSeguridad extends Dron {

    public DronSeguridad(Double autonomia, Mision mision, Integer procesamiento) {
        super(autonomia, mision, procesamiento);
    }

    @Override
    public Boolean esAvanzadoSegunTipo() {
        return this.procesamiento > 50;
    }
    
}
