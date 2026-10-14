/**
 * Demonstração do Decorator: cada adicional embrulha o hambúrguer anterior
 * e soma preço e descrição.
 */
public class Main {
    /**
     * Monta quatro combinações de hambúrguer e mostra descrição e preço de cada uma.
     */
    public static void main(String[] args) {
        System.out.println("=== Padrão Decorator ===");

        Hamburguer simples = new HamburguerBase();
        mostrar("Simples", simples);

        Hamburguer comQueijo = new Queijo(new HamburguerBase());
        mostrar("Com queijo", comQueijo);

        Hamburguer completo = new Ovo(new Bacon(new Queijo(new HamburguerBase())));
        mostrar("Completo", completo);

        Hamburguer duploBacon = new Bacon(new Bacon(new HamburguerBase()));
        mostrar("Duplo bacon", duploBacon);
    }

    /**
     * Imprime o nome da combinação, a descrição e o preço formatado.
     */
    private static void mostrar(String nome, Hamburguer hamburguer) {
        System.out.printf("%s: %s -> R$ %.2f%n", nome, hamburguer.getDescricao(), hamburguer.getPreco());
    }
}
