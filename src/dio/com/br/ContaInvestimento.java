package dio.com.br;

public class ContaInvestimento extends Conta {

    private static int SEQUENCIAL = 1 ;

    public ContaInvestimento(Cliente cliente) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--");
        System.out.println(" === Extrato Conta Investimento ===" );
        super.imprimirinfosComuns();
    }
}
