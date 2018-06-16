package ar.edu.unlam.pb2;

public class Gerente extends Empleado{
	//Atributos
	private Integer numeroDeCochera;

	//Metodos
	public Gerente(String n, String a, Integer dia, Integer mes, Integer anio) {
		super(n, a, dia, mes, anio);
		this.numeroDeCochera=((int)(Math.random()*(300)+1));
		setSalario(20000);
	}

	public Integer getNumeroDeCochera() {
		return numeroDeCochera;
	}

	public void setNumeroDeCochera(Integer numeroDeCochera) {
		this.numeroDeCochera = numeroDeCochera;
	}
	
	

}
