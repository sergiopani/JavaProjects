package Ficheros_texto;
/*
  E01_CuentaLineas
 
  Programa que cuenta las líneas de un fichero de texto
 
*/
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class E01_CuentaLineas {
 
    public static void main(String[] args) {
 
        String filename = "prueba.txt";
        Scanner fitxer = null;
 
        try {
 
            fitxer = new Scanner(new File(filename));
 
        } catch (FileNotFoundException e) {
            System.err.println("No existeix el fitxer " + filename);
            System.exit(1);
        }
 
        int cont = 0;
        while (fitxer.hasNext()) {
            fitxer.nextLine();
            cont++;
        }
        fitxer.close();
 
        System.out.println("El fichero " + filename + " tiene " + cont + " lineas");
 
    }
}