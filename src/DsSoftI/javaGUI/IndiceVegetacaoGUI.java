package DsSoftI.javaGUI;

import javax.swing.*;
import java.awt.event.*;

public class IndiceVegetacaoGUI extends JFrame implements ActionListener {
    // Componentes da interface gráfica
    private JLabel redLabel, nirLabel, resultRVI, resultNDVI, resultSAVI;
    private JTextField redField, nirField;
    private JButton calculateButton;

    public IndiceVegetacaoGUI() {
        // Configurações da janela
        setTitle("Vegetation Index Calculator");
        setSize(500, 380);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Rótulos
        redLabel = new JLabel("Red Band Value:");
        redLabel.setBounds(20, 20, 120, 20);
        add(redLabel);

        nirLabel = new JLabel("NIR Band Value:");
        nirLabel.setBounds(20, 50, 120, 20);
        add(nirLabel);

        // Campos de texto
        redField = new JTextField();
        redField.setBounds(140, 20, 120, 20);
        add(redField);

        nirField = new JTextField();
        nirField.setBounds(140, 50, 120, 20);
        add(nirField);

        // Botão de calcular
        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(100, 80, 100, 30);
        calculateButton.addActionListener(this);
        add(calculateButton);

        // Rótulos de resultados
        resultRVI = new JLabel("RVI: ");
        resultRVI.setBounds(20, 120, 250, 20);
        add(resultRVI);

        resultNDVI = new JLabel("NDVI: ");
        resultNDVI.setBounds(20, 140, 250, 20);
        add(resultNDVI);

        resultSAVI = new JLabel("SAVI: ");
        resultSAVI.setBounds(20, 160, 250, 20);
        add(resultSAVI);
    }

    // Método para calcular os índices quando o botão é clicado
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            double redValue = Double.parseDouble(redField.getText());
            double nirValue = Double.parseDouble(nirField.getText());

            // Verificar se os valores estão dentro das faixas corretas de comprimento de
            // onda
            if (redValue < 0.65 || redValue > 0.72 || nirValue < 0.72 || nirValue > 1.3) {
                JOptionPane.showMessageDialog(this, "Valores fora das faixas de comprimento de onda permitidas.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Cálculo dos índices de vegetação
            double rvi = redValue / nirValue;
            double ndvi = (nirValue - redValue) / (nirValue + redValue);
            double sav;
            double l = 0.5; // Exemplo de valor para o fator de ajuste do solo

            if (nirValue + redValue + l == 0) {
                sav = 0;
            } else {
                sav = (1 + l) * (nirValue - redValue) / (l + nirValue + redValue + 0.5);
            }

            // Exibir resultados
            resultRVI.setText("RVI: " + String.format("%.2f", rvi));
            resultNDVI.setText("NDVI: " + String.format("%.2f", ndvi));
            resultSAVI.setText("SAVI: " + String.format("%.2f", sav));
        }
    }

    public static void main(String[] args) {
        // Criar e exibir a janela
        SwingUtilities.invokeLater(() -> {
            IndiceVegetacaoGUI calculator = new IndiceVegetacaoGUI();
            calculator.setVisible(true);
        });
    }
}
