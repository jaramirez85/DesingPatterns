package edu.meli.desingpatterns.state.states;

import edu.meli.desingpatterns.state.Ventilador;
import edu.meli.desingpatterns.state.VentiladorState;

public class EncendidoAltoState implements VentiladorState {

    private final Ventilador context;

    public EncendidoAltoState(Ventilador context) {
        this.context = context;
    }

    @Override
    public Ventilador.Estado next() {
        System.out.println("EL INTERRUPTOR NO TIENE MAS GIRO A LA DERECHA");
        return Ventilador.Estado.ENCENDIDO_ALTO;
    }

    @Override
    public Ventilador.Estado prev() {
        System.out.println("Encendido en velocidad MEDIO");
        context.setStatus(new EncendidoMedioState(context));
        return Ventilador.Estado.ENCENDIDO_MEDIO;
    }
}
