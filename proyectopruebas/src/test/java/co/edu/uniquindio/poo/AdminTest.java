package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdminTest {
    
    /**
     * Prueba del metodo get salario
     */
     @Test
    public void testGetSalario() {
        
        Admin admin = new Admin("Miguel", "Garcia", "123", "310", "pto espejo", "miguel@gmail.com", "0000", 2500000.0);

        assertEquals(2500000.0, admin.getSalario());
    }

    /**
     * Prueba del metodo set salario
     */
    @Test
    public void testSetSalario() {
        // Crear una instancia de Admin con un salario inicial
        Admin admin = new Admin("Miguel", "Garcia", "123", "310", "pto espejo", "miguel@gmail.com", "0000", 2500000.0);

        // Cambiar el salario
        admin.setSalario(3500000.0);

        // Verificar que el salario ha sido actualizado correctamente
        assertEquals(3500000.0, admin.getSalario());
    }
}
