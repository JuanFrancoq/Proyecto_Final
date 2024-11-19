package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BusElecTest {
    
    /**
     * Prueba del get y set del numero de pasajeros
     */
    @Test
    public void testGetySetNumPasajeros() {
        
        BusElec bus = new BusElec("Mercedes", "xxxx", "Bus", "aaa111", true, true, 6, 180.0, 2.8,
        TipoTransmision.AUTOMATICA, 300.0, 4.0, 30, 2, 6, 2, 4, true, true, true, 5.0);

        assertEquals(30, bus.getNumPasajeros());

        bus.setNumPasajeros(40);

        assertEquals(40, bus.getNumPasajeros());
    }

    /**
     * Prueba del metodo get de la capacidad del maletero
     */
    @Test
    public void testGetAndSetCapacidadMaletero() {
        
        BusElec bus = new BusElec("Mercedes", "xxxx", "Bus", "aaa111", true, true, 6, 180.0, 2.8,
        TipoTransmision.AUTOMATICA, 300.0, 4.0, 30, 2, 6, 2, 4, true, true, true, 5.0);

        assertEquals(5.0, bus.getCapacidadMaletero());
    }
}
