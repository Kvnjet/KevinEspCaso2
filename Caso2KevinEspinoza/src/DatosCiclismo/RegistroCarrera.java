package DatosCiclismo;

import java.util.ArrayList;

/**
 *
 * @author Kevin Alonso Espinoza Barrantes
 */
public class RegistroCarrera {
   /**
    * 
    */
   private int idCiclista;
   
   /**
    * 
    */
   private int idCarrera;
   
   /**
    * 
    */
   private ArrayList<Double> tiempos;
   
   /**
    * 
    */
   public RegistroCarrera(){
     this.idCiclista = 0;
     this.idCarrera = 0;
     this.tiempos = new ArrayList<>();
   }
   
   /**
    * 
    * @param id 
    */
   public void setIdCiclista(int id){
      this.idCiclista = id;
   }
   
   /**
    * 
    * @param id 
    */
   public void setIdCarrera(int id){
      this.idCarrera = id;
   }
   
   /**
    * 
    * @param tiempos 
    */
   public void setTiempos(ArrayList<Double> tiempos){
      this.tiempos = tiempos;
   }
   
   /**
    * 
    * @return 
    */
   public int getIdCiclista(){
      return this.idCiclista;
   }
   
   /**
    * 
    * @return 
    */
   public int getIdCarrera(){
      return this.idCarrera;
   }
   
   /**
    * 
    * @return 
    */
   public ArrayList<Double> getTiempos(){
      return this.tiempos;
   }
}