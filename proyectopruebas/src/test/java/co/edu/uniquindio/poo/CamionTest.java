package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CamionTest {
    
    /**
     * Prueba del metodo is y set
     */
    @Test
    public void testIsAndSetAireAcon() {
        
        Camion camion = new Camion("Mercedes", "Actros", "Camión", "AAA111", false, true, 8, 140.0, 10.0,
        TipoTransmision.AUTOMATICA, TipoCombustible.GASOLINA, "Camión refrigerado", true, true, true, 4);

        assertTrue(camion.isAireAcon());

        camion.setAireAcon(false);

        assertFalse(camion.isAireAcon());
    }

    /**
     * Prueba del metodo get de tipo camion
     */
     @Test
    public void testGetAndSetTipoCamion() {
        
        Camion camion = new Camion("Volvo", "FH", "Camión", "AAA111", true, true, 6, 120.0, 8.0,
        TipoTransmision.MANUAL, TipoCombustible.DIESEL, "Camión de carga", true, true, true, 3);

        assertEquals("Camión de carga", camion.getTipoCamion());
    }
}
