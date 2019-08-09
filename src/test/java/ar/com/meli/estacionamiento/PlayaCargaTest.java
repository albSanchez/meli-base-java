package ar.com.meli.estacionamiento;

import ar.com.meli.playa.Camion;
import ar.com.meli.playa.Camioneta;
import ar.com.meli.playa.PlayaCarga;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PlayaCargaTest {
    @Test
    public void crearPlayaCargaVacia() {
        PlayaCarga playa = PlayaCarga.getInstance();
        Assertions.assertThat(playa).isNotNull();
        Assertions.assertThat(playa.getVehicles()).isEmpty();
        playa.deleteInstance();
    }

    @Test
    public void agregarCamioneta() {
        PlayaCarga playa = PlayaCarga.getInstance();
        Camioneta camioneta = new Camioneta(20);
        playa.addVehicle(camioneta);
        Assertions.assertThat(playa.getVehicles().size()).isEqualTo(1);
        playa.deleteInstance();
    }

    @Test
    public void agregarCamion() {
        PlayaCarga playa = PlayaCarga.getInstance();
        Camion camion = new Camion(20);
        playa.addVehicle(camion);
        Assertions.assertThat(playa.getVehicles().size()).isEqualTo(1);
        playa.deleteInstance();
    }


    @Test
    public void agregarCargaCamioneta(){
        PlayaCarga playa = PlayaCarga.getInstance();
        Camioneta camioneta = new Camioneta(20);
        playa.addVehicle(camioneta);
        Assertions.assertThat(playa.getVehicles().size()).isEqualTo(1);
        playa.agregarCarga(5);
        Assertions.assertThat(playa.cargas.size()).isEqualTo(1);
        System.out.println("Cantidad carga despachada para camioneta es: "+playa.totalDespachado );
        playa.deleteInstance();
    }



    @Test
    public void agregarCargaCamion(){
        PlayaCarga playa = PlayaCarga.getInstance();
        Camion camion = new Camion(30);
        playa.addVehicle(camion);
        Assertions.assertThat(playa.getVehicles().size()).isEqualTo(1);
        playa.agregarCarga(10);
        Assertions.assertThat(playa.cargas.size()).isEqualTo(1);
        System.out.println("Cantidad carga despachada para camiones es: "+ playa.totalDespachado );
        playa.deleteInstance();
    }

}
