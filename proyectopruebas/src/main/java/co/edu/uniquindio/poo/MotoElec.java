package co.edu.uniquindio.poo;

public class MotoElec extends VehiculoElec {
    
    /**
     * Metodo constructor de motoElec
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
    public MotoElec(String marca, String modelo, String tipoVehiculo, String placa, boolean nuevo, boolean revisionTecnica, int cambios, double velocidadMax, double cilindraje, co.edu.uniquindio.poo.TipoTransmision tipoTransmision, double autonomiaCarga, double tiempoCarga){
        super(marca, modelo, tipoVehiculo, placa, nuevo, revisionTecnica, cambios, velocidadMax, cilindraje, tipoTransmision, autonomiaCarga, tiempoCarga);
        
    }

    /**
     * Metodo toString de motoElec
     */
    @Override
    public String toString() {
        return "MotoElec []";
    }
    
}
