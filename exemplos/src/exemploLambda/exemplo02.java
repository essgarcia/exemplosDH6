package exemploLambda;

public class exemplo02 {

    interface interfaceString{
        String executar(String str);
    }

    public static void imprimir(String texto, interfaceString inter){
        String resultado = inter.executar(texto);
        System.out.println(resultado);
    }

    public static void main(String[] args) {

        interfaceString mudar = s -> s + " complemento";
        imprimir("meu texto", mudar);
    }
}
