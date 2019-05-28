
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Comparator -->  Mecanismo de ordenamiento
        LinkedList<Integer> llDatos = new LinkedList();
        llDatos.add(100);
        llDatos.add(800);
        llDatos.add(400);
        llDatos.add(500);
        llDatos.add(200);
        System.out.println(llDatos);
        Comparator cmOrden = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                //Hay que regresar 
                //positivo--> o1>o2  Se debe hacer cambios
                //Cero-->  o1=o2       Son iguales
                //Negativo-->  o1<o2    No hay Cambios
                int iVal1 = (int) o1;
                int iVal2 = (int) o2;
                return iVal1 - iVal2;
                
            }
        };
       
        
        
        llDatos.sort(cmOrden);
        System.out.println(llDatos);
               
    }
    
}
