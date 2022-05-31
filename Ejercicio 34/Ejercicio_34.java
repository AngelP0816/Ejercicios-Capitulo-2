
import java.util.Scanner;

public class Ejercicio_34 {

    public static void main(String[] args) {   
        Scanner lectura = new Scanner(System.in);
        double altura, peso ,bmi;
        System.out.println("Introduce tu altura en Metros: ");
        altura = lectura.nextFloat();
        System.out.println("Introduce tu peso en Kg: ");
        peso = lectura.nextFloat();

        bmi = peso/(altura * altura);

        if(bmi <= 18.4){
            System.out.println("Tu peso Esta bajo");
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.print("Tu peso esta normal");
        }
        else if(bmi >= 25 && bmi <= 29.9){
            System.out.print("Tienes Sobrepeso");
        }
        else if(bmi >= 30 && bmi <= 34.9){
            System.out.print("Tienes Obesidad ");
        }

    }
}