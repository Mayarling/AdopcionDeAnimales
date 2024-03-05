package cr.ac.uned.estructurasdedatos.tarea2.logica;

import cr.ac.uned.estructurasdedatos.tarea2.dominio.Adopcion;
import cr.ac.uned.estructurasdedatos.tarea2.dominio.TipoDeAnimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * Esta clase contiene la lógica para agregar y eliminar tipo de animal y para agregar y eliminar adopciones.
 * 
 * Se va a guardar los tipos de anaimal con un Stack y para la adopcion se usara un Map
 * del cual la llave será el id del tipo de animal y el valor sera un Queue de objetos Adopcion.
 * 
 * @author Mayarling Martinez
 */
public class ServicioDeAdopciones {
    // Definimos los atributos de la clase ServicioDeAdopciones.
    private Stack<TipoDeAnimal> tiposDeAnimal;
    private Map<Integer, Queue<Adopcion>> adopcionesPorTipo;
    
    /**
     * Constructor por defecto.
     */
    public ServicioDeAdopciones(){
        this.tiposDeAnimal = new Stack();
        this.adopcionesPorTipo = new HashMap();
    }
    
    /**
     * Metodo que devuelve el iterador de los tipo de animal
     * @return tipos de animal
     */
    public Iterator<TipoDeAnimal> getTiposDeAnimal() {
        return tiposDeAnimal.iterator();
    }
    
    /**
     * Método que devuelve el iterador de adopciones correspondiente al tipo de animal.
     * 
     * @param tipoDeAnimal tipo de animal
     * 
     * @return adopcion por tipo
     */
    public Iterator<Adopcion> getAdopcionesPorTipo(int tipoDeAnimal) {
        return adopcionesPorTipo.get(tipoDeAnimal).iterator();
    }
    
    public void agregarTipoDeAnimal(TipoDeAnimal tipoDeAnimal){
        // Falta por implementar
    }
    
    public void eliminarTipoDeAnimal(){
        //Falta por implenetar
    }
    
    public void agregarAdopcion(TipoDeAnimal tipoDeAnimal, Adopcion adopcion){
        //falta por implentar
    }
    
    public void eliminarAdopcion(TipoDeAnimal tipoDeAnimal){
        //falta por implementar
    }
}
