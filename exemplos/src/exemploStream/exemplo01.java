package exemploStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exemplo01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        /* Forma didatica
        Stream<Integer> stream = list.stream();
        stream.forEach(val -> System.out.println(val));
        */

        //Forma simplificada de apenas percorrer a list
        //list.stream().forEach(val -> System.out.println(val));


        List<Integer> litaAlterada = list.stream().map(val -> val * 2).collect(Collectors.toList());
        //Lista normal a ser impressa
        list.forEach(val -> System.out.print(val + " "));
        //Lista multiplicada a ser impressa
        litaAlterada.forEach(val -> System.out.println(val + " "));


        long count = list.stream().filter(val -> val % 2 == 0)
                .count();

        System.out.println("Quantidade pares: " + count);
    }
}
