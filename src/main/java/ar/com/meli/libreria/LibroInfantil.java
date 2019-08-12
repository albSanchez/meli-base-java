package ar.com.meli.libreria;

import java.util.Date;

public class LibroInfantil extends Libro  {

    Integer edadDesde = 0;
    Integer edadHasta = 0;

    public LibroInfantil(String editorial, String titulo, Integer edadDesde, Integer edadHasta) {
        super(editorial, titulo);
        this.edadDesde = edadDesde;
        this.edadHasta = edadHasta;
    }


}
