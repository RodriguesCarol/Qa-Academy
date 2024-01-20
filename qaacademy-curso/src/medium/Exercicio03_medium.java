package medium;

import javax.swing.JOptionPane;

public class Exercicio03_medium {
    public static void main(String[] args) {
        int fatorial, i;
        String fatorialDigitado = JOptionPane.showInputDialog("Digite o fatorial");
        fatorial = Integer.parseInt(fatorialDigitado);
        i = fatorial;
        while (i > 1) {
            fatorial = fatorial * (i - 1);
            i--;

        }
        System.out.println("O fatorial do numero digitado é: " + fatorial);
    }

}
