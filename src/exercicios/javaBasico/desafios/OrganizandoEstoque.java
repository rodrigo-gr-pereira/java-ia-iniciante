package exercicios.javaBasico.desafios;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OrganizandoEstoque {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String saida = organizarEstoque(entrada);

        System.out.println(saida);

        scanner.close();
    }

    public static String organizarEstoque(String entrada) {
        // TODO: Crie um mapa (LinkedHashMap) para armazenar o total de cada código mantendo a ordem de aparição
        Map<String, Integer> estoque = new LinkedHashMap<>();

        // Divide a entrada pelas vírgulas
        String[] lojas = entrada.split(",");

        // Percorre cada item "LOJAx:quantidade"
        for (String loja : lojas) {
            String[] partes = loja.split(":");
            String codigo = partes[0].trim();
            int quantidade = Integer.parseInt(partes[1].trim());

            // Soma a quantidade no mapa
            estoque.put(codigo, estoque.getOrDefault(codigo, 0) + quantidade);
        }

        // Monta a saída
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            sb.append(entry.getKey())
                    .append(":")
                    .append(entry.getValue())
                    .append(",");
        }

        // Remove a última vírgula
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }
}
