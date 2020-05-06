import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "Andres";
		
		String pass = "";
		
		while (clave.contentEquals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Introduce  la contraseña, por favor");
			
			if (clave.contentEquals(pass) == false ) {
				
				System.out.println("Contraseña incorrecta");
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitidoy");
	}
}
