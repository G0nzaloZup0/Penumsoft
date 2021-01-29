//Gonzalo Adolfo Zupo Silveira
//Evaluación Celulas Plenumsoft
import static java.lang.Math.abs;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Palindromos {

    public static void main(String[] args) {
        int numero;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese un número: ");
        numero = reader.nextInt();
        
        //esta variable me sirve para dar la solución
        //como se pide (true / false)
        boolean respuesta;
        
        //Este if me sirve para tomar por defecto 
        //como no palindromos a los negativos
        //ya que tiene un signo (-) del lado derecho
        //por lo tanto, al leerlos al reves no se lee
        //lo mismo 
        if(numero < 0){
            respuesta = false;
            System.out.println(respuesta);
            System.out.printf("El numero no es palindromo%n");
        }

        numero = abs(numero);
        if (es_palindromo(numero)) {
            respuesta = true;
            System.out.println(respuesta);
            System.out.printf("El número es palíndromo%n");
        } else {
                respuesta = false;
                System.out.println(respuesta);
                System.out.printf("El número no es palíndromo%n");
             }
        }

    private static boolean es_palindromo(int numero) {
            int total_digitos = cuenta_digitos(numero);
            int mitad = total_digitos / 2;
            int i;
            int factor = (int) pow(10, total_digitos - 1);
            for (i = 1; i <= mitad; i++) {
                int digito_derecha = numero % 10;
                int digito_izquierda = numero / factor;
                if (digito_derecha != digito_izquierda) {
                return false;
                }
            numero %= factor;
            numero /= 10;
            factor /= 100;
        }
        return true;
        
    }

    private static int cuenta_digitos(int numero) {
        if (numero == 0) {
            return 1;
        }
        return (int) (log10(numero) + 1);
    }
}