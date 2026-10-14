/**
 * Decorator concreto: adiciona bacon ao hambúrguer que recebe, mudando a
 * descrição e somando R$ 6,40 ao preço.
 */
public class Bacon extends HamburguerDecorator {
    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    /**
     * Descrição do hambúrguer embrulhado com o bacon no final.
     */
    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + " + bacon defumado";
    }

    /**
     * Preço do hambúrguer embrulhado mais o valor do bacon.
     */
    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 6.40;
    }
}
