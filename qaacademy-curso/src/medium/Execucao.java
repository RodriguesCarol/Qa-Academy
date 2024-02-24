package medium;

import javax.swing.JOptionPane;

public class Execucao {

    public static void main(String[] args) {

        // Exercicio01_medium exercicio01_medium = new Exercicio01_medium();
        // exercicio01_medium.retornaParImpar();

        // String valorInvestidoStg = JOptionPane.showInputDialog("Qual o valor investido?");
        // double valorInvestido = Double.parseDouble(valorInvestidoStg);
        
        // Exercici02_medium exercici02_medium =new Exercici02_medium();
        // double valorTotal = exercici02_medium.valorInvestidoJurosComposto(valorInvestido);
        // double valorJuros = exercici02_medium.valorJurosComposto(valorTotal, valorInvestido);
        // System.out.println("O valor investido é: " + valorInvestido);
        // System.out.println("O valor do juros é " + valorJuros);
        // System.out.println("O valor acumulado é: " + valorTotal);

        String fatorialDigitadoStr = JOptionPane.showInputDialog("Digite um número que deseja ver o fatorial");
        int fatorialDigitado= Integer.parseInt(fatorialDigitadoStr);
        
        Exercicio03_medium exercicio03_medium = new Exercicio03_medium();
        int valorFatorial = exercicio03_medium.retornaFatorial(fatorialDigitado);
        System.out.println(valorFatorial);



        // Exercicio04_medium exercicio04_medium = new Exercicio04_medium();
        // exercicio04_medium.resultadoMultiplicacao();

        // Exercicio05_medium exercicio05_medium = new Exercicio05_medium();
        // int menorNumeroDigitado = exercicio05_medium.verificaMenorNumero();
        // System.out.println("O menor numero digitado é: " + menorNumeroDigitado);


    }
    
}
