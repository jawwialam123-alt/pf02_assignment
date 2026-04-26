
import java.util.ArrayList;
// task 2

public class duplicateElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(1);

        System.out.println("Original list: " + list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    System.out.println(list.get(i) + " is a duplicate element.");
                    break;

                }
            }
        }

    }

}
