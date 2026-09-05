public class CasaInteligente {
    private final FocoInteligente foco;
    private final AireAcondicionado aire;
    private final Televisor televisor;
    private final CerraduraDigital cerradura;
    private final BocinaInteligente bocina;

    public CasaInteligente(FocoInteligente foco, AireAcondicionado aire, Televisor televisor,
                           CerraduraDigital cerradura, BocinaInteligente bocina) {
        this.foco = foco;
        this.aire = aire;
        this.televisor = televisor;
        this.cerradura = cerradura;
        this.bocina = bocina;
    }

    public void mostrarEstadoCasa() {
        System.out.println("--------------------------------------------------");
        foco.verEstadoActual();
        aire.verEstadoActual();
        televisor.verEstadoActual();
        cerradura.verEstadoActual();
        bocina.verEstadoActual();
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        // Inicializar dispositivos
        FocoInteligente foco = new FocoInteligente(false, 0, 15.0);
        AireAcondicionado aire = new AireAcondicionado(false, 25, "Frio");
        Televisor tv = new Televisor(false, 0, 1);
        CerraduraDigital cerradura = new CerraduraDigital(true, 100, "1234");
        BocinaInteligente bocina = new BocinaInteligente(false, 0, "Ninguna");

        // Configurar el control central
        ControlRemoto control = new ControlRemoto();
        control.setFoco(foco);
        control.setAire(aire);
        control.setTelevisor(tv);
        control.setCerradura(cerradura);
        control.setBocina(bocina);

        // Instanciar la casa inteligente
        CasaInteligente casa = new CasaInteligente(foco, aire, tv, cerradura, bocina);

        System.out.println("=== ESTADO INICIAL DE LA CASA ===");
        casa.mostrarEstadoCasa();

        // Probar interacción
        control.modoBienvenida();
        casa.mostrarEstadoCasa();

        control.modoCine();
        casa.mostrarEstadoCasa();

        control.modoNoche();
        casa.mostrarEstadoCasa();
    }
}
