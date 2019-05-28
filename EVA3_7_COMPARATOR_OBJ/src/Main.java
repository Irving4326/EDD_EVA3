
import java.util.Comparator;
import java.util.Iterator;
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
        LinkedList<Persona> llObjetos = new LinkedList();
        
        llObjetos.add(new Persona( "A", " G", 19));
        llObjetos.add(new Persona( "B", " H", 20));
        llObjetos.add(new Persona( "C", " I", 30));
        llObjetos.add(new Persona( "D", " J", 12));
        llObjetos.add(new Persona( "E", " K", 58));
        llObjetos.add(new Persona( "F", " L", 58));
        
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();
            System.out.println("Nombre" + next.getNombre());
            System.out.println("Apellido" + next.getApellido());
            System.out.println("Edad" + next.getEdad());
            System.out.println("-----------------");
            
        }
        
        //Ordenamiento por edad
        Comparator cEdad = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Persona iVal1 = (Persona) o1;
                Persona iVal2 = (Persona) o2;
                return iVal1.getEdad() - iVal2.getEdad();
            }
        };
        
      llObjetos.sort(cEdad);
        System.out.println("Orden");
        System.out.println("-------------------");
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();
            System.out.println("Nombre" + next.getNombre());
            System.out.println("Apellido" + next.getApellido());
            System.out.println("Edad" + next.getEdad());
            System.out.println("-----------------");
            
        }
        
        
        
        //Apellido
        Comparator cApeNom = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Persona iVal1 = (Persona) o1;
                Persona iVal2 = (Persona) o2;
                
               int iResu;
                char c1,c2;
               c1 = iVal1.getApellido().charAt(0);
               c2 = iVal2.getApellido().charAt(0);
               
              iResu = c1 -c2;
               
               
               if(iResu == 0){
                   
               char Nom1,Nom2;
               Nom1 = iVal1.getNombre().charAt(0);
               Nom2 = iVal2.getNombre().charAt(0);
               iResu = Nom1 - Nom2;
               
               
               }
                return iResu;
            }
        };
        
        
        
        System.out.println("");
        llObjetos.sort(cApeNom);
        System.out.println("Orden");
        System.out.println("-------------------");
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();
            System.out.println("Nombre" + next.getNombre());
            System.out.println("Apellido" + next.getApellido());
            System.out.println("Edad" + next.getEdad());
            System.out.println("-----------------");
            
        }
        
       
    }
    
}
class Persona{

private String nombre;
private String apellido;
private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }





}