package ar.com.meli.libreria;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.sql.Date;
import java.time.Instant;
import java.util.NoSuchElementException;

public class LibreriaTest {

    @Test
    public void crearLibreria() {
        Libreria libreria = Libreria.getInstance();
        Assertions.assertThat(libreria).isNotNull();
        Assertions.assertThat(libreria.getAquileres()).isEmpty();
        libreria.deleteInstance();
    }


    @Test
    public void agregandoUnAquiler() {
        Libreria libreria = Libreria.getInstance();
        Assertions.assertThat(libreria).isNotNull();
        Assertions.assertThat(libreria.getAquileres()).isEmpty();
        Alquiler alquiler = new Alquiler("Pepito", Date.from(Instant.now()));
        libreria.addAlquiler(alquiler);
        Assertions.assertThat(libreria.getAquileres().size()).isEqualTo(1);
        libreria.deleteInstance();
    }


    @Test
    public void buscarAlquiler() {
        Libreria libreria = Libreria.getInstance();
        Alquiler alquiler = new Alquiler("Harry Potter", Date.from(Instant.now()));
        libreria.addAlquiler(alquiler);

        // Encuentra el alquiler con el mismo nombre
        Assertions.assertThat(libreria.buscarAlquiler("Harry Potter")).isNotNull();

        // Lanza excepción si no encuentra
       boolean catcheo = false;
        try {
            libreria.buscarAlquiler("No Es Harry Potter");
        } catch (NoSuchElementException e) {
            catcheo = true;
        }
        Assertions.assertThat(catcheo).isTrue();
        libreria.deleteInstance();
    }

/*
    @Test
    public void agregarLibroEstudio() {
        Libreria libreria = Libreria.getInstance();
        Libro libroEstudio = new LibroEstudio("Pepito", "Ecuaciones", "Matematica");
        libreria.addLibro(libroEstudio);
        Assertions.assertThat(libreria.getLibros().size()).isEqualTo(1);
        libreria.deleteInstance();
    }


    @Test
    public void agregarLibroInfantil() {
        Libreria libreria = Libreria.getInstance();
        Libro libro = new LibroInfantil("Pepito","principito",5,10);
        libreria.addLibro(libro);
        Assertions.assertThat(libreria.getLibros().size()).isEqualTo(1);
        libreria.deleteInstance();
    }


    @Test
    public void agregarNovela() {
        Libreria libreria = Libreria.getInstance();
        Libro libro = new Novela("Pepito","Planeta Hulk","Nedved","Pedro");
        libreria.addLibro(libro);
        Assertions.assertThat(libreria.getLibros().size()).isEqualTo(1);
        libreria.deleteInstance();
    }*/


}
