/**
 * Observer: contrato de quem quer ser avisado quando o preço da ação mudar.
 */
public interface Observer {
    /**
     * Chamado pela ação sempre que o preço muda, já com o preço novo.
     */
    void atualizar(double novoPreco);
}
