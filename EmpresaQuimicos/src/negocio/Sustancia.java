
package negocio;

/**
 *
 * @author Mosqueteros
 */
public class Sustancia {
    private String nombre;
    private float densidad;
    
    public Sustancia(String nom, float den){
        nombre=nom;
        densidad=den;
    }
    
    //Constructor Copia
    public Sustancia(Sustancia sust){
        nombre=sust.nombre;
        densidad=sust.densidad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getDensidad() {
        return densidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDensidad(float densidad) {
        this.densidad = densidad;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+", Densidad: "+densidad+"g/cm3";
    }
    
   
}
