/**
 * Estratégia concreta: PIX, que dá desconto para pagamento à vista.
 */
public class PagamentoPix implements EstrategiaPagamento {
    private static final double DESCONTO = 0.08;

    /**
     * Gera o QR Code com 8% de desconto sobre o valor.
     */
    @Override
    public void processarPagamento(double valor) {
        double total = valor - valor * DESCONTO;
        System.out.printf("[PIX] Desconto de 8%% concedido. QR Code gerado no valor de: R$ %.2f%n", total);
    }
}
