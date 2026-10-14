/**
 * Subsistema do Facade: iluminação da sala.
 */
public class Luzes {
    /**
     * Diminui a luz para a porcentagem informada.
     */
    public void diminuirPara(int porcentagem) {
        System.out.println("Luzes: intensidade reduzida para " + porcentagem + "%.");
    }

    /**
     * Acende as luzes no máximo.
     */
    public void acender() {
        System.out.println("Luzes: acesas em 100%.");
    }
}
