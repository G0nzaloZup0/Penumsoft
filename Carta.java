//Gonzalo Adolfo Zupo Silveira
//Evaluación Celulas Plenumsoft
//29/enero/2021


//Esta clase me sirve para definir como es una carta de poker
public class Carta {
    //Atributos
    private String cara;
    private String palo;
    
    //Constructor
    public Carta(String caraCarta, String paloCarta){
        cara = caraCarta;
        palo = paloCarta;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return cara + " de " + palo ;
    }
}
