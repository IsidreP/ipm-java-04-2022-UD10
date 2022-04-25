package MiExcepcion;

public class MiExcepcion extends Exception{
	
	// Atrivutos
	private int codigoExcepcion;
	private int num;

	// Construcor1
	public MiExcepcion() {
		super();
	}	
	
	// Constructor2
	public MiExcepcion(int codigoExcepcion) {
		super();
		this.codigoExcepcion = codigoExcepcion;
	}
	
	// Constructor3
	public MiExcepcion(int codigoExcepcion, int num) {
		super();
		this.codigoExcepcion = codigoExcepcion;
		this.num = num;
	}

	// Getters & Setters
	public int getCodigoExcepcion() {
		return codigoExcepcion;
	}

	public void setCodigoExcepcion(int codigoExcepcion) {
		this.codigoExcepcion = codigoExcepcion;
	}
	
	
	@Override
	public String getMessage() {
		
		String mensaje="";
		
		switch(codigoExcepcion) {
		case 111:
			mensaje="El numero aleatorio generado es: "+num+"\n";
			mensaje+="Es par";
			break;
		case 222:
			mensaje="El numero aleatorio generado es: "+num+"\n";
			mensaje+="Es impar";
			break;
		case 333: // Mensaje de la actividad 2
			mensaje="Mensage mostrado por pantalla3\n";
			mensaje+="Excepcion capturada con mensage: Esto es un objeto excepcion\n";
			mensaje+="Programa terminado";
			break;
		case 444: // Mensaje de la actividad 4
			mensaje="No se puede dividir por zero";
			break;
		case 555: // Mensaje de la actividad 4
			mensaje="Pon un numero positivo";
			break;
		}
		
		return mensaje;
	}
	
	
	
	
	
	
}
