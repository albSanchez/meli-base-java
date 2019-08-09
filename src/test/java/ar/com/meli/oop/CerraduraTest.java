package ar.com.meli.oop;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CerraduraTest {

    @Test
    public void crearCerradura(){
        Cerradura cerradura = new Cerradura();
        Assertions.assertThat(cerradura).isNotNull();
    }

    @Test
    public void crearCerraduraConClave(){
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura).isNotNull();
    }


    @Test
    public void crearCerraduraConClaveYLaGuardo(){
        Integer clave = 1234;
        Cerradura cerradura = new Cerradura(clave);
        Assertions.assertThat(cerradura).isNotNull();
        Assertions.assertThat(cerradura.clave).isEqualTo(clave);
    }


    @Test
    public void abrirCerradura(){
        // Creo cerradura
        Integer clave = 1234;
        Cerradura cerradura = new Cerradura(clave);

        // Veo que esté cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();

        // La intento abrir
        cerradura.abrir(clave);

        // Veo que no esté cerrada
        Assertions.assertThat(cerradura.estaAbierta()).isTrue();
    }


    @Test
    public void abrirCerraduraConClaveIncorrecta(){
        // Creo cerradura
        Integer clave = 1234;
        Cerradura cerradura = new Cerradura(clave);

        // Veo que esté cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();

        // La intento abrir
        cerradura.abrir(32423);

        // Veo que todavía esté cerrada
        Assertions.assertThat(cerradura.estaAbierta()).isFalse();
    }





}
