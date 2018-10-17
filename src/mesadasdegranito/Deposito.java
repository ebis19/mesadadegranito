package mesadasdegranito;

import java.io.IOException;

public class Deposito {
	public static void main(String[] args) throws IOException  {
		archivoMesada archivos = new archivoMesada();
		Mesada[] mesadas= archivos.leerMesadas();
		//mesadas[1].sepuedeApilar(mesadas[2]);
		archivos.escribirCantidad(contarPilas(mesadas));
		System.out.println("listo");

	}
	
	
	public static int contarPilas(Mesada[] mesadas){
		int cantpilas=0;
		Boolean pilanueva=true;
		for(Mesada x:mesadas){
			pilanueva=true;
			for(Mesada y: mesadas){
				if(!x.equals(y) && x.sepuedeApilar(y))
					pilanueva=false;
			}
			if(pilanueva)
				cantpilas++;
		}
		System.out.println("se necesitan "+cantpilas+" pilas");
		return cantpilas;
	}
	

}
