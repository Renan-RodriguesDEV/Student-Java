package devacademy.metodos;

import java.util.Arrays;

public class busca {
    public static void main(String[] args) {
        int meu[] = { 1, 2, 3, 4, 5 };

        boolean b = busca(meu, 1);
        System.out.println(b);
    }

    static boolean busca(int array[], int buscado) {
        Arrays.sort(array);
        int comeco = 0;
        int fim = array.length - 1;
        while (comeco <= fim) {
            int meio = (comeco + fim) / 2;
            if (array[meio] == buscado) {
                return true;
            } else {
                if (buscado < array[meio]) {
                    fim = meio - 1;
                } else {
                    comeco = meio + 1;
                }
            }
        }
        return false;
    }
}
