package devacademy;

//nao se pd criar objts de uma classe abstrata
public abstract class Personagem {

    private String nome;
    private int nivel;
    private String genero;

    public Personagem(String nome, String genero) {
        this.nome = nome;
        this.nivel = 1;
        this.genero = genero;
    }

    // metodos especificos
    public void atacar() {
        System.out.println("Atacando..");
    }

    public void rilar() {
        System.out.println("Rilando kit..");
    }

    public void defender() {
        System.out.println("Se defendendo..");
    }

    public String toString() {
        String status = String.format("NOME: %s\nNIVEL: %s\nGENERO: %s\n", nome, nivel, genero);
        return status;
    }

    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
