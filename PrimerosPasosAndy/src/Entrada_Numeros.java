import javax.swing.*;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1	= JOptionPane.showInputDialog("Indroduce un número");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raíz de " + num2 + " es ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
		
		//double x = 10000.0;
		
		//System.out.printf("%1.4f", x / 3);

	}

}
