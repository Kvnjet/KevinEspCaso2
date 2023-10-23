package LogicaCiclismo;

import DatosCiclismo.*;
import UICiclismo.*;
import java.util.ArrayList;
import java.lang.Math;

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
    
    /**
     * 
     */
    private UIPrincipal ventanaPrincipal;
    
    /**
     * 
     */
    private UICrearCiclista ventanaCrearCiclista;
    
    /**
     * 
     */
    private UICrearCarrera ventanaCrearCarrera;
    
    /**
     * 
     */
    private UIReportes ventanaReportes;
    
    /**
     * 
     */
    public GestorPrincipal(){
        this.ciclistas = new ArrayList<>();
        this.carreras = new ArrayList<>();
        this.registroDeCarreras = new ArrayList<>();
        this.ventanaPrincipal = new UIPrincipal(this);
        this.ventanaCrearCiclista = new UICrearCiclista(this);
        this.ventanaCrearCarrera = new UICrearCarrera(this);
        this.ventanaReportes = new UIReportes(this);
    }
   
    /**
     * 
     * @param idCiclista
     * @return 
     */
    public Ciclista getCiclista(int idCiclista){
        int indice = this.buscarCiclista(idCiclista);
        if(indice >= 0){
            return this.ciclistas.get(indice);
        } else {
            return null;
        }
    }
    
    /**
     * 
     * @param idCarrera
     * @return 
     */
    public Carrera getCarrera(int idCarrera){
        int indice = this.buscarCarrera(idCarrera);
        if(indice >= 0){
            return this.carreras.get(indice);
        } else {
            return null;
        }
    }
    
    /**
     * 
     * @param ciclista
     * @return 
     */
    public int agregarCiclista(Ciclista ciclista){
        this.ciclistas.add(ciclista);
        this.ventanaPrincipal.agregarCiclista(ciclista);
        return this.ciclistas.indexOf(ciclista);
    }
    
    /**
     * 
     * @param idCiclista
     * @return 
     */
    public int removerCiclista(int idCiclista){
        for(int i = 0; i < this.ciclistas.size(); i++){
            if (this.ciclistas.get(i).getIdentificador() == idCiclista){
               this.ciclistas.remove(i);
               return i;
            }
        }
        return 0;
    }
    
    /**
     * 
     * @param carrera
     * @return 
     */
    public int agregarCarrera(Carrera carrera){
        this.carreras.add(carrera);
        this.ventanaPrincipal.agregarCarrera(carrera);
        return this.carreras.indexOf(carrera);
    }
    
    public int removerCarrera(int idCarrera){
        for(int i = 0; i < this.carreras.size(); i++){
            if (this.carreras.get(i).getIdentificador() == idCarrera){
               this.ciclistas.remove(i);
               return i;
            }
        }
        return 0;
    }
    
    /**
     * 
     * @param idCiclista
     * @return 
     */
    public int buscarCiclista(int idCiclista){
       int id = -1;
       for(int i = 0; i < this.ciclistas.size(); i++){
            if (this.ciclistas.get(i).getIdentificador() == idCiclista){
                id = i;
            }
        }
       return id;
    }
    
    /**
     * 
     * @param idCarrera
     * @return 
     */
    public int buscarCarrera(int idCarrera){
       int id = -1;
       for(int i = 0; i < this.carreras.size(); i++){
            if (this.carreras.get(i).getIdentificador() == idCarrera){
                id = i;
            }
        }
       return id;
    }
    
    /**
     * Genera de forma aleatoria el rendimiento de un ciclista basado en los tiempos medios investigados
     * según la especialidad y categoria del ciclista, para esto genera un valor aleatoria dentro de un 
     * rango de velocidad que varia según la especialidad y categoria
     * @param especialidad Carretera, Montaña, Pista y BMX.
     * @param categoria Amateur, Profesional y Veterano
     * @return Rendimiento o velocidad media del ciclista generada de forma aleatoria;
     */
    public int generarRendimiento(String especialidad, String categoria){
        int rendimiento = 0;
        switch (especialidad){
            case "Carretera":
            case "Pista":
                switch (categoria){
                    case "Amateur":
                        //La velocidad de un amateur en Carretera o Pista puede estar en 15 km/h y 20 km/h
                        rendimiento = (int)(Math.random() * 5000) + 15000;
                        break;
                    case "Profesional":
                        //La velocidad de un profesional en Carretera o Pista puede estar en 35 km/h y 45 km/h
                        rendimiento = (int)(Math.random() * 10000) + 35000;
                        break;
                    case "Veterano":
                        //La velocidad de un veterano en Carretera o Pista puede estar en 15 km/h y 35 km/h
                        rendimiento = (int)(Math.random() * 20000) + 15000;
                        break;
                }
                break;
            case "Montaña":
            case "BMX":
                switch (categoria){
                    case "Amateur":
                        //La velocidad de un amateur en Montaña o BMX puede estar en 10 km/h y 12 km/h
                        rendimiento = (int)(Math.random() * 2000) + 10000;
                        break;
                    case "Profesional":
                        //La velocidad de un profesional en Montaña o BMX puede estar en 15 km/h y 20 km/h
                        rendimiento = (int)(Math.random() * 5000) + 15000;
                        break;
                    case "Veterano":
                        //La velocidad de un veterano en Montaña o BMX puede estar en 10 km/h y 17 km/h
                        rendimiento = (int)(Math.random() * 7000) + 10000;
                }
                break;
        }
        return rendimiento;
    }
    
    public int asignarCiclista(int IdCiclista, int IdCarrera){
       Ciclista ciclista = this.ciclistas.get(this.buscarCiclista(IdCiclista));
       Carrera carrera = this.carreras.get(this.buscarCarrera(IdCarrera));
       int indice = carrera.agregarCiclista(ciclista);
       if(indice >= 0){
           this.ventanaPrincipal.agregarCiclistaCarrera(ciclista);
       }
       return indice;
    }
    
    public void simularRecorrido(Recorrido carrera){
        GestorCarreras.simularRecorrido(carrera, this.registroDeCarreras);
    }
    
    public void simularCircuito(Circuito carrera){
        GestorCarreras.simularCircuito(carrera, this.registroDeCarreras);
    }
    
    /**
     * 
     */
    public void listarCarrerasFinalizadas(){
        int totalCarreras = this.carreras.size();
        for (int i = 0; i < totalCarreras; i++){
            Carrera carrera = this.carreras.get(i);
            if(carrera.getFecha() != null){
                this.ventanaReportes.agregarCarrera(carrera);
            }
        }
    }
    
    /**
     * 
     */
    public void mostrarVentanaCiclista(){
        this.ventanaCrearCiclista.setVisible(true);
    }
    
    /**
     * 
     */
    public void mostrarVentanaCarreras(){
        this.ventanaCrearCarrera.setVisible(true);
    }
    
    /**
     * 
     */
    public void mostrarVentaReportes(){
        this.ventanaReportes.setVisible(true);
    }
    
    /**
     * 
     */
    public void cerrarVentanaCiclista(){
        this.ventanaCrearCiclista.setVisible(false);
    }
    
    /**
     * 
     */
    public void cerrarVentanaCarreras(){
        this.ventanaCrearCarrera.setVisible(false);
    }
    
    /**
     * 
     */
    public void cerrarVentanaReportes(){
        this.ventanaReportes.setVisible(false);
    }
    
    public static void main(String args[]){
        GestorPrincipal manager = new GestorPrincipal();
        manager.ventanaPrincipal.setVisible(true);
    }
}