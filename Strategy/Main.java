/**
 * Demonstração do Strategy: o mesmo carrinho paga de formas diferentes
 * trocando só a estratégia.
 */
public class Main {
    /**
     * Enche o carrinho e tenta finalizar sem estratégia e depois com cada
     * forma de pagamento.
     */
    public static void main(String[] args) {
        System.out.println("=== Padrão Strategy ===");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Mouse sem fio", 89.90);
        carrinho.adicionarItem("Teclado mecânico", 249.00);

        System.out.println("\n-- Sem estratégia definida --");
        carrinho.finalizarCompra();

        System.out.println("\n-- Cartão de crédito --");
        carrinho.setEstrategiaPagamento(new PagamentoCartaoCredito());
        carrinho.finalizarCompra();

        System.out.println("\n-- PayPal --");
        carrinho.setEstrategiaPagamento(new PagamentoPayPal());
        carrinho.finalizarCompra();

        System.out.println("\n-- PIX --");
        carrinho.setEstrategiaPagamento(new PagamentoPix());
        carrinho.finalizarCompra();
    }
}
