package easy;

public class EXecucao {
    public static void main(String[] args) {
        Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
        String palavra = exercicio02_easy.retornaPalavra("Carol");
        System.out.println(palavra);

        Exercicio03_easy exercicio03_easy = new Exercicio03_easy();
        String palavras = exercicio03_easy.retornaPalavras("Carol", "Rodrigues");
        System.out.println(palavras);

    }

    
}
