package edu.meli.desingpatterns.state.states;

import edu.meli.desingpatterns.state.Ventilador;
import edu.meli.desingpatterns.state.VentiladorState;

public class ApagadoState implements VentiladorState {

    private final Ventilador context;

    public ApagadoState(Ventilador context) {
        this.context = context;
    }

    @Override
    public Ventilador.Estado next() {
        System.out.println("Encendido en velocidad BAJA");
        context.setStatus(new EncendidoBajoState(context));
        return Ventilador.Estado.ENCENDIDO_BAJO;
    }

    @Override
    public Ventilador.Estado prev() {
        System.out.println("EL INTERRUPTOR NO TIENE MAS GIRO A LA IZQUIERDA");
        return Ventilador.Estado.APAGADO;
    }

}
