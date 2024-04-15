package devacademy.execoes;

import javax.swing.JOptionPane;

public class TryCatch {
    public static void main(String[] args) {
        String nome[] = new String[3];
        int idade[] = new int[nome.length];

        try {
            for (int i = 0; i < idade.length; i++) {
                nome[i] = JOptionPane.showInputDialog("Insira nome:");
                idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira idade"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("printando pilha de rastreamento");
            e.printStackTrace();
        } finally {
            for (int i = 0; i < idade.length; i++) {
                System.out.println(nome[i] + " : " + idade[i]);
            }
        }
    }
}
