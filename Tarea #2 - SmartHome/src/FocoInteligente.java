public class FocoInteligente {
    private boolean encendido;
    private int intensidad; 
    private double consumoWatts;

    public FocoInteligente(boolean encendido, int intensidad, double consumoWatts) {
        this.encendido = encendido;
        this.intensidad = intensidad;
        this.consumoWatts = consumoWatts;
    }

    public void encender() {
        this.encendido = true;
        this.intensidad = 100;
        System.out.println("Foco: Encendido al 100%");
    }

    public void apagar() {
        this.encendido = false;
        this.intensidad = 0;
        System.out.println("Foco: Apagado");
    }

    public void cambiarIntensidad(int nuevaIntensidad) {
        if (nuevaIntensidad >= 0 && nuevaIntensidad <= 100) {
            this.intensidad = nuevaIntensidad;
            this.encendido = (nuevaIntensidad > 0);
            System.out.println("Foco: Intensidad ajustada a " + intensidad + "%");
        }
    }

    public void verEstadoActual() {
        System.out.println("[Foco] Estado: " + (encendido ? "Encendido" : "Apagado") + 
                           " | Intensidad: " + intensidad + "% | Consumo: " + consumoWatts + "W");
    }

    // Getters y Setters
    public boolean isEncendido() { return encendido; }
    public void setEncendido(boolean encendido) { this.encendido = encendido; }
    public int getIntensidad() { return intensidad; }
    public void setIntensidad(int intensidad) { this.intensidad = intensidad; }
    public double getConsumoWatts() { return consumoWatts; }
    public void setConsumoWatts(double consumoWatts) { this.consumoWatts = consumoWatts; }
}
