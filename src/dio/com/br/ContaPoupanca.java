package dio.com.br;

public class ContaPoupanca extends Conta {
    private static int SEQUENCIAL = 1 ;

    public ContaPoupanca(Cliente cliente) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--");
        System.out.println(" === Extrato Conta Poupanca ===" );
        super.imprimirinfosComuns();
    }



}


