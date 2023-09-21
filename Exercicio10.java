package MetodosMatematicos;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		int escolhaUsuario = 0;
		int numero1 = 0, numero2 = 0;

		do {

			try {

				escolhaUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha uma opção \n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão"));

				if (escolhaUsuario > 4 || escolhaUsuario <= 0) {
					JOptionPane.showMessageDialog(null, " Você não digitou nenhum número válido, fim da aplicação");
					break;
				}

				numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));

				numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));

			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, "Digite apenas números nesse campo  \n ERRO!");
			}

			switch (escolhaUsuario) {
			case 1:

				MetodosMatematicos.somaNumeros(numero1, numero2);

				break;

			case 2:

				MetodosMatematicos.subtraiNumeros(numero1, numero2);

				break;
			case 3:
				MetodosMatematicos.multiplicaNumeros(numero1, numero2);

				break;
			case 4:

				MetodosMatematicos.divideNumeros(numero1, numero2);


			}
		}

		while (escolhaUsuario > 0 && escolhaUsuario <= 4);

	}

}
