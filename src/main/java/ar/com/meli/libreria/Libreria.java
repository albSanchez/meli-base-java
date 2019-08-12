package ar.com.meli.libreria;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public  class Libreria {

    public static Libreria unique;
    List<Alquiler> alquileres = new ArrayList<>();
    Boolean alquilado ;


    private Libreria() {
        this.alquilado = false;
    }


    public static Libreria getInstance() {
        if (unique == null) unique = new Libreria();
        return unique;
    }


    public void addAlquiler(Alquiler Aquiler) {
        this.alquileres.add(Aquiler);
    }

    public Alquiler buscarAlquiler(String  nombre) {
        Predicate<Alquiler> mismoNombre = alquiler -> alquiler.getNombre().equals(nombre);
        return this.alquileres
                .stream()
                .filter(alquiler -> mismoNombre.test(alquiler))
                .findFirst().get();
    }


    public List<Alquiler> getAquileres() {
        return this.alquileres;
    }


    public void addLibro(Libro libro){

    }



    public void deleteInstance() {
        this.unique = null;
    }
}
