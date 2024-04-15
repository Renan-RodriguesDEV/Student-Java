package devacademy.colletions;

import java.util.HashMap;
import java.util.Map;

public class Dicionarios {
    public static void main(String[] args) {
        // meu arrays
        String[] keys = {
                "ADM", "ADS", "Contabilidade", "Direito", "Biologia", "Infermagem",
                "Zootecnia" };
        double[] values = { 900, 741, 1200, 3100, 2000, 1100, 2090 };

        // estancia do dicionario
        Map<String, Double> dic = new HashMap<>();

        // chamando o metodo
        preencherMap(dic, keys, values);

        System.out.println("Dicionário de cursos:");
        // printando com um foreach
        for (Map.Entry<String, Double> entry : dic.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + " - " + value);
        }

    }

    // metodo pra preencher o dicionario
    static void preencherMap(Map<String, Double> dic, String[] keys, double[] values) {
        // coloquei isso pra num bugar se o tamanho do array de chaves(keys) for
        // diferente do de valores(values)
        if (keys.length != values.length) {
            throw new IllegalStateException("Chara os tamanhos nao batem ajeita ai po");
        }
        for (int i = 0; i < values.length; i++) {
            dic.put(keys[i], values[i]);
        }
    }
}
