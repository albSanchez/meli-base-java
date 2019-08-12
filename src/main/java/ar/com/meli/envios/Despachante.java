package ar.com.meli.envios;

import java.util.LinkedList;
import java.util.List;

public class Despachante {


    List<Envio> envios;
    Asignador asignador;
    CalculadorDeCostos calculador;
    Integer cantidadEnvios;


    public Despachante(Asignador asignador, CalculadorDeCostos calculador) {
        this.asignador = asignador;
        this.calculador = calculador;
        this.cantidadEnvios = 0;
        this.envios = new LinkedList<>();
    }

    public Envio crearEnvio(List<Paquete> paquetes, String direccion) throws PaquetesNoEnviables {
        try {
            String vehiculo = this.asignador.asignarVehiculo(paquetes);
            Double costo = this.aplicarGastos(this.calculador.obtenerCosto(paquetes));
            Envio envio = new Envio(paquetes, costo, direccion, vehiculo);
            this.envios.add(envio);
            this.cantidadEnvios++;
            return envio;
        } catch (PaquetesNoAsignables e){
            throw new PaquetesNoEnviables();
        }
    }

    private Double aplicarGastos(Double costo) {
        if (this.cantidadEnvios >= 10) return costo * 1.1;
        return costo;
    }

}
