package ar.com.meli.motor;

public class MotorSolar extends Motor {

    public MotorSolar(Integer potencia) {
        super(potencia);
    }


    public void refrigerar(){
        this.temperatura *= 0.8;
    }
}
