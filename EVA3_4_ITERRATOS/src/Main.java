
import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<Integer> aiDatos = new ArrayList();
        aiDatos.add(100);
        aiDatos.add(200);
        aiDatos.add(300);
        aiDatos.add(400);
        aiDatos.add(500);
        //Imprimir cada uno
        
        for (int i = 0; i < aiDatos.size(); i++) {
            for (int j = 0; j < aiDatos.size(); j++) {
                
            }  
        }
        
        System.out.println("Usando interator");
        for (Iterator<Integer> iterator = aiDatos.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();  
            System.out.println("[" +next + "]");
            
            
        }
        System.out.println("Usando interator");
        Iterator itMitera = aiDatos.iterator();
        while(itMitera.hasNext()){
            System.out.println("[" + itMitera.next() + "]");
        }
        
        
        
    }
    
}
