package exemploGenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class exemplo01 {
    public static void main(String[] args) {
        MinhaClasse<Integer> minhaClasse1 = new MinhaClasse(123);
        MinhaClasse<String> minhaClasse2 = new MinhaClasse("Texto");

        System.out.println(minhaClasse1.getObj());
        System.out.println(minhaClasse2.getObj());

        //outras possibilidades
        List<?> list = new ArrayList();
        HashMap<Integer, String> map = new HashMap<>();
    }
}
