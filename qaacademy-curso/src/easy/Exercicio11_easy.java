package easy;
import javax.swing.JOptionPane;

public class Exercicio11_easy {
    public static void main(String[] args) {
        int numeroDigitado, i =1;
        String numeroDigitadoStg;
        numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número");
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        while (i <=100) {
            numeroDigitado = numeroDigitado +2;
            i++;
            System.out.println("O tota somado é: "+ numeroDigitado);
            
        }
    }
    
}
