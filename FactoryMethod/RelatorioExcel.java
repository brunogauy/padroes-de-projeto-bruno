/**
 * Produto concreto: relatório em planilha Excel, criado pela RelatorioFactory.
 */
public class RelatorioExcel implements Relatorio {
    /**
     * Gera o relatório de vendas em Excel.
     */
    @Override
    public void gerar() {
        System.out.println("[Excel] Preenchendo a aba Resumo e salvando vendas_mensais.xlsx");
    }
}
