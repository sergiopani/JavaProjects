package Ficheros_texto;

/*
E02_cat

Programa que lee las lineas de un fichero y las muestra por pantalla.

*/

import java.io.*;
import java.util.Scanner;

public class E02_cat {

  public static void main(String[] args) {

      String filename = "prueba.txt";
      Scanner fitxer = null;

      try {

          fitxer = new Scanner(new File(filename));

      } catch (FileNotFoundException e) {
          System.err.println("No existeix el fitxer " + filename);
          System.exit(1);
      }

      while (fitxer.hasNext()) {
          System.out.println(fitxer.nextLine());
      }
      fitxer.close();

  }
}
