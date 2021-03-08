package suma2numeros;

import java.util.Scanner;

/**
 *
 * @author Monroy Vazquez Luis Antonio
 */
public class Suma2Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, res=0;
        System.out.println("Ingrese su primer valor: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese su segundo valor: ");
        num2 = sc.nextInt();
        
        res = num1+num2;
        System.out.println("La suma de sus 2 valores es: "+res);
    }
    
}
