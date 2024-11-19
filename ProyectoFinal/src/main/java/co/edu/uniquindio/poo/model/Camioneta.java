package co.edu.uniquindio.poo.model;

public class Camioneta extends VehiculoComb{

    private int numPasajeros, numPuertas, numBolsasAire;
    private boolean capacidadMaletero, aireAcon, abs, sensorCol, asistenteCarril, sensorTrafico, camaraReversa, velocidadCrucero, cuatroXcuatro;
    public Camioneta(String marca, String modelo, String tipoVehiculo, String placa, boolean nuevo,
            boolean revisionTecnica, int cambios, double velocidadMax, double cilindraje,
            co.edu.uniquindio.poo.model.TipoTransmision tipoTransmision, TipoCombustible tipoCombustible,
            int numPasajeros, int numPuertas, int numBolsasAire, boolean capacidadMaletero, boolean aireAcon,
            boolean abs, boolean sensorCol, boolean asistenteCarril, boolean sensorTrafico, boolean camaraReversa,
            boolean velocidadCrucero, boolean cuatroXcuatro) {
        super(marca, modelo, tipoVehiculo, placa, nuevo, revisionTecnica, cambios, velocidadMax, cilindraje,
                tipoTransmision, tipoCombustible);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcon = aireAcon;
        this.abs = abs;
        this.sensorCol = sensorCol;
        this.asistenteCarril = asistenteCarril;
        this.sensorTrafico = sensorTrafico;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.cuatroXcuatro = cuatroXcuatro;
    }
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
    public boolean isSensorCol() {
        return sensorCol;
    }
    public void setSensorCol(boolean sensorCol) {
        this.sensorCol = sensorCol;
    }
    public boolean isAsistenteCarril() {
        return asistenteCarril;
    }
    public void setAsistenteCarril(boolean asistenteCarril) {
        this.asistenteCarril = asistenteCarril;
    }
    public boolean isSensorTrafico() {
        return sensorTrafico;
    }
    public void setSensorTrafico(boolean sensorTrafico) {
        this.sensorTrafico = sensorTrafico;
    }
    public boolean isCamaraReversa() {
        return camaraReversa;
    }
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }
    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }
    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }
    public boolean isCuatroXcuatro() {
        return cuatroXcuatro;
    }
    public void setCuatroXcuatro(boolean cuatroXcuatro) {
        this.cuatroXcuatro = cuatroXcuatro;
    }

    

    
    
}
