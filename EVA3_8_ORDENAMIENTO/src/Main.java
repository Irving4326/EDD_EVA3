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
    static final int MAX_LEVELS = 1000000;
    public static void main(String[] args) {
        // TODO code application logic here
        System.nanoTime();   //Mil millonesimas de segundos
        long iIni, iFin, iResu;
        int x =0;
        int [] aiDatos = new int [1000000];
        int [] aiCopia = new int[aiDatos.length];
        int [] aiCopia1 = new int[aiDatos.length];
        int [] aiCopia2 = new int[aiDatos.length];
        
        
        
    while(x!=2){
        
        
        for (int i = 0; i < aiDatos.length; i++) {
            
            aiDatos[i] = (int)(Math.random() * 1000) +1;
            aiCopia[i] = aiDatos[i];
            aiCopia1[i] = aiDatos[i];
            aiCopia2[i] = aiDatos[i];
        }
        
        
        
        System.out.println("---------- Ordenado " +x+ " --------------");
        System.out.println("");
        
        
      
        /*
        System.out.println("SelectionSort");
        iIni = System.nanoTime();
        selectionSort(aiDatos);
        iFin = System.nanoTime();
        iResu = iFin - iIni;
        igual(aiDatos);
        System.out.println("El tiempo es ----> "  + iResu);
        imprimir(aiDatos);
        
     
        System.out.println("");
        System.out.println("InsertionSort");
        iIni = System.nanoTime();
        insertionSort(aiCopia);
        iFin = System.nanoTime();
        iResu = iFin - iIni;
        
        System.out.println("El tiempo es ----> "  + iResu);
        imprimir(aiCopia);
     
        
        System.out.println("");
        
        System.out.println("Buuble sort");
        iIni = System.nanoTime();
        buubleSort(aiCopia1);
        iFin = System.nanoTime();
        iResu = iFin - iIni;
        
        System.out.println("El tiempo es ----> "  + iResu);
        System.out.println("");
       imprimir(aiCopia1);
        */
        
        
        System.out.println("Quicksort");
        iIni = System.nanoTime();
        quickSort(aiCopia2, MAX_LEVELS);
        iFin = System.nanoTime();
        iResu = iFin - iIni;
        
        System.out.println("El tiempo es ----> "  + iResu);
        System.out.println("");
        
        x++;

        
       
    }
        
        
        
    }
    
    
    
    public static void igual(int[] aiDatos){
            int iCont=0;
            for (int i = 0; i < aiDatos.length; i++) {
            
            for (int j = i+1 ; j < aiDatos.length; j++) {
                if(aiDatos[j] == aiDatos[i]){
                iCont++;
                }
            }
            
            }
                System.out.println("Los numeros repetidos son = " +iCont);
            }
    
    // Eficiencia es o(n^2)
    public static void selectionSort(int[] aiDatos){    //Menos intercambios mas comparaciones    o(n)    o(n^2)
        for (int i = 0; i < aiDatos.length; i++) {
            int iMin = i;
            for (int j = i+1 ; j < aiDatos.length; j++) {
                if(aiDatos[j] < aiDatos[iMin]){
                iMin =j;
                }
            }
            
            if(iMin != i){
            int iTemporal = aiDatos[i];
            aiDatos[i] = aiDatos[iMin];
            aiDatos[iMin] = iTemporal;
            }
        }
    
    }
    
    public static void imprimir(int[] aiDatos){
     for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("[" +aiDatos[i] + "]");
        }
    
    }
   
            public static void insertionSort(int[] aiDatos){  //Hace menos comparaciones pero mas intercambios    O(N)           O(N^2)
                int temp;
                for (int i = 1; i < aiDatos.length; i++) {   
                   
                    for (int j = i; j > 0; j--) {
                        if(aiDatos[j] < aiDatos[j-1]){
                           temp = aiDatos[j];
                           aiDatos[j] = aiDatos[j-1];
                           aiDatos[j-1] = temp;
                        } 
                    }           
                }
            }
            
            
            //Booble  o(N^) En comparacion y en intercambios
            public static void buubleSort(int [] aiDatos){
                int temp;
                for (int i = 0; i < aiDatos.length; i++){
         
                    for (int j = i+1 ; j < aiDatos.length; j++) {
                        
                    if(aiDatos[i] > aiDatos[j]){
                    temp= aiDatos[i];
                    aiDatos[i] = aiDatos[j];
                    aiDatos[j] = temp;
                                               }
                        
                                                                }
                    
                                                        }
                                                        }
            
            //Quicksort   O(N^2)   ---> n^log n    
            //Mergesort    (N log(n))
            
public static boolean quickSort(int[] arr, int elements) {
    int i=0,L,R,pivot;
    int[] beg = new int[MAX_LEVELS], end = new int[MAX_LEVELS];
    beg[0]=0;
    end[0]=elements;
    while(i>=0) {
        L=beg[i];
        R=end[i]-1;
        if(L<R) {
            pivot=arr[L]; if(i==MAX_LEVELS-1) return false;
            while(L<R) {
                while(arr[R]>=pivot&&L<R) R--; if(L<R) arr[L++]=arr[R];
                while(arr[L]<=pivot&&L<R) L++; if(L<R) arr[R--]=arr[L];
            }
            arr[L]=pivot;
            beg[i+1]=L+1;
            end[i+1]=end[i];
            end[i++]=L;
        } else {
            i--;
        }
    }
    return true;
}


public static void ordenacionRapida(int vec[]){
                final int N=vec.length;
                quickSort1(vec, 0, N-1);
        }
        
        public static void quickSort1(int vec[], int inicio, int fin){
                if(inicio>=fin) return;
                int pivote=vec[inicio];
                int elemIzq=inicio+1;
                int elemDer=fin;
                while(elemIzq<=elemDer){
                        while(elemIzq<=fin && vec[elemIzq]<pivote){
                                elemIzq++;
                        }
                        while(elemDer>inicio && vec[elemDer]>=pivote){
                                elemDer--;
                        }
                        if(elemIzq<elemDer){
                                int temp=vec[elemIzq];
                                vec[elemIzq]=vec[elemDer];
                                vec[elemDer]=temp;
                        }
                }
                
                if(elemDer>inicio){
                        int temp=vec[inicio];
                        vec[inicio]=vec[elemDer];
                        vec[elemDer]=temp;
                }
                quickSort1(vec, inicio, elemDer-1);
                quickSort1(vec, elemDer+1, fin);
        }
}
