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
    	String nombre = "src/exer1.txt";
    	Scanner fichero = null;
    	
    	try {
    		fichero = new Scanner(new File(nombre));
    		System.out.println("Si se ha encontrado!");
    	}catch(FileNotFoundException e) {
    		System.err.println("No se encuentra el Finchero de nombre" + nombre);
    		System.exit(1);
    	}
    	int cont = 0;
    	while(fichero.hasNext()) {
    		fichero.nextLine();
    		cont++;
    	}
    	
    	fichero.close();
    	
    	System.out.println("El fichero contiene: " + cont + " lineas.");
    }
}