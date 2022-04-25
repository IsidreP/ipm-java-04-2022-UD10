package act5;

import java.security.SecureRandom;

public class Password {

	// Atrivutos
	private int longitud;
	private String contraseña;
	private boolean fuerte;

	// Constantes
	int CONST_LONGITUD = 8;

	// Constructor
	public Password() {
		super();
		this.longitud = 8;
		this.contraseña = generarPassword();
		this.fuerte = esFuerte();
	}

	// Constructor2
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contraseña = generarPassword();
		this.fuerte = esFuerte();
	}

	// Metodo para sacar contraseña
	public String generarPassword() {

		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < longitud; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}

		return sb.toString();
	}

	// Getters & Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + ", fuerte=" + fuerte
				+ ", CONST_LONGITUD=" + CONST_LONGITUD + "]";
	}

	public boolean esFuerte() {

		int esMayuscula = 0;
		int esMinuscula = 0;
		int esNumero = 0;

		for (int i = 0; i < this.contraseña.length(); i++) {

			if (Character.isUpperCase(contraseña.charAt(i))) {
				esMayuscula++;
			} else if (Character.isLowerCase(contraseña.charAt(i))) {
				esMinuscula++;
			} else if (Character.isDigit(contraseña.charAt(i))) {
				esNumero++;
			}
		}

		if (esMayuscula > 2 && esMinuscula > 1 && esNumero > 5) {
			System.out.println("La contraseña es fuerte");
			return  true;
		} else {
			System.out.println("La contraseña es devil");
			return  false;
		}

	}

}
