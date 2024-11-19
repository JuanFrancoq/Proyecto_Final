package co.edu.uniquindio.poo;

public class DeportivoElec extends VehiculoElec{

    private int numPasajeros, numPuertas, numBolsasAire;
    private double caballosFuerza, tiempo100Kmh;

    /**
     * Metodo Constructor DeportivoElec
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
     * @param caballosFuerza
     * @param tiempo100Kmh
     */
    public DeportivoElec(String marca, String modelo, String tipoVehiculo, String placa, boolean nuevo,
            boolean revisionTecnica, int cambios, double velocidadMax, double cilindraje,
            co.edu.uniquindio.poo.TipoTransmision tipoTransmision, double autonomiaCarga, double tiempoCarga,
            int numPasajeros, int numPuertas, int numBolsasAire, double caballosFuerza, double tiempo100Kmh) {
        super(marca, modelo, tipoVehiculo, placa, nuevo, revisionTecnica, cambios, velocidadMax, cilindraje,
                tipoTransmision, autonomiaCarga, tiempoCarga);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempo100Kmh = tiempo100Kmh;
    }

    /**
     * Metodos Get y Set
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
    public double getCaballosFuerza() {
        return caballosFuerza;
    }
    public void setCaballosFuerza(double caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
    public double getTiempo100Kmh() {
        return tiempo100Kmh;
    }
    public void setTiempo100Kmh(double tiempo100Kmh) {
        this.tiempo100Kmh = tiempo100Kmh;
    }
    
}
