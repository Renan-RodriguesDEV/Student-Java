package devacademy.metodos;

public class recursividade {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    static int fatorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * fatorial(i - 1);

    }
}
