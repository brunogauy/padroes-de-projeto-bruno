/**
 * Classe legada (adaptada): só entende pedidos em XML e não implementa
 * CalculadorFrete, por isso precisa do adaptador.
 */
public class FreteAntigoXML {
    private static final double TAXA_BASE = 7.50;
    private static final double VALOR_POR_KG_KM = 0.012;

    /**
     * Lê o peso e a distância de dentro do XML e devolve o custo do frete.
     */
    public double obterCustoXML(String xmlDados) {
        System.out.println("  [Sistema legado] XML recebido: " + xmlDados);
        double peso = lerTag(xmlDados, "pesoKg");
        double distancia = lerTag(xmlDados, "distanciaKm");
        return TAXA_BASE + peso * distancia * VALOR_POR_KG_KM;
    }

    /**
     * Leitura bem simplificada de uma tag do XML, feita só para a demonstração.
     */
    private double lerTag(String xml, String tag) {
        int inicio = xml.indexOf("<" + tag + ">") + tag.length() + 2;
        int fim = xml.indexOf("</" + tag + ">");
        return Double.parseDouble(xml.substring(inicio, fim));
    }
}
