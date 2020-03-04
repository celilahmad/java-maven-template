package app;

import java.util.HashMap;

public class CharacterPosition3 {
    public static void main(String[] args) {
        String origin = "Hello World";
        HashMap<Character, Integer> map = new HashMap<>();
        origin.chars().mapToObj(n -> (char)n)
                .forEach(c -> {
                    int count = map.getOrDefault(c, 0);
                    map.put(c, count + 1);
                });
        map.forEach((c, n) ->
                System.out.printf("Letter: '%c', count:%d\n", c, n));
    }
}
