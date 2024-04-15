package devacademy.colletions;

import java.util.HashMap;

public class Dicionary_2 {
    public static void main(String[] args) {
        HashMap<String, Double> carros = new HashMap<>();
        String nomes[] = { "Camaro", "Mustang", "Ferrari" };
        Double preco[] = { 2500.000, 3500.000, 4500.000 };
        for (int i = 0; i < preco.length; i++) {
            carros.put(nomes[i], preco[i]);
        }
        System.out.println(carros);
        for (double x : carros.values()) {
            System.out.println("Valor:" + x);
        }
    }
}
