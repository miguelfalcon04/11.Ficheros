package clase;
import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("prueba.txt"));
        String linea = br.readLine("Bienvenido\n");
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("prueba.txt"));
        bw.write("Bienvenido\n");
        bw.close();
    }
}