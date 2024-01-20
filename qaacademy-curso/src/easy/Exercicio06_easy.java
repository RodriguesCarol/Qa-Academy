package easy;
import javax.swing.JOptionPane;

public class Exercicio06_easy {//inicio classe
    public static void main(String[] args) {///inicio main
        double  nota1, nota2, resultado;
        String primeiraNota = JOptionPane.showInputDialog("Digite a primiera nota");
        String segundaNota = JOptionPane.showInputDialog("Digite a segunda nota");
        nota1 = Integer.parseInt(primeiraNota);
        nota2 = Integer.parseInt(segundaNota);
        resultado = (nota1 + nota2)/2;
        System.out.println("Sua nota é: " + resultado);
        if (resultado > 5) {// inicio if
            System.out.println("Aprovado");
        } /// fim if
        if (resultado < 5) {
            System.out.println("Reprovado");
        }
        // if (resultado == 5){
        else { ////else substitui o terceiro if
            System.out.println("Exame");
        }
        // }

    }///fim main

    
}////fim da classe
