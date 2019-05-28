/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author escritorio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista<String> miLista = new Lista();
        miLista.agregarNodo("Hola");
        miLista.agregarNodo("");
        miLista.agregarNodo("Mundo");
        miLista.agregarNodo("");
        miLista.agregarNodo("Cruel");
        miLista.agregarNodo("!!!!");
        miLista.imprimir();
        miLista.borrar("Cruel");
        miLista.imprimir();
    }
    
}
class Nodo<T>{

//Atributos datos
    private T dato;
    
    // Atributos para crear la lista (Referencia)
    private Nodo sig;
    public Nodo (){
    sig=null;
    }
    public Nodo(T dato){
    this.dato = dato;
    sig=null;
    }

    
    
    
    
    
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
}

class Lista<T>{

    //Inicio de la lista
private Nodo inicio;
private Nodo fin;
private int iCont;      

//Al crear la lista, inicia con 0 elementos
//Lista vacia:
//3 estados: Vacia, con un nodo, con N nodos

public Lista(){
inicio = null;
fin = null;
}
// Primer metodo: agregar un Nodo
// Metodo que reciba un Nodo
//Eficiencia --> O(N)
//Nueva eficiencia --> O(1) 
public void agregarNodo(T dato){
Nodo<T> nNuevo = new Nodo(dato);
//Verificar el estado de la lista:
//Esta Vacia?
if(inicio == null){ //Lista vacia
inicio = nNuevo;
fin = nNuevo;    //Modifaco -- > Mayor eficiencia
}else{
        iCont++;
        }
fin.setSig(nNuevo);
fin= nNuevo;
}
   
public void imprimir(){
Nodo nTemp = inicio;
while(nTemp != null){ //Tenemos que dejar a nTemp en el ultimo nodo y getsig tiene que ser null 
System.out.println("[" + nTemp.getDato() + "]");
nTemp = nTemp.getSig();
}
    System.out.println("");
}
public void borrar(T dato){

Nodo nTemp= inicio;
while(nTemp == dato){
    
    
nTemp = nTemp.getSig();
}
inicio = inicio.getSig();
fin = inicio.getSig();



}



}
