
package negocio;

/**
 *
 * @author Mosqueteros
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Sustancia sust1,sust2,sust3,sust4=null;
        sust1=new Sustancia("Monomero",10);
        sust2=new Sustancia("Thiner",12);
        sust3=new Sustancia(sust1);
        System.out.println(sust1);
        System.out.println(sust2);
        System.out.println(sust3);
        System.out.println(sust4);
        sust3.setNombre("Resina");
        sust3.setDensidad(20);
        System.out.println("\n"+sust1);
        System.out.println(sust2);
        System.out.println(sust3);
        System.out.println(sust4);
        
        Cubo cub1,cub2,cub3,cub4;
        cub1=new Cubo(1, 50, 10);
        cub2=new Cubo(2, 70, 15);
        cub3=new Cubo(cub1);
        System.out.println("\n"+cub1.todosLosDatos());
        System.out.println(cub2.todosLosDatos());
        System.out.println(cub3.todosLosDatos());
        cub1.setSustancia(sust1);
        cub2.setSustancia(sust2);
        cub3.setSustancia(sust3);
        System.out.println("\n"+cub1.todosLosDatos());
        System.out.println(cub2.todosLosDatos());
        System.out.println(cub3.todosLosDatos());
        cub3.setCodigo(3);
        cub3.setLado(20);
        cub3.setPesoVacio(80);
        System.out.println("\n"+cub1.todosLosDatos());
        System.out.println(cub2.todosLosDatos());
        System.out.println(cub3.todosLosDatos());
        
        Cilindro cil1,cil2,cil3,cil4;
        cil1=new Cilindro(6, 40, 10, 30);
        cil2=new Cilindro(7, 80, 20, 10);
        cil3=new Cilindro(cil1);
        System.out.println("\n"+cil1.todosLosDatos());
        System.out.println(cil2.todosLosDatos());
        System.out.println(cil3.todosLosDatos());
        
        cil1.setSustancia(sust1);
        cil2.setSustancia(sust2);
        cil3.setSustancia(sust3);
        System.out.println("\n"+cil1.todosLosDatos());
        System.out.println(cil2.todosLosDatos());
        System.out.println(cil3.todosLosDatos());
        
        Caja caj1,caj2,caj3,caj4;
        caj1=new Caja(1,200000);
        caj2=new Caja(2,300000);
        caj3=new Caja(caj1);
        System.out.println("\n"+caj1.todosLosDatos());
        System.out.println(caj2.todosLosDatos());
        System.out.println(caj3.todosLosDatos());
        caj3.setCodigo(3);
        caj3.setResistencia(400000);
        System.out.println(caj1.todosLosDatos());
        System.out.println(caj2.todosLosDatos());
        System.out.println(caj3.todosLosDatos());
        
        System.out.println("Agregando a caja 1 cub1: "+caj1.addEnvase(cub1));
        System.out.println(caj1.todosLosDatos());
        System.out.println("Agregando a caja 1 cub3: "+caj1.addEnvase(cub3));
        System.out.println(caj1.todosLosDatos());
        System.out.println("Agregando a caja 1 cub3: "+caj1.addEnvase(cub3));
        System.out.println(caj1.todosLosDatos());
        
        System.out.println("Agregando a caja 2 cub2: "+caj2.addEnvase(cub2));
        System.out.println(caj2.todosLosDatos());
        System.out.println("Agregando a caja 2 cil1: "+caj2.addEnvase(cil1));
        System.out.println(caj2.todosLosDatos());
        System.out.println("Agregando a caja 2 cil2: "+caj2.addEnvase(cil2));
        System.out.println(caj2.todosLosDatos());
        
        System.out.println("Agregando a caja 3 cub3: "+caj3.addEnvase(cub3));
        System.out.println(caj3.todosLosDatos());
        System.out.println("Agregando a caja 3 cil 2: "+caj3.addEnvase(cil2));
        System.out.println(caj3.todosLosDatos());
        System.out.println("Agregando a caja 3 cil 3: "+caj3.addEnvase(cil3));
        System.out.println(caj3.todosLosDatos());
        
        System.out.println("\neliminando envase de caja 3"+caj3.removeEnvase());
        System.out.println(caj3.todosLosDatos());
        System.out.println("eliminando envase 7 de caja 3"+caj3.removeEnvase(7));
        System.out.println(caj3.todosLosDatos());


        
        
    }
    
}
