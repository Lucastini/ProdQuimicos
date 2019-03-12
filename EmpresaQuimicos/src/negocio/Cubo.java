
package negocio;

/**
 *
 * @author Mosqueteros
 */
public class Cubo extends Envase{
    private float lado;
    
    public Cubo(int cod, float pesoV, float lado){
        super(cod, pesoV);
        this.lado=lado;
    }
    
    //Constructor Copia
    public Cubo(Cubo cub){
        super(cub);
        lado=cub.lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }
    
    @Override
    public float volumen(){
        return (float)Math.pow(lado,3);
    }
    
    //Especificacion del metodo toString de la base
    @Override
    public String toString(){
        return super.toString()+", Forma del envase: Cuadrado, dimencion del lado: "+lado+"cm";
    }
    
    @Override
    public String todosLosDatos(){
        return super.todosLosDatos()+", Forma del envase: Cuadrado, dimencion del lado: "+lado+"cm";
    }
            
}
