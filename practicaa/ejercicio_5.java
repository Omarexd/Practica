package practicaa;
import java.util.Scanner;
public class ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();

        int suma = 0;

        while(n > 0){

            int dig = n % 10;
            suma += dig;
            n = n / 10;

        }

        System.out.println("La suma de los digitos es: " + suma);

	}

}
