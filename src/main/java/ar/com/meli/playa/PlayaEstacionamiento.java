package ar.com.meli.playa;

import java.util.LinkedList;

public class PlayaEstacionamiento extends Playa {

    static PlayaEstacionamiento unique = new PlayaEstacionamiento();

    public static PlayaEstacionamiento get_instance() {
        if (unique == null ) unique = new PlayaEstacionamiento();
        return unique;
    }

    private PlayaEstacionamiento() {
        this.vehiculos = new LinkedList<Vehiculo>();
    }

    public void add_vehicle(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
}
