/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.LinkedList;

/**
 *
 * @author Mosqueteros
 */
public class Caja {
    private int codigo;
    private float resistencia;
    private LinkedList<Envase> envases=null;
    
    public Caja(int cod, float resis){
        codigo=cod;
        resistencia=resis;
        envases=new LinkedList();
    }
    
    //Constructor copia 
    public Caja(Caja caja){
        codigo=caja.codigo;
        resistencia=caja.resistencia;
        envases=new LinkedList(caja.envases);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getResistencia() {
        return resistencia;
    }

    public void setResistencia(float resistencia) {
        this.resistencia = resistencia;
    }
    
    @Override
    public String toString(){
        String aux2, aux="Caja codigo: "+codigo+", Resistencia: "+resistencia+"gr, Datos de los ENVASES:";
        aux2=aux;
        for(Envase iter:envases)
            aux+="\n"+iter.toString();
        if(aux.equals(aux2))
            aux+="\nLa caja aun no tiene envases en su interior";
        return aux;
    }
    
    public String todosLosDatos(){
        String aux2, aux="Caja codigo: "+codigo+", Resistencia: "+resistencia+"gr, Datos de los ENVASES:";
        aux2=aux;
        for(Envase iter:envases)
            aux+="\n"+iter.todosLosDatos();
        if(aux.equals(aux2))
            aux+="\nLa caja aun no tiene envases en su interior";
        return aux+"\nOtros datos de la caja: Peso total: "+pesoTotal()+", Cant. cubos: "+cantEnvasesTipoCubo()+", Cant. cilindros: "+cantEnvasesTipoCilibdro()+", Diametro promedio de cilindros: "+diametroPromedioCilindros()+"cm\n";
    }
    
    public float pesoTotal(){
        float pesoAcum=0f;
        for(Envase iter:envases)
            pesoAcum+=iter.pesoLleno();
        return pesoAcum;
    }
    public boolean addEnvase(Envase envase){
        boolean res=false;
        if(resistencia>=pesoTotal()+envase.pesoLleno())
            res=envases.add(envase);
        return res;    
    }
    
    private Envase buscarEnvase(int cod){
        Envase env=null;
        for(Envase iter:envases)
            if(iter.getCodigo()==cod){
                env=iter;
                break;
            }
        return env;
    }
    
    public boolean removeEnvase(int cod){
        boolean res=false;
        Envase env=buscarEnvase(cod);
        if(env!=null)
            res=envases.remove(env);
        return res;
    }
    
    public Envase removeEnvase(){
        Envase env=null;
        if(envases.size()>0)
            env=envases.remove();
        return env;
    }
    
    public int cantEnvasesTipoCubo(){
        int cant=0;
        for(Envase iter:envases)
            if(iter instanceof Cubo)
                cant++;
        return cant;
    }
    
    public int cantEnvasesTipoCilibdro(){
        int cant=0;
        for(Envase iter:envases)
            if(iter instanceof Cilindro)
                cant++;
        return cant;
    }
    
    public float sumaDiametrosCilin(){
        float sumDiam=0;
        for(Envase iter:envases)
            if(iter instanceof Cilindro)
                sumDiam+=((Cilindro) iter).getDiametroBase();
        return sumDiam;
    }
    public float diametroPromedioCilindros(){
        float prom=0f;
        float acumDiam=sumaDiametrosCilin();
        int cantCil=cantEnvasesTipoCilibdro();
        if(cantCil>0)
            prom=acumDiam/cantCil;
        return prom;
    }
    
    
    
    
}
