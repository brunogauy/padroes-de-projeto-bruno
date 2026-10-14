import java.util.ArrayList;
import java.util.List;

/**
 * Subject do Observer: a ação guarda a lista de observadores e avisa todos
 * quando o preço muda.
 */
public class Acao {
    private String codigo;
    private double preco;
    private List<Observer> observadores = new ArrayList<>();

    public Acao(String codigo, double precoInicial) {
        this.codigo = codigo;
        this.preco = precoInicial;
    }

    /**
     * Inscreve um observador para receber os avisos de mudança de preço.
     */
    public void adicionarObserver(Observer observer) {
        observadores.add(observer);
    }

    /**
     * Tira o observador da lista, e ele para de receber avisos.
     */
    public void removerObserver(Observer observer) {
        observadores.remove(observer);
    }

    /**
     * Muda o preço da ação e avisa os observadores. Se o preço for igual
     * ao atual, ninguém é avisado.
     */
    public void setPreco(double novoPreco) {
        if (novoPreco == preco) {
            System.out.printf("%n[Bolsa] %s continua em R$ %.2f. Ninguém é notificado.%n", codigo, preco);
            return;
        }
        System.out.printf("%n[Bolsa] %s mudou de R$ %.2f para R$ %.2f%n", codigo, preco, novoPreco);
        this.preco = novoPreco;
        notificarObservadores();
    }

    /**
     * Avisa todos os observadores do preço novo. É privado porque só a
     * própria ação decide quando avisar.
     */
    private void notificarObservadores() {
        for (Observer observer : observadores) {
            observer.atualizar(preco);
        }
    }

    /**
     * Devolve o código da ação na bolsa, como "TECH4".
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Devolve o preço atual da ação.
     */
    public double getPreco() {
        return preco;
    }
}
