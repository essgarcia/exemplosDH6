package exemploLambda;

import java.util.Arrays;
import java.util.List;

public class exemplo01 {
    /*public boolean par(int n){
        return n % 2 == 0;
    }

    n -> n % 2 == 0;
    */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //lambda para impressao vertical
        numeros.forEach(n -> System.out.println(n));

        //lambda para impressao vertical de numeros pares
        numeros.forEach(n -> {
            if (n % 2 == 0)
            System.out.println(n);
        });

        //impressao da lista horizontal
        System.out.println(numeros);

        //
        for (Integer n: numeros
             ) {
            System.out.println(n);
        }
    }
}
