package co.edu.uniquindio.poo;

public class Empleado extends Persona {
    
    private double salario;

    /**
     * Metodo Constructor Empleado
     * @param nombre
     * @param apellido
     * @param cedula
     * @param telefono
     * @param direccion
     * @param correo
     * @param clave
     * @param salario
     */

    public Empleado(String nombre, String apellido, String cedula, String telefono, String direccion, String correo,
            String clave, double salario) {
        super(nombre, apellido, cedula, telefono, direccion, correo, clave);
        this.salario = salario;
    }

    /**
     * Metodos Get y Set
     * @return
     */

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
