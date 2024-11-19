package co.edu.uniquindio.poo;

public class Moto extends VehiculoComb {

    /**
     * Metodo constructor de moto
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
     * @param tipoCombustible
     */
    public Moto (String marca, String modelo, String tipoVehiculo, String placa, boolean nuevo, boolean revisionTecnica, int cambios, double velocidadMax, double cilindraje, co.edu.uniquindio.poo.TipoTransmision tipoTransmision, TipoCombustible tipoCombustible) {
        super(marca, modelo, tipoVehiculo, placa, nuevo, revisionTecnica, cambios, velocidadMax, cilindraje, tipoTransmision, tipoCombustible);
    }

}
