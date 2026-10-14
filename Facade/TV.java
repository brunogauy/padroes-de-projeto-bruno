/**
 * Subsistema do Facade: televisão.
 */
public class TV {
    /**
     * Liga a TV.
     */
    public void ligar() {
        System.out.println("TV: ligada.");
    }

    /**
     * Troca a TV para a entrada informada, como "HDMI 2".
     */
    public void selecionarEntrada(String entrada) {
        System.out.println("TV: entrada " + entrada + " selecionada.");
    }

    /**
     * Desliga a TV.
     */
    public void desligar() {
        System.out.println("TV: desligada.");
    }
}
