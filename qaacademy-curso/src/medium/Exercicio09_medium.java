package medium;

import javax.swing.JOptionPane;

public class Exercicio09_medium {
    public static void main(String[] args) {
        String[] nomeAlunos = new String[5];
        int[] codigoAlunos = new int[5];
        int i = 0;

        while (i < 5) {
            nomeAlunos [i] = JOptionPane.showInputDialog("Digite o nome do aluno");
            codigoAlunos [i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o código do aluno"));
            i++;

        }
        i = 0;
        while (i < 5) {
            System.out.println(" O aluno " + nomeAlunos[i] + " tem o código " + codigoAlunos[i]);
            i++;

        }

    }

}
