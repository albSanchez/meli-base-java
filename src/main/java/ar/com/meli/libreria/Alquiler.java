package ar.com.meli.libreria;

import java.time.Instant;
import java.util.Date;
import java.util.function.Predicate;

public class Alquiler {

    String nombre;
    Date fechaAquiler;
    Date fechaDevolucion;


    public String getNombre() {
        return this.nombre;
    }

    public Alquiler(String nombre, Date fechaDevolucion) {
        this.nombre = nombre;
        this.fechaAquiler = Date.from(Instant.now());
        this.fechaDevolucion = fechaDevolucion;
    }

}
