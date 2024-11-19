package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MotoTest {

    /**
     * Prueba del constructor
     */
    @Test
    public void testMotoConstructor() {
        
        Moto moto = new Moto("Yamaha", "R1", "Deportiva", "ABC123", true, true, 6, 300.0, 1000.0, 
        co.edu.uniquindio.poo.TipoTransmision.MANUAL, TipoCombustible.GASOLINA);

        assertEquals("Yamaha", moto.getMarca());
        assertEquals("R1", moto.getModelo());
        assertEquals("Deportiva", moto.getTipoVehiculo());
        assertEquals("ABC123", moto.getPlaca());
        assertTrue(moto.isNuevo());
        assertTrue(moto.isRevisionTecnica());
        assertEquals(6, moto.getCambios());
        assertEquals(300.0, moto.getVelocidadMax());
        assertEquals(1000.0, moto.getCilindraje());
    }

    /**
     * Prueba del get moto
     */
    @Test
    public void testGetVelocidadMax() {
        // Crear una instancia de Moto con datos de prueba
        Moto moto = new Moto("Yamaha", "R1", "Deportiva", "ABC123", true, true, 6, 300.0, 1000.0, 
        co.edu.uniquindio.poo.TipoTransmision.MANUAL, TipoCombustible.GASOLINA);

        assertEquals(300.0, moto.getVelocidadMax());
    }
    
}
