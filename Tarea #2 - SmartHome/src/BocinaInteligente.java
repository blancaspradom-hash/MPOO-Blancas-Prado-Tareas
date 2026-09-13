public class BocinaInteligente {
    private boolean encendida;
    private int volumen; // 0 a 100
    private String cancionActual;

    public BocinaInteligente(boolean encendida, int volumen, String cancionActual) {
        this.encendida = encendida;
        this.volumen = volumen;
        this.cancionActual = cancionActual;
    }

    public void encender() {
        this.encendida = true;
        System.out.println("Bocina: Encendida");
    }

    public void apagar() {
        this.encendida = false;
        this.cancionActual = "Ninguna";
        System.out.println("Bocina: Apagada");
    }

    public void reproducirMusica(String cancion) {
        if (encendida) {
            this.cancionActual = cancion;
            System.out.println("Bocina: Reproduciendo '" + cancion + "'");
        }
    }

    public void verEstadoActual() {
        System.out.println("[Bocina] Estado: " + (encendida ? "Encendida" : "Apagada") + 
                           " | Canción: " + cancionActual + " | Volumen: " + volumen);
    }

    // Getters y Setters
    public boolean isEncendida() { return encendida; }
    public void setEncendida(boolean encendida) { this.encendida = encendida; }
    public int getVolumen() { return volumen; }
    public void setVolumen(int volumen) { this.volumen = volumen; }
    public String getCancionActual() { return cancionActual; }
    public void setCancionActual(String cancionActual) { this.cancionActual = cancionActual; }
}