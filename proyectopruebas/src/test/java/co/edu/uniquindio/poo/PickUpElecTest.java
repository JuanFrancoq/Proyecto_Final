package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PickUpElecTest {

    /**
     * Prueba del get y set
     */
    @Test
    public void testNumPasajeros() {
        
        PickUpElec pickUp = new PickUpElec("Tesla", "Cybertruck", "PickUp", "XYZ123", true, true, 5, 200.0, 0.0,
        co.edu.uniquindio.poo.TipoTransmision.AUTOMATICA, 500.0, 2.0,
        4, 4, 6, true, true, true, true, true);

        assertEquals(4, pickUp.getNumPasajeros());

        pickUp.setNumPasajeros(5);

        assertEquals(5, pickUp.getNumPasajeros());
    }
    
    /**
     * Prueba del constructor
     */
    @Test
    public void testPickUpElecConstructor() {
        
        PickUpElec pickUp = new PickUpElec("Tesla", "Cybertruck", "PickUp", "XYZ123", true, true, 5, 200.0, 0.0,
        co.edu.uniquindio.poo.TipoTransmision.AUTOMATICA, 500.0, 2.0,
        4, 4, 6, true, true, true, true, true);

        assertEquals(4, pickUp.getNumPasajeros());
        assertEquals(4, pickUp.getNumPuertas());
        assertEquals(6, pickUp.getNumBolsasAire());
        assertTrue(pickUp.isAireAcon());
        assertTrue(pickUp.isAbs());
        assertTrue(pickUp.isCamaraReversa());
        assertTrue(pickUp.isVelocidadCrucero());
        assertTrue(pickUp.isCapacidadCajaCarga());
    }
}
