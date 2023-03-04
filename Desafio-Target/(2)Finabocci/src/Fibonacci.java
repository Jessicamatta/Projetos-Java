import javax.swing.*;

public class Fibonacci {

    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        long numero = Long.parseLong(JOptionPane.showInputDialog(null, "Informe um número: "));
        boolean parar = false;

        for (int i = 0; !parar; i++) {
            if (Fibonacci.fibo(i) == numero) {
                JOptionPane.showMessageDialog(null, "Este número está na sequencia de Fibonacci!\n");
                parar = true;
            }else if (Fibonacci.fibo(i) > numero) {
                JOptionPane.showMessageDialog(null, "Este número não faz parte da sequencia de Fibonacci!\n");
                parar = true;
            }
        }
    }
}

