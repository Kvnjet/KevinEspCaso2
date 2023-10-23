package DatosCiclismo;

import java.util.Date;
import java.util.ArrayList;

/**
 * Define todos los metodos y atributos correspondientes a una carrera de ciclismo.
 * @author Kevin Alonso Espinoza Barrantes
 */
public class Carrera {

   /**
    * Identificador único de la carrera.
    */
   private int identificador;
   
   /**
    * Fecha en la que se realizó la simulacion de la carrera.
    */
   private Date fecha;
   
   /**
    * Tipo de carrera: carretera, montaña, pista o BMX.
    */
   private String tipo;
   
   /**
    * Define el tamaño (en metros) de la pista/ruta de la carrera.
    * En el caso de las carreras tipo carretera o montaña es la distancia
    * total de la carrera, en el caso de las carreras tipo pista o BMX; es
    * el tamaño del circuito, la distancia todal en este caso se definiría
    * multiplicando la distancia del circuito por el numero de vueltas 
    * que completan la carrera.
    */
   private double distancia;
   
   /**
    * Lista de ciclistas que van a correr la carrera
    */
   private ArrayList<Ciclista> ciclistas;
   
   /**
    * Indica el menor tiempo en que se completó la carrera, el tiempo se
    * expresa en horas.
    */
   private int record;
   
   /**
    * 
    * @param id 
    */
   public void setIdentificador(int id){
       this.identificador = id;
   }
   
   /**
    * 
    * @param fecha 
    */
   public void setFecha(Date fecha){
       this.fecha = fecha;
   }
   
   /**
    * 
    * @param tipo 
    */
   public void setTipo(String tipo){
       this.tipo = tipo;
   }
   
   /**
    * 
    * @param distancia 
    */
   public void setDistancia(double distancia){
       this.distancia = distancia;
   }
   
   /**
    * 
    * @param record 
    */
   public void setRecord(int record){
       this.record = record;
   }
   
   /**
    * 
    * @param ciclistas 
    */
   public void setCiclistas(ArrayList<Ciclista> ciclistas){
      this.ciclistas = ciclistas;
   }
   
   /**
    * 
    * @return 
    */
   public int getIdentificador(){
       return this.identificador;
   }
   
   /**
    * 
    * @return 
    */
   public Date getFecha(){
       return this.fecha;
   }
   
   /**
    * 
    * @return 
    */
   public String getTipo(){
       return this.tipo;
   }
   
   /**
    * 
    * @return 
    */
   public double getDistancia(){
       return this.distancia;
   }
   
   /**
    * 
    * @return 
    */
   public int getRecord(){
       return this.record;
   }
   
   /**
    * 
    * @return 
    */
   public ArrayList<Ciclista> getCiclistas(){
      return this.ciclistas;
   }
   
   /**
    * 
    * @param ciclista
    * @return 
    */
   public int agregarCiclista(Ciclista ciclista){
       if (this.ciclistas.contains(ciclista)){
          return -1; 
       } else {
           this.ciclistas.add(ciclista);
           return this.ciclistas.indexOf(ciclista);
       }  
   }
}