/**
 * Estratégia concreta: PayPal, que cobra uma tarifa fixa por transação.
 */
public class PagamentoPayPal implements EstrategiaPagamento {
    private static final double TARIFA_FIXA = 2.75;

    /**
     * Debita o valor da conta PayPal somando a tarifa fixa de R$ 2,75.
     */
    @Override
    public void processarPagamento(double valor) {
        double total = valor + TARIFA_FIXA;
        System.out.printf("[PayPal] Tarifa fixa de R$ 2,75 somada. Valor debitado da conta PayPal: R$ %.2f%n", total);
    }
}
