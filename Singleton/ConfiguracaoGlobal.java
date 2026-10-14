/**
 * Singleton: guarda as configurações do banco e garante que exista só uma
 * instância dela no sistema inteiro.
 */
public class ConfiguracaoGlobal {

    private static ConfiguracaoGlobal instancia;

    private String urlBanco;
    private int porta;
    private int timeoutSegundos;

    /**
     * Construtor privado: ninguém fora desta classe consegue fazer
     * "new ConfiguracaoGlobal()", só o getInstance().
     */
    private ConfiguracaoGlobal() {
        System.out.println("[ConfiguracaoGlobal] Lendo configurações do banco (acontece uma única vez)...");
        this.urlBanco = "jdbc:postgresql://db.loja-academica.local/vendas";
        this.porta = 5432;
        this.timeoutSegundos = 45;
    }

    /**
     * Ponto global de acesso: cria a instância só na primeira chamada e depois
     * devolve sempre a mesma. O synchronized evita que duas threads criem
     * duas instâncias ao mesmo tempo.
     */
    public static synchronized ConfiguracaoGlobal getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracaoGlobal();
        }
        return instancia;
    }

    /**
     * Devolve o endereço JDBC do banco.
     */
    public String getUrlBanco() {
        return urlBanco;
    }

    /**
     * Devolve a porta do banco.
     */
    public int getPorta() {
        return porta;
    }

    /**
     * Devolve quantos segundos esperar pelo banco antes de desistir.
     */
    public int getTimeoutSegundos() {
        return timeoutSegundos;
    }
}
