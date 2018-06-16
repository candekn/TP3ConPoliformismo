package ar.edu.unlam.pb2;

public class Ingeniero extends Empleado{

	public Ingeniero(String n, String a, Integer dia, Integer mes, Integer anio) {
		super(n, a, dia, mes, anio);
		setSalario(25000);
	}
		
}
