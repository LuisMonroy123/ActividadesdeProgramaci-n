package pilanumeros;

import java.util.Scanner;

public class PilaNumeros {
    Scanner sc = new Scanner(System.in);
    //Agregamos las variables de tope de cada pila
    public static int tope1=0,tope2=0,tope3=0;
    //Aqui declaramos el tamaño de la pila
    public int tam=sc.nextInt();
    //Creamox lo que son las pilas
    public int pila1[]=new int[tam];
    public int pila2[]=new int[tam];
    public int pila3[]=new int[tam];
   
    //Este metodo sirve para crear la pila 1
    public void pila1(){
        for (int i = 0; i < tam; i++) {
            //Aqui declaramos que los numeros seran randoms del 1 al 100
           pila1[i]= (int) (Math.random() * 100 + 1);
           tope1++;
    }
        System.out.println("Pila a llena");
    }
    //Este metodo sirve para crear la pila 2
    public void pila2(){
           for (int j = 0; j < tam; j++) {
               //Aqui declaramos que los numeros seran randoms del 100 al 200
             pila2[j]= (int) (Math.random() * (200-100)+100);
             tope2++;
        }
           System.out.println("Pila b llena");
    }
    //Este metodo sirve para que mostremos ambas pilas
    public void mostrar(){
        if(tope1!=0 && tope2!=0){
        System.out.println("Pila a:");
          for (int i=0; i<tam; i++) {
            System.out.print(pila1[i] + " ");
        }  System.out.println("\nPila b:");
        
          for (int j=0; j<tam; j++) {
           System.out.print(pila2[j] + " ");
          }
        }else{
            System.out.println("Las pilas estan vacias");
        }
    }
    public void unir(){
        //Aqui evaluamos si hay elementos en la pila
        if(tope1!=0 && tope2!=0){
        for (int i = 0; i < tam; i++) {
            //Aqui declaramos que la pila 3 sera la suma de la 1 y 2
            pila3[i]=pila1[i]+pila2[i];
            tope3++;
        }
        System.out.println("Pilas unidas");
        }
        else{
            System.out.println("No hay valores en las Pilas a y b");
        }
        
    }
    //Aqui creamos un metodo donde muestra la suma de pila 1 y 2
    public void verPila3(){
        //Aqui verificamos si la pila 3 tiene valores
        if(tope3!=0){
        System.out.println("Pila 3:");
        for (int i = 0; i < tam; i++) {
            System.out.print(pila3[i]+" ");
        }
        }
        else{
            System.out.println("No has unido las pilas a y b");
        }
    }
    //Este metodo sirve para eliminar los valores de la pila
    public void vaciar(){
        //Aqui evaluamos si las pilas tienen valores
        if(tope1>0&&tope2>0){
        for (int i = 0; i < tam; i++) {
            tope1--;
        }
        for (int i = 0; i < tam; i++) {
            tope2--;
        }
            System.out.println("Pilas a y b vaciadas");
        }
        else{
            System.out.println("No hay elementos en la pila a y b");
        }
    }
 
    
    public static void main(String[] args) {
        
        System.out.println("Ingresa el tamaño de la pila");
        
        Scanner sc = new Scanner(System.in);
        //Aqui llamamos a llamar los metodos
        PilaNumeros c= new PilaNumeros();
        int opc;
        do {            
             System.out.print("\n--------------------MENÚ--------------------"
                    + "\n1. Llenar pilas a y b"
                    + "\n2. Mostar pilas a y b"
                    + "\n3. Unir pilas (pila c)"
                    + "\n4. Mostar pila c"
                    + "\n5. Vaciar pilas"
                     + "\n6. Salir"
                    + "\n--------------------------------------------"
                    + "\n Tu respuesta:");
             switch (opc=sc.nextInt()){
                 
                 case 1:
                     c.pila1();c.pila2();
                 break;
                 case 2:
                     c.mostrar();
                 break;
                 case 3:
                     c.unir();
                 break;
                 case 4:
                     c.verPila3();
                 break;
                 case 5:
                   c.vaciar();
                 break;
                 default:
                     System.out.println("Favor de ingresar una opción valida");
                 break;
                     
             }
        } while (opc!=6);
    }
    
}
