package MetodosMatematicos;

import javax.swing.JOptionPane;

public class MetodosMatematicos {

	public static int somaNumeros(int numero1, int numero2) {

		JOptionPane.showMessageDialog(null, " Soma de " + numero1 + " e " + numero2 + " = " + (numero1 + numero2));
		return numero1 + numero2;
	}

	public static int subtraiNumeros(int numero1, int numero2) {

		JOptionPane.showMessageDialog(null, " Subtração de " + numero1 + " e " + numero2 + " = " + (numero1 - numero2));
		return numero1 - numero2;
	}

	public static int multiplicaNumeros(int numero1, int numero2) {

		JOptionPane.showMessageDialog(null,
				" Multiplicação de " + numero1 + " e " + numero2 + " = " + (numero1 * numero2));
		return numero1 * numero2;
	}

	public static int divideNumeros(int numero1, int numero2) {
		try {
			if (numero2 == 0 || numero1 == 0) {
				throw new ArithmeticException("Divisão por zero não é permitida.");
			}
			return numero1 / numero2;
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Você tentou fazer uma divisão por zero, portanto, fim da aplicação");
			return 0;
		}
	}

}
