package co.edu.uniquindio.poo;

public class Camion extends VehiculoComb {
    
    private String tipoCamion;
    private boolean aireAcon, abs, frenosAire;
    private int numEjes;

    /**
     * Metodo constructor Camion
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
     * @param tipoCamion
     * @param aireAcon
     * @param abs
     * @param frenosAire
     * @param numEjes
     */
    public Camion(String marca, String modelo, String tipoVehiculo, String placa, boolean nuevo,
            boolean revisionTecnica, int cambios, double velocidadMax, double cilindraje,
            co.edu.uniquindio.poo.TipoTransmision tipoTransmision, TipoCombustible tipoCombustible,
            String tipoCamion, boolean aireAcon, boolean abs, boolean frenosAire, int numEjes) {
        super(marca, modelo, tipoVehiculo, placa, nuevo, revisionTecnica, cambios, velocidadMax, cilindraje,
                tipoTransmision, tipoCombustible);
        this.tipoCamion = tipoCamion;
        this.aireAcon = aireAcon;
        this.abs = abs;
        this.frenosAire = frenosAire;
        this.numEjes = numEjes;
    }

    /**
     * Metodos Get y Set
     * @return
     */
    public String getTipoCamion() {
        return tipoCamion;
    }
    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
    public boolean isAireAcon() {
        return aireAcon;
    }
    public void setAireAcon(boolean aireAcon) {
        this.aireAcon = aireAcon;
    }
    public boolean isAbs() {
        return abs;
    }
    public void setAbs(boolean abs) {
        this.abs = abs;
    }
    public boolean isFrenosAire() {
        return frenosAire;
    }
    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }
    public int getNumEjes() {
        return numEjes;
    }
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

}
