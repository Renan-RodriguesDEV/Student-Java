package DsSoftI.Exercicios;

import javax.swing.JOptionPane;

public class Validacao {
    public static void main(String[] args) {
        String dfLogin = JOptionPane.showInputDialog(null, "Defina seu login: ", "DEFINIÇÃO DE LOGIN",
                JOptionPane.OK_CANCEL_OPTION);
        String dfPass = JOptionPane.showInputDialog(null, "Defina sua senha: ", "DEFINIÇÃO DE SENHA",
                JOptionPane.OK_CANCEL_OPTION);
        String login = JOptionPane.showInputDialog(null, "Insira seu login: ", "VALIDAÇÃO DE LOGIN",
                JOptionPane.OK_CANCEL_OPTION);
        String passWord = JOptionPane.showInputDialog(null, "Insira sua senha: ", "VALIDAÇÃO DE USUARIOS",
                JOptionPane.OK_CANCEL_OPTION);

        if (isValido(dfLogin, dfPass, login, passWord)) {
            JOptionPane.showMessageDialog(null, "Usuario e senha estão corretos, acesso autorizado", "Acesso Liberado",
                    JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario e senha estão INCORRETOS\n ACESSO NEGADO!!!", "Acesso Negado",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    static boolean isValido(String dfLogin, String dfPass, String login, String passWord) {
        if (login.equals(dfLogin) && passWord.equals(dfPass)) {
            return true;
        } else {
            return false;
        }
    }
}
