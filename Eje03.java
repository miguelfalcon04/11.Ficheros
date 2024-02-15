import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Eje03 {
    public static void main(String[] args) {
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("p1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("p2.txt"));
            BufferedWriter bf = new BufferedWriter(new FileWriter("p3.txt"));

            String linea1 = "";
            String linea2 = "";
            while ( (linea1 != null) || (linea2 != null) ) {
                linea1 = br1.readLine();
                linea2 = br2.readLine();

                if (linea1 != null) {
                    bf.write(linea1 + "\n");
                }

                if (linea2 != null) {
                    bf.write(linea2 + "\n");
                }
            }

            br1.close();
            br2.close();
            bf.close();
        } catch (IOException e) {
            System.out.println("Error repentino");
        }

    }
}
