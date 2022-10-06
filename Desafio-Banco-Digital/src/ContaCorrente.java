public class ContaCorrente extends Conta{

    private final int operacaoCorrente = 3;

    public ContaCorrente(Cliente cliente, NumeroAgencias agencia) {
        super(cliente, agencia);
        operacao = operacaoCorrente;
    }

    public void imprimirExtrato(){
        System.out.println("===Extrato Conta Corrente===");
        super.extratoConta();
    }

}
