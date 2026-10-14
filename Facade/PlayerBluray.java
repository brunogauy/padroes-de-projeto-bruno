/**
 * Subsistema do Facade: reprodutor de Blu-ray.
 */
public class PlayerBluray {
    /**
     * Liga o player.
     */
    public void ligar() {
        System.out.println("Player Blu-ray: ligado.");
    }

    /**
     * Começa a tocar o disco.
     */
    public void reproduzir() {
        System.out.println("Player Blu-ray: reproduzindo o disco.");
    }

    /**
     * Para a reprodução do disco.
     */
    public void parar() {
        System.out.println("Player Blu-ray: reprodução parada.");
    }

    /**
     * Desliga o player.
     */
    public void desligar() {
        System.out.println("Player Blu-ray: desligado.");
    }
}
