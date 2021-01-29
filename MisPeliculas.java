//Gonzalo Adolfo Zupo Silveira
//Evaluación Celulas Plenumsoft
//29/enero/2021

import java.util.Scanner;

public class MisPeliculas {
    public static void main (String args []){
        
        int opcionMenu = 0;
        
        System.out.println("Bienvenido al inventario de peliculas");
        System.out.println("Menu : ");
        System.out.println("| 1.- Agregar una pelicula al inventario         |");
        System.out.println("| 2.- Consultar peliculas guardadas              |");
        System.out.println("| 3.- Indicar si una pelicula ya se vio o aun no |");
        System.out.println("| 4.- Buscar pelicula                            |");
        System.out.println("| 5.- Eliminar pelicula del inventario           |");
        System.out.println("Para seleccionar una opcion, por favor ingrese el numero de la misma");
        System.out.println("¿Qué desea hacer?");
        //lectura de la opcion elegida
        Scanner sc = new Scanner(System.in);
        opcionMenu = sc.nextInt();
        
        //Esto es para que el usuario sepa que el sistema solo funcionara
        //cuando se ingresa una de las opciones mostradas
        //consideré numeros mayores a 0 y menores e iguales a 5
        if(opcionMenu > 0 && opcionMenu <= 5) {
            
            switch (opcionMenu)
            {
                case 1:
                    System.out.println("Seleccionó: ");
                    System.out.println("Agregar una pelicula al inventario");
                    System.out.println("");
                    System.out.println("Ingrese el identificador de la pelicula: ");
                    int idPeli;
                    idPeli = sc.nextInt();
                    System.out.println("");
                    
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    String nombrePeli;
                    nombrePeli = sc.nextLine();
                    System.out.println("");
                    
                    System.out.println("Ingrese quién, o quienes,  dirigieron la pelicula");
                    String directPeli;
                    directPeli = sc.nextLine();
                    System.out.println("");
                    
                    System.out.println("Ingrese el nombre de la compañia productora de la pelicula: ");
                    String productoraPeli;
                    productoraPeli = sc.nextLine();
                    System.out.println("");
                    
                    System.out.println("Ingrese el género al que pertenece la pelicula: ");
                    String generoPeli;
                    generoPeli = sc.nextLine();
                    System.out.println("");
                    
                    System.out.println("Ingresa la calificación de la pelicula (del 1 al 5): ");
                    int calificacionPeli = 0;
                    calificacionPeli = sc.nextInt();
                    System.out.println("");
                    //Lo siguiente lo hice pensando en que solo puede tener una pelicula
                    //su calificacion entre el numero 1 y el numero 5
                    //si el numero ingresado es diferente de 1,2,3,4,5 entonces
                    //se indica como se debe poner la calificacion y 
                    //se pide de nuevo
                    while(calificacionPeli < 1 || calificacionPeli > 5){
                        System.out.println("Por favor ingrese solo un número entre el 1 y el 5");
                        System.out.println("(1,2,3,4,5)");
                        System.out.println("El numero 1 indica que la pelicula es muy mala ");
                        System.out.println("El numero 5 indica que la pelicula fue muy buena ");
                        System.out.println("Ingrese la calificación de la pelicula: ");
                        calificacionPeli = sc.nextInt();
                    }
                    
                    System.out.println("Indique si la pelicula ya fue vista o si aun no");
                    System.out.println("Imgrese (vista) o (no) segun corresponda :");
                    String vistaPeli;
                    vistaPeli = sc.nextLine();
                    
                    
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("Seleccionó: ");
                    System.out.println("Consultar peliculas guardadas");
                    break;
                    
                case 3:
                    System.out.println("Seleccionó: ");
                    System.out.println("Indicar si una pelicula ya se vio o aun no");
                    break;
                    
                case 4:
                    System.out.println("Seleccionó: ");
                    System.out.println("Buscar pelicula");
                    break;
                    
                case 5:
                    System.out.println("Seleccionó: ");
                    System.out.println("Eliminar pelicula del inventario");
                    break;
            }
            
            
            
        } else {
            System.out.println("Por favor, ingrese el numero correspondiente a la opcion de su elección");
            opcionMenu = sc.nextInt();
        }
        
        
        
        
        
        
        
    }
}
