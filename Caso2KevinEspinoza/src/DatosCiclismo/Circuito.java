package DatosCiclismo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kevin Alonso Espinoza Barrantes
 */
public class Circuito extends Carrera {
    
    /**
     * Cantidad de giros que se deben realizar al circuito para concluir la carrera
     * Se utilizara cada giro como un punto de control.
     */
    private int cantidadGiros;
    
    /**
     * Distancia total de la carrera.
     * Es igual a la cantidadGiros * la distancia del circuito.
     */
    private int distanciaTotal;
    
    /**
    * Constructor de la clase, recibe como parametros todos los atributos de la clase 
    * y asigna sus valores a cada propiedad respectiva.
    * @param id Identificador de la carrera.
    * @param tipo Tipo de carrera.
    * @param distancia Distancia del circuito/ruta de la carrera.
    * @param record Menor tiempo en que se a finalizado esta carrera.
    */
   public Circuito(int id, String tipo, int distancia, int record){
      this.setIdentificador(id);
      this.setTipo(tipo);
      this.setDistancia(distancia);
      this.setRecord(record);
      ArrayList<Ciclista> ciclistas = new ArrayList();
      this.setCiclistas(ciclistas);
      this.cantidadGiros = 0;
      this.distanciaTotal = 0;
   }
   
   /**
    * Constructor de la clase, recibe como parametros todos los atributos de la clase 
    * y asigna sus valores a cada propiedad respectiva.
    * @param id Identificador de la carrera.
    * @param tipo Tipo de carrera.
    * @param distancia Distancia del circuito/ruta de la carrera.
    * @param record Menor tiempo en que se a finalizado esta carrera.
    * @param giros
    */
   public Circuito(int id, String tipo, int distancia, int record, int giros){
      this.setIdentificador(id);
      this.setTipo(tipo);
      this.setDistancia(distancia);
      this.setRecord(record);
      ArrayList<Ciclista> ciclistas = new ArrayList();
      this.setCiclistas(ciclistas);
      this.cantidadGiros = giros;
      this.distanciaTotal = giros*distancia;
   }
   
   /**
    * 
    * @param giros 
    */
   public void setCantidadGiros(int giros){
       this.cantidadGiros = giros;
   }
   
   /**
    * 
    * @param distTotal 
    */
   public void setDistanciaTotal(int distTotal){
       this.distanciaTotal = distTotal;
   }
   
   /**
    * 
    * @return 
    */
   public int getCantidadGiros(){
       return this.cantidadGiros;
   }
   
   /**
    * 
    * @return 
    */
   public int getDistanciaTotal(){
       return this.distanciaTotal;
   }
}