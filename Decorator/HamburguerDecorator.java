/**
 * Decorator abstrato: implementa a mesma interface do hambúrguer e guarda
 * o hambúrguer que está embrulhando. Por padrão só repassa as chamadas.
 */
public abstract class HamburguerDecorator implements Hamburguer {
    protected Hamburguer hamburguer;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    /**
     * Repassa a descrição do hambúrguer embrulhado.
     */
    @Override
    public String getDescricao() {
        return hamburguer.getDescricao();
    }

    /**
     * Repassa o preço do hambúrguer embrulhado.
     */
    @Override
    public double getPreco() {
        return hamburguer.getPreco();
    }
}
