/**
 * Fachada: esconde os vários aparelhos atrás de dois métodos simples.
 * O cliente chama assistirFilme() em vez de ligar e ajustar cada aparelho.
 */
public class HomeTheaterFacade {
    private TV tv;
    private Amplificador amplificador;
    private PlayerBluray player;
    private Luzes luzes;

    public HomeTheaterFacade(TV tv, Amplificador amplificador, PlayerBluray player, Luzes luzes) {
        this.tv = tv;
        this.amplificador = amplificador;
        this.player = player;
        this.luzes = luzes;
    }

    /**
     * Prepara a sala inteira para o filme, chamando cada aparelho na ordem certa.
     */
    public void assistirFilme() {
        System.out.println(">> Preparando a sala para o filme...");
        luzes.diminuirPara(15);
        tv.ligar();
        tv.selecionarEntrada("HDMI 2");
        amplificador.ligar();
        amplificador.ativarSomSurround();
        amplificador.ajustarVolume(32);
        player.ligar();
        player.reproduzir();
        System.out.println(">> Bom filme!");
    }

    /**
     * Desliga tudo no fim do filme e acende as luzes de novo.
     */
    public void encerrarFilme() {
        System.out.println(">> Encerrando a sessão...");
        player.parar();
        player.desligar();
        amplificador.desligar();
        tv.desligar();
        luzes.acender();
    }
}
