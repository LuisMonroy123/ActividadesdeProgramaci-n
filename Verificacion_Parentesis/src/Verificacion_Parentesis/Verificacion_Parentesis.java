package Verificacion_Parentesis;

import java.util.Scanner;
import java.util.Stack;
public class Verificacion_Parentesis {
    Scanner sc = new Scanner(System.in);
    /*Aqui pedimos al usuario la cadena de parentesis y la guardamos
    en la variable cadena*/
  public String cadena=sc.nextLine();
  /* Este es un metodo de pila, lo cual hace que vaya guardando
  cada valor que ingresemos en forma de pila*/
  public Stack<Character> parentesis = new Stack<Character>();
    /*Creamos un metodo en la cual va a verificar que los 
  parentesis que ingrese el usuario se cumple la condicion o no*/
    public void verificacion(){
      /*Aqui creamos la pila y va a ser de tipo array*/
      char pila[]=cadena.toCharArray();
      
      /*Aqui creamos un ciclo for en la cual va a repetirse 
      dependiendo del tamaño de la pila*/
        for (int i = 0; i <pila.length; i++) {
            
            /*Creamos un if en la cual va a verificar si el parentesis
            es de abrir*/
            
            if (pila[i]=='('||pila[i]=='['||pila[i]=='{') {
            /*Aqui usammos el metodo push en la cual hace
            que si se cumple la condicion pasemos a la siguiente posicion*/
            parentesis.push(cadena.charAt(i));
            }
            /*Aqui verificamos si el parentesis es de cierre*/
            else if(pila[i]==')'||pila[i]==']'||pila[i]=='}'){
                /*En este if se va a ver si la pila esta llena o no*/
                if (!parentesis.empty()) {
                    /*Aqui lo que hace es eliminar los valores*/
                    parentesis.pop();
                }
            }
        } 
        /*Aqui agregamos un if en la cual vemos si es que la pila
        esta vacia o no, si si lo esta la cadena es correcta de 
        lo contrario esta sera falsa*/
        if (parentesis.empty()) {
            System.out.println("La cadena es correcta");
        }
        else{
            System.out.println("La cadena es incorrecta");
        }
    }
    public static void main(String[] args) {    
    
        Scanner sc = new Scanner (System.in);
        int opc;
        
        do {            
            
            System.out.println("\n1. Ingresar cadena"
                    + "\n2. Salir");
            
            switch(opc=sc.nextInt()){
                case 1:
       System.out.println("Ingrese los parentesis");
        /*Aqui mandamos a llamar el metodo que creamos, creando un
        objeto*/
      Verificacion_Parentesis x = new Verificacion_Parentesis();
       x.verificacion();
                break;
        }
            
        } while (opc!=2);
    
    
}
}
