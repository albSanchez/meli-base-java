package ar.com.meli.envios;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EnviosPostalesTest {

    @Test
    public void crearDespachante(){
        Despachante despachante = new Despachante(new Asignador(), new CalculadorDeCostos());
        Assertions.assertThat(despachante).isNotNull();
    }

    @Test
    public void crearTransportesDeLosEnviosCreados() throws PaquetesNoAsignables, PaquetesNoEnviables {
        Asignador asignador = mock(Asignador.class);
        List<Paquete> paquetes = new LinkedList<>();
        when(asignador.asignarVehiculo(paquetes)).thenReturn("Cosa Rara");
        Despachante despachante = new Despachante(asignador, new CalculadorDeCostos());
        Envio envio = despachante.crearEnvio(paquetes, "direccion");
        Assertions.assertThat(envio.getTransporte()).isEqualTo("Cosa Rara");
    }


    @Test
    public void agregaCostosAdministrativos() throws PaquetesNoAsignables, PaquetesNoEnviables {
        Asignador asignador = mock(Asignador.class);
        CalculadorDeCostos calculador = mock(CalculadorDeCostos.class);
        List<Paquete> paquetes = new LinkedList<>();
        when(calculador.obtenerCosto(paquetes)).thenReturn(10.0);
        Despachante despachante = new Despachante(asignador, calculador);

        // A partir de 10 envios, agrega gastos administrativos
        for (int i = 0; i < 10; i++) {
            Envio envio = despachante.crearEnvio(paquetes, "direccion");
            Assertions.assertThat(envio.costo).isEqualTo(10.0);
        }
        Envio envio = despachante.crearEnvio(paquetes, "direccion");
        Assertions.assertThat(envio.costo).isEqualTo(11.0);
    }


}
