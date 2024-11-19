package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TransaccionTest {

    /**
     * Prueba get y set monto total
     */
    @Test
    public void testMontoTotal() {
        // Crear objetos para los atributos
        Empleado empleado = new Empleado("Miguel", "Perez", "123", "300", "Calle 1", "Miguel@mail.com", "0000", 1500.0);
        Cliente cliente = new Cliente("Miguel", "Londoño", "123", "300", "Calle 1", "Miguel@.com", "0000");
        Vehiculo vehiculo = new Vehiculo("TOYOTA", "Toy", "Corolla", "AAA111", false, false, 0, 0, 0, null);
        LocalDate fecha = LocalDate.of(2024, 11, 18);
        
        Transaccion transaccion = new Transaccion("T001", fecha, empleado, cliente, vehiculo, 25000.0);
        
        assertEquals(25000.0, transaccion.getMontoTotal());

        transaccion.setMontoTotal(30000.0);

        assertEquals(30000.0, transaccion.getMontoTotal());
    }

    /**
     * Prueba del set para la fecha
     */
    @Test
    public void testSetFecha() {
        
        Empleado empleado = new Empleado("Miguel", "Perez", "123", "300", "Calle 1", "Miguel@mail.com", "0000", 1500.0);
        Cliente cliente = new Cliente("Juan", " Gómez", "carlos@correo.com", null, null, null, null);
        Vehiculo vehiculo = new Vehiculo("MAzda", "323", "Corolla", null, false, false, 0, 0, 0, null);
        LocalDate fecha = LocalDate.of(2024, 11, 18);
        
        Transaccion transaccion = new Transaccion("T001", fecha, empleado, cliente, vehiculo, 25000.0);

        assertEquals(fecha, transaccion.getFecha());

        LocalDate nuevaFecha = LocalDate.of(2024, 12, 1);
        transaccion.setFecha(nuevaFecha);

        assertEquals(nuevaFecha, transaccion.getFecha());
    }
    
}
