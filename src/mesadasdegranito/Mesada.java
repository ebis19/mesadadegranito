package mesadasdegranito;

public class Mesada {
	
	private int ancho;
	private int largo;
	public Mesada(int ancho, int largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
	public  boolean sepuedeApilar(Mesada otra){
		
		if(this.esMenor(otra)) 
			return true;
		this.rotar();
		if(this.esMenor(otra)){
				this.rotar();
				return true;
		}
		
		this.rotar();

		return false;
	}
	
	public Mesada rotar() {
		int aux=this.ancho;
		ancho=largo;
		largo=aux;
		return this;
	}
	public boolean esMenor(Mesada otra) {
		return (this.ancho<=otra.ancho && this.largo<=otra.largo);
		
	}
	@Override
	public String toString() {
		return "Mesada [ancho=" + ancho + ", largo=" + largo + "]";
	}
	
	

}
