
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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
       Stack<Integer> stPila = new Stack();
       stPila.push(100);
       stPila.push(22400);
       stPila.push(400);
       stPila.push(425);
       stPila.push(1);
        System.out.println(stPila);
        System.out.println(stPila.peek());
        System.out.println(stPila);
        System.out.println(stPila.pop());
        System.out.println(stPila);
        System.out.println(stPila.peek());
        
        //Colas --- QUEUE
        
        Queue<Integer> qCola = new LinkedList();
        qCola.add(100);
        qCola.add(200);
        qCola.add(300);
        qCola.add(400);
        qCola.add(500);
        qCola.add(600);
        System.out.println("-----QUEUE-----");
        System.out.println(qCola);
        System.out.println(qCola.peek());
        System.out.println(qCola);
        System.out.println(qCola.poll());
        System.out.println(qCola);
        
        
        //SETS ----- CONJUNTOS--------> No hay elementos repetidos
        Set<Integer> stMiConjunto = new LinkedHashSet<>();
        stMiConjunto.add(100);
        stMiConjunto.add(200);
        stMiConjunto.add(300);
        stMiConjunto.add(400);
        stMiConjunto.add(100);
        stMiConjunto.add(200);
        
        System.out.println("-------SET--------");
        System.out.println(stMiConjunto);
        
       Collections.sort(stPila);
        for (Integer numero: stPila) {
            System.out.println(numero);
        }
    }
    
}
