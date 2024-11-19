package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DeportivoElecTest {
    
    /**
     * Prueba del get Deportivo
     */
    @Test
    public void testCrearDeportivoElec() {
        
        DeportivoElec deportivoElec = new DeportivoElec("Tesla", "Model S", "Deportivo", "ABC123", true, true, 6, 250, 3.5, 
        co.edu.uniquindio.poo.TipoTransmision.AUTOMATICA, 500, 2.5, 2, 4, 6, 450, 3.1);

        assertEquals("Tesla", deportivoElec.getMarca());
        assertEquals(450, deportivoElec.getCaballosFuerza());
    }

    /**
     * Prueba de los set 
     */
    @Test
    public void testSettersYGetters() {
        
        DeportivoElec deportivoElec = new DeportivoElec("Tesla", "Model S", "Deportivo", "ABC123", true, true, 6, 250.0, 1000.0, 
        co.edu.uniquindio.poo.TipoTransmision.AUTOMATICA, 400.0, 2.5, 2, 2, 6, 700.0, 3.2);

        deportivoElec.setCaballosFuerza(750.0);
        deportivoElec.setTiempo100Kmh(2.8);

        assertEquals(750.0, deportivoElec.getCaballosFuerza());
        assertEquals(2.8, deportivoElec.getTiempo100Kmh());
    }

}
