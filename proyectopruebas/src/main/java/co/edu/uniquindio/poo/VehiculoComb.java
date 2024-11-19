package co.edu.uniquindio.poo;

public abstract class VehiculoComb extends Vehiculo{
    
    private TipoCombustible tipoCombustible;

    /**
     * MEtodo constructor de VehiculoComb
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
    public VehiculoComb(String marca, String modelo, String tipoVehiculo, String placa, boolean nuevo,
            boolean revisionTecnica, int cambios, double velocidadMax, double cilindraje,
            co.edu.uniquindio.poo.TipoTransmision tipoTransmision, TipoCombustible tipoCombustible) {
        super(marca, modelo, tipoVehiculo, placa, nuevo, revisionTecnica, cambios, velocidadMax, cilindraje,
                tipoTransmision);
        this.tipoCombustible = tipoCombustible;
    }

    /**
     * Metodos get y set
     * @return
     */

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
