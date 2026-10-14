/**
 * Componente do Decorator: interface comum ao hambúrguer simples e aos
 * adicionais, para que todos possam ser usados do mesmo jeito.
 */
public interface Hamburguer {
    /**
     * Devolve a descrição do hambúrguer com todos os adicionais.
     */
    String getDescricao();

    /**
     * Devolve o preço total, já somando os adicionais.
     */
    double getPreco();
}
