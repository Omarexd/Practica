package practicaa;
import java.util.Scanner;
public class ejercicio_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        int suma = 0;
        int i = 1;

        while(suma < n){

            suma += i;
            i++;

        }

        if(suma == n){
            System.out.println("Es un número triangular");
        } else{
            System.out.println("No es un número triangular");
        }

	}

}
