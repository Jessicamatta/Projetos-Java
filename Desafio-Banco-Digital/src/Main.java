public class Main {
    public static void main(String[] args) {
        Cliente jessica = new Cliente("Jéssica", 45556669);
        Cliente felipe = new Cliente("Felipe", 124446669);

        Conta cc = new ContaCorrente(jessica, NumeroAgencias.AGENCIA_1);
        Conta cp = new ContaPoupanca(felipe, NumeroAgencias.AGENCIA_3);

        cc.depositar(500);
        cc.transferir(200, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
