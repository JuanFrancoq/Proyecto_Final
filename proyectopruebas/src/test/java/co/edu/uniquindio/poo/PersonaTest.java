package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    
    /**
     * Prueba para modificar la clave utilizando el metodo set
     */
    @Test
    public void testClave() {
        
        Persona persona = new Persona("Juan", "Franco", "123", "4321", "Limonar", "juan@gmail.com", "0000");

        persona.setClave("1111");

        assertEquals("1111", persona.getClave());
    }


    /**
     * Prueba para verificar que se almacene correctamente el nombre utilizando el metodo get
     */
    @Test
    public void testGetNombre() {

        Persona persona = new Persona("Luisa", "Cano", "123", "4321", "calle 11", "luisa@gmail.com", "0000");

        assertEquals("Luisa", persona.getNombre());
    }

}
