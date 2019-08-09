package ar.com.meli.playa;

import static java.lang.Integer.min;

public class Utilitario extends Vehiculo {
    Integer pesoMaximo;
    Integer carga;

    public Utilitario(Integer pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Integer getPesoMaximo() {
        return this.pesoMaximo;
    }

    public void addCarga(Integer carga) {
        this.carga = min(this.carga,pesoMaximo);
    }

}
