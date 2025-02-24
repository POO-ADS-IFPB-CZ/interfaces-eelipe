// Programa principal para testar a classe Poupanca
public class Main {
    public static void main(String[] args) {
        Poupanca poupanca = new Poupanca(1000);
        System.out.println("Saldo inicial: " + poupanca.getSaldo());

        poupanca.reajustar(5);
        System.out.println("Saldo após reajuste: " + poupanca.getSaldo());

        poupanca.depositar(500);
        System.out.println(" Saldo após depósito: " + poupanca.getSaldo());

        poupanca.sacar(300);
        System.out.println("Saldo após saque: " + poupanca.getSaldo());
    }
}
