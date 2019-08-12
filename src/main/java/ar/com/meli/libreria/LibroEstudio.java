package ar.com.meli.libreria;

import java.util.Date;

public class LibroEstudio extends Libro implements Alquilable {


    String temaEstudio;
    Boolean alquilado;

    public LibroEstudio(String editorial, String titulo, String temaEstudio) {
        super(editorial, titulo);
        this.temaEstudio = temaEstudio;
    }


    @Override
    public void alquilar() {

    }
}
