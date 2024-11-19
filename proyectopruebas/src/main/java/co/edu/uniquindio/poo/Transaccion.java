package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Transaccion {

    private String idTransaccion;
    private LocalDate fecha;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double montoTotal;

    /**
     * Metodo constructor de Transaccion
     * @param idTransaccion
     * @param fecha
     * @param empleado
     * @param cliente
     * @param vehiculo
     * @param montoTotal
     */
    public Transaccion(String idTransaccion, LocalDate fecha, Empleado empleado, Cliente cliente, Vehiculo vehiculo,
            double montoTotal) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.montoTotal = montoTotal;
    }

    /**
     * Metodos get y set
     * @return
     */
    public String getIdTransaccion() {
        return idTransaccion;
    }
    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
}
