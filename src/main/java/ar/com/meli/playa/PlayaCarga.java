package ar.com.meli.playa;

import java.util.LinkedList;

public class PlayaCarga extends Playa {
    static PlayaCarga unique;
    public LinkedList<Integer> cargas = new LinkedList<Integer>();
    public Integer totalDespachado = 0;
    public Integer totalRestante = 0;

    public void agregarCarga(Integer carga) {
        this.cargas.add(carga);
        totalDespachado += carga;
    }


    public void despacharCarga(Utilitario utilitario){
        for (Integer carga :cargas) {
            if (carga < utilitario.pesoMaximo) {
                utilitario.addCarga(carga);
                this.totalRestante -= carga;
                this.totalDespachado += carga;
                cargas.remove();
                break;
            }
        }
    }



    public static PlayaCarga getInstance() {
        if (unique == null ) unique = new PlayaCarga();
        return unique;
    }

    public void deleteInstance(){
        unique = null;
    }

    private PlayaCarga() {
        this.vehiculos = new LinkedList<Vehiculo>();
    }

    public void addVehicle(Utilitario utilitario) {
        this.vehiculos.add(utilitario);
        this.despacharCarga(utilitario);
    }

}
