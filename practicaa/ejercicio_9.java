package practicaa;
import java.util.Scanner;
public class ejercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número del 1 al 5: ");
        int num = sc.nextInt();

        switch(num){

            case 1:
                System.out.println("I");
                break;

            case 2:
                System.out.println("II");
                break;

            case 3:
                System.out.println("III");
                break;

            case 4:
                System.out.println("IV");
                break;

            case 5:
                System.out.println("V");
                break;

            default:
                System.out.println("Número fuera de rango");

        }


	}

}
