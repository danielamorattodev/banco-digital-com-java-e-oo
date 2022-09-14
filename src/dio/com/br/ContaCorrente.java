package dio.com.br;

public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1 ;

    public ContaCorrente(Cliente cliente) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--");
        System.out.println(" === Extrato Conta Corrente ===" );
        super.imprimirinfosComuns();
    }
}
