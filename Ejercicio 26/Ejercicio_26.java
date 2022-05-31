import java.util.Scanner;
   
public class Ejercicio_26
   
{                         // Abre clase Ejercicio_26
public static void main(String arg[])
{          // Abre metodo main
Scanner entrada = new Scanner(System.in);
int num1;
int num2;
int mayor;
int menor;
 
System.out.println("\nEste programa recibe dos enteros y verifica si uno es multiplo del otro.");
System.out.println("Por favor introduzca el primer numero:");
num1 = entrada.nextInt();
  
System.out.println("Por favor introduzca el segundo numero:");
num2 = entrada.nextInt();
 
mayor = num1;
menor = num2;
 
if ( num2 > num1 )
{          // Abre if
mayor = num2;
menor = num1;
}          // Cierra if

if ( 0 == mayor % menor )
System.out.printf("\nEl numero %d es multiplo del numero %d\n", mayor, menor);
 
if ( 0 != mayor % menor )
System.out.println("\nLos numeros no son multiplos.");
 
}         //Cierra metodo main 
 
}                        // Cierra clase Ejercicio_26