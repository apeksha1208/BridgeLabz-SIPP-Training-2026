import java.io.*;

public class schoolPortal {
    public static void main(String[] args) {

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("students.txt"));

            FileWriter fw =
                    new FileWriter("report.txt", true);

            String line;

            while ((line = br.readLine()) != null) {

                String arr[] = line.split(" ");

                String name = arr[0];

                int m1 = Integer.parseInt(arr[1]);
                int m2 = Integer.parseInt(arr[2]);
                int m3 = Integer.parseInt(arr[3]);

                int avg = (m1 + m2 + m3) / 3;

                fw.write(name + " Average = " + avg + "\n");
            }

            br.close();
            fw.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
