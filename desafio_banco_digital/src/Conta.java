public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (verificaSaldo(valor)) {
            System.out.println("Transação não pode ser efetuada, o valor de " + valor + " é superior ao saldo!");
        } else {
            saldo -= valor;
            System.out.println("Transação efetuada com sucesso!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Transação efetuada com sucesso!");
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (verificaSaldo(valor)) {
            System.out.println("Transação não pode ser efetuada, o valor de " + valor + " é superior ao saldo!");
        } else {
            saldo -= valor;
            contaDestino.depositar(valor);
        }
    }

    public void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean verificaSaldo(double valor) {
        if (valor > this.saldo) {
            return true;
        }
        return false;
    }
}
