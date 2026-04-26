import java.util.ArrayList;

//Task1
public class removeNegativeNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(-3);
        list.add(8);
        list.add(-1);
        list.add(12);
        list.add(-7);
        list.add(4);

        System.out.println("Original list: " + list);

        list.removeIf(num -> num < 0);
        System.out.println("List after removing negative numbers: " + list);

    }
}
