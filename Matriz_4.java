import java.util.Scanner;
public class Matriz_4{
    public static void main(String []arg) {

        int i,j;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese las filas de la matriz menor a 7");

        int n=teclado.nextInt();

        System.out.println("Ingrese las columnas de la matriz menor a 7");

        int m=teclado.nextInt();

        String matriz [][]= new String [n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
               matriz[i][j]="a";
            }
        }
         for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((i==0) && (j>0) && (j<matriz.length-1)){
                    matriz[i][j]="1"; 
                }
                if((i==1) && (j>1) && (j<matriz.length-2)){
                    matriz[i][j]="1"; 
                }
                if((i==2) && (j>2) && (j<matriz.length-3)){
                    matriz[i][j]="1"; 
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((i==matriz.length-1) && (j>0) && (j<matriz.length-1)){
                    matriz[i][j]="3"; 
                }
                if((i==matriz.length-2) && (j>1) && (j<matriz.length-2)){
                    matriz[i][j]="3"; 
                }
                if((i==matriz.length-3) && (j>2) && (j<matriz.length-3)){
                    matriz[i][j]="3"; 
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((j==matriz.length-1) && (i>0) && (i<matriz.length-1)){
                    matriz[i][j]="2"; 
                }
                if((j==matriz.length-2) && (i>1) && (i<matriz.length-2)){
                    matriz[i][j]="2"; 
                }
                if((j==matriz.length-3) && (i>2) && (i<matriz.length-3)){
                    matriz[i][j]="2"; 
                }
            }
        }
         for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((j==0) && (i>0) && (i<matriz.length-1)){
                    matriz[i][j]="4"; 
                }
                if((j==1) && (i>1) && (i<matriz.length-2)){
                    matriz[i][j]="4"; 
                }
                if((j==2) && (i>2) && (i<matriz.length-3)){
                    matriz[i][j]="4"; 
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i==j){
                    matriz[i][j]="0";
                }
                if((i+j)==(n-1)){
                    matriz[i][j]="0";
                }
            }
        }
       for(i=0; i<n;i++){
        for(j=0;j<m;j++){
          System.out.print(matriz[i][j]+" ");
        }
        System.out.println();
     }

    }
}