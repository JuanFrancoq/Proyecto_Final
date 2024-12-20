package co.edu.uniquindio.poo;

public class Persona {

    private String nombre, apellido, cedula, telefono, direccion, correo, clave;

    /**
     * Metodo constructor de Persona
     * @param nombre
     * @param apellido
     * @param cedula
     * @param telefono
     * @param direccion
     * @param correo
     * @param clave
     */
    public Persona(String nombre, String apellido, String cedula, String telefono, String direccion, String correo, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.clave = clave;
    }

    /**
     * MEtodos Get y Set
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Metodo toString de Persona
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", telefono=" + telefono
                + ", direccion=" + direccion + ", correo=" + correo + ", clave=" + clave + "]";
    }
}
