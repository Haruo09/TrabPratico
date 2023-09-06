package exercicios.ex3.classes;

public class Triangulo {
    private double A;
    private double B;
    private double C;

    public Triangulo(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    public String verificarTipo() {
        if (this.A == this.B && this.B == this.C) {
            return "Equilátero";
        }

        if (this.A != this.B && this.B != this.C && this.A != this.C) {
            return "Escaleno";
        }

        else {
            return "Isósceles";
        }
    }

    public void setLados(double A, double B, double C) {
        setA(A);
        setB(B);
        setC(C);
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }
}
