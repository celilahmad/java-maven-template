package app;

import java.util.stream.Collectors;


    public class StringFilterApp3 {
        public String filter(String origin) {
            return origin.chars()
                    .mapToObj(n -> (char)n)
                    .map(c -> Character.toLowerCase(c))
                    .map(c -> String.valueOf(c))
                    .filter(s -> !"aueio".contains(s))
                    .collect(Collectors.joining());
        }

        public static void main(String[] args) {
            StringFilterApp3 app = new StringFilterApp3();
            System.out.println(app.filter("Hello"));
        }
    }


