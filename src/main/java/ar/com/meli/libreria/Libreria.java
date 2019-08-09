package ar.com.meli.libreria;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Libreria {

    public static Libreria unique;
    List<Alquiler> alquileres = new ArrayList<>();
    List<Libro> libros = new ArrayList<>();


    private Libreria() {
    }



    public static Libreria getInstance() {
        if (unique == null ) unique = new Libreria();
        return unique;
    }


    public void addAquiler(Alquiler Aquiler){
        this.alquileres.add(Aquiler);
    }

    public Alquiler buscarAlquiler(String nombre) {
        Predicate<Alquiler> mismoNombre = alquiler -> alquiler.getNombre().equals(nombre);
        return this.alquileres
                .stream()
                .filter(alquiler -> mismoNombre.test(alquiler))
                .findFirst().get();
    }

    public void addLibro(Libro libro){
        this.libros.add(libro);
    }

    public List<Alquiler> getAquileres() {
        return this.alquileres;
    }

    public List<Libro> getLibros() {
        return libros;
    }


    public void deleteInstance() {
        this.unique = null;
    }
}
