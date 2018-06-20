package ar.edu.unlam.pb2;

public class Secretaria extends Empleado{

	public Secretaria(String n, String a, Integer dia, Integer mes, Integer anio) {
		super(n, a, dia, mes, anio);
		setSalario(17000);
	}
	@Override
	public String brindarDetalles(){
		return "Cargo: Secretaria. Nombre completo: " + getNombre() + " " + getApellido() + ". Fecha de nacimiento:" + " " 
				+ getDia() + "/" + getMes() + "/" + getAnio() + ". Sueldo: $" + getSalario() + ".";
	}
	

}
