package ordennumeroa;

import java.util.Random;

public class OrdenNumeroa {
 public static int ArrayRandom[] = new int[20];
    public static Random aleatorio = new Random();
    public static void main(String[] args) {
        
       
         for (int i=0; i<ArrayRandom.length; i++) {
            ArrayRandom[i] = aleatorio.nextInt(100 - 0 + 1) + 0;
        }
        
        System.out.println("\nNúmeros random: ");
        for (int i=0; i<20; i++) {
            System.out.print(ArrayRandom[i]+", ");
        }
        System.out.println();
        System.out.println("Array Ordenado");
         
        for (int i=0; i<20; i++) {
            if (ArrayRandom[i]%2==0) {
                System.out.print(ArrayRandom[i]+", ");
                
            }
        }
        for (int i=0; i<20; i++) {
            if (ArrayRandom[i]%2!=0) {
                System.out.print(ArrayRandom[i]+", ");
            }
        }
        SeparaParesImpares();
        
       
    }      
    public static void SeparaParesImpares() {
        System.out.println("\nNúmeros pares: ");
        for (int i=0; i<20; i++) {
            if (ArrayRandom[i]%2==0) {
                System.out.print(ArrayRandom[i]+", ");
            }
        }
        System.out.println("");
        System.out.println("Números impares: ");
        for (int i=0; i<20; i++) {
            if (ArrayRandom[i]%2!=0) {
                System.out.print(ArrayRandom[i]+", ");
            }
        }
    }
    
}
