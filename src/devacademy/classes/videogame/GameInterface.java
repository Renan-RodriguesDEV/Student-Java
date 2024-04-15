package devacademy.classes.videogame;

import java.util.ArrayList;

public interface GameInterface {
    void jogar();

    void ligar();

    void desligar();

    boolean isJogo();

    String getJogo();

    ArrayList<String> getLib();

    String getConsole();

    void setConsole(String plataforma);

    void statusConsole();

}
