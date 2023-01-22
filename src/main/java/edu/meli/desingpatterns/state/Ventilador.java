package edu.meli.desingpatterns.state;

public class Ventilador {

    private Estado estadoActual;

    public enum Estado {
        APAGADO, ENCENDIDO_BAJO, ENCENDIDO_MEDIO, ENCENDIDO_ALTO
    }

    public Ventilador(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public Estado next(){
        if(estadoActual == Estado.APAGADO){
            System.out.println("Encendido en velocidad BAJA");
            estadoActual = Estado.ENCENDIDO_BAJO;
        } else if (estadoActual == Estado.ENCENDIDO_BAJO) {
            System.out.println("Encendido en velocidad MEDIA");
            estadoActual = Estado.ENCENDIDO_MEDIO;
        } else if (estadoActual == Estado.ENCENDIDO_MEDIO) {
            System.out.println("Encendido en velocidad ALTA");
            estadoActual = Estado.ENCENDIDO_ALTO;
        } else if (estadoActual == Estado.ENCENDIDO_ALTO) {
            System.out.println("EL INTERRUPTOR NO TIENE MAS GIRO A LA DERECHA");
        }
        return estadoActual;
    }

    public Estado prev(){
        if(estadoActual == Estado.ENCENDIDO_ALTO){
            System.out.println("Encendido en velocidad MEDIO");
            estadoActual = Estado.ENCENDIDO_MEDIO;
        } else if (estadoActual == Estado.ENCENDIDO_MEDIO) {
            System.out.println("Encendido en velocidad BAJA");
            estadoActual = Estado.ENCENDIDO_BAJO;
        } else if (estadoActual == Estado.ENCENDIDO_BAJO) {
            System.out.println("Apagando Ventilador....");
            estadoActual = Estado.APAGADO;
        } else if (estadoActual == Estado.APAGADO) {
            System.out.println("EL INTERRUPTOR NO TIENE MAS GIRO A LA IZQUIERDA");
        }
        return estadoActual;
    }

}

