package co.edu.uniquindio.poo;

public class VehiculoHib extends Vehiculo{
    
    private boolean enchufable;
    private TipoCombustible TipoCombustible;

    /**
     * Metodo constructor de VehiculoHib
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
     * @param enchufable
     * @param tipoCombustible
     */

    VehiculoHib(String marca, String modelo, String tipoVehiculo, String placa, boolean nuevo, boolean revisionTecnica, int cambios, double velocidadMax, double cilindraje, TipoTransmision tipoTransmision, boolean enchufable, TipoCombustible tipoCombustible){
        super(marca, modelo, tipoVehiculo, placa, nuevo, revisionTecnica, cambios, velocidadMax, cilindraje, tipoTransmision);
        this.TipoCombustible =  tipoCombustible;
        this.enchufable=enchufable;
    }

    /**
     * MEtodos get y set
     * @return
     */

    public boolean isEnchufable() {
        return enchufable;
    }

    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    public TipoCombustible getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        TipoCombustible = tipoCombustible;
    }
}
