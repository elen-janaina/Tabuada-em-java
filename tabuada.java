import java.util.*;
class tabuada {
	public static void main (String args[]) {			

		System.out.print("Digite um número para ver a tabuada: ");
		Scanner sc = new Scanner(System.in); 
		int numero = sc.nextInt();

		System.out.println("Tabuada do " + numero + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
	}
}

