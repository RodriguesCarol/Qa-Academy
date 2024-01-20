package exemplosMetodos;

public class ExercicoMetodosComParametros {

    public static void main(String[] args) {
        ///Com retorno
        
        System.out.println(exibirNome("Flávio"));
        System.out.println(retornarIdade(33));
        System.out.println(retornarSalario(3.000));
        System.out.println(retornarNomeESobrenome("FLÁVIO", "lIMA"));
        System.out.println(retornarDobro(20));
        /// Sem Retorno
        exibirNomeSem("Carol");
        retornarIdadeSem(40);
        retornarSalarioSem(0.00);
        retornarNomeESobrenomeSem("Carol", "Rodrigues");
        retornarDobroSem(40);

    }

    public static String exibirNome(String nome) {
        return nome;
    }

    public static Integer retornarIdade(Integer idade) {
        return idade;
    }

    public static Double retornarSalario(Double nome) {
        return nome;
    }

    public static String retornarNomeESobrenome(String nome, String sobrenome) {
        return nome + " " + sobrenome;
    }

    public static Integer retornarDobro(Integer dobro) {
        return (dobro * 2);
    }

    //// métodos sem retornos
    public static void exibirNomeSem(String nome) {
        System.out.println(nome);
    }

    public static void retornarIdadeSem(Integer idade) {
        System.out.println(idade);
    }

    public static void retornarSalarioSem(Double nome) {
        System.out.println (nome);
    }

    public static void retornarNomeESobrenomeSem(String nome, String sobrenome) {
        System.out.println(nome + " " + sobrenome);
    }

    public static void retornarDobroSem(Integer dobro) {
        System.out.println(dobro *2);
    }

}
