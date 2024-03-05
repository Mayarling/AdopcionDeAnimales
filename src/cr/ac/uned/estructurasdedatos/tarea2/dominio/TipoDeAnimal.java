package cr.ac.uned.estructurasdedatos.tarea2.dominio;

/**
 * Esta clase es para el tipo de animal.
 * 
 * @author MAyarling Martinez
 */
public class TipoDeAnimal {
    // Aqui se indican los atributos del objeto TipoDeAnimal.
    private int idAnimal;
    private String descripcion;
    
    /**
     * Se crea un n uevo objeto de tipo TipoDeAnimal.
     */
    public TipoDeAnimal(){
        this.idAnimal = 0;
        this.descripcion = "";
    }
    
    /**
     * Nuevo objeto de tipo TipoDeAnimal
     * @param idAnimal
     * @param descripcion 
     */
    public TipoDeAnimal(int idAnimal, String descripcion){
        this.idAnimal = idAnimal;
        this.descripcion = descripcion;   
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
