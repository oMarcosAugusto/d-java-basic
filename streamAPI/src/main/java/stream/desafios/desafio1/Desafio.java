package stream.desafios.desafio1;

import java.util.Arrays;
import java.util.List;

public class Desafio {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream()
                .map(Integer::toBinaryString) // 1. Número para string binária
                .map(str -> new StringBuilder(str).reverse().toString()) // 2. Reverter a string
                .map(str -> Integer.parseInt(str, 2)) // 3. Converter de volta para inteiro
                .forEach(System.out::println); // Imprimir o resultado
    }
}
