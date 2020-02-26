package app.warmUp10;

import java.util.*;

public class ArrayListCopy {

    public static void main(String[] args) {

        ArrayListNew a1 = new ArrayListNew();

        List<Integer> newCombined = a1.combined(Arrays.asList(1,2,3,4,5,6,7,8), Arrays.asList(3,5,7,9,1,11,13,15));

        for (int i : newCombined) {
            System.out.println(i);
        }
    }


}
