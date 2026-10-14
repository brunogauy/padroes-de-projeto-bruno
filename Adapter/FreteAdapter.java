/**
 * Adaptador: implementa a interface moderna CalculadorFrete e, por dentro,
 * repassa o pedido para o sistema legado que só entende XML.
 */
public class FreteAdapter implements CalculadorFrete {
    private FreteAntigoXML sistemaLegado;

    public FreteAdapter(FreteAntigoXML sistemaLegado) {
        this.sistemaLegado = sistemaLegado;
    }

    /**
     * Monta o XML que o sistema legado espera e devolve o custo que ele calcular.
     */
    @Override
    public double calcular(double peso, double distancia) {
        String xml = "<pedidoFrete><pesoKg>" + peso + "</pesoKg>"
                + "<distanciaKm>" + distancia + "</distanciaKm></pedidoFrete>";
        return sistemaLegado.obterCustoXML(xml);
    }
}
