package easy;

import javax.swing.JOptionPane;

public class EXecucao {
    public static void main(String[] args) {
        // Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        // String palavra = exercicio02_easy.retornaPalavra("Carol");
        // System.out.println(palavra);


        // String palavra1 = JOptionPane.showInputDialog("DIGITE UM VALOR");
        // String palavra2 = JOptionPane.showInputDialog("DIGITE UM VALOR");
        // Exercicio03_easy exercicio03_easy = new Exercicio03_easy();////Instanciando a classe Exercicio 03 easy
        // String valorTrocado = (exercicio03_easy.retornaPalavrasTrocadas(palavra1, palavra2)); /// Fazendo a chamada e gravando na váriavel valorTrocado
        // System.out.println(valorTrocado);

    //    String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um número");
    //    String numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
    //    String resultado = numeroDigitado *2;

      String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um número");
      Integer numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
      Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
      System.out.println("O dobro de " + numeroDigitado+ " é " + exercicio04_easy.calculaDobro(numeroDigitado));

    }

}
