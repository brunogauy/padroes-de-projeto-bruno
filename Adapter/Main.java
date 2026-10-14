/**
 * Demonstração do Adapter: o cliente usa só CalculadorFrete e nem sabe
 * que existe um sistema em XML por trás.
 */
public class Main {
    /**
     * Calcula o frete de duas entregas usando o adaptador.
     */
    public static void main(String[] args) {
        System.out.println("=== Padrão Adapter ===");

        CalculadorFrete calculador = new FreteAdapter(new FreteAntigoXML());

        double[][] entregas = {{3.0, 250.0}, {12.5, 80.0}};
        for (double[] entrega : entregas) {
            System.out.printf("Calculando frete: %.1f kg por %.0f km%n", entrega[0], entrega[1]);
            double custo = calculador.calcular(entrega[0], entrega[1]);
            System.out.printf("Frete: R$ %.2f%n%n", custo);
        }
    }
}
