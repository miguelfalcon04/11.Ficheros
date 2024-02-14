

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Eje01 {
    public static void main(String[] args) {
        boolean esPrimo = true;
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("primos.dat"));

            for (int i = 1; i < 500; i++) {
                esPrimo = true;

                for (int j = 2; j < i/2+1; j++) {
                    if(i%j==0){
                        esPrimo = false;
                    }
                }

                if(esPrimo==true){
                    bf.write(String.valueOf(i)+"\n");
                }
            }

            bf.close();
        } catch (IOException e) {
            System.out.println("No se ha podido leer");
        }

    }
}
