public class Televisor {
    private boolean encendido;
    private int volumen; // 0 a 100
    private int canal;

    public Televisor(boolean encendido, int volumen, int canal) {
        this.encendido = encendido;
        this.volumen = volumen;
        this.canal = canal;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("Televisor: Encendido");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("Televisor: Apagado");
    }

    public void cambiarCanal(int nuevoCanal) {
        if (encendido && nuevoCanal > 0) {
            this.canal = nuevoCanal;
            System.out.println("Televisor: Cambiado al canal " + canal);
        }
    }

    public void verEstadoActual() {
        System.out.println("[Televisor] Estado: " + (encendido ? "Encendido" : "Apagado") + 
                           " | Canal: " + canal + " | Volumen: " + volumen);
    }

    // Getters y Setters
    public boolean isEncendido() { return encendido; }
    public void setEncendido(boolean encendido) { this.encendido = encendido; }
    public int getVolumen() { return volumen; }
    public void setVolumen(int volumen) { this.volumen = volumen; }
    public int getCanal() { return canal; }
    public void setCanal(int canal) { this.canal = canal; }
}
