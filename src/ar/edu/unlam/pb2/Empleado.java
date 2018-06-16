package ar.edu.unlam.pb2;

public class Empleado {
	//Atributos
	private String nombre;
	private String apellido;
	private Integer dia;
	private Integer mes;
	private Integer anio;
	private Integer salario;
	//Metodos
	public Empleado(String n, String a, Integer dia, Integer mes, Integer anio){
		this.nombre=n;
		this.apellido=a;
		if(dia<1||dia>31){
			this.dia=1;
		}
		else{
			this.dia=dia;
		}
		if(mes<1||mes>12){
			this.mes=1;
		}
		else{
			this.mes=mes;
		}
		if(anio<=2000){
			this.anio=anio;
		}
		else{
			this.anio=1995;
		}
		setSalario(13000);
		
	}
	
	public String brindarDetalles(){
		return "Nombre completo: " + this.nombre + " " + this.apellido + ". Fecha de nacimiento:" + " " + this.dia + "/" + 
				this.mes + "/" + this.anio + ". Sueldo: $" + this.salario + ".";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}
	
	
}
