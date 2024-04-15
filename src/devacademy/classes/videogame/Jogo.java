package devacademy.classes.videogame;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Jogo implements GameInterface {
    private String nome;
    private String genero;
    private String console;
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

    public String getGenero() {
        return genero;
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

    @Override
    public void statusConsole() {
        System.out.printf("Tem Jogo: %b\nConsole: %s\n", this.isJogo(), this.getConsole());

    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public void jogar() {
        System.out.println("Start in game: " + getJogo());
    }

    @Override
    public void ligar() {
        System.out.println("Bem vindo ao: " + console);
    }

    @Override
    public void desligar() {
        System.out.println("bye bye friend!!!");
    }

    @Override
    public boolean isJogo() {
        if (this.nome.equals("")) {
            return false;
        }
        return true;
    }

    @Override
    public String getJogo() {
        return this.nome;
    }

    @Override
    public ArrayList<String> getLib() {
        ArrayList<String> lib = new ArrayList<String>();
        lib.add(this.nome);
        return lib;
    }

    @Override
    public String getConsole() {
        return this.console;
    }

    @Override
    public void setConsole(String plataforma) {
        this.console = plataforma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
