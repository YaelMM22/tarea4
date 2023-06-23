package primer_Proyecto2023;

import java.util.Scanner;

public class circulo_clases {
	
	//Cálculo del área de un círculo utilizando números flotantes usando clases
	double radio, area;
	
	public circulo_clases(double radio1) {
		this.radio = radio1;
	}
	
	public void geocir() {
		this.area = Math.PI*this.radio*this.radio;
	}
	
	public static void main(String[] args) {
		double radio2;
		Scanner leerradio = new Scanner (System.in);
		System.out.println("Ingrese el radio de un circulo para consultar su area: ");
		radio2=leerradio.nextDouble();
		
		circulo_clases circ = new circulo_clases(radio2);
		circ.geocir();
		System.out.println("El area del circulo es: " + circ.area);
		
	}

}