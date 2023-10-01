package espinozakevincaso2;
import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private int dificultad;
    private String terreno;
    private List<String> terrenosPermitidos;

    public Carrera() {
        // Inicializamos la lista de terrenos permitidos
        terrenosPermitidos = new ArrayList<>();
        terrenosPermitidos.add("Montañoso");
        terrenosPermitidos.add("Plano");
        terrenosPermitidos.add("Carretera");
        terrenosPermitidos.add("Valle");
        terrenosPermitidos.add("BmX");
    }


}

