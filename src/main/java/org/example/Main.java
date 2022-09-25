package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Предложение аборигена
        String str = "fradf gsdd evmofj avbng arr rewdf rew orin";

        System.out.println(getDictionary(str));

    }

    // Детерменированая функция, включающая в себя монаду
  static Map<Character, String> getDictionary(String string) {
        String[] separateWords = string.split("\\s+");

        return Arrays.stream(separateWords)
                .collect(Collectors.toMap
                        (o -> o.charAt(0), o -> o , (s, a) -> s + ", " + a));
    }
}