package edu.meli.desingpatterns.state.states;

import edu.meli.desingpatterns.state.Ventilador;
import edu.meli.desingpatterns.state.VentiladorState;

public class EncendidoMedioState implements VentiladorState {

    private final Ventilador context;

    public EncendidoMedioState(Ventilador context) {
        this.context = context;
    }

    @Override
    public Ventilador.Estado next() {
        System.out.println("Encendido en velocidad ALTA");
        context.setStatus(new EncendidoAltoState(context));
        return Ventilador.Estado.ENCENDIDO_ALTO;
    }

    @Override
    public Ventilador.Estado prev() {
        System.out.println("Encendido en velocidad BAJA");
        context.setStatus(new EncendidoBajoState(context));
        return Ventilador.Estado.ENCENDIDO_BAJO;
    }
}
