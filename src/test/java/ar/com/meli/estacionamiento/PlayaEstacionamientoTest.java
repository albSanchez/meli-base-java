package ar.com.meli.estacionamiento;

import ar.com.meli.playa.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PlayaEstacionamientoTest {

    @Test
    public void crearPlayaEstacionamientoVacia() {
        PlayaEstacionamiento playa = PlayaEstacionamiento.get_instance();
        Assertions.assertThat(playa).isNotNull();
        Assertions.assertThat(playa.getVehicles()).isEmpty();
    }

    @Test
    public void agregarAuto() {
        PlayaEstacionamiento playa = PlayaEstacionamiento.get_instance();
        Auto auto = new Auto();
        playa.add_vehicle(auto);
        Assertions.assertThat(playa.getVehicles().size()).isEqualTo(1);
    }

    @Test
    public void agregarCamioneta() {
        PlayaEstacionamiento playa = PlayaEstacionamiento.get_instance();
        Camioneta camioneta = new Camioneta(20);
        playa.add_vehicle(camioneta);
        Assertions.assertThat(playa.getVehicles().size()).isEqualTo(2);

    }

    @Test
    public void agregarCamion() {
        PlayaEstacionamiento playa = PlayaEstacionamiento.get_instance();
        Camion camion = new Camion(20);
        playa.add_vehicle(camion);
        Assertions.assertThat(playa.getVehicles().size()).isEqualTo(3);
    }

}
