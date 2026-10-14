/**
 * Decorator concreto: adiciona queijo ao hambúrguer que recebe, mudando a
 * descrição e somando R$ 3,80 ao preço.
 */
public class Queijo extends HamburguerDecorator {
    public Queijo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    /**
     * Descrição do hambúrguer embrulhado com o queijo no final.
     */
    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + " + cheddar derretido";
    }

    /**
     * Preço do hambúrguer embrulhado mais o valor do queijo.
     */
    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 3.80;
    }
}
