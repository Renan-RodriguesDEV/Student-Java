package calculoTriangulo;

public class CalcTriangulo {
    protected double l1;
    protected double l2;
    protected double l3;

    String tipo;

    public CalcTriangulo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public String getTipo() {

        if (l1 == l2 && l2 == l3) {
            tipo = "Equilátero";
        } else if (l1 == l2 || l2 == l3 || l3 == l1) {
            tipo = "Isósceles";
        } else {
            tipo = "Escaleno";
        }

        return tipo;
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public double getL3() {
        return l3;
    }

}
