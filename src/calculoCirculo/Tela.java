package calculoCirculo;

import java.util.Random;

public class Tela {
    public static void main(String[] args) {

        Random rn = new Random();
        double num = rn.nextDouble(100) + 1;
        calcCirculo redondo = new calcCirculo(num);
        System.out.printf(
                "Seu raio e: " + redondo.getRaio()
                        + "\nE seu resultado: "
                        + redondo.calcular());
    }
}
