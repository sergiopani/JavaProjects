package Ficheros_texto;

/*
E03_SumaNumeros

Programa que lee números de un fichero, los muestra por pantalla y finalmente muestra la suma de todos.

*/

import java.io.*;
import java.util.Scanner;

public class E03_SumaNumeros {

  public static void main(String[] args) {
	  String filename = "src/Numeros.txt";
	  Scanner file = null;
	  
	  try {
		  file = new Scanner(new File(filename));
	  }catch(FileNotFoundException e ) {
		  System.err.println("El fichero no se encuentra: " + filename);
	  }
	  int result = 0;
	  while(file.hasNext()) {
		 result += file.nextInt();
	  }
	  
	  file.close();
	  System.out.println("La suma de las lineas es: " + result);
  }    
}