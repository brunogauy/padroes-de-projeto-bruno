/**
 * Observer concreto: painel no navegador que redesenha o gráfico quando
 * o preço muda.
 */
public class PainelWeb implements Observer {
    private String nomePainel;

    public PainelWeb(String nomePainel) {
        this.nomePainel = nomePainel;
    }

    /**
     * Acrescenta o preço novo ao gráfico do painel.
     */
    @Override
    public void atualizar(double novoPreco) {
        System.out.printf("  [Painel %s] Gráfico atualizado com o ponto R$ %.2f%n", nomePainel, novoPreco);
    }
}
