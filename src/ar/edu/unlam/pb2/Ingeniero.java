package ar.edu.unlam.pb2;

public class Ingeniero extends Empleado{

	public Ingeniero(String n, String a, Integer dia, Integer mes, Integer anio) {
		super(n, a, dia, mes, anio);
		setSalario(25000);
	}
	@Override
	public String brindarDetalles(){
		return "Cargo: Ingeniero. Nombre completo: " + getNombre() + " " + getApellido() + ". Fecha de nacimiento:" + " " 
				+ getDia() + "/" + getMes() + "/" + getAnio() + ". Sueldo: $" + getSalario() + ".";
	}
		
}
