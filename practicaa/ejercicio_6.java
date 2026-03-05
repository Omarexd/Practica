package practicaa;
import java.util.Scanner;
public class ejercicio_6 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();

        if(n % 7 == 0){
            System.out.println("Es múltiplo de 7");
        }

        if(n % 11 == 0){
            System.out.println("Es múltiplo de 11");
        }
        if(n % 7 != 0 && n % 11 != 0){
            System.out.println("No es múltiplo de 7 ni de 11");
        }

}
}