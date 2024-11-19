package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CamionetaTest {
    
    /**
     * Prueba del metodo is y set
     */
    @Test
    public void testIsAndSetAireAcon() {
        
        Camioneta camioneta = new Camioneta("Chevrolet", "Tahoe", "Camioneta", "ABC123", true, true, 5, 180.0, 5.0,
        TipoTransmision.MANUAL, TipoCombustible.DIESEL, 7, 4, 8, true, true, false, true, true, false, true, false, false);

        
        assertTrue(camioneta.isAireAcon(), "El aire acondicionado esta activado");

        camioneta.setAireAcon(false);

        assertFalse(camioneta.isAireAcon(), "El aire acondicionado esta desactivado");
    }

    /**
     * Prueba del get y set
     */
    @Test
    public void testGetAndSetNumPasajeros() {
    
        Camioneta camioneta = new Camioneta("Toyota", "Land Cruiser", "Camioneta", "XYZ789", true, true, 6, 160.0, 4.0,
        TipoTransmision.AUTOMATICA, TipoCombustible.GASOLINA, 5, 4, 6, true, true, true, true, true, true, true, true, false);

        assertEquals(5, camioneta.getNumPasajeros(), "El número de pasajeros es 5");

        camioneta.setNumPasajeros(7);

        assertEquals(7, camioneta.getNumPasajeros(), "El número de pasajeros es 7");
    }
}
