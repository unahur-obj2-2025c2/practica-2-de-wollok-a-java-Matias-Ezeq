package me.gonzager.ex.operaciones.Drones;

import me.gonzager.ex.operaciones.Drones.Misiones.Mision;

public abstract class Dron {
    private Double autonomia = 0.0;
    private Integer procesamiento = 0;
    private Mision mision;

    public Dron(Double autonomia, Mision mision, Integer procesamiento) {
        this.autonomia = autonomia;
        this.mision = mision;
        this.procesamiento = procesamiento;
    }

    public Double getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
    }
    public Mision getMision() {
        return mision;
    }
    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public Integer eficienciaOperativa(){
        return autonomia.intValue() * 10 + mision.eficienciaOperativa();
    }

    public abstract Boolean esAvanzadoSegunTipo();

    public void disminuirAutonomia() {
        autonomia = autonomia * 0.95;
    }

}
