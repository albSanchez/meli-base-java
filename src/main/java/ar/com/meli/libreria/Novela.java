package ar.com.meli.libreria;

import java.util.Date;

public class Novela extends Libro implements Alquilable {

    String autor;
    String edicion;

    Boolean alquilado;

    public Novela(String editorial, String titulo, String autor, String edicion) {
        super(editorial, titulo);
        this.autor = autor;
        this.edicion = edicion;
    }

    @Override
    public void alquilar() {

    }
}
