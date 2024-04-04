package calculoTriangulo;

import javax.swing.JOptionPane;

public class APP2 {

    public static void main(String[] args) throws Exception {
       
            double n[]= new double[3];
            
            for (int i = 0; i <= 2; i++) {
                String en = JOptionPane.showInputDialog(null, "Qual tamanho do ["+i+"] lado do seu triangulo", "Iniciando o triangulo", JOptionPane.WARNING_MESSAGE);         
                n[i] = Double.parseDouble(en);
                
            }
           
            CalcTriangulo triangulo = new CalcTriangulo(n[0],n[1],n[2]);
            JOptionPane.showMessageDialog(null,"Seu triangulo é: "+triangulo.getTipo(),"Tipo de Triangulo ?? ",JOptionPane.CLOSED_OPTION);
            JOptionPane.showMessageDialog(null,"Com os lados: " + triangulo.getL1() +" / "+ triangulo.getL2() +" / "+ triangulo.getL3(),"Valores dos lados",JOptionPane.CLOSED_OPTION);
            
        }
        
    }


