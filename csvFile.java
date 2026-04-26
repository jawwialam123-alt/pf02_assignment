
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

Task 1;
public class csvFile {

    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader("student.csv"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("honour_students.csv"))) {

            String header = br.readLine();
            bw.write(header);
            bw.newLine();

            while ((line = br.readLine()) != null) {
                String[] student = line.split(splitBy);

                String name = student[0];
                int age = Integer.parseInt(student[1]);
                String grade = student[2];
                double GPA = Double.parseDouble(student[3]);

                if (GPA >= 3.5) {
                    bw.write(name + "," + age + "," + grade + "," + GPA);
                    bw.newLine();
                }
            }

            System.out.println("Honour students have been written to honour_students.csv");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
