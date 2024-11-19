package co.edu.uniquindio.poo;

public class VanElec extends VehiculoElec{
    
    private int numPasajeros, numPuertas, numBolsasAire;
    private boolean capacidadMaletero, aireAcon, abs, camaraReversa;

    /**
     * Metodo constructor de VanElec
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
     * @param numPasajeros
     * @param numPuertas
     * @param numBolsasAire
     * @param capacidadMaletero
     * @param aireAcon
     * @param abs
     * @param camaraReversa
     */
    public VanElec(String marca, String modelo, String tipoVehiculo, String placa, boolean nuevo,
            boolean revisionTecnica, int cambios, double velocidadMax, double cilindraje,
            co.edu.uniquindio.poo.TipoTransmision tipoTransmision, double autonomiaCarga, double tiempoCarga,
            int numPasajeros, int numPuertas, int numBolsasAire, boolean capacidadMaletero, boolean aireAcon,
            boolean abs, boolean camaraReversa) {
        super(marca, modelo, tipoVehiculo, placa, nuevo, revisionTecnica, cambios, velocidadMax, cilindraje,
                tipoTransmision, autonomiaCarga, tiempoCarga);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcon = aireAcon;
        this.abs = abs;
        this.camaraReversa = camaraReversa;
    }

    /**
     * Metodos get y set
     * @return
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public int getNumBolsasAire() {
        return numBolsasAire;
    }
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }
    public boolean isCapacidadMaletero() {
        return capacidadMaletero;
    }
    public void setCapacidadMaletero(boolean capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
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
    public boolean isCamaraReversa() {
        return camaraReversa;
    }
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    
}
