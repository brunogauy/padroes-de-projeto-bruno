/**
 * Estratégia concreta: cartão de crédito, que cobra uma taxa percentual
 * da operadora.
 */
public class PagamentoCartaoCredito implements EstrategiaPagamento {
    private static final double TAXA_OPERADORA = 0.035;

    /**
     * Cobra o valor no cartão somando a taxa de 3,5% da operadora.
     */
    @Override
    public void processarPagamento(double valor) {
        double total = valor + valor * TAXA_OPERADORA;
        System.out.printf("[Cartão de Crédito] Taxa de 3,5%% aplicada. Valor cobrado no cartão: R$ %.2f%n", total);
    }
}
