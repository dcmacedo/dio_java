//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Danilo");

        ContaCorrente contaCorrente = new ContaCorrente(cliente1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente1);

        contaCorrente.depositar(150);
        contaCorrente.transferir(100,contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}