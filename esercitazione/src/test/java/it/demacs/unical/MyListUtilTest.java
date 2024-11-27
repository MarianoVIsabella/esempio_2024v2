package it.demacs.unical;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyListUtilTest {
    MyListUtil myListUtil;
    static List<Integer> list;
    static List<Integer> ascendingList;
    static List<Integer> descendingList;
    @BeforeEach
    public void prepareTesting(){
        myListUtil = new MyListUtil();
    }
    @BeforeAll
    public static void prepareLists(){
        Integer[] toOrder={3,6,8,4,5};
        Integer[] ascendingOrder={3,4,5,6,8};
        Integer[] descendingOrder={8,6,5,4,3};
        list = Arrays.asList(toOrder);
        ascendingList = Arrays.asList(ascendingOrder);
        descendingList = Arrays.asList(descendingOrder);
    }
    @Test
    public void ascendingSortingWorks(){
        assertEquals(myListUtil.sort(list,0),ascendingList);
    }
    @Test
    public void descendingSortingWorks(){
        assertEquals(myListUtil.sort(list,1),descendingList);
    }
}
