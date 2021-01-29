//Gonzalo Adolfo Zupo Silveira 
//Evaluación Celulas Plenumsoft
//29/enero/2021

//Esta clase me sirve para definir que es una pelicula 
public class Pelicula {
    
    //Atributos 
    private String idPeli;
    private String nombrePeli;
    private String directPeli;
    private String productoraPeli;
    private String generoPeli;
    private int calificacionPeli; //del 1 al 5
    private String vistaPeli; //vista o no;
    //private String añoEstrenoPeli;

    //Constructor
    public Pelicula(String idPeli, String nombrePeli, String directPeli, String productoraPeli, String generoPeli, int calificacionPeli, String vistaPeli) {
        this.idPeli = idPeli;
        this.nombrePeli = nombrePeli;
        this.directPeli = directPeli;
        this.productoraPeli = productoraPeli;
        this.generoPeli = generoPeli;
        this.calificacionPeli = calificacionPeli;
        this.vistaPeli = vistaPeli;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Pelicula{" + "idPeli=" + idPeli + ", nombrePeli=" + 
                nombrePeli + ", directPeli=" + directPeli + ", productoraPeli=" + 
                productoraPeli + ", generoPeli=" + generoPeli + ", calificacionPeli=" + 
                calificacionPeli + ", vistaPeli=" + vistaPeli + '}';
    }
    
}
