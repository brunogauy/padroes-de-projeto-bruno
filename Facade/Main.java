/**
 * Demonstração do Facade: o cliente controla o home theater usando só
 * dois métodos da fachada.
 */
public class Main {
    /**
     * Monta o home theater, começa e encerra uma sessão de filme.
     */
    public static void main(String[] args) {
        System.out.println("=== Padrão Facade ===");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new TV(), new Amplificador(), new PlayerBluray(), new Luzes());

        homeTheater.assistirFilme();
        System.out.println();
        homeTheater.encerrarFilme();
    }
}
