import java.util.ArrayList;

public class reverse {
    // task 4
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);

        for (int i = 0; i < list.size() / 2; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (i < j) {
                    // Swap elements
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println("Reversed list: " + list);
    }
}
