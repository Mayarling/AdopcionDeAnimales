package cr.ac.uned.estructurasdedatos.tarea2.dominio;

import java.util.UUID;

/**
 * Esta clase para la adopcion.
 * 
 * @author Mayarling Martinez
 */
public class Adopcion {
    // Aqui se indican los atributos del objeto Adopcion.
    private UUID dni;
    private String nombre;
    private boolean certificadoDeRaza;
    private String domicilio;
    private double costo;
    
    /**
     * Se crea un objeto de tipo Adopcion.
     */
    public Adopcion(){
        this.dni = UUID.randomUUID();
        this.nombre = "";
        this.certificadoDeRaza = false;
        this.domicilio = "";
        this.costo = 0;
    }
    
    /**
     * Nuevo objeto de tipo de Adopcion
     * @param nombre
     * @param certificadoDeRaza
     * @param domicilio
     * @param costo 
     */
    public Adopcion(String nombre, boolean certificadoDeRaza, String domicilio, double costo){
        this.dni = UUID.randomUUID();
        this.nombre = nombre;
        this.certificadoDeRaza = certificadoDeRaza;
        this.domicilio = domicilio;
        this.costo = costo; 
    }

    public UUID getDni() {
        return dni;
    }

    public void setDni(UUID dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCertificadoDeRaza() {
        return certificadoDeRaza;
    }

    public void setCertificadoDeRaza(boolean certificadoDeRaza) {
        this.certificadoDeRaza = certificadoDeRaza;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
   
}
