package practicaa;
import java.util.Scanner;
public class ejercicio_4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Ingrese un numero: ");
	        int n = sc.nextInt();

	        int suma = 0;
	        int contador = 0;

	        for(int i = 1; i <= n; i++){
	            if(i % 2 == 0){
	                suma += i;
	                contador++;
	            }
	        }

	        double promedio = (double)suma / contador;

	        System.out.println("El promedio de los numeros pares es: " + promedio);

	}

}
