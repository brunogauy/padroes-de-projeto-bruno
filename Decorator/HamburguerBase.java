/**
 * Componente concreto: o hambúrguer sem adicionais, que vai ser
 * embrulhado pelos decorators.
 */
public class HamburguerBase implements Hamburguer {
    /**
     * Descrição do hambúrguer simples.
     */
    @Override
    public String getDescricao() {
        return "Pão brioche com blend de 160g";
    }

    /**
     * Preço do hambúrguer simples, sem nenhum adicional.
     */
    @Override
    public double getPreco() {
        return 21.90;
    }
}
