package co.edu.uniquindio.poo;

public abstract class VehiculoElec extends Vehiculo {
    
    private double autonomiaCarga, tiempoCarga;

    /**
     * Metodo constructor de VehiculoElec
     * @param marca
     * @param modelo
     * @param tipoVehiculo
     * @param placa
     * @param nuevo
     * @param revisionTecnica
     * @param cambios
     * @param velocidadMax
     * @param cilindraje
     * @param tipoTransmision
     * @param autonomiaCarga
     * @param tiempoCarga
     */
    public VehiculoElec(String marca, String modelo, String tipoVehiculo, String placa, boolean nuevo,
            boolean revisionTecnica, int cambios, double velocidadMax, double cilindraje,
            co.edu.uniquindio.poo.TipoTransmision tipoTransmision, double autonomiaCarga, double tiempoCarga) {
        super(marca, modelo, tipoVehiculo, placa, nuevo, revisionTecnica, cambios, velocidadMax, cilindraje,
                tipoTransmision);
        this.autonomiaCarga = autonomiaCarga;
        this.tiempoCarga = tiempoCarga;
    }

    /**
     * Metodos get y set
     * @return
     */

    public double getAutonomiaCarga() {
        return autonomiaCarga;
    }

    public void setAutonomiaCarga(double autonomiaCarga) {
        this.autonomiaCarga = autonomiaCarga;
    }

    public double getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(double tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }
}
