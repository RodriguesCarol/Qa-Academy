package medium;

import javax.swing.JOptionPane;

public class Exercici02_medium {
    public static void main(String[] args) {
        Double valorInvestido, valorAtualizadoJuros,  taxaJuros = 0.05;
        Integer ano =1,tempoInvestido = 10;
        String valorInvestidoStg = JOptionPane.showInputDialog("Qual o valor investido?");
        valorInvestido = Double.parseDouble(valorInvestidoStg);
        valorAtualizadoJuros = valorInvestido;

        while (ano <= tempoInvestido) {
            valorAtualizadoJuros =  (valorAtualizadoJuros * taxaJuros) + valorAtualizadoJuros;
            ano++;
            System.out.println("O valor investido é: " + valorInvestido);
            System.out.println("O valor do juros é " + (valorAtualizadoJuros - valorInvestido  ));
            System.out.println("O valor acumulado é: " + valorAtualizadoJuros);
        }

    }

}
