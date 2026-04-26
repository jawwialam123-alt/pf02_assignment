
import java.util.Scanner;
import java.util.HashMap;

public class Miniproject {
    static HashMap<String, Integer> inventory = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Fruits available");
        System.out.println("1.Apple" + "\n" + "2.Banana" + "\n" + "3.Oranges"); // ✅ Fixed

        inventory.put("Apple", 50);
        inventory.put("Banana", 30);
        inventory.put("Orange", 40);

    

    // function

    static void addStock() {
        inventory.put("Apple", inventory.get("Apple") + 20);
        System.out.println("Stock after update: " + inventory.get("Apple"));
    }

    static void removeStock() {
        inventory.put("Banana", inventory.get("Banana") - 15);
        System.out.println("Stock after update: " + inventory.get("Banana"));

    }
}

}