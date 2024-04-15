package DsSoftI.javaGUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        janela();
    }

    static JButton botao() {
        JButton btn = new JButton();
        btn.setText("click");
        btn.setVisible(true);
        return btn;
    }

    static void janela() {
        JFrame jf = new JFrame("Hello World");
        jf.setSize(500, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(botao());
    }

}
