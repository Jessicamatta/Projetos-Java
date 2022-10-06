public class ContaPoupanca extends Conta{

    int operacaoPoupanca = 5;

    public ContaPoupanca(Cliente cliente, NumeroAgencias agencia) {
        super(cliente, agencia);
        operacao = operacaoPoupanca;
    }

    public void imprimirExtrato(){
        System.out.println("===Extrato Conta Poupança===");
        super.extratoConta();
    }

}
