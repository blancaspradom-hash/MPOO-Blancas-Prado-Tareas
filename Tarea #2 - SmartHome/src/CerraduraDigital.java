public class CerraduraDigital {
    private boolean bloqueada;
    private int nivelBateria; // 0 a 100
    private String codigoPin;

    public CerraduraDigital(boolean bloqueada, int nivelBateria, String codigoPin) {
        this.bloqueada = bloqueada;
        this.nivelBateria = nivelBateria;
        this.codigoPin = codigoPin;
    }

    public void bloquear() {
        this.bloqueada = true;
        System.out.println("Cerradura: Puertas bloqueadas (Seguro activado)");
    }

    public void desbloquear(String pinIngresado) {
        if (this.codigoPin.equals(pinIngresado)) {
            this.bloqueada = false;
            System.out.println("Cerradura: Código correcto. Puertas desbloqueadas");
        } else {
            System.out.println("Cerradura: Código PIN incorrecto");
        }
    }

    public void verEstadoActual() {
        System.out.println("[Cerradura] Estado: " + (bloqueada ? "Bloqueada" : "Desbloqueada") + 
                           " | Batería: " + nivelBateria + "%");
    }

    // Getters y Setters
    public boolean isBloqueada() { return bloqueada; }
    public void setBloqueada(boolean bloqueada) { this.bloqueada = bloqueada; }
    public int getNivelBateria() { return nivelBateria; }
    public void setNivelBateria(int nivelBateria) { this.nivelBateria = nivelBateria; }
    public String getCodigoPin() { return codigoPin; }
    public void setCodigoPin(String codigoPin) { this.codigoPin = codigoPin; }
}

