
import java.util.Scanner;



/**
 *
 * @author Irene Payá Hernández Actividad_2_4
 */
public class Suma {
    public static void main(String[] args){
        int operando1, operando2, operacion;
        double resultado = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce los dos números que quieres operar: ");
        operando1 = teclado.nextInt();
        operando2 = teclado.nextInt();
        System.out.println("1: Suma\n2: Resta\n3: Multiplicación\n4: división\n5: módulo");
        System.out.print("Introduce que operación quieres realizar: ");
        operacion = teclado.nextInt();
        switch(operacion){
            case 1:
                resultado = operando1 + operando2;
                break;
            case 2:
                resultado = operando1 - operando2;
                break;
            case 3:
                resultado = operando1 * operando2;
                break;
            case 4:
                if(operando2 == 0) System.out.println("Error, no se puede dividir entre 0");
                else resultado = operando1 / operando2;
                break;
            case 5:
                resultado = operando1 % operando2;
                break;
            
        }
        System.out.printf("El resultado de la operación es: %.1f\n", resultado);
    }
    
}
