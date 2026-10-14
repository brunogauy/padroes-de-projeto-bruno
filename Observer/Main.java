/**
 * Demonstração do Observer: a ação muda de preço e os inscritos são
 * avisados automaticamente.
 */
public class Main {
    /**
     * Inscreve três observadores, muda o preço algumas vezes e remove um deles no meio.
     */
    public static void main(String[] args) {
        System.out.println("=== Padrão Observer ===");

        Acao acao = new Acao("TECH4", 31.20);

        Observer celularAna = new AppCelular("Ana");
        Observer celularCarlos = new AppCelular("Carlos");
        Observer painel = new PainelWeb("Mesa de Operações");

        acao.adicionarObserver(celularAna);
        acao.adicionarObserver(celularCarlos);
        acao.adicionarObserver(painel);

        acao.setPreco(32.85);
        acao.setPreco(32.85);

        System.out.println("\n(Carlos desativou as notificações)");
        acao.removerObserver(celularCarlos);

        acao.setPreco(29.40);
    }
}
