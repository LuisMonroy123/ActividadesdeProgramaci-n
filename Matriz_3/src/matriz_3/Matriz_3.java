package matriz_3;
import java.util.Scanner;
public class Matriz_3 {
public static void main(String[] args) {
                 Scanner entrada = new Scanner(System.in);
          
          int n,m;
     System.out.println("Ingrese un numero de filas impares: ");
    n=entrada.nextInt();
    System.out.println("Ingrese un numero de columnas impares: ");
    m=entrada.nextInt();

char matriz[][] = new char [n][m];

    for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz.length; j++){
            if (i==j || i+j==matriz.length-1){
                matriz[i][j] = 'x';
            }
                else{
                        matriz[i][j] = 'c';
                        }
            
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
