
package getset;

import java.util.Scanner;


public class GetSet {
    public static void main(String[] args) {
        
               Scanner sc = new Scanner(System.in);
      
       
        
            int opc,num;
        System.out.println("Bienvenido al programa donde puedes ingresar "
                + "\nlos datos del empleado puedes ingresar los que quieras"
                + "\ny una vez termines de ingresar sus datos te apareceran");
        
        System.out.println("¿Cuantos empleados deseas poner?");
        num=sc.nextInt();
        String [] nombre = new String[num];
        String [] apellido = new String[num];
        int [] edad = new int[num];
        for (int i=1; i<=num; i++){
     System.out.println("Que datos desea ingresar"
                + "\n1. Nombre, apellido y edad"
                + "\n2. Nombre y edad"
                + "\n3. Nombre y Apellido");
        opc= sc.nextInt();
            switch(opc){
            case 1:
                sc.nextLine();
          System.out.println("Ingresa el nombre del empleado "+i+ ":");
          nombre[i] = sc.nextLine();
          
          System.out.println("Ingresa el apellido del empleado " +i+":");
          apellido[i] = sc.nextLine();
         
          System.out.println("Ingresa la edad del empleado "+i+":");
          edad[i] = sc.nextInt();
         Empleado a = new Empleado (nombre[i], apellido[i], edad[i]);
         a.datos1();
            break;
      
            case 2: 
        sc.nextLine();
         System.out.println("Ingresa el nombre del empleado "+i+ ":");
          nombre[i] = sc.nextLine();
          
          System.out.println("Ingresa la edad del empleado "+i+":");
          edad[i] = sc.nextInt();
         Empleado b = new Empleado (nombre[i], edad[i]);
         b.datos2();
            break;
           
            case 3:
                sc.nextLine();
          System.out.println("Ingresa el nombre del empleado "+i+ ":");
          nombre[i] = sc.nextLine();
          
          System.out.println("Ingresa el apellido del empleado " +i+":");
          apellido[i] = sc.nextLine();
          Empleado d = new Empleado (nombre[i], apellido[i]);
         d.datos3();
          break;
         
            default:
                System.out.println("Favor de ingresar una opción valida como se muestra en el menu");
                  break;
        }
         
           
        }
    }
}
    

