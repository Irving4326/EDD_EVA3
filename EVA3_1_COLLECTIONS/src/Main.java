
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iVal = 10;
        Integer iValObj = 10;
        iValObj = iValObj + iVal;
        ArrayList<Double> alMiArrayList = new ArrayList();    
        alMiArrayList.add(43.3);
        alMiArrayList.add(13.3);
        alMiArrayList.add(123.3);
        alMiArrayList.add(3.1316);
        
        for (int i = 0; i < alMiArrayList.size(); i++) {
            System.out.println("[" + alMiArrayList.get(i) + "]");
        }
        
        /*
        alMiArrayList.add("Hola mundo");
        alMiArrayList.add(7.0);
        alMiArrayList.add(true);
        alMiArrayList.get(0); */
        
        LinkedList<Integer> miListaEnlazada = new LinkedList();
        miListaEnlazada.add(10);
        miListaEnlazada.add(20);
        miListaEnlazada.add(30);
        miListaEnlazada.add(40);
        miListaEnlazada.add(50);
        System.out.println("Mi lista enlazada");
        System.out.println(miListaEnlazada);
        for (int i = 0; i < miListaEnlazada.size(); i++) {
            System.out.println(miListaEnlazada.get(i));
        }
        miListaEnlazada.remove(3);
        System.out.println(miListaEnlazada);
    }
    
}
