import java.io.*;

public class Feedback {
    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new FileReader("feedback.txt"));

        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {

            if (line.toLowerCase().contains("good")) {
                count++;
            }
        }

        System.out.println("Good Feedback Count = " + count);

        br.close();
    }
}