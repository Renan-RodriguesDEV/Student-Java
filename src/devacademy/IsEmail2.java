package devacademy;

import javax.swing.JOptionPane;

public class IsEmail2 {
    public static void main(String[] args) {
        String pv = JOptionPane.showInputDialog("insert into: ");
        isPalidromo(pv);
        exibir(pv);
    }

    static boolean isPalidromo(String pv) {
        // removendo os espacos
        pv = pv.replaceAll(" ", "");

        int start = 0;
        int end = pv.length() - 1;

        for (int i = 0; i < pv.length(); i++) {
            if (pv.charAt(start) != pv.charAt(end)) {
                return false;
            }
        }
        return true;
    }

    static void exibir(String pv) {
        StringBuilder sb = new StringBuilder(pv);
        if (isPalidromo(pv)) {
            System.out.println("is palidromo " + sb.reverse());
        } else {
            System.out.println("not is palidromo");
        }
    }
}
