// Classe Conta
class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

// Classe Poupança que herda de Conta e implementa Investimento
class Poupanca extends Conta implements Investimento {
    public Poupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void reajustar(double taxa) {
        saldo += saldo * taxa / 100;
    }
}