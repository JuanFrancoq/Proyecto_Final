package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class EmpresaTest {


    /**
    * Prueba del metodo agregar cliente
    */
    @Test
    public void testAgregarCliente() {
        
        Empresa empresa = new Empresa("Tu Carro UQ", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        
        Cliente cliente = new Cliente("Miguel", "Londoño", "123", "300", "Calle 1", "Miguel@.com", "0000");
        
        boolean resultado = empresa.agregarCliente(cliente);
        
        assertTrue(resultado);
        assertTrue(empresa.getClientes().contains(cliente));
    }
    
    /**
     * Prueba del metodo verificar empleado
     */
    @Test
    public void testVerificarEmpleado() {
    
    Empresa empresa = new Empresa("Tu Carro UQ", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    Empleado empleado = new Empleado("Miguel", "Perez", "123", "300", "Calle 1", "Miguel@mail.com", "0000", 1500.0);
    empresa.agregarEmpleado(empleado);
    
    boolean resultado = empresa.verificarEmpleado(empleado.getCedula());
    
    assertTrue(resultado);
    }

    /**
     * Prueba del metodo eliminar cliente
     */
    @Test
    public void testEliminarCliente() {
    
    Empresa empresa = new Empresa("Tu Carro UQ", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    Cliente cliente = new Cliente("Miguel", "Londoño", "123", "300", "Calle 1", "Miguel@.com", "0000");
    empresa.agregarCliente(cliente);
    
    boolean resultado = empresa.eliminarCliente(cliente.getCedula());
    
    assertTrue(resultado);
    assertFalse(empresa.getClientes().contains(cliente));
}


}
