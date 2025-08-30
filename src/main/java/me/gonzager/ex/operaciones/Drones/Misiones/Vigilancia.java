package me.gonzager.ex.operaciones.Drones.Misiones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.Drones.Dron;
import me.gonzager.ex.operaciones.Drones.Sensor;

public class Vigilancia extends Mision{
    private List<Sensor> sensores = new ArrayList<>();

    public Vigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public List<Sensor> getSensores() {
        return(new ArrayList<>(sensores));
    };

    @Override
    public Integer eficienciaOperativa() {
        return sensores.stream().mapToInt(sensor -> sensor.eficienciaOperativa()).sum();
    }

    @Override
    public Boolean esAvanzadoSegunMision(Dron dron) {
        return sensores.stream().allMatch(sensor -> sensor.esDuradero() == true); //se ve feo esto
    }

}
