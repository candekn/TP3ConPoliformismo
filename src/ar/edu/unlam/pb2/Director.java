package ar.edu.unlam.pb2;

public class Director extends Empleado{
	
	//Atributos
	private Integer gastosDeVehiculo;
	private Integer extraImpuesto;
	private Integer numeroDeCochera;
	
	//Metodos
	public Director(String n, String a, Integer dia, Integer mes, Integer anio, Integer gdv, Integer ndc) {
		super(n, a, dia, mes, anio);
		this.gastosDeVehiculo=gdv;
		this.extraImpuesto=((this.gastosDeVehiculo*15)/100);
		this.numeroDeCochera=ndc;
		setSalario(30000+this.extraImpuesto);
	}

	public Integer getGastosDeVehiculo() {
		return gastosDeVehiculo;
	}

	public void setGastosDeVehiculo(Integer gastosDeVehiculo) {
		this.gastosDeVehiculo = gastosDeVehiculo;
	}

	public Integer getExtraImpuesto() {
		return extraImpuesto;
	}

	public void setExtraImpuesto(Integer extraImpuesto) {
		this.extraImpuesto = extraImpuesto;
	}

	public Integer getNumeroDeCochera() {
		return numeroDeCochera;
	}

	public void setNumeroDeCochera(Integer numeroDeCochera) {
		this.numeroDeCochera = numeroDeCochera;
	}
	@Override
	public String brindarDetalles(){
		return "Cargo: Director. Nombre completo: " + getNombre() + " " + getApellido() + ". Fecha de nacimiento:" + " " 
				+ getDia() + "/" + getMes() + "/" + getAnio() + ". Sueldo: $" + getSalario() + " Numero de cochera: " + 
				getNumeroDeCochera() + ". Gastos de Vehiculo: $" + getGastosDeVehiculo() + ". Sueldo extra por gastos de vehículo: $" 
				+ getExtraImpuesto() + ".";
	}
	
	

}