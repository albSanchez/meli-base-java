package ar.com.meli.envios;

import java.util.List;

public class CalculadorDeCostos {

    public Double obtenerCosto(List<Paquete> paquetes) {
        if (paquetes.size() <= 5) return (double) 50;
        if (paquetes.size() <= 10) return (double) 80;
        return (double) 80 + (paquetes.size() - 10) * 15;
    }
}
