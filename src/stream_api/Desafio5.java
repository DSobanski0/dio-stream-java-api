package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numeros.stream().filter(n1 -> n1 > 5).mapToDouble(Integer::doubleValue).average().orElse(0.0));
    }
}
