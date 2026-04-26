import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

//Task 2
//Calculate the average from csv of product
public class csvfile2 {
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        double sum = 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("product.csv"))) {

            String header = br.readLine();

            while ((line = br.readLine()) != null) {
                String[] product = line.split(splitBy);
                double price = Double.parseDouble(product[1]);
                sum += price;
                count++;
            }

            double average = sum / count;
            System.out.println("Average price: " + average + "PKR");
            System.out.println("Total products: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
