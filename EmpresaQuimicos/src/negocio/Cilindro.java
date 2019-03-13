
package negocio;

/**
 *
 * @author Mosqueteros
 */
public class Cilindro extends Envase{
    private float diametroBase;
    private float altura;
    
    public Cilindro(int cod, float pesoV, float diametroBase, float altura){
        super(cod, pesoV);
        this.diametroBase=diametroBase;
        this.altura=altura;
    }
    
    //Constructor copia
    public Cilindro(Cilindro cil){
        super(cil);
        diametroBase=cil.diametroBase;
        altura=cil.altura;
    }
    
    public float getDiametroBase() {
        return diametroBase;
    }

    public float getAltura() {
        return altura;
    }

    public void setDiametroBase(float diametroBase) {
        this.diametroBase = diametroBase;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString(){
        return super.toString()+", Forma del envase: Cilindro, dimencion de la base: "+diametroBase+"cm, Altura: "+altura+"cm";
    }
    
    private float radio(){
        return diametroBase/2;
    }
    private float supBaseCilindro(){
        return (float)(Math.PI*Math.pow(radio(),2)); 
    }
    
    @Override
    public float volumen(){
        return altura*supBaseCilindro();
    }
    
   
}
