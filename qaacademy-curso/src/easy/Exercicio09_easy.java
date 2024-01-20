package easy;
import javax.swing.JOptionPane;

public class Exercicio09_easy {//inicio classe
    public static void main(String[] args) {//inicio main
        int resultado, numeroDigitado, i=1;
        String numeroDigitadoStg;

        numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número para calcular a tabuada");
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        while (i <= 10) {
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + " X " + i + " = " + resultado);
            i++;
            
        }
        System.out.println("Fim do algoritimo");
        
    }//fim main
    
}//fim classe
