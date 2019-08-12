package ar.com.meli.envios;

import java.util.List;

public class Envio {

    public String getTransporte() {
        return transporte;
    }

    List<Paquete> paquetes;
    Double costo;
    String direccionDeEntrega;
    String transporte;


    public Envio(List<Paquete> paquetes, Double costo, String direccionDeEntrega, String transporte) {
        this.paquetes = paquetes;
        this.costo = costo;
        this.direccionDeEntrega = direccionDeEntrega;
        this.transporte = transporte;
    }
}
