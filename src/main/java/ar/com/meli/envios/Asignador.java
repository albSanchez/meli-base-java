package ar.com.meli.envios;

import java.util.List;
import java.util.stream.Collectors;

public class Asignador {

    public String asignarVehiculo(List<Paquete> paquetes) throws PaquetesNoAsignables {
        Integer pesoTotal = this.obtenerPesoTotal(paquetes);
        if (pesoTotal <= 5) return "Bicicleta";
        if (pesoTotal <= 50) return "Auto";
        if (pesoTotal <= 150) return "Camioneta";
        throw new PaquetesNoAsignables();
    }

    private Integer obtenerPesoTotal(List<Paquete> paquetes){
        List<Integer> pesos = paquetes.stream()
                    .map((paquete) -> paquete.getPeso()).collect(Collectors.toList());
        return pesos.stream().reduce((peso, peso2) -> peso + peso2).get();
    }
}
