package ar.com.meli.envios;

public class PaquetesNoEnviables extends Exception {
    public PaquetesNoEnviables()
    {
        super("No se pueden enviar.");
    }
}
