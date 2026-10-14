/**
 * Produto concreto: relatório em PDF, criado pela RelatorioFactory.
 */
public class RelatorioPDF implements Relatorio {
    /**
     * Gera o relatório de vendas em PDF.
     */
    @Override
    public void gerar() {
        System.out.println("[PDF] Montando páginas A4 e exportando vendas_mensais.pdf");
    }
}
