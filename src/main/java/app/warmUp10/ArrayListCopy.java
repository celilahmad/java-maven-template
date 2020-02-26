package app.warmUp10;

import java.util.*;

public class ArrayListCopy {

    public static void main(String[] args) {


        List list1 = Arrays.asList(1,2,3,5,8,10);

        List list2 = Arrays.asList(2,5,7,9,10 ,15);


        List<Integer> listCombined = new ArrayList();
        listCombined.addAll(list1);
        listCombined.addAll(list2);

        Set<Integer> setCombined = new HashSet<>();
        setCombined.addAll(listCombined);

        for (int i : setCombined) {
            System.out.println(i);
        }
    }


}
