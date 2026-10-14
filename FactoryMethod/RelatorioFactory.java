/**
 * Fábrica do Factory Method: recebe o tipo como texto e decide qual
 * relatório concreto criar. Quem usa a fábrica só conhece a interface Relatorio.
 */
public class RelatorioFactory {

    /**
     * Cria o relatório do tipo pedido ("pdf", "excel" ou "html"), sem diferenciar
     * maiúsculas e ignorando espaços nas pontas. Lança IllegalArgumentException
     * se o tipo for vazio ou desconhecido.
     */
    public static Relatorio criar(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("Tipo de relatório não informado.");
        }

        switch (tipo.trim().toLowerCase()) {
            case "pdf":
                return new RelatorioPDF();
            case "excel":
                return new RelatorioExcel();
            case "html":
                return new RelatorioHTML();
            default:
                throw new IllegalArgumentException("Tipo de relatório desconhecido: " + tipo);
        }
    }
}
