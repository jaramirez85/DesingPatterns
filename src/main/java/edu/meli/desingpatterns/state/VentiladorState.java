package edu.meli.desingpatterns.state;

public interface VentiladorState {

    Ventilador.Estado next();
    Ventilador.Estado prev();

}
