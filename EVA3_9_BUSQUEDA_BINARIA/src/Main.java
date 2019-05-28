
import java.util.Scanner;

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
    static final int MAX_LEVELS = 20;
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner sInput = new Scanner (System.in);
        System.nanoTime();   //Mil millonesimas de segundos
        long iIni, iFin, iResu;
        int x =1;
        int [] aiDatos = new int [20];
        
         for (int i = 0; i < aiDatos.length; i++) {
            
            aiDatos[i] = (int)(Math.random() * 1000) +1;
           
        }
         imprimir(aiDatos);
        quickSort(aiDatos, MAX_LEVELS);
        System.out.println("");
        imprimir(aiDatos);
        System.out.println("");
        System.out.println("Dame el valor a buscar");
        int iVal = sInput.nextInt();
       int iPos = busquedaBinaria(aiDatos, iVal);
        if ( iPos == -1){
            System.out.println("El elemento no se encuentra");
        }else{
            System.out.println("El elemento es " + iPos);
        }
        
        
        
        
        
    }
    
    
    
       public static void imprimir(int[] aiDatos){
     for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("[" +aiDatos[i] + "]");
        }
    
    }
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
       
       public static int busquedaBinaria(int [] aiDatos, int iVal){
       
           
           
       return recurBusBinaria(aiDatos, iVal, 0, aiDatos.length -1);
       }
       private static int recurBusBinaria(int [] aiDatos, int iVal, int lo, int hi){
       int imid = lo + ((hi-lo)/2);
       int iResu =-1;
       if(aiDatos[imid] == iVal){   // Valor encontrado
       iResu = imid;
       }else{ //No esta, repetimos
       
           if(iVal < aiDatos[imid]){
               iResu = recurBusBinaria(aiDatos, iVal, lo, imid-1);
               
               
           }else{
           iResu = recurBusBinaria(aiDatos, iVal, imid+1, hi);
           
           }
           
       }
       return iResu;
       }
       
}
