package Ficheros_texto;

/*
E02_cat

Programa que lee las lineas de un fichero y las muestra por pantalla.

*/

import java.io.*;
import java.util.Scanner;

public class E02_cat {

  public static void main(String[] args) {
	  String nombre = "src/exer1.txt";
	  Scanner fichero = null;
	  
	  try {
		  fichero = new Scanner(new File(nombre));
	  }catch(FileNotFoundException e) {
		  System.err.println("No encuentra el fichero : " + nombre);
		  System.exit(1);
	  }
	  
	  String salida = "";
	  
	  while(fichero.hasNext()) {
		 salida += fichero.nextLine();
		 salida += "\n";		 
	  }
	  
	  fichero.close();
	  
	  System.out.println(salida);
	  
	  
  }   
}
