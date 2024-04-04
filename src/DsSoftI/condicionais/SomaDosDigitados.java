package DsSoftI.condicionais;

import javax.swing.JOptionPane;

public class SomaDosDigitados {

    public static void main(String[] args) {
        int somados = 0;

        while (true) {
            int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));

            if (numeroDigitado < 0) {
                JOptionPane.showMessageDialog(null, "Você digitou um número negativo. O jogo será encerrado.");
                break;
            } else {
                somados += numeroDigitado;
                JOptionPane.showMessageDialog(null, "A soma dos números digitados até agora é: " + somados);
            }
        }
    }
}
