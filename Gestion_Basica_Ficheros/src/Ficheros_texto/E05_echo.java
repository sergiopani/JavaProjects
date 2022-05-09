package Ficheros_texto;

/*
E03_SumaNumeros

Programa que lee números de un fichero, los muestra por pantalla y finalmente muestra la suma de todos.

*/

import java.io.*;
import java.util.Scanner;

public class E05_echo {

  public static void main(String[] args) {
	  /** LEE Y ESCRIBE **/
	  String filename = "salida.txt";
	  PrintStream salida = null;
	  Scanner entrada = new Scanner(System.in);//lee el fichero
	  
	  try {
		  salida = new PrintStream(new File(filename));//Crea el fichero de salida
	  }catch(FileNotFoundException e) {
		  System.err.println("No se puede crear el fichero" + e.toString());
		  System.exit(1);
	  }
	  
	  String linea = entrada.nextLine();
	  while(linea.length() > 0) {
		  
	  }
  }    
}