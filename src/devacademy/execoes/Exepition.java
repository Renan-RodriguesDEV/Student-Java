package devacademy.execoes;

import javax.swing.JOptionPane;

public class Exepition {
    public static void main(String[] args) {
        int[] num = new int[5];
        try {
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(JOptionPane.showInputDialog("insert num"));
            }
            inverte(num);
            for (int i : num) {
                System.out.print(i);

            }
        } catch (Exception e) {
            System.out.print("Calma pae deu um pequeno erro aq " + e.getMessage());
            e.printStackTrace();
            System.out.println("possivelmente de string pra int");
        }
    }

    // qnd definimos o throws Exception jogamos o try catch para outro
    static void inverte(int[] array) throws Exception {

        int dir = array.length - 1;
        int esc = 0;
        while (dir > esc) {
            int aux = array[esc];
            array[esc] = array[dir];
            array[dir] = aux;
            esc++;
            dir--;
        }

    }
}
