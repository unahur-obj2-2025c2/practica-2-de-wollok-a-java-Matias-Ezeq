package me.gonzager.ex.operaciones.Drones;

public abstract class Dron {
    private Double autonomia = 0.0;
    private static Integer procesamiento = 0;
    private Mision mision;

    public Dron(Double autonomia, Mision mision) {
        this.autonomia = autonomia;
        this.mision = mision;
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

    public Double eficienciaOperativa(){
        return autonomia * 10 + mision.eficienciaOperativa();
    }

    public abstract Boolean esAvanzadoSegunTipo();

    public void disminuirAutonomia() {
        autonomia = autonomia * 0.95;
    }

}
