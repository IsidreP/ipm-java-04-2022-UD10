package act5;

import java.security.SecureRandom;

public class Password {

	// Atrivutos
	private int longitud;
	private String contrase�a;
	private boolean fuerte;

	// Constantes
	int CONST_LONGITUD = 8;

	// Constructor
	public Password() {
		super();
		this.longitud = 8;
		this.contrase�a = generarPassword();
		this.fuerte = esFuerte();
	}

	// Constructor2
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contrase�a = generarPassword();
		this.fuerte = esFuerte();
	}

	// Metodo para sacar contrase�a
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + ", fuerte=" + fuerte
				+ ", CONST_LONGITUD=" + CONST_LONGITUD + "]";
	}

	public boolean esFuerte() {

		int esMayuscula = 0;
		int esMinuscula = 0;
		int esNumero = 0;

		for (int i = 0; i < this.contrase�a.length(); i++) {

			if (Character.isUpperCase(contrase�a.charAt(i))) {
				esMayuscula++;
			} else if (Character.isLowerCase(contrase�a.charAt(i))) {
				esMinuscula++;
			} else if (Character.isDigit(contrase�a.charAt(i))) {
				esNumero++;
			}
		}

		if (esMayuscula > 2 && esMinuscula > 1 && esNumero > 5) {
			System.out.println("La contrase�a es fuerte");
			return  true;
		} else {
			System.out.println("La contrase�a es devil");
			return  false;
		}

	}

}
