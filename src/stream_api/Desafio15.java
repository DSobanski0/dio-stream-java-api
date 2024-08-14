package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println("A lista contém número negativo? " + numeros.stream().anyMatch(n1 -> n1 < 0));
    }
}
