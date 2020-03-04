package app.warmUp10;

import javax.lang.model.util.Types;
import java.util.*;
import java.util.stream.IntStream;

public class CharacterPositions4 {

/*
  private static String origin;
  //private  String origin;
  public static List<String> formatting(List<String> x){
    for(char letter ='a'; letter <='z'; letter++){
      if (origin.contains(String.valueOf(letter)))
      x.add(String.valueOf(letter));
    }
    return x;
  }*/

  public static void main(String[] args) {
    CharacterPositions4 ch = new CharacterPositions4();

    String origin = "baldl";
    HashMap<Character, List<Integer>> map = new HashMap<>();

    IntStream.range(0, origin.length()).forEach(i -> {
      char c = origin.charAt(i);
      List<Integer> positions = map.getOrDefault(c, new ArrayList<>());
      positions.add(i);
      map.put(c, positions);
    });
    TreeMap<Character, List<Integer>> sorted = new TreeMap<>();
    sorted.putAll(map);

    for (Map.Entry<Character, List<Integer>> entry : sorted.entrySet())

      System.out.println("Letter = " + entry.getKey()  +
              ", position = " + entry.getValue());


    //TASK 5. sort the output in the initial order of initial letter occurrence
    //H:1:<1>, e:1:<2>, l:3:<3,4,10>, ....



    //map.forEach((c, n) ->
       // System.out.printf("Letter: '%c', positions:%s\n", c, n));
  }



}
