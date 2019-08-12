package ar.com.meli.libreria;

import java.util.Date;

public abstract class Libro   {

    String editorial;

    public String getTitulo() {
        return titulo;
    }

    String titulo;

    public Libro(String editorial, String titulo) {
        this.editorial = editorial;
        this.titulo = titulo;
    }



}
