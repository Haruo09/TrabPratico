package exercicios.exB.classes;

public class Circulo {
    private double raio;
    private String cor;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public String getCor() {
        return cor;
    }
}
