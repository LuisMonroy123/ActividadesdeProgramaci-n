package matriz;
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
               int n,m;
           boolean numerocorrecto = false;
do{
    System.out.println("Ingrese un numero de filas impares: ");
    n=entrada.nextInt();
    System.out.println("Ingrese un numero de filas impares: ");
    m=entrada.nextInt();
    if (n%2 !=0 && m%2 !=0){
        numerocorrecto=true;
       }else{
        System.out.println("Por favor ingrese un numero impar");
    }    
} while(!numerocorrecto);
char matriz[][] = new char [n][m];
    for (int i=0; i<matriz.length; i++){
        for (int j=0; j<matriz.length; j++){
            if ((i==0) || (i== matriz.length-1)||(j==0)||(j==matriz.length-1)){
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
