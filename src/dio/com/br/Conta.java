package dio.com.br;

public abstract class Conta implements IConta {

    protected static int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;


    @Override
    public void sacar(double valor) {
        saldo -= valor > 0 ? valor : 0;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor > 0 ? valor : 0;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
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

    protected void imprimirinfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
