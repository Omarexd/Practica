package practicaa;
import java.util.Scanner;
public class ejercicio_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Ingrese el primer número: ");
	        int n1 = sc.nextInt();

	        System.out.print("Ingrese el segundo número: ");
	        int n2 = sc.nextInt();

	        int mayor;
	        int menor;

	        if(n1 > n2){
	            mayor = n1;
	            menor = n2;
	        } else{
	            mayor = n2;
	            menor = n1;
	        }

	        int dif = Math.abs(n1 - n2);

	        System.out.println("Mayor: " + mayor);
	        System.out.println("Menor: " + menor);
	        System.out.println("Diferencia absoluta: " + dif);

	}

}
