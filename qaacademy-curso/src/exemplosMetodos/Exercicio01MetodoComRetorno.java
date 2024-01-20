package exemplosMetodos;

public class Exercicio01MetodoComRetorno {

  public static void main(String[] args) {
        
        System.out.println(metodoUmRet());
        System.out.println(metodoDoisRet());
        System.out.println(metodoTresRet());
        System.out.println(metodoQuatroRet());
    }

    public static String metodoUmRet  (){
        return "Primeiro Método";

    }
    public static Integer metodoDoisRet  (){
        return 2;

    }
    public static Double metodoTresRet (){
        return 3.0;

    }
    public static Boolean metodoQuatroRet (){
        return false;

    }
    
}
