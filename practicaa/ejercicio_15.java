package practicaa;
import java.util.Scanner;
public class ejercicio_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de números: ");
        int n = sc.nextInt();

        int suma = 0;
        int contador = 0;

        for(int i = 1; i <= n; i++){

            System.out.print("Ingrese número: ");
            int num = sc.nextInt();

            if(num < 0){
                suma += num;
                contador++;
            }

        }

        if(contador > 0){
            double promedio = (double)suma / contador;
            System.out.println("Promedio de negativos: " + promedio);
        } else{
            System.out.println("No hay negativos");
        }



	}

}
