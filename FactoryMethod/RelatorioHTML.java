/**
 * Produto concreto: relatório em página HTML, criado pela RelatorioFactory.
 */
public class RelatorioHTML implements Relatorio {
    /**
     * Gera o relatório de vendas em HTML.
     */
    @Override
    public void gerar() {
        System.out.println("[HTML] Criando a tabela de vendas e publicando vendas_mensais.html");
    }
}
