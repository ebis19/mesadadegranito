package mesadasdegranito;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class archivoMesada {
	
	public Mesada[] leerMesadas() throws FileNotFoundException{
		
		Scanner in = new Scanner(new File("mesadas.in"));
		Mesada []  vec = new Mesada[in.nextInt()];
		for (int i = 0; i < vec.length; i++) {
			vec[i]=new Mesada(in.nextInt(),in.nextInt());
		}
		System.out.println("Leyendo el archivo . . .");
		in.close();
		return vec;
		
	}
	public void  escribirCantidad(int x) throws IOException{
		
		PrintWriter out = new PrintWriter(new File("mesadas.out"));
		out.println(x);
		System.out.println("Escribiendo el archivo . . .");
		out.close();
		
	}

}
