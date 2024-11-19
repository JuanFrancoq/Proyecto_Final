package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    /**
     * Prueba de los get de empleado
     */
    @Test
    public void testCrearEmpleado() {
    
        Empleado empleado = new Empleado("Miguel", "Perez", "123", "300", "Calle 1", "Miguel@mail.com", "0000", 1500.0);

        assertEquals("Miguel", empleado.getNombre());
        assertEquals(1500.0, empleado.getSalario());
    }
    
    /**
     * Prueba del set de empleado
     */
    @Test
    public void testSetGetSalario() {
        
        Empleado empleado = new Empleado("Miguel", "Perez", "123", "300", "Calle 1", "Miguel@mail.com", "0000", 1500.0);
        
        empleado.setSalario(2000.0);

        assertEquals(2000.0, empleado.getSalario());
    }
}
