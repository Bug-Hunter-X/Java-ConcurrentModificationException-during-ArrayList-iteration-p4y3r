import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionExampleSolution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Solution 1: Using an iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Solution 1: " + list);

        //Solution 2: Create a new list
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> newList = new ArrayList<>();
        for(int i : list2){
            if(i % 2 != 0){
                newList.add(i);
            }
        }
        System.out.println("Solution 2: " + newList);
    }
}