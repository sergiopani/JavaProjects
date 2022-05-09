package Ficheros_texto;

import java.util.Scanner;
import java.io.*;

public class E04_Concatena {
	
	public static void main(String[] args) {
		String filename = "src/exer1.txt";
		Scanner file = null;
		String exitFilename = "src/escritura.txt";
		PrintStream exitFile = null;
		
		try {
			file = new Scanner(new File(filename));
			exitFile = new PrintStream(new FileOutputStream(exitFilename,true));
		} catch (FileNotFoundException e) {
			if(file == null)
			System.err.println("No puede abrir el fichero " + filename);
			else
			System.err.println("No se abre el archivo de escritua" + exitFilename);
		}
		
		while (file.hasNext()) {
			String linea = file.nextLine();
			exitFile.print(linea + "\n");
		}
		
		//Closeamos las files
		file.close();
		exitFile.close();
		
		
	}
	
	
}
