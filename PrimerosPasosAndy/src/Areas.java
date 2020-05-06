import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige unan opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");

		int figura = entrada.nextInt();
		
		switch(figura) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
			break;
			
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la al tura"));
			System.out.println("El area del rectángulo es " + (base * altura));
			break;
			
		case 3:
			int base2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la añtura"));
			System.out.println("El area del triángulo es " + ((base2 * altura2) / 2));
			break;
			
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.print("El area del círculo es ");
			System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
			break;
			
		default:
			System.out.println("La opción no es correcta");
		}
		
	}

}
