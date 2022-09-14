package dio.com.br;

public class Main {

    public static void main(String[] args) {

        Cliente daniela = new Cliente();
        daniela.setNome("Daniela Moratto");

        Cliente giovanni = new Cliente();
        giovanni.setNome("Giovanni Vicentin");


        Conta contaCorrente = new ContaCorrente(daniela);
        contaCorrente.depositar(100);
        contaCorrente.sacar(20);

        Conta contaPoupanca = new ContaPoupanca(daniela);
        contaPoupanca.depositar(20);

        Conta contaCorrente1 = new ContaCorrente(giovanni);
        contaCorrente1.depositar(250);
        contaCorrente1.transferir(50, contaCorrente);
        contaCorrente1.sacar(100);

        Conta contaInvestimento = new ContaInvestimento(giovanni);
        contaInvestimento.depositar(100);

        contaCorrente.imprimirExtrato();
        contaCorrente1.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        contaInvestimento.imprimirExtrato();

    }

}
