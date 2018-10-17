package mesadasdegranito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mesadastest {

	@Test
	void SepuedeApilartest() {
		Mesada mes= new Mesada(1,12);
		Mesada mes2= new Mesada(2,12);
		Mesada mes3= new Mesada(5,5);
		assertTrue(mes.sepuedeApilar(mes2));
		assertFalse(mes.sepuedeApilar(mes3));
		assertFalse(mes3.sepuedeApilar(mes2));
		assertFalse(mes3.esMenor(mes2));
		mes3.rotar();
		assertFalse(mes3.esMenor(mes2));
		System.out.println(mes2.rotar());
	}

}
