package practicaa;
import java.util.Scanner;
public class ejercicio_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n1 = sc.nextInt();

        while(n1 > 1 && n1 % 2 == 0){
            n1 = n1 / 2;
        }

        if(n1 == 1){
            System.out.println("Es potencia de 2");
        } else{
            System.out.println("No es potencia de 2");
        }
	}

}
