package act4;

import javax.swing.JOptionPane;

import MiExcepcion.MiExcepcion;

public class Calculadora {
	
	// Atrivutos
	private double primerNumero;
	private double segundoNumero;
	
	// constructor1
	public Calculadora() {
		super();
	}	
	
	// constructor2
	public Calculadora(double primerNumero, double segundoNumero) {
		super();
		this.primerNumero = primerNumero;
		this.segundoNumero = segundoNumero;
	}

	// Getters & Setters
	public double getPrimerNumero() {
		return primerNumero;
	}

	public void setPrimerNumero(double primerNumero) {
		this.primerNumero = primerNumero;
	}

	public double getSegundoNumero() {
		return segundoNumero;
	}

	public void setSegundoNumero(double segundoNumero) {
		this.segundoNumero = segundoNumero;
	}

	@Override
	public String toString() {
		return "Calculadora [primerNumero=" + primerNumero + ", segundoNumero=" + segundoNumero + "]";
	}
	
	
	public void escogerCalculo() {
		
		String num = JOptionPane.showInputDialog("Que calculo quieres realizar?\n 1. Suma\n 2. Resta\n 3. Multiplicacion\n 4. Potencia\n 5. Raiz cuadrada\n 6. Raiz cubica\n 7. Division\n Introduce un numero de los anteriores");
		int num2=Integer.parseInt(num);

		switch (num2) {
		  case 1:
		    Suma();
		    break;
		  case 2:
		    Resta();
		    break;
		  case 3:
		    Multiplicacion();
		    break;
		  case 4:
			Potencia();
		    break;
		  case 5:
			RaizCuadrada();
		    break;
		  case 6:
			RaizCubica();
		    break;
		  case 7:
		    Division();
		    break;
		}

	}
	
	public void Suma() {
		
		String num = JOptionPane.showInputDialog("Introduce el primer sumando");
		double num1=Double.parseDouble(num);
		
		String num2 = JOptionPane.showInputDialog("Introduce el segundo sumando");
		double num3=Double.parseDouble(num2);
		
		double suma=num1+num3;
		
		System.out.println("El resultado de la suma es: "+suma);
	}
	
	public void Resta() {
		
		String num = JOptionPane.showInputDialog("Introduce el primer numero");
		double num1=Double.parseDouble(num);
		
		String num2 = JOptionPane.showInputDialog("Introduce el segundo numero");
		double num3=Double.parseDouble(num2);
		
		double resta=num1-num3;
		
		System.out.println("El resultado de la resta es: "+resta);
	}
	
	public void Multiplicacion() {
		
		String num = JOptionPane.showInputDialog("Introduce el primer numero");
		double num1=Double.parseDouble(num);
		
		String num2 = JOptionPane.showInputDialog("Introduce el segundo numero");
		double num3=Double.parseDouble(num2);
		
		double mult=num1*num3;
		
		System.out.println("El resultado de la multiplicacion es: "+mult);
	}
	
	public void Potencia() {
		
		String num = JOptionPane.showInputDialog("Introduce el numero");
		double num1=Double.parseDouble(num);
		
		String num2 = JOptionPane.showInputDialog("Introduce la potencia");
		double num3=Double.parseDouble(num2);
		
		double pot=Math.pow(num1,num3);
		
		System.out.println("El resultado de la potencia es: "+pot);
	}
	
	public void RaizCuadrada() {
		
		String num = JOptionPane.showInputDialog("Introduce el numero");
		double num1=Double.parseDouble(num);
		
		try{
		
		double raiz=Math.sqrt(num1);
		
		System.out.println("El resultado de la raiz cuadrada es: "+raiz);
		
		 if(num1<0){throw new MiExcepcion(555);}
		}catch (MiExcepcion e){
			System.out.println(e.getMessage());
		}
	}
	
	public void RaizCubica() {
		
		String num = JOptionPane.showInputDialog("Introduce el numero");
		double num1=Double.parseDouble(num);
		
		double raiz=Math.cbrt(num1);
		
		System.out.println("El resultado de la raiz cuadrada es: "+raiz);
	}
	
	public void Division() {
		
		String num = JOptionPane.showInputDialog("Introduce el primer numero");
		double num1=Double.parseDouble(num);
		
		String num2 = JOptionPane.showInputDialog("Introduce el segundo numero");
		double num3=Double.parseDouble(num2);
		
		try{
			
		double div=num1/num3;

		System.out.println("El resultado de la division es: "+div);
		
		if(num3==0) {throw new MiExcepcion(444);}
		
		}catch (MiExcepcion e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
	

}
