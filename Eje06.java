import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Eje06 {

    public static void menu(){
        System.out.println("1. Añade palabra");
        System.out.println("2. Listar palabras");
        System.out.println("3. Cuenta el total de palabras");
        System.out.println("4. Cuenta las veces que aparece una palabra");
        System.out.println("5. Borrar la primera ocurrencia de una palabra");
        System.out.println("6. Borrar todas las ocurrencias de una palabra");
        System.out.println("7. Salir");
        System.out.print("Opción: ");
    }

    public static int cuentaPalabras(File f){
        int cont = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));

            while (br.readLine()!=null) {
                cont++;
            }
            br.close();
        } catch (IOException e) {
            System.out.println("PEC");
        }

        return cont;
    }

    public static int cuentaOcurrencias(File f, String palabra){
        int cont = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String linea = "";

            while ((linea = br.readLine()) !=null) {
                if(linea.equals(palabra)){
                    cont++;
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("PEC");
        }

        return cont;
    }
    public static void main(String[] args) {
        String fileName = "fichEje06.txt";
        File file = new File(fileName);
        ArrayList<String> palabras = new ArrayList<String>();
        int opc = 0;
        String linea = "";
        boolean salir = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            if(file.exists()){
                while ((linea = br.readLine()) != null) {
                    palabras.add(linea);
                }
            }else{
                palabras.add("kiki");
                palabras.add("palmera");
                palabras.add("loca");
                palabras.add("aguacate");
                palabras.add("loca");
                palabras.add("premio");
                palabras.add("loca");
                palabras.add("palmera");
                palabras.add("kiki");
                palabras.add("veloz");
            }

            BufferedWriter bf = new BufferedWriter(new FileWriter(file));

            do {
                menu();
                opc = Integer.parseInt(System.console().readLine());

                switch (opc) {
                    case 1:{
                        System.out.println("Palabra a añadir: ");
                        String s = System.console().readLine();
                        palabras.add(s);
                        }
                        break;

                    case 2:
                        for (String p : palabras) {
                            System.out.println(p);
                        }
                        break;

                    case 3:
                        System.out.print("Cuenta el total de palabras: ");
                        System.out.println(cuentaPalabras(file));
                        break;

                    case 4:
                        System.out.print("Contará el total de veces que aprece la palabra: ");
                        String p = System.console().readLine();
                        System.out.println("Total: "+cuentaOcurrencias(file, p));
                        break;

                    case 5:
                        break;

                    case 6:
                        break;

                    case 7:
                        salir = true;
                        break;

                    default:
                        System.out.println("Fuera de rango");
                        break;
                }
            } while (salir == false);



            bf.close();
            br.close();
        } catch (IOException e) {
            System.out.println("PEC");
        }

    }
}
