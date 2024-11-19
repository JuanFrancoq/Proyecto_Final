package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClienteTest {
    
    /**
     * Prueba del get de cliente
     */
    @Test
    public void testCrearCliente() {
        
        Cliente cliente = new Cliente("Miguel", "Londoño", "123", "300", "Calle 1", "Miguel@.com", "0000");

        assertEquals("Miguel", cliente.getNombre());
    }

    /**
     * Prueba del set cliente
     */
    @Test
    public void testSetGetApellido() {
        
        Cliente cliente = new Cliente("Miguel", "Londoño", "123", "300", "Calle 1", "Miguel@.com", "0000");

        cliente.setApellido("Gomez");

        assertEquals("Gomez", cliente.getApellido());
    }
}
