package ar.com.meli.motor;

public class MotorNuclear extends Motor {

    public MotorNuclear(Integer potencia) {
        super(potencia);
    }


    public void refrigerar(){
        this.temperatura *= 0.8;
    }
}
