//Gonzalo Adolfo Zupo Silveira
//Evaluación Celulas Plenumsoft
//29/Enero/2021

import java.util.Scanner;

public class EnterosAlDerechoYAlReves {
    
    public static void main(String args []){
        int numero = 0, invertido = 0, resto = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enteros al derecho y al revés");
        System.out.println("Por favor ingrese un número: ");
        numero = sc.nextInt();
        
        if (numero < 0){
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
            
            System.out.println("El número invertido es: -" + invertido);
        } else {
            while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
            
            }
             System.out.println("El número invertido es: " + invertido);
        }
        
    }
}
