
import java.util.*;

public class MergeSortedList {
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

        Collections.sort(list1);
        Collections.sort(list2);
        
        List<Integer> mergedList = new ArrayList<>();
        int i=0, j=0;        
        while(i < list1.size() && j < list2.size())
        {
            if(list1.get(i) <= list2.get(j))
            {
                mergedList.add(list1.get(i));
                i++;
            }
            else
            {
                mergedList.add(list2.get(j));
                j++;
            }
        }
        while(i < list1.size())
        {
            mergedList.add(list1.get(i));
            i++;
        }
        while(j < list2.size())
        {
            mergedList.add(list2.get(j));
            j++;
        }
        System.out.println("MergedList" + mergedList);

    }
}