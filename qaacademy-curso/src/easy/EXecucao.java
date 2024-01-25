package easy;

import javax.swing.JOptionPane;

public class EXecucao {
    public static void main(String[] args) {
        // Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        // String palavra = exercicio02_easy.retornaPalavra("Carol");
        // System.out.println(palavra);


        String palavra1 = JOptionPane.showInputDialog("DIGITE UM VALOR");
        String palavra2 = JOptionPane.showInputDialog("DIGITE UM VALOR");
        Exercicio03_easy exercicio03_easy = new Exercicio03_easy();
        String valorTrocado = (exercicio03_easy.retornaPalavrasTrocadas(palavra1, palavra2));
        System.out.println(valorTrocado);

        // Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
        // Integer resultado (exercicio04_easy.retornoDobro(20));
        // System.out.println(resultado);

    }

    
}
