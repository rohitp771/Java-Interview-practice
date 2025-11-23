package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface SortElementsInArrayList {

public static void main(String[] args) {
    List<Integer> myList = new ArrayList<>(Arrays.asList(9,6,4,2,1,4,6,8,9));
    myList.sort(Comparator.naturalOrder());
    Collections.sort(myList,Collections.reverseOrder());
    }
}