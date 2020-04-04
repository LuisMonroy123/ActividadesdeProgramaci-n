package matriz_2;
import java.util.Scanner;
public class Matriz_2 {
public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
          
          int n,m;

     System.out.println("Ingrese un numero de filas : ");
    n=entrada.nextInt();
    System.out.println("Ingrese un numero de columnas: ");
    m=entrada.nextInt();

char matriz[][] = new char [n][m];
 
    for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz.length; j++){
            if (i+j<matriz.length-1 || i+j>matriz.length-1){
                matriz[i][j] = 'x';
            }
                else{
                        matriz[i][j] = ' ';
                        }
            
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
