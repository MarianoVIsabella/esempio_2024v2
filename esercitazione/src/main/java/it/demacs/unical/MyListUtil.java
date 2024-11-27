package it.demacs.unical;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyListUtil {
    public List<Integer> sort(List<Integer> list, int order) {
        //0 ->Ascendente
        //1 -> Discendente
        if (order == 0){
            Collections.sort(list);
        } else {
            Collections.sort(list,Collections.reverseOrder());
        }
        return list;
    }
}
