import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> sortedlist3 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        System.out.println(list1);
        System.out.println(list2);
        sortedlist3.addAll(list1);
        sortedlist3.addAll(list2);
        System.out.println("Before");
        System.out.println(sortedlist3);
        for (int i = 0; i < sortedlist3.size(); i++) {
            for (int j = 0; j < sortedlist3.size() - 1; j++) {

                if (sortedlist3.get(j) > sortedlist3.get(j + 1)) {

                    int num = sortedlist3.get(j);
                    sortedlist3.set(j, sortedlist3.get(j + 1));
                    sortedlist3.set(j + 1, num);
                }
            }
        }
        System.out.println("After");
        System.out.println(sortedlist3);

    }
}