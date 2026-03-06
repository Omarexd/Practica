package practicaa;
import java.util.Scanner;
public class ejercicio_20 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Ingrese la temperatura en Celsius: ");
	        double celsius = sc.nextDouble();

	        double fahrenheit = (celsius * 9 / 5) + 32;

	        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

	}
}
