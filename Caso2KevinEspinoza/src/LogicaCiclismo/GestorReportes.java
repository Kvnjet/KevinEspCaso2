package LogicaCiclismo;

import DatosCiclismo.*;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author jeans
 */
public class GestorReportes {
    
    public static boolean reporteCarrera(Carrera carrera, ArrayList<RegistroCarrera> registroCarrera){
       System.out.print("ID Carrera\tID Ciclista\tTiempos\n");
       for(int i = 0; i < registroCarrera.size(); i++){
           if(carrera.getIdentificador() == registroCarrera.get(i).getIdCarrera()){
              System.out.print(carrera.getIdentificador() + "\t\t" + registroCarrera.get(i).getIdCiclista() + "\t\t");
              for(int j = 0; j < registroCarrera.get(i).getTiempos().size(); j++){
                  System.out.print(registroCarrera.get(i).getTiempos().get(j) + " ");
              }
              System.out.println();
           }
       } 
       return true;
    }
    
    public static boolean reporteFechas(Date fechaInicial, Date fechaFinal, ArrayList<Carrera> carreras, ArrayList<RegistroCarrera> registroCarrera){
       for(int i = 0; i < carreras.size(); i++){
           if((carreras.get(i).getFecha()).after(fechaInicial) && (carreras.get(i).getFecha()).before(fechaFinal)){
               GestorReportes.reporteCarrera(carreras.get(i), registroCarrera);
           } 
       }
       return true;
    }
}
