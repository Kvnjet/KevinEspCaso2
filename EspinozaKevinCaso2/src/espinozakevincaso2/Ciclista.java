package espinozakevincaso2;
import java.awt.Color;
import java.util.ArrayList;
/*import Soporte.Util;*/ 
/* Despues tengo que hacer una clase util que funcionara muy parecido a una que ya hice para patio */
/*Util es simplemente un sistema de reportes que no nos importa hasta que empiece a imprimir en pantalla*/
import java.util.List;

public class Ciclista {

    private List<String> nombre;
    private int edad;
    private List<String> nivelHabilidad;
    private List<String> genero;
    private int numeroBici;

    public Ciclista(List<String> nombre, int numeroBici, int edad, List<String> nivelHabilidad, List<String> genero) {
        nombre = new ArrayList<>();
        nombre.add("Kevin");
        nombre.add("Juan");
        nombre.add("María");
        nombre.add("Pedro");
        nombre.add("Laura");
        nombre.add("Carlos");
        nombre.add("Luisa");
        
        nivelHabilidad = new ArrayList<>();
        nivelHabilidad.add("Principiante");
        nivelHabilidad.add("Intermedio");
        nivelHabilidad.add("Avanzado");
        nivelHabilidad.add("Experto");
        nivelHabilidad.add("Profesional");
        
        genero = new ArrayList<>();
        genero.add("Femenino");
        genero.add("Masculino");
        genero.add("Otros");
    }

     public void nuevoCiclista() {
        /*Util.report("Se ha agregado un nuevo ciclista", Main.color_verde, "Ciclista", 3, true);*/
        System.out.println("Se ha agregado un nuevo ciclista");
        // Definir un nombre aleatorio
        int nombreIndex = (int)(Math.random() * this.nombre.size());
        String nombreCiclista = this.nombre.get(nombreIndex);
        System.out.println("Nombre: " + nombreCiclista);

        // Definir un nivel de habilidad aleatorio
        int habilidadIndex = (int)(Math.random() * this.nivelHabilidad.size());
        String habilidadCiclista = this.nivelHabilidad.get(habilidadIndex);
        System.out.println("Nivel de Habilidad: " + habilidadCiclista);

        // Definir un género aleatorio
        int generoIndex = (int)(Math.random() * this.genero.size());
        String generoCiclista = this.genero.get(generoIndex);
        System.out.println("Género: " + generoCiclista);

        // Resto del código para asignar número de bicicleta y edad
        this.numeroBici = (int)(Math.random() * 4) + 5;
        System.out.println("Tiene el número de bicicleta: " +  this.numeroBici);

        this.edad = (int) (Math.random() * 46) + 15;
        System.out.println("Tiene la edad de: " +  this.edad);
    }
}

