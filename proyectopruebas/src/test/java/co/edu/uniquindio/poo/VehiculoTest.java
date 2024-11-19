package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VehiculoTest {
    
    /**
     * Prueba del metodo get con la marca
     */
    @Test
    public void testGetMarca() {
        
        Vehiculo vehiculo = new Vehiculo("Mazda", "323", "Camioneta", "DMA198", true, false, 6, 220.0, 2.5, TipoTransmision.AUTOMATICA);

        assertEquals("Mazda", vehiculo.getMarca());
    }

    /**
     * Prueba del metodo toString
     */
    @Test
    public void testToString() {
        
        Vehiculo vehiculo = new Vehiculo("Mazda", "323", "Sedán", "KDF682", false, true, 5, 185.0, 1.8, TipoTransmision.MANUAL);

        String expected = "Vehiculo [marca=Mazda, modelo=323, tipoVehiculo=Sedán, placa=KDF682, nuevo=false, " + "revisionTecnica=true, cambios=5, velocidadMax=185.0, cilindraje=1.8, TipoTransmision=MANUAL]";

        assertEquals(expected, vehiculo.toString());
    }
}
