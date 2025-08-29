package me.gonzager.ex.operaciones.Drones;

public class Sensor {
    public final Integer capacidad;
    public final Integer durabilidad;
    public final Boolean mejorasTecnologicas;

    public Sensor(Integer capacidad, Integer durabilidad, Boolean mejorasTecnologicas) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTecnologicas = mejorasTecnologicas;
    }

    public Integer eficienciaOperativa() {
        if (mejorasTecnologicas) {
            return capacidad * 2;
        }
        else {
            return capacidad;
        }
    }

    public Boolean esDuradero() {
        return durabilidad > 2 * capacidad;
    }

    
}
