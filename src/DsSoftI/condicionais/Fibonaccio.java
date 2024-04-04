package DsSoftI.condicionais;

//exibir a sequencia fibonacci até 10
public class Fibonaccio {
    public static void main(String[] args) {

        int f1 = 1;// f1 começa em 1
        int f2 = 1;// f2 começa em 1
        int f3 = 0;// f3 começa em 0 pq sera nosso acumulador no loop

        // printamos os dois primeiros
        System.out.print(f1 + " + ");
        System.out.print(f2);

        // começamos em 1 até 8 pq ja temos 2, o f1 e o f2 ( 1 + 1 = 2), (10 - 2 = 8)
        for (int i = 1; i <= 8; i++) {
            f3 = f1 + f2;// f3 sempre recebe a soma de f1+f2
            // trocamos as posiçoes para a soma da proxima volta
            f2 = f1; // f2 agora é o atual f1
            f1 = f3; // f1 agora é o atual f3

            System.out.print(" + " + f3);// exibimos o f3 a cada volta
        }

    }
}
