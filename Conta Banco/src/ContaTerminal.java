import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome completo.");
        String nomeCompleto = sc.nextLine();
        System.out.println("Digite o número da sua agencia.");
        String agencia = sc.next();
        System.out.println("Digite o número da sua conta.");
        int conta = sc.nextInt();
        System.out.println("Informe o seu saldo bancário.");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo +
                " já está disponível para saque.");
    }
}