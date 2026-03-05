package practicaa;
import java.util.Scanner;
public class ejercicio_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int n = sc.nextInt();
		
		int factorial = 1;
		for(int i = 1; i<= n; i++) {
			factorial *= i;
		}
		System.out.println("El factorial es: " + factorial);
	}
}
