package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testeo {

	@Test
	public void testDeCreacionConPoliformismo() {
		Empleado test1 = new Secretaria("Maria", "Lopez", 25, 6, 1994);
		Integer esperado1= 17000;
		assertEquals(esperado1,test1.getSalario());
	}
	@Test
	public void testDeImpuesto(){
		Empleado test2 = new Director("Fernando", "Garcia", 21, 10, 1975, 2000, 52);
		Integer esperado1= 30300;
		assertEquals(esperado1,test2.getSalario());
		System.out.println(test2.brindarDetalles()); //Antes de impuesto
		Impuesto imp1 = new Impuesto();
		Integer esperado2=6000;
		assertEquals(esperado2,imp1.calcular(test2));
		Integer esperado3=esperado1-esperado2;
		assertEquals(esperado3,test2.getSalario());
		System.out.println(test2.brindarDetalles()); //Despues de impuesto
	}

}
