package practicaa;
import java.util.Scanner;
public class ejercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de numeros: ");
        int n = sc.nextInt();

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for(int i = 1; i <= n; i++){

            System.out.print("Ingrese numero: ");
            int num = sc.nextInt();

            if(num > 0){
                positivos++;
            }
            else if(num < 0){
                negativos++;
            }
            else{
                ceros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

	}

}
