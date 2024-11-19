package co.edu.uniquindio.poo;

public class Cliente extends Persona {
    
    /**
     * Metodo Constructor Cliente
     * @param nombre
     * @param apellido
     * @param id
     * @param telefono
     * @param direccion
     * @param correo
     * @param clave
     */
    public Cliente(String nombre, String apellido, String id, String telefono, String direccion, String correo, String clave) {
        super(nombre, apellido, id, telefono, direccion, correo, clave);
    }
}
