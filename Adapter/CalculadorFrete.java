/**
 * Alvo do Adapter: é a interface moderna que o sistema atual sabe usar
 * para calcular o frete.
 */
public interface CalculadorFrete {
    /**
     * Calcula o custo do frete a partir do peso (kg) e da distância (km).
     */
    double calcular(double peso, double distancia);
}
