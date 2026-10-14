/**
 * Decorator concreto: adiciona ovo ao hambúrguer que recebe, mudando a
 * descrição e somando R$ 2,90 ao preço.
 */
public class Ovo extends HamburguerDecorator {
    public Ovo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    /**
     * Descrição do hambúrguer embrulhado com o ovo no final.
     */
    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + " + ovo caipira";
    }

    /**
     * Preço do hambúrguer embrulhado mais o valor do ovo.
     */
    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 2.90;
    }
}
