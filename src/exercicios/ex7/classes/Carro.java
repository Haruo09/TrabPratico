package exercicios.ex7.classes;

import java.time.LocalDate;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;

    public Carro(String marca, String modelo, int anoFabricacao, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    // Método considerando que o usuário não informará um ano inválido:
    public double calcularValorDepreciacao() {
        int idade = LocalDate.now().getYear() - anoFabricacao;
        if (idade < 2) {
            return 0;
        }
        else if (idade <= 3) {
            return preco * .20;
        }
        else if (idade <= 5) {
            return preco * .22;
        }
        else if (idade <= 8) {
            return preco * .25;
        }
        else if (idade <= 12) {
            return preco * .30;
        }
        else if (idade <= 15) {
            return preco * .40;
        }
        else {
            return preco * .45;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
