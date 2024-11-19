package co.edu.uniquindio.poo;

public class Admin extends Persona {
    
    private double salario;

    /**
     * Metodo constructor Admin
     */
    public Admin(String nombre, String apellido, String cedula, String telefono, String direccion, String correo,
            String clave, double salario) {
        super(nombre, apellido, cedula, telefono, direccion, correo, clave);
        this.salario = salario;
    }

    /**
     * Metodo Get y set
     * @return
     */
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
