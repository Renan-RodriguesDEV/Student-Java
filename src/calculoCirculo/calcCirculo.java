package calculoCirculo;

public class calcCirculo {
    private final double PI = 3.14 ;
    private double raio;

    
    public calcCirculo(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }

    public double calcular(){
         double resultado = (2 * PI) * getRaio();
         return resultado;
    }
   
    

}
