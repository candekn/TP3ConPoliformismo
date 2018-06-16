package ar.edu.unlam.pb2;

public class Impuesto {
		//Metodos
		public Impuesto(){
			
		}
		public Integer calcular(Empleado trab){
			switch(trab.getSalario()){
			case 13000: trab.setSalario(trab.getSalario()-1300);
						return 1300;
						
			case 17000: trab.setSalario(trab.getSalario()-1700);
						return 1700;
						
			case 20000: trab.setSalario(trab.getSalario()-3000);
						return 3000;	
						
			case 25000: trab.setSalario(trab.getSalario()-5000);
						return 5000;
						
			default: 	trab.setSalario(trab.getSalario()-6000);
						return 6000;		
			}
		}
}
