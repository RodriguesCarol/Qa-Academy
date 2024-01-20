package easy;
public class Exercicio10_2_easy {
    public static void main(String[] args) {
        double valorInvestimento, taxaJuros =0.05, valorTotal, valorJuros=0.0 ;
        int ano=1;
        valorInvestimento = 1000.00;

        while (ano<=10) {
            valorJuros = valorJuros +(valorInvestimento* taxaJuros);
            ano++;
            
        }
        valorTotal = valorInvestimento + valorJuros;
        System.out.println("O valor investido é: " + valorInvestimento);
        System.out.println("O valor do juros é: " + valorJuros);
        System.out.println("O valor total é: "+ valorTotal);
    }
    
}
