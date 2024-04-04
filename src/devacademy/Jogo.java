package devacademy;

import javax.swing.JOptionPane;

public class Jogo {
    private String nome;
    private String genero;
    private String plataforma;
    private int ano;
    private double nota;

    public Jogo(String nome, String genero, int ano) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
    }

    public void statusJogo(Jogo jogo) {
        JOptionPane.showMessageDialog(
                null,
                "Voce esta jogando:\n" + this.nome + "\n"
                        + "Do genero:\n" + this.genero + "\n"
                        + "De ano:\n" + this.ano,
                "Status do Jogo", JOptionPane.INFORMATION_MESSAGE);

    }

    // gettes e setters
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getAno() {
        return ano;
    }

    public double getNota() {
        return nota;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
