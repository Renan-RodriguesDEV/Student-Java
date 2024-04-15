package devacademy.classes.videogame;

import javax.swing.JOptionPane;

/**
 * VideoGame
 */
public class VideoGame {
        public static void main(String[] args) {
                String nome = JOptionPane.showInputDialog(null, "Qual nome do seu jogo", "Nome do Jogo",
                                JOptionPane.PLAIN_MESSAGE);
                String genero = JOptionPane.showInputDialog(null, "Qual genero do seu jogo", "Genero do Jogo",
                                JOptionPane.PLAIN_MESSAGE);
                String anoStr = JOptionPane.showInputDialog(null, "Qual ano do seu jogo", "Ano do Jogo",
                                JOptionPane.PLAIN_MESSAGE);
                int anoInt = Integer.parseInt(anoStr);
                Jogo jogo = new Jogo(nome, genero, anoInt);
                jogo.statusJogo(jogo);

                String nomePesonagem = JOptionPane.showInputDialog(
                                null, "Qual nome do seu Jogador",
                                "Nome do Jogador", JOptionPane.PLAIN_MESSAGE);
                String generoPersonagem = JOptionPane.showInputDialog(
                                null, "Qual genero do seu Jogador",
                                "Genero do Jogador", JOptionPane.PLAIN_MESSAGE);

                Rushador trator = new Rushador(nomePesonagem, generoPersonagem);
                JOptionPane.showMessageDialog(null, trator.toString(), "Informaçoes", JOptionPane.PLAIN_MESSAGE);
                // System.out.println(trator); <- Faz a mesma funçao mesmo sem o toSting()
                System.out.println(trator.toString());

                // invocando meus metodos
                trator.atacar();
                trator.defender();
                trator.rilar();
        }

}