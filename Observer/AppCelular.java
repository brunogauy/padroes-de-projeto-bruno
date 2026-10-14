/**
 * Observer concreto: aplicativo de celular que mostra um alerta para o
 * usuário quando o preço muda.
 */
public class AppCelular implements Observer {
    private String nomeUsuario;

    public AppCelular(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    /**
     * Mostra o alerta no celular com o preço novo.
     */
    @Override
    public void atualizar(double novoPreco) {
        System.out.printf("  [Celular de %s] Alerta: a cotação agora é R$ %.2f%n", nomeUsuario, novoPreco);
    }
}
