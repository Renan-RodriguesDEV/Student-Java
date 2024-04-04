package DsSoftI.condicionais;

import javax.swing.JOptionPane;

public class Adivinhando {

    public static void main(String[] args) {
        // loop infinito mas break caso acerte o numero
        while (true) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));

            // pra que começe em 1 e o limite do sorteio seja 100
            int sorteado = (int) (1 + Math.random() * 100);

            if (n == sorteado) {
                JOptionPane.showMessageDialog(null, "Acertou miseravi, fechando o Loop");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Você errou o número era: " + sorteado);
            }
        }
    }
}
