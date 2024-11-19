package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Empresa {

    private String nombre;
    private Collection<Empleado> empleados;
    private Collection<Cliente> clientes;
    private Collection<Admin> admins;
    private Collection<Transaccion> transacciones;
    private Collection<Vehiculo> vehiculos;

    /**
     * Metodo Constructor Empresa
     * @param nombre
     * @param empleados
     * @param clientes
     * @param admins
     * @param transacciones
     * @param vehiculos
     */
    public Empresa(String nombre, Collection<Empleado> empleados, Collection<Cliente> clientes,
            Collection<Admin> admins, Collection<Transaccion> transacciones, Collection<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        empleados = new LinkedList<>();
        clientes = new LinkedList<>();
        admins = new LinkedList<>();
        transacciones = new LinkedList<>();
        vehiculos = new LinkedList<>();
    }

    /**
     * Metodos Get y Set
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Collection<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }
    public Collection<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }
    public Collection<Admin> getAdmins() {
        return admins;
    }
    public void setAdmins(Collection<Admin> admins) {
        this.admins = admins;
    }
    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }
    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Metodo para agregar un cliente a la lista
     * @param cliente
     * @return
     */
    public boolean agregarCliente(Cliente cliente){
        boolean centinela = false;
        if (!verificarCliente(cliente.getCedula())){
            clientes.add(cliente);
            centinela = true;
        }
        return centinela;
    }

    /**
     * Metodo Verificar que un cliente no este repetido 
     * @param cliente
     * @return
     */
    public boolean verificarCliente(String cedula){
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if(!verificarCliente(cliente.getCedula())){
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para eliminar un cliente de la lista
     * @param cliente
     * @return
     */
    public boolean eliminarCliente(String cedula){
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if(cliente.getCedula().equals(cedula)){
                clientes.remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Metodo para actualizar un cliente de la lista
     * @param cliente
     * @return
     */
    public boolean actualizarCliente(String cedula, Cliente actualizado){
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)){
                cliente.setNombre(actualizado.getNombre());
                cliente.setApellido(actualizado.getApellido());
                cliente.setCedula(actualizado.getCedula());
                cliente.setTelefono(actualizado.getTelefono());
                cliente.setDireccion(actualizado.getDireccion());
                cliente.setCorreo(actualizado.getCorreo());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregar un Empleado a la lista
     * @param cliente
     * @return
     */
    public boolean agregarEmpleado(Empleado empleado){
        boolean centinela = false;
        if (!verificarEmpleado(empleado.getCedula())){
            empleados.add(empleado);
            centinela = true;
        }
        return centinela;
    }

    /**
     * Metodo Verificar que un empleado no este repetido 
     * @param cliente
     * @return
     */
    public boolean verificarEmpleado(String cedula){
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if(!verificarEmpleado(empleado.getCedula())){
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para eliminar un empleado de la lista
     * @param cliente
     * @return
     */
    public boolean eliminarEmpleado(String cedula){
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if(empleado.getCedula().equals(cedula)){
                empleados.remove(empleado);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Metodo para actualizar un empleado de la lista
     * @param cliente
     * @return
     */
    public boolean actualizarEmpleado(String id, Empleado actualizado){
        boolean centinela = false;
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(id)){
                empleado.setNombre(actualizado.getNombre());
                empleado.setApellido(actualizado.getApellido());
                empleado.setCedula(actualizado.getCedula());
                empleado.setTelefono(actualizado.getTelefono());
                empleado.setDireccion(actualizado.getDireccion());
                empleado.setCorreo(actualizado.getCorreo());
                empleado.setSalario(actualizado.getSalario());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregar un vehiculo a la lista
     * @param vehiculo
     * @return
     */
    public boolean agregarVehiculo(Vehiculo vehiculo){
        boolean centinela = false;
        if(!verificarVehiculo(vehiculo.getPlaca())){
            vehiculos.add(vehiculo);
            centinela = true;
        }
        return centinela;
    }

    /**
     * MEtodo para verificar que un vehiculo no este repetido
     * @param placa
     * @return
     */
    public boolean verificarVehiculo(String placa){
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if(!verificarVehiculo(vehiculo.getPlaca())){
                centinela = true;
            }
        }
        return centinela;
    
    } 
    
    /**
     * Metodo para eliminar un vehiculo de la lista
     * @param placa
     * @return
     */
    public boolean eliminarVehiculo(String placa){
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getPlaca().equals(placa)){
                vehiculos.remove(vehiculo);
                centinela = true;
                break;
            }
        }
        return centinela;
    }
    
}
