package medium;

public class Exercicio10_medium {
    public static void main(String[] args) {
        int i = 2, elemento = 10;
        
        int fibonacci[]; /// forma
        fibonacci = new int[elemento];// objeto
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        while (i < elemento) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;

        }
        i = 0;
        while (i < elemento) {
            System.out.println(fibonacci[i]);
            i++;

        }

    }

}  

