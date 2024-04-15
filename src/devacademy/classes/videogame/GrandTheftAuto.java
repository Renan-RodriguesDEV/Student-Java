package devacademy.classes.videogame;

public class GrandTheftAuto {

    public static void main(String[] args) {
        Jogo GTA = new Jogo("Grand Theft Auto", "Mundo Aberto", 2013);
        GTA.setConsole("PS4");
        GTA.statusJogo(GTA);
        GTA.ligar();
        GTA.statusConsole();
        GTA.getLib();
        GTA.desligar();
    }

}
