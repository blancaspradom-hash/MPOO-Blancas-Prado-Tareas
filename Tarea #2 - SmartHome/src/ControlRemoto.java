public class ControlRemoto {
    private FocoInteligente foco;
    private AireAcondicionado aire;
    private CerraduraDigital cerradura;
    private BocinaInteligente bocina;

    public ControlRemoto() {
        // Constructor vacío para asignar referencias mediante setters
    }

    // Métodos para cambiar escenarios
    public void modoBienvenida() {
        System.out.println("\n>>> EJECUTANDO: MODO BIENVENIDA <<<");
        if (cerradura != null) cerradura.desbloquear("1234");
        if (foco != null) {
            foco.encender();
            foco.cambiarIntensidad(80);
        }
        if (aire != null) {
            aire.encender();
            aire.ajustarTemperatura(22);
        }
        if (bocina != null) {
            bocina.encender();
            bocina.setVolumen(30);
            bocina.reproducirMusica("Música Ambiental");
        }
    }

    public void modoNoche() {
        System.out.println("\n>>> EJECUTANDO: MODO NOCHE <<<");
        if (foco != null) foco.apagar();
        if (bocina != null) bocina.apagar();
        if (aire != null) {
            aire.encender();
            aire.ajustarTemperatura(24);
        }
        if (cerradura != null) cerradura.bloquear();
    }

    public void modoCine() {
        System.out.println("\n>>> EJECUTANDO: MODO CINE <<<");
        if (foco != null) foco.cambiarIntensidad(15);
        if (bocina != null) bocina.apagar();
    }

    // Setters de referencias
    public void setFoco(FocoInteligente foco) { this.foco = foco; }
    public void setAire(AireAcondicionado aire) { this.aire = aire; }
    public void setCerradura(CerraduraDigital cerradura) { this.cerradura = cerradura; }
    public void setBocina(BocinaInteligente bocina) { this.bocina = bocina; }
}