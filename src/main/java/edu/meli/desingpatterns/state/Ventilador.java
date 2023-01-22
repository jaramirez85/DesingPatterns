package edu.meli.desingpatterns.state;

import edu.meli.desingpatterns.state.states.EncendidoBajoState;

public class Ventilador {

    private VentiladorState currentState;

    public enum Estado {
        APAGADO, ENCENDIDO_BAJO, ENCENDIDO_MEDIO, ENCENDIDO_ALTO
    }

    public Estado next(){
        return currentState.next();
    }

    public Estado prev(){
        return currentState.prev();
    }

    public void setStatus(VentiladorState newState) {
        currentState = newState;
    }

}

