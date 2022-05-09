package Ficheros_texto;

/*
E03_SumaNumeros

Programa que lee números de un fichero, los muestra por pantalla y finalmente muestra la suma de todos.

*/

import java.io.*;
import java.util.Scanner;

public class E03_SumaNumeros {

  public static void main(String[] args) {

      String filename = "numeros.txt";
      Scanner fitxer = null;

      try {

          fitxer = new Scanner(new File(filename));

      } catch (FileNotFoundException e) {
          System.err.println("No existeix el fitxer " + filename);
          System.exit(1);
      }

      int suma = 0;
      while (fitxer.hasNextInt()) {
          suma = suma + fitxer.nextInt();
      }
      fitxer.close();
      System.out.println("La suma total és = " + suma);

  }
}