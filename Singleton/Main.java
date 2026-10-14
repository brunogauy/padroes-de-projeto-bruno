/**
 * Demonstração do Singleton: várias chamadas e várias threads recebem
 * sempre o mesmo objeto.
 */
public class Main {
    /**
     * Pede a configuração duas vezes e depois em três threads, conferindo
     * se é sempre a mesma instância.
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Padrão Singleton ===");

        // new ConfiguracaoGlobal(); // não compila: o construtor é privado

        ConfiguracaoGlobal primeira = ConfiguracaoGlobal.getInstance();
        ConfiguracaoGlobal segunda = ConfiguracaoGlobal.getInstance();

        System.out.println("URL do banco: " + primeira.getUrlBanco());
        System.out.println("Porta: " + primeira.getPorta());
        System.out.println("Timeout: " + primeira.getTimeoutSegundos() + " segundos");
        System.out.println("primeira == segunda? " + (primeira == segunda));

        Thread[] threads = new Thread[3];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                boolean mesma = ConfiguracaoGlobal.getInstance() == primeira;
                System.out.println(Thread.currentThread().getName() + " recebeu a mesma instância? " + mesma);
            }, "Thread-" + (i + 1));
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
    }
}
