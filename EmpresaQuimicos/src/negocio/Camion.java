
package negocio;

import java.util.ArrayList;

/**
 *
 * @author Mosqueteros
 */
public class Camion {
    private String marca;
    private ArrayList<Caja> cajas;
    
    public Camion(){
        marca="Sin Marca";
        cajas=new ArrayList(5);
    }
    
    public Camion(String marca){
        this.marca=marca;
        cajas=new ArrayList(5);
    }
    
    //Constructor Copia
    public Camion(Camion cam){
        marca=cam.marca;
        cajas=new ArrayList(cam.cajas);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String toString(){
        String aux2, aux="Datos del Camion:\nMarca: "+marca+"\nDatos de la carga de cajas:";
        aux2=aux;
        for(Caja iter:cajas)
            aux+="\n"+iter.toString();
        if(aux.equals(aux2))
            aux+="\nEl camion aun no tiene cajas cargadas";
        return aux;
    }
    
    public String todosLosDatos(){
        String aux2, aux="Datos del Camion:\nMarca: "+marca+"\nDatos de la carga de cajas:";
        aux2=aux;
        for(Caja iter:cajas)
            aux+="\n"+iter.todosLosDatos();
        if(aux.equals(aux2))
            aux+="\nEl camion aun no tiene cajas cargadas";
        return aux+"\nOtros datos de la carga: Peso total: "+pesoTotalCarga()+", Cant. cubos: "+cantEnvasesTipoCubo()+", Cant. cilindros: "+cantEnvasesTipoCilibdro()+", Diametro promedio de los cilindros: "+diametroPromedioCilindros();
    }
    
    public boolean addCaja(Caja caja){
        boolean res=false;
        if(cajas.size()<5)
            res=cajas.add(caja);
        return res;
    }
    
    private Caja buscarCaja(int cod){
        Caja cajaBuscada=null;
        for(Caja iter:cajas)
            if(iter.getCodigo()==cod)
                cajaBuscada=iter;
        return cajaBuscada;
    }
    
    public boolean removeCaja(int cod){
        boolean res=false;
        Caja cajaARemover=buscarCaja(cod);
        if(cajaARemover!=null)
            res=cajas.remove(cajaARemover);
        return res;
    }
    
    public Caja removePrimerCaja(){
        Caja cajaRemovida=null;
        if(!cajas.isEmpty())
            cajaRemovida=cajas.remove(0);
        return cajaRemovida;
    }
    
    public float pesoTotalCarga(){
        float pesoT=0f;
        for(Caja iter:cajas)
            pesoT+=iter.pesoTotal();
        return pesoT;
    }
    
    public int cantEnvasesTipoCubo(){
        int cant=0;
        for(Caja iter:cajas)
            cant+=iter.cantEnvasesTipoCubo();
        return cant;
    }
    
    public int cantEnvasesTipoCilibdro(){
        int cant=0;
        for(Caja iter:cajas)
                cant+=iter.cantEnvasesTipoCilibdro();
        return cant;
    }
    
    public float diametroPromedioCilindros(){
        float prom=0f;
        float acumPromDiam=0f;
        float diamPromCaja=0f;
        int cantCajasConCilindros=0;
        for(Caja iter:cajas){
                diamPromCaja+=iter.diametroPromedioCilindros();
                if(diamPromCaja>0){
                    acumPromDiam+=diamPromCaja;
                    cantCajasConCilindros++;
                }
            }
        if(cantCajasConCilindros>0)
            prom=acumPromDiam/cantCajasConCilindros;
        return prom;
    }
    
}
