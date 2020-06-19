package matriz5;

import java.util.Scanner;

public class Matriz5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Tamaño del arreglo i: ");
        int x = sc.nextInt();
        System.out.print("Tamaño del arreglo j: ");
        int y = sc.nextInt();
        
        int arr1[] = new int[x];
        int arr2[] = new int[y];
        int mult[] = new int[x+y];
       
        for (int i=0; i<x; i++) {
               System.out.print(arr1[i]+i+ "   ");
        }
        
        System.out.println("");
        
        for (int j=1; j<y; j++) {
            System.out.print(arr2[j]+j+" "+""+" ");
            
            for (int i=1; i<x; i++) {
                mult[i] = (arr1[i]+i) * (arr2[j]+j);
                if(((arr1[i]+i) * (arr2[j]+j)) <10){
                System.out.print(mult[i]+" "+"  ");
                }
                else{
                System.out.print(mult[i]+" "+" ");
                }
            }
            System.out.println("");
        }
    }
    
}
