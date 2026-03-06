package practicaa;
import java.util.Scanner;
public class ejercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n1 = sc.nextInt();

        for(int i = 1; i <= 10; i++){

            double resultado = (double)n1 / i;
            System.out.println(n1 + " / " + i + " = " + resultado);

        }

	}

}
