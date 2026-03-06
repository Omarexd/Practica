package practicaa;
import java.util.Scanner;
public class ejercicio_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }

        if (suma % 2 == 0) {
            System.out.println("La suma es PAR");
        } else {
            System.out.println("La suma es IMPAR");
        }
	}

}
