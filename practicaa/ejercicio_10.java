package practicaa;
import java.util.Scanner;
public class ejercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese primer numero: ");
		int n1 = sc.nextInt();
		System.out.println("Ingrese segundo numero: ");
		int n2 = sc.nextInt();
		System.out.println("Ingrese la opcion 1.suma 2.resta 3.multiplicacion");
		int op = sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("La suma es: "+(n1+n2));
			break;
		case 2: 
			System.out.println("La resta es: "+(n1-n2));
			break;
		case 3:
			System.out.println("La multiplicacion ess: "+(n1*n2));
			break;
			default:
				System.out.println("Opcion invalida");
		}

	}

}
