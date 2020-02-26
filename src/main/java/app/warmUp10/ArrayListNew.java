package app.warmUp10;

import java.util.*;

public class ArrayListNew {

    List combined(List req1, List req2){
        Set<Integer> rs = new HashSet<>();
        rs.addAll(req1);
        rs.addAll(req2);
        List list = new ArrayList();
        list.addAll(rs);
        return list;
    }


}
