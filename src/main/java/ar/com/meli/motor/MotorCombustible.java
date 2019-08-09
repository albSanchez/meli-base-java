package ar.com.meli.motor;

public class MotorCombustible extends Motor {

    public MotorCombustible(Integer potencia) {
        super(potencia);
    }


    public void refrigerar() {
        this.temperatura -= this.temperatura * 0.2;
    }
}
