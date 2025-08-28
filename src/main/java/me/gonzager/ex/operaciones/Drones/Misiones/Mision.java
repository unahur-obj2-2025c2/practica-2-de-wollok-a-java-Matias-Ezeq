package me.gonzager.ex.operaciones.Drones.Misiones;

import me.gonzager.ex.operaciones.Drones.Dron;

public abstract class Mision {
    public abstract Integer eficienciaOperativa();

    public abstract Boolean esAvanzadoSegunMision(Dron dron);
}
