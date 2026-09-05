public class AireAcondicionado {
    private boolean encendido;
    private int temperatura; // en grados Celsius
    private String modo; // "Frio", "Calor", "Eco"

    public AireAcondicionado(boolean encendido, int temperatura, String modo) {
        this.encendido = encendido;
        this.temperatura = temperatura;
        this.modo = modo;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("Aire Acondicionado: Encendido");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("Aire Acondicionado: Apagado");
    }

    public void ajustarTemperatura(int temp) {
        if (temp >= 16 && temp <= 30) {
            this.temperatura = temp;
            System.out.println("Aire Acondicionado: Temperatura establecida en " + temp + "°C");
        }
    }

    public void verEstadoActual() {
        System.out.println("[Aire Acondicionado] Estado: " + (encendido ? "Encendido" : "Apagado") + 
                           " | Temp: " + temperatura + "°C | Modo: " + modo);
    }

    // Getters y Setters
    public boolean isEncendido() { return encendido; }
    public void setEncendido(boolean encendido) { this.encendido = encendido; }
    public int getTemperatura() { return temperatura; }
    public void setTemperatura(int temperatura) { this.temperatura = temperatura; }
    public String getModo() { return modo; }
    public void setModo(String modo) { this.modo = modo; }
}
