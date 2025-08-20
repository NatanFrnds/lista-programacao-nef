public class AtividadeSala03 {
    public static void main(String[] args) {
        int a= 15;
        int b= 20;

        int soma=a+b;
        int subtracao=a-b;
        int multiplicacao=a*b;
        double divisao=a/b;

        System.out.println("Soma:"+soma+'\n'+"Subtração:"
                +subtracao+ '\n'+
                "multiplicação:"+multiplicacao+'\n'
                +"Divisão"+divisao);

        System.out.println("a==b:"+(a==b));
        System.out.println("a!=b:"+(a!=b));
        System.out.println("a>=b:"+(a>=b));
        System.out.println("a<=b:"+(a<=b));
    }
}
