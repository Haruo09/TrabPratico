package exercicios.ex2.classes;

public class ContaBancaria {
    private final int ID;
    private String titular;
    private double saldo;
    private double limite;

    public ContaBancaria(int ID, String titular, double saldo, double limite) {
        this.ID = ID;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String toString() {
        return String.format(
            """
            ID: %d
            Titular: %s
            Saldo: R$%,.2f
            Limite: R$%,.2f
            """, ID, titular, saldo, limite
        );
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void sacar(double valorSaque) {
        if (valorSaque > saldo) {
            System.out.println("\u001b[1;31mErro: Valor excedente ao saldo.\u001b[m");
            return;
        }

        else if (valorSaque > limite) {
            System.out.println("\u001b[1;31mErro: Valor excedente ao limite.\u001b[m");
            return;
        }

        saldo -= valorSaque;
    }

    public int getID() {
        return ID;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
