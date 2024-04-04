package devacademy;

public class Rushador extends Personagem {
    private String arma;

    public Rushador(String nome, String genero) {
        super(nome, genero);
        this.arma = "Mp-40";
        setNivel(10);
    }

    @Override
    public void atacar() {
        System.out.println("O Rushador vai rushar..");
    }

    @Override
    public String toString() {
        String infoPersonagem = super.toString();
        String infoRushador = String.format(infoPersonagem + "ARMA: %s\n", arma);
        return infoRushador;
    }

}
