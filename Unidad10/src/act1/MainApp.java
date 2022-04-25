package act1;

public class MainApp {

	public static void main(String[] args) {
		
		AdivinaNumero adivinaNumero = new AdivinaNumero();
		
		adivinaNumero.mayorOMenor(adivinaNumero.getNumeroPc());
		
		adivinaNumero.numeroAcertado(adivinaNumero.getContador());

	}

}
