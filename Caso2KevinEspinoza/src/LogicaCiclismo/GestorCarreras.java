package LogicaCiclismo;

import DatosCiclismo.*;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Kevin Alonso Espinoza Barrantes
 */
public class GestorCarreras {    
    public boolean simularRecorrido(Recorrido simulacion, ArrayList<RegistroCarrera> registroCarrreras){
       Date fecha = new Date();
       simulacion.setFecha(fecha);
       int participantes = simulacion.getCiclistas().size();
       if(participantes == 0){
         return false;
       }
       
       int cantidadPuntosControl = simulacion.getCantidadPuntosControl();
       
       for(int i = 0; i < participantes; i++){
         RegistroCarrera registroTiempos = new RegistroCarrera();
         registroTiempos.setIdCarrera(simulacion.getIdentificador());
         registroTiempos.setIdCiclista(simulacion.getCiclistas().get(i).getIdentificador());
         int velocidad = (simulacion.getCiclistas().get(i)).getRendimiento();
         System.out.print(simulacion.getCiclistas().get(i).getNombre() + ": ");
         for(int j = 0; j < cantidadPuntosControl; j++){
             double tiempo = simulacion.getPuntosControl().get(j)/velocidad;
             registroTiempos.getTiempos().add(tiempo);
             System.out.print(tiempo + " ");
         }
         registroCarrreras.add(registroTiempos);
         System.out.println();
       } 
       return true;
    }

    public boolean simularCircuito(Circuito simulacion, ArrayList<RegistroCarrera> registroCarrreras){
       Date fecha = new Date();
       simulacion.setFecha(fecha);
       int participantes = simulacion.getCiclistas().size();
       if(participantes == 0){
         return false;
       }
       
       int cantidadGiros = simulacion.getCantidadGiros();
       
       for(int i = 0; i < participantes; i++){
         RegistroCarrera registroTiempos = new RegistroCarrera();
         registroTiempos.setIdCarrera(simulacion.getIdentificador());
         registroTiempos.setIdCiclista(simulacion.getCiclistas().get(i).getIdentificador());
         int velocidad = (simulacion.getCiclistas().get(i)).getRendimiento();
         System.out.print(simulacion.getCiclistas().get(i).getNombre() + ": ");
         
         for(int j = 0; j < cantidadGiros; j++){
             double tiempo = ((simulacion.getDistancia())*(j+1))/velocidad;
             registroTiempos.getTiempos().add(tiempo);
             System.out.print(tiempo + " ");
         }
         registroCarrreras.add(registroTiempos);
         System.out.println();
       }
       return true;
    }
}