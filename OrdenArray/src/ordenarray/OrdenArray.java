package ordenarray;
import java.util.*;
public class OrdenArray {
    static Scanner teclado = new Scanner (System.in);
    static int arreglo[ ], x, posi, aux;
public static void main(String[] args) {
    
    ordenArray();
}
    public static void ordenArray(){
        System.out.println(" Inserta el numero de elementos: ");
        x = teclado.nextInt();
        
        arreglo = new int [x];
        
        System.out.println("Digite el arreglo: ");
        for (int i=0; i<x; i++){
            System.out.print((i+1)+" Digite un numero: ");
            arreglo [i] = teclado.nextInt();
        }
        for (int i=0; i<x; i++){
            posi = i;
            aux = arreglo[i];
            
            while ((posi>0) && (arreglo[posi-1] > aux)){
                arreglo [posi] = arreglo [posi-1];
                posi--;
            }
            arreglo [posi] = aux;
        }
        System.out.print(" ");
        
        System.out.println("\nOrden mayor a menor: ");
        for (int i=(x-1);i>=0;i--){
            System.out.print(arreglo [i]+ ", ");
            
        }
    } 
}