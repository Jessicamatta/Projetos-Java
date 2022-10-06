
public class Conta {

    private static int SEQUENCIAL = 1 ;
    protected Cliente cliente;
    protected NumeroAgencias agencia;

    protected int numeroConta;
    protected double saldo;
    protected int operacao;

    public Conta(Cliente cliente, NumeroAgencias agencia) {
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.agencia = agencia;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
            this.sacar(valor);
            contaDestino.depositar(valor);
    }

    public int getNumeroConta() {return numeroConta;}
    public double getSaldo() {return saldo;}

    protected void imprimirExtrato() {}

    protected void extratoConta(){
        System.out.printf("Titular : %s%n", this.cliente.getNome());
        System.out.printf("CPF : %s%n", this.cliente.getCpf());
        System.out.printf("Operação : %s%n", this.operacao);
        System.out.printf("Agencia : %d%n", this.agencia.getAgencia());
        System.out.printf("Conta : %d%n", this.numeroConta);
        System.out.printf("Saldo : %.2f%n", this.saldo);
    }
}
