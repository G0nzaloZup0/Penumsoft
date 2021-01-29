//Gonzalo Adolfo Zupo Silveira
//Evaluación Celulas Plenumsoft
//29/enero/2021

//Esta clase me sirve para definir como es un paquete de cartas de poker


import java.util.Random;

public class PaqueteDeCartas {
    //Atributos
    private Carta paquete[];
    private int cartaActual;
    private final int NUMERO_DE_CARTAS = 52;
    private  Random numerosAleatorios;
    
    
    //Constructor
    //En el constructor, puse 2 arreglos porque uno sirve para establecer los palos,
    // y el otro arreglo define todos los valores posibles de las cartas.
    public PaqueteDeCartas(){
        String caras[] = {"AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ", "JACK", "QUINA", "REY"};
        String palos[] = {"CORAZONES", "DIAMANTES", "PICAS", "TREBOLES"};
        
        paquete = new Carta[NUMERO_DE_CARTAS];
        cartaActual = 0;
        numerosAleatorios = new Random();
        
        //Ciclo que sirve para "crear" el paquete de cartas
        //Es decir, inicializa el arreglo correspondiente al paquete de cartas
        for(int cuenta = 0; cuenta < paquete.length; cuenta++){
            paquete[cuenta] = new Carta(caras[cuenta % 13], palos[cuenta / 13]);
        }
        
    }
    
    //Metodo para barajar las cartas.
    //Lo que hace es generar cartas aleatorias
    //con los palos y las caras ya definidos 
    //en el constructor
    public void barajar(){
        cartaActual = 0;
        
        for(int primera = 0; primera < paquete.length; primera++){
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
            Carta temp = paquete[primera];
            
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }
    }
    
    //Metodo para repartir las cartas.
    //Aquí se simula el repartido
    //de las cartas ya creadas
    //y barajadas anteriormente
    public Carta repartirCarta(){
        if(cartaActual < paquete.length){
        return paquete[cartaActual ++];
        }
        else return null;
    } 
}