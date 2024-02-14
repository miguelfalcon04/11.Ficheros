

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Eje02 {
    public static void main(String[] args) {
        String linea = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));

            while (linea != null) {
                System.out.println(linea+" ");
                linea = br.readLine();
            }
            System.out.println();

            br.close();
        } catch (IOException e) {
            System.out.println("No se encontro el fichero");
        }
        
    }
}
