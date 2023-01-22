package edu.meli.desingpatterns.state.states;

import edu.meli.desingpatterns.state.Ventilador;
import edu.meli.desingpatterns.state.VentiladorState;

public class EncendidoBajoState implements VentiladorState {

    private final Ventilador context;

    public EncendidoBajoState(Ventilador context) {
        this.context = context;
    }

    @Override
    public Ventilador.Estado next() {
        System.out.println("Encendido en velocidad MEDIA");
        context.setStatus(new EncendidoMedioState(context));
        return Ventilador.Estado.ENCENDIDO_MEDIO;
    }

    @Override
    public Ventilador.Estado prev() {
        System.out.println("Apagando Ventilador....");
        context.setStatus(new ApagadoState(context));
        return Ventilador.Estado.APAGADO;
    }
}
