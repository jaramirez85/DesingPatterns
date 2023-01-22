package edu.meli.desingpatterns.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VentiladorTest {

    @Test
    void next() {
        Ventilador ventilador = new Ventilador(Ventilador.Estado.APAGADO);
        assertEquals(Ventilador.Estado.ENCENDIDO_BAJO, ventilador.next());
        assertEquals(Ventilador.Estado.ENCENDIDO_MEDIO, ventilador.next());
        assertEquals(Ventilador.Estado.ENCENDIDO_ALTO, ventilador.next());
        assertEquals(Ventilador.Estado.ENCENDIDO_ALTO, ventilador.next());
    }

    @Test
    void prev() {
        Ventilador ventilador = new Ventilador(Ventilador.Estado.ENCENDIDO_ALTO);
        assertEquals(Ventilador.Estado.ENCENDIDO_MEDIO, ventilador.prev());
        assertEquals(Ventilador.Estado.ENCENDIDO_BAJO, ventilador.prev());
        assertEquals(Ventilador.Estado.APAGADO, ventilador.prev());
        assertEquals(Ventilador.Estado.APAGADO, ventilador.prev());
    }

    @Test
    //children playing with grandma's fan
    void children_playing_with_grandma_s_fan() {
        Ventilador ventilador = new Ventilador(Ventilador.Estado.APAGADO);
        assertEquals(Ventilador.Estado.ENCENDIDO_BAJO, ventilador.next());
        assertEquals(Ventilador.Estado.ENCENDIDO_MEDIO, ventilador.next());
        assertEquals(Ventilador.Estado.ENCENDIDO_ALTO, ventilador.next());
        assertEquals(Ventilador.Estado.ENCENDIDO_MEDIO, ventilador.prev());
        assertEquals(Ventilador.Estado.ENCENDIDO_BAJO, ventilador.prev());
        assertEquals(Ventilador.Estado.APAGADO, ventilador.prev());
        assertEquals(Ventilador.Estado.ENCENDIDO_BAJO, ventilador.next());
    }

}