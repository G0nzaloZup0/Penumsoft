//Gonzalo Adolfo Zupo Silveira
//Evaluación Celulas Plenumsoft
//29/enero/2021

public class PruebaDeCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar();
        
        System.out.println("/n");
        for(int i = 0; i < 13; i++){
            System.out.printf("%-20s%-20s%-20s%-20s\n", 
            miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta(),
            miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta());
        }
        
        System.out.println("\n");
    }   
}