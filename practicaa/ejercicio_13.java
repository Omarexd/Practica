package practicaa;
import java.util.Scanner;
public class ejercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        int contador = 0;

        while(n > 0){

            int digito = n % 10;

            if(digito % 2 == 0){
                contador++;
            }

            n = n / 10;
        }

        System.out.println("Cantidad de dígitos pares: " + contador);

	}

}
