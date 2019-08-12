package ar.com.meli.libreria;

import java.time.Instant;
import java.util.Date;

public class Alquiler {

    Date fechaAquiler;
    Date fechaDevolucion;

    public String getNombre() {
        return nombre;
    }

    String nombre;

    public Alquiler(String nombre, Date fechaDevolucion) {
        this.nombre = nombre;
        this.fechaAquiler = Date.from(Instant.now());
        this.fechaDevolucion = fechaDevolucion;
    }








}
