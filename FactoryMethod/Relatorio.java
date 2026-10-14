/**
 * Produto do Factory Method: interface comum a todos os relatórios.
 * Quem usa a fábrica só conhece este tipo.
 */
public interface Relatorio {
    /**
     * Gera o relatório no formato da classe concreta.
     */
    void gerar();
}
