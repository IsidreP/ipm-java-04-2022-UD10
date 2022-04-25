package act3;

import MiExcepcion.MiExcepcion;

public class Random {
	
	// Atrivutos
	private int numeroAleatorio;

	
	// Constructor1
	public Random() {
		super();
		this.numeroAleatorio = Aleatorio ();
	}
	
	// Constructor2
	public Random(int numeroAleatorio) {
		super();
		this.numeroAleatorio = numeroAleatorio;
	}

	// Getters & Setters
	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}

	public void setNumeroAleatorio(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}

	@Override
	public String toString() {
		return "Random [numeroAleatorio=" + numeroAleatorio + "]";
	}
	
	// Saca un numero aleatorio entre 999 y 0.
	public int Aleatorio () {

		int num= (int) (Math.random() * (999 - 0) + 0);
		
		System.out.println("Generando numero aleatorio...");
		
		return num;
	}
	
	// Comprueva si un numero es par o impar
	public void esImpar (int num) {

		
		int num2 = num%2;
		
		try {
		
		if(num2==0) {
			
			throw new MiExcepcion(111, num);

		}else {
		
			throw new MiExcepcion(222, num);

		}
		}catch (MiExcepcion ex) {
			System.out.println(ex.getMessage());
		}
	}

}
