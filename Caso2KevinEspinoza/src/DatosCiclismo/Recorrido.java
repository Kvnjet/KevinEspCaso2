package DatosCiclismo;

import java.util.ArrayList;

/**
 *
 * @author Kevin Alonso Espinoza Barrantes
 */
public class Recorrido extends Carrera {
    
    /**
     * Indica la cantidad de puntos de control que existen en el recorrido,
     * donde se realiza lectura del Chip.
     */
    private int cantidadPuntosControl;
    
    /**
     * Arreglo de enteros que indica la distancia (en metros) donde estan ubicados
     * cada uno de los puntos de control (lectura de chip) en el recorrido.
     */
    private ArrayList<Double> puntosControl;
    
    /**
    * Constructor de la clase, recibe como parametros todos los atributos de la clase 
    * y asigna sus valores a cada propiedad respectiva.
    * @param id Identificador de la carrera.
    * @param tipo Tipo de carrera.
    * @param distancia Distancia del circuito/ruta de la carrera.
    */
   public Recorrido(int id, String tipo, int distancia){
      this.setIdentificador(id);
      this.setTipo(tipo);
      this.setDistancia(distancia);
      this.setRecord(0);
      ArrayList<Ciclista> ciclistas = new ArrayList();
      this.setCiclistas(ciclistas);
      this.cantidadPuntosControl = 0;
      this.puntosControl = new ArrayList<>();
   }
    
    /**
    * Constructor de la clase, recibe como parametros todos los atributos de la clase 
    * y asigna sus valores a cada propiedad respectiva.
    * @param id Identificador de la carrera.
    * @param tipo Tipo de carrera.
    * @param distancia Distancia del circuito/ruta de la carrera.
    * @param record Menor tiempo en que se a finalizado esta carrera.
    */
   public Recorrido(int id, String tipo, int distancia, int record){
      this.setIdentificador(id);
      this.setTipo(tipo);
      this.setDistancia(distancia);
      this.setRecord(record);
      ArrayList<Ciclista> ciclistas = new ArrayList();
      this.setCiclistas(ciclistas);
      this.cantidadPuntosControl = 0;
      this.puntosControl = new ArrayList<>();
   }
   
   /**
    * Constructor de la clase, recibe como parametros todos los atributos de la clase 
    * y asigna sus valores a cada propiedad respectiva.
    * @param id Identificador de la carrera.
    * @param tipo Tipo de carrera.
    * @param distancia Distancia del circuito/ruta de la carrera.
    * @param record Menor tiempo en que se a finalizado esta carrera.
    * @param cantPuntos Cantidad de puntos de control.
    * @param puntos Arreglo que indica la distancia donde se encuentra cada punto de control.
    */
   public Recorrido(int id, String tipo, int distancia, int record, int cantPuntos, ArrayList<Double> puntos){
      this.setIdentificador(id);
      this.setTipo(tipo);
      this.setDistancia(distancia);
      this.setRecord(record);
      ArrayList<Ciclista> ciclistas = new ArrayList();
      this.setCiclistas(ciclistas);
      this.cantidadPuntosControl = cantPuntos;
      this.puntosControl = puntos;
   }
   
   /**
    * 
    * @param cantPuntos Cantidad de puntos de control del recorrido 
    */
   public void setCantidadPuntosControl(int cantPuntos){
      this.cantidadPuntosControl = cantPuntos;
   }
   
   /**
    * 
    * @param puntos 
    */
   public void setPuntosControl(ArrayList<Double> puntos){
       this.puntosControl = puntos;
   }
   
   /**
    * 
    * @return 
    */
   public int getCantidadPuntosControl(){
      return this.cantidadPuntosControl;
   }
   
   /**
    * 
    * @return 
    */
   public ArrayList<Double> getPuntosControl(){
       return this.puntosControl;
   }
}