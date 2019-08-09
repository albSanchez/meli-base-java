package ar.com.meli.motor;


import static java.lang.StrictMath.max;

public class Motor {
    Double temperatura;
    Integer potencia;

    private Double temperaturaSegunPotencia(Integer potencia) {
        return Double.valueOf(potencia);
    }

    public Motor(Integer potencia) {
        this.temperatura = temperaturaSegunPotencia(potencia);
        this.potencia = potencia;
    }


    public Motor(){}


    public void subirPotencia(){
        this.subirPotencia(1);

    }


    public void bajarPotencia(){
        this.bajarPotencia(1);
    }


    public void subirPotencia(Integer factor){
        this.potencia += factor;
        this.temperatura += temperaturaSegunPotencia(potencia);
    }


    public void bajarPotencia(Integer factor){
        this.potencia = max(this.potencia - factor, 0);
        this.temperatura = max(this.temperatura - temperaturaSegunPotencia(factor), 0);
    }

}
