package act2;

import MiExcepcion.MiExcepcion;

public class MainApp {

	public static void main(String[] args) {
		
		try {
			
			
			 int num=3;
			 
			 if(num == 1) { throw new MiExcepcion(111);}
			 else if(num == 2) { throw new MiExcepcion(222);}
			 else if(num == 3) { throw new MiExcepcion(333);}
			
		}catch (MiExcepcion ex) {
			
			System.out.println(ex.getMessage());
		}

	}

}
