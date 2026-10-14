/**
 * Contexto do Strategy: guarda uma estratégia de pagamento e deixa o
 * pagamento por conta dela, sem saber qual é.
 */
public class CarrinhoDeCompras {
    private EstrategiaPagamento estrategiaPagamento;
    private double valorTotal;

    /**
     * Soma o preço do item ao total do carrinho.
     */
    public void adicionarItem(String nome, double preco) {
        valorTotal += preco;
        System.out.printf("Item adicionado: %s (R$ %.2f)%n", nome, preco);
    }

    /**
     * Define a forma de pagamento. Pode ser trocada a qualquer momento,
     * e é aí que o padrão aparece.
     */
    public void setEstrategiaPagamento(EstrategiaPagamento estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    /**
     * Fecha a compra usando a estratégia escolhida. Se nenhuma foi escolhida,
     * só avisa o cliente.
     */
    public void finalizarCompra() {
        System.out.printf("Finalizando compra de R$ %.2f...%n", valorTotal);
        if (estrategiaPagamento == null) {
            System.out.println("Escolha uma forma de pagamento antes de finalizar a compra.");
            return;
        }
        estrategiaPagamento.processarPagamento(valorTotal);
    }
}
