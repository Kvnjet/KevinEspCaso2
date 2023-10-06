package LogicaCiclismo;

import DatosCiclismo.*;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Kevin Alonso Espinoza Barrantes
 */
public class GestorPrincipal {
    
    /**
     * 
     */
    private ArrayList<Ciclista> ciclistas;
    
    /**
     * 
     */
    private ArrayList<Carrera> carreras;
    
    /**
     * 
     */
    private ArrayList<RegistroCarrera> registroDeCarreras;
    
    public GestorPrincipal(){
        this.ciclistas = new ArrayList<>();
        this.carreras = new ArrayList<>();
        this.registroDeCarreras = new ArrayList<>();
    }
    
    /**
     * 
     * @param ciclista
     * @return 
     */
    public int agregarCiclista(Ciclista ciclista){
        this.ciclistas.add(ciclista);
        return this.ciclistas.indexOf(ciclista);
    }
    
    /**
     * 
     * @param carrera
     * @return 
     */
    public int agregarCarrera(Carrera carrera){
        this.carreras.add(carrera);
        return this.carreras.indexOf(carrera);
    }
    
    public static void main(String args[]){
        GestorPrincipal manager = new GestorPrincipal();
        GestorCarreras simulador = new GestorCarreras();
        GestorReportes reportes = new GestorReportes();
        
        Ciclista ciclista1 = new Ciclista(1,"Jeans","Espinoza","Torres",40,'M',"amateur","carretera",15000);
        Ciclista ciclista2 = new Ciclista(2,"Kevin Alonso","Espinoza","Barrantes",19,'M',"amateur","carretera",16000);
        Ciclista ciclista3 = new Ciclista(3,"Pablo","Espinoza","Chinga",38,'M',"amateur","carretera",14000);
        
        ArrayList<Double> puntos = new ArrayList<>();
        puntos.add(20000.0);
        puntos.add(45000.0);
        puntos.add(70000.0);
        puntos.add(100000.0);
        puntos.add(120000.0);
        
        Recorrido carrera1 = new Recorrido(1,"carretera",120000,0,5,puntos);
        Circuito carrera2 = new Circuito(2,"pista",1000,0,5);
        
        manager.agregarCiclista(ciclista1);
        manager.agregarCiclista(ciclista2);
        manager.agregarCiclista(ciclista3);
        
        carrera1.agregarCiclista(ciclista1);
        carrera1.agregarCiclista(ciclista2);
        carrera1.agregarCiclista(ciclista3);
        carrera2.agregarCiclista(ciclista1);
        carrera2.agregarCiclista(ciclista2);
        
        Date fecha1 = new Date();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            System.out.println(e);
        }
        
        simulador.simularRecorrido(carrera1, manager.registroDeCarreras);
        manager.agregarCarrera(carrera1);
        
        Date fecha2 = new Date();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            System.out.println(e);
        }
        
        simulador.simularCircuito(carrera2, manager.registroDeCarreras);
        manager.agregarCarrera(carrera2);
        
        Date fecha3 = new Date();
        
        System.out.println();
        System.out.println();

        //reportes.reporteCarrera(carrera2, manager.registroDeCarreras);
        //reportes.reporteCarrera(carrera1, manager.registroDeCarreras);
        
        //reportes.reporteFechas(fecha1, fecha2, manager.carreras, manager.registroDeCarreras);
        //reportes.reporteFechas(fecha2, fecha3, manager.carreras, manager.registroDeCarreras);
        reportes.reporteFechas(fecha1, fecha3, manager.carreras, manager.registroDeCarreras);
    }
}