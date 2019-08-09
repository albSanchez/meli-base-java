package ar.com.meli.motor;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MotorTest {

    @Test
    public void crearMotor(){
        Motor motor = new Motor();
        Assertions.assertThat(motor).isNotNull();
    }


    @Test
    public void configuracionMotor(){
        Motor motor = new Motor(10);
        Assertions.assertThat(motor.potencia).isEqualTo(10);
        Assertions.assertThat(motor.temperatura).isNotNull();
    }


    @Test
    public void subirPotenciaMotor(){
        Motor motor = new Motor(10);
        Assertions.assertThat(motor.potencia).isEqualTo(10);
        motor.subirPotencia();
        Assertions.assertThat(motor.potencia).isGreaterThan(10);
    }


    @Test
    public void bajarPotenciaMotor(){
        Motor motor = new Motor(10);
        Assertions.assertThat(motor.potencia).isEqualTo(10);
        motor.bajarPotencia();
        Assertions.assertThat(motor.potencia).isLessThan(10);
    }


    @Test
    public void factorSubidaMotor(){
        Motor motor = new Motor(10);
        Assertions.assertThat(motor.potencia).isEqualTo(10);
        motor.subirPotencia(15);
        Assertions.assertThat(motor.potencia).isEqualTo(25);
    }

    @Test
    public void factorBajadaMotor(){
        Motor motor = new Motor(10);
        Assertions.assertThat(motor.potencia).isEqualTo(10);

        motor.bajarPotencia(5);
        Assertions.assertThat(motor.potencia).isEqualTo(5);

        // La potencia no puede bajar de 0
        motor.bajarPotencia(10);
        Assertions.assertThat(motor.potencia).isEqualTo(0);
    }


    @Test
    public void bajarTemperaturaMotor(){
        Motor motor = new Motor(10);
        Assertions.assertThat(motor.potencia).isEqualTo(10);
        Double temperatura_inicial = motor.temperatura;

        motor.bajarPotencia(5);
        Assertions.assertThat(motor.temperatura).isLessThan(temperatura_inicial);
    }


    @Test
    public void subirTemperaturaMotor(){
        Motor motor = new Motor(10);
        Assertions.assertThat(motor.potencia).isEqualTo(10);
        Double temperatura_inicial = motor.temperatura;

        motor.subirPotencia(5);
        Assertions.assertThat(motor.temperatura).isGreaterThan(temperatura_inicial);
    }

    @Test
    public void refrigeranteMotor(){
        // Motor a combustible no puede refrigerar
        MotorCombustible motor = new MotorCombustible(10);

        Assertions.assertThat(motor.potencia).isEqualTo(10);
        Double temperatura_inicial = motor.temperatura;

        motor.subirPotencia(5);
        Assertions.assertThat(motor.temperatura).isGreaterThan(temperatura_inicial);
    }








}
