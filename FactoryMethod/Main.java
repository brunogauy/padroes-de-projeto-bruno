/**
 * Demonstração do Factory Method: o Main pede relatórios à fábrica, sem
 * usar new nas classes concretas.
 */
public class Main {
    /**
     * Pede relatórios válidos à fábrica e depois mostra o erro para tipos inválidos.
     */
    public static void main(String[] args) {
        System.out.println("=== Padrão Factory Method ===");

        String[] tipos = {"pdf", "Excel", " HTML "};
        for (String tipo : tipos) {
            Relatorio relatorio = RelatorioFactory.criar(tipo);
            System.out.print("Pedido \"" + tipo + "\" -> ");
            relatorio.gerar();
        }

        System.out.println("\n-- Tipos inválidos --");
        String[] invalidos = {"docx", null};
        for (String tipo : invalidos) {
            try {
                RelatorioFactory.criar(tipo);
            } catch (IllegalArgumentException erro) {
                System.out.println("Erro: " + erro.getMessage());
            }
        }
    }
}
