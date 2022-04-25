package act5;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		//Password password= new Password();
		//Password password= new Password(25);
		//System.out.println(password.generarPassword(password.getLongitud()));
		//System.out.println(password.generarPassword());
		//password.esFuerte();
		
		String recogerSizePswd = JOptionPane.showInputDialog("Indica el tamaño del password");
		int sizePswd=Integer.parseInt(recogerSizePswd);
		
		String recogerCuantosPswd = JOptionPane.showInputDialog("Cuantos passwords quieres almacenar");
		int cuantosPswd=Integer.parseInt(recogerCuantosPswd);
		
		Password ArrayPasswords[] = new Password[cuantosPswd];
		
		for (int i = 0; i < ArrayPasswords.length; i++) {
			Password password1= new Password(sizePswd);
			ArrayPasswords[i] = password1;
			System.out.println(ArrayPasswords[i]);
		}
		
	}

}
