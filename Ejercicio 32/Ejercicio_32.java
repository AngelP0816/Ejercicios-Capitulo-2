import java.util.Scanner;
   
public class Ejercicio_32
{  // Abre la clase Ejercicio_32
public static void main(String arg[])
{  // Abre metodo main
Scanner entrada = new Scanner(System.in);
int num1;
int num2;
int num3;
int num4;
int num5;
  
System.out.println("\nIntroduzca 5 enteros y le dire cuantos son positivos,cuantos son negativos y cuantos son cero.");
System.out.println("Introduzca el primer entero:");
num1 = entrada.nextInt();
  
System.out.println("Introduzca el segundo entero:");
num2 = entrada.nextInt();
  
System.out.println("Introduzca el tercer entero:");
num3 = entrada.nextInt();
  
System.out.println("Introduzca el cuarto entero:");
num4 = entrada.nextInt();
  
System.out.println("Introduzca el quinto entero:");
num5 = entrada.nextInt();

// Ahora se cuentan los positivos, negativos y ceros
  
int positivos = 0;
int negativos = 0;
int ceros = 0;
  
if ( num1 > 0)
positivos = positivos + 1;
  
if ( num1 < 0)
negativos = negativos + 1;
  
if ( 0 == num1)
ceros = ceros + 1;
  
if ( num2 > 0)
positivos = positivos + 1;
  
if ( num2 < 0)
negativos = negativos + 1;
  
if ( 0 == num2)
ceros = ceros + 1;
  
if ( num3 > 0)
positivos = positivos + 1;
  
if ( num3 < 0)
negativos = negativos + 1;
  
if ( 0 == num3)
ceros = ceros + 1;
  
if ( num4 > 0)
positivos = positivos + 1;
  
if ( num4 < 0)
negativos = negativos + 1;
  
if ( 0 == num4)
ceros = ceros + 1;
  
if ( num5 > 0)
positivos = positivos + 1;
  
if ( num5 < 0)
negativos = negativos + 1;
  
if ( 0 == num5)
ceros = ceros + 1;
  
//Imprime los resultados
  
System.out.printf("\nDe los numeros introducidos, %d son positivos, %d son negativos y %d son ceros\n", positivos, negativos, ceros);
} // Cierra metodo main
}   // Cierra la clase Ejercicio_32