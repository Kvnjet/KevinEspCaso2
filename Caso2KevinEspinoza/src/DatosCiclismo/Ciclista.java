package DatosCiclismo;

/**
 * Define todos los metodos y atributos correspondientes a un ciclista.
 * @author Kevin Alonso Espinoza Barrantes
 */
public class Ciclista {
   /**
    * Identificador único asignado a cada ciclista.
    */
   private int identificador;
    
   /**
    * Nombre del ciclista, incluye primer y segundo nombre.
    */
   private String nombre;
    
   /**
    * Primer apellido del ciclista.
    */
   private String primerApellido;
   
   /**
    * Segundo apellido del ciclista.
    */
   private String segundoApellido;
   
   /**
    * Edad del ciclista.
    */
   private int edad;
   
   /**
    * Sexo del ciclista, se define como un caracter (M/F).
    */
   private char sexo;
   
   /**
    * Define la categoría del ciclista, estas pueden ser: amateur, profesional o veterano.
    */
   private String categoria;
   
   /**
    * Define la especialidad en la que compite el ciclista, estas pueden ser:
    * carretera, montaña, pista y BMX.
    */
   private String especialidad;
   
   /**
    * Es una variable que define el rendimiento del ciclista, esta se expresa en
    * metros por hora e indica la velocidad media del ciclista. Esta variable
    * es generada de forma aleatoria por el GestorPrincipal a la hora de crear un
    * ciclista, la misma se define de forma aleatoria pero dentro de unos parametros
    * predefinidos según la especialidad y categoria del ciclista.
    */
   private int rendimiento;
   
   /**
    * Contructor de la clase Ciclista, recibe como parametros todos los atributos de
    * la clase y asigna dichos valores.
    * @param nombre Nombre del ciclista.
    * @param pApellido Primer apellido del ciclista.
    * @param sApellido Segundo apellido del ciclista.
    * @param edad Edad del ciclista.
    * @param sexo Sexo del ciclista.
    * @param categoria Categoria del ciclista (amateur, profesional o veterano).
    * @param especialidad Especialidad en la que compite el ciclista (carretera, montaña, pista o BMX).
    * @param rendimiento Velocidad media del ciclista (mts/s)
    */
   public Ciclista(int id, String nombre, String pApellido, String sApellido, int edad, char sexo, String categoria, String especialidad, int rendimiento){
      this.identificador = id;
      this.nombre = nombre;
      this.primerApellido = pApellido;
      this.segundoApellido = sApellido;
      this.edad = edad;
      this.sexo = sexo;
      this.categoria = categoria;
      this.especialidad = especialidad;
      this.rendimiento = rendimiento;
   }
   
   /**
    * Asigna el valor recibido como parametro al atributo identificador.
    * @param id Identificador del ciclista.
    */
   public void setIdentificador(int id){
       this.identificador = id;
   }
   
   /**
    * Asigna el valor recibido como parametro al atributo nombre.
    * @param nombre Nombre del ciclista.
    */
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   
   /**
    * Asigna el valor recibido como parametro al atributo primerApellido.
    * @param pApellido Primer apellido del ciclista.
    */
   public void setPrimerApellido(String pApellido){
       this.primerApellido = pApellido;
   }
   
   /**
    * Asigna el valor recibido como parametro al atributo segundoApellido.
    * @param sApellido Segundo apellido del ciclista.
    */
   public void setSegundoApellido(String sApellido){
       this.segundoApellido = sApellido;
   }
   
   /**
    * Asigna el valor recibido como parametro al atributo edad.
    * @param edad Edad del ciclista.
    */
   public void setEdad(int edad){
       this.edad = edad;
   }
   
   /**
    * Asigna el valor recibido como parametro al atributo sexo.
    * @param sexo Sexo del ciclista.
    */
   public void setSexo(char sexo){
       this.sexo = sexo;
   }
   
   /**
    * Asigna el valor recibido como parametro al atributo categoria.
    * @param categoria Categoria del ciclista.
    */
   public void setCategoria(String categoria){
       this.categoria = categoria;
   }
   
   /**
    * Asigna el valor recibido como parametro al atributo especialidad.
    * @param especialidad Especialidad del ciclista.
    */
   public void setEspecialidad(String especialidad){
       this.especialidad = especialidad;
   }
   
   /**
    * Asigna el valor recibido como parametro al atributo rendimiento.
    * @param rendimiento Rendimiento del ciclista.
    */
   public void setRendimiento(int rendimiento){
       this.rendimiento = rendimiento;
   }
   
   /**
    * Retorna el identificador del ciclista.
    * @return Identificador del ciclista.
    */
   public int getIdentificador(){
       return this.identificador;
   }
   
   /**
    * Retorna el nombre del ciclista.
    * @return Nombre del ciclista.
    */
   public String getNombre(){
       return this.nombre;
   }
   
   /**
    * Retorna el primer apellido del ciclista.
    * @return Primer apellido del ciclista.
    */
   public String getPrimerApellido(){
       return this.primerApellido;
   }
   
   /**
    * Retorna el segundo apellido del ciclista.
    * @return Segundo apellido del ciclista.
    */
   public String getSegundoApellido(){
       return this.segundoApellido;
   }
   
   /**
    * Retorna la edad del ciclista.
    * @return Edad del ciclista.
    */
   public int getEdad(){
       return this.edad;
   }
   
   /**
    * Retorna el sexo del ciclista.
    * @return Sexo del ciclista.
    */
   public char getSexo(){
       return this.sexo;
   }
   
   /**
    * Retorna la categoria del ciclista.
    * @return Cantegoria del ciclista.
    */
   public String getCategoria(){
       return this.categoria;
   }
   
   /**
    * Retorna la especialidad del ciclista.
    * @return Especialidad del ciclista.
    */
   public String getEspecialidad(){
       return this.especialidad;
   }
   
   /**
    * Retorna el rendimiento del ciclista.
    * @return Rendimiento del ciclista.
    */
   public int getRendimiento(){
       return this.rendimiento;
   }
}