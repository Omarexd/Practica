package practicaa;
import java.util.Scanner;
public class ejercicio_8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Ingrese la hora (0-23): ");
		 int hor = sc.nextInt();
		 
		 if(hor >= 0 && hor <= 11) {
			 System.out.println("Mañana");
		 }
		 else if(hor >=12 && hor<=17) {
			 System.out.println("Tarde");
		 }
		 else if(hor >=18 && hor <=23) {
			 System.out.println("Noche");
		 }
		 else {
			 System.out.println("Hora inválida");
		 }
	}

}
