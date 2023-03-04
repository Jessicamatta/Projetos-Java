import javax.swing.*;

public class InverterString {
    public static void main(String[] args) {
        String palavra, ordernar ="";
        char extrair;

        palavra = JOptionPane.showInputDialog(null, "Digite uma palavra:");

        for(int i = 0; i < palavra.length(); i++){
            extrair = palavra.charAt(i);
            ordernar = extrair + ordernar;

        }

        JOptionPane.showMessageDialog(null, "A sua palavra invertida fica: "+ ordernar);
    }
}
