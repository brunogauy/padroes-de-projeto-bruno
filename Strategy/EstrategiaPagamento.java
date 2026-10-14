/**
 * Strategy: contrato comum que toda forma de pagamento precisa seguir,
 * para o carrinho poder trocar de uma para outra.
 */
public interface EstrategiaPagamento {
    /**
     * Processa o pagamento do valor informado do jeito desta forma de pagamento.
     */
    void processarPagamento(double valor);
}
