
package negocio;

/**
 *
 * @author Mosqueteros
 */
public abstract class Envase {
    private int codigo;
    private float pesoVacio;
    private Sustancia sustancia;
    
    public Envase(int cod, float pesoV){
        codigo=cod;
        pesoVacio=pesoV;
        sustancia=null;
    }
    
    //Contructor copia
    public Envase(Envase env){
        codigo=env.codigo;
        pesoVacio=env.pesoVacio;
        sustancia=env.sustancia;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPesoVacio(float pesoVacio) {
        this.pesoVacio = pesoVacio;
    }

    public void setSustancia(Sustancia sustancia) {
        this.sustancia = sustancia;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getPesoVacio() {
        return pesoVacio;
    }

    public Sustancia getSustancia() {
        return sustancia;
    }
    
    @Override
    public String toString(){
        String aux="Codigo: "+codigo+", Peso vacio: "+pesoVacio+"g, DATOS DE LA SUSTANCIA: ";
        if(sustancia!=null)
            aux+=sustancia.toString();
        else
            aux+="El envace aun esta vacio";
        return aux;
    }
    
    public abstract float volumen();
    
    public float pesoLleno(){
        return pesoVacio+volumen()*sustancia.getDensidad();
    }
    
    public String todosLosDatos(){
        return toString()+"\n\tOtros datos: Volumen: "+volumen()+", Peso lleno: "+pesoLleno();
    }
    
    
}
