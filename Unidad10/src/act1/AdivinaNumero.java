package act1;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.text.ParseException;
import java.util.InputMismatchException;

public class AdivinaNumero {


	// Atributos
	private int numeroPc;
	private int contador;
	private int resultado;

	// constructore1
	public AdivinaNumero() {
		this.numeroPc = numeroPcAleatorio();
		this.contador = 0;

	}

	// constructore2
	public AdivinaNumero(int numeroPc, int resultado, int contador) {
		this.numeroPc = numeroPc;
		this.resultado = resultado;
		this.contador = contador;
	}

	// Getters & Setters
	public int getNumeroPc() {
		return numeroPc;
	}

	public void setNumeroPc(int numeroPc) {
		this.numeroPc = numeroPc;
	}

	public int getresultado() {
		return resultado;
	}

	public void setNumeroUsuario(int resultado) {
		this.resultado = resultado;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	// Metodo para sacar un numero aleatorio entre 0 a 500
	public int numeroPcAleatorio() {

		int aleatorio = (int) (Math.random() * (500 - 0) + 0);

		return aleatorio;
	}

	// Metodo que indica si el numero del usuario es mayor o menor al del Pc
	public int mayorOMenor(int numeroPc) {

		int num2 = 0;

			do {
				String num1 = JOptionPane.showInputDialog("Introduce un numero");
				
				try {
				
				num2 = Integer.parseInt(num1);
				
				} catch (NumberFormatException e) {
					System.out.println("Introduce un numero");
				}
				
				if (num2 < numeroPc) {
					System.out.println("El numero es mayor "+num2);
					contador++;
				} else if (num2 > numeroPc) {
					System.out.println("El numero es menor "+num2);
					contador++;
				}
			} while (num2 != numeroPc);

		return contador;

	}

	public int numeroAcertado(int contador) {

		System.out.println("Has acertado el numero");
		System.out.println("te has equivocado: " + contador + " veces");

		return contador;
	}

	// to String
	@Override
	public String toString() {
		return "AdivinaNumero [numeroPc=" + numeroPc + ", resultado=" + resultado + ", contador=" + contador + "]";
	}

}
