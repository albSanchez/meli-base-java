package ar.com.meli.oop;

public class Cerradura {

    Integer clave;
    boolean closed;

    public Cerradura(Integer clave) {
         this.clave = clave;
        this.closed = true;
    }

    public Cerradura() {
        this.closed = false;
    }



    public void abrir(Integer clave) {
        if (!this.closed) return;
        if (clave == this.clave) {
            this.closed = false;
        }
    }

    public boolean estaCerrada() {
        return this.closed;
    }

    public boolean estaAbierta() {
        return !this.estaCerrada();
    }


}
