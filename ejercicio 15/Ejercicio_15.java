import java.util.Scanner;

public class Ejercicio_15

{        // Abre clase Ejercicio_15
 public static void main( String args[] )
 {       // Abre metodo main
 Scanner entrada = new Scanner(System.in);

 int num1;
 int num2;
 int suma;
 int producto;
 int diferencia;
 int cociente;

 System.out.print("\nEste programa recibe dos numeros y da su producto, cociente, suma y diferencia.\n");

 System.out.println("Introduzca el primer entero: ");
 num1 = entrada.nextInt();

 System.out.println("Introduzca el segundo entero: ");
 num2 = entrada.nextInt();

 suma = num1 + num2;
 diferencia = num1 - num2;
 producto = num1*num2;
 cociente = num1/num2;

 System.out.printf("\nLa suma de los numeros es: %d\n", suma);
 System.out.printf("\nLa diferencia de los numeros es: %d\n", diferencia);
 System.out.printf("\nEl producto de los numeros es: %d\n", producto);
 System.out.printf("\nEl cociente de los numeros es: %d\n", cociente);

  }       
}  