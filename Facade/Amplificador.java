/**
 * Subsistema do Facade: amplificador de som. O cliente não mexe nele
 * direto, quem controla é a fachada.
 */
public class Amplificador {
    /**
     * Liga o amplificador.
     */
    public void ligar() {
        System.out.println("Amplificador: ligado.");
    }

    /**
     * Coloca o som no modo surround para o filme.
     */
    public void ativarSomSurround() {
        System.out.println("Amplificador: modo surround 7.1 ativado.");
    }

    /**
     * Ajusta o volume para o nível informado.
     */
    public void ajustarVolume(int nivel) {
        System.out.println("Amplificador: volume em " + nivel + ".");
    }

    /**
     * Desliga o amplificador.
     */
    public void desligar() {
        System.out.println("Amplificador: desligado.");
    }
}
