package Ejercicio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        
        for (int i=0; i<=10; i++){
        System.out.println("¿Que medio de desplazamiento usa su vehiculo?"
                + "\n1.Tierra"
                + "\n2.Agua"
                + "\n3.Aire");
        int desplazamiento=entrada.nextInt();
        
        switch (desplazamiento){
        
        case 1:
          System.out.println("Cuantas ruedas tiene su vehiculo: ");
           int Nruedas=entrada.nextInt();
           
           if (Nruedas>4){
               entrada.nextLine();
               System.out.println("Ingresa el destino de esta vehiculo: ");
               String destino = entrada.nextLine();
               Autobus A = new Autobus(destino, Nruedas, Nruedas, desplazamiento, Nruedas);
               A.MostrarDatos4();
           }
           if(Nruedas==2){
               entrada.nextLine();
               System.out.println("Ingrese el modelo del vehiculo: ");
               String modelo = entrada.nextLine();
               Moto M = new Moto(modelo, Nruedas, Nruedas, desplazamiento, Nruedas);
               M.MostrarDatos5();
           }
           if(Nruedas==4){
               System.out.println("Ingrese el numero de puertas que tiene: ");
               int puertas= entrada.nextInt();
               Carro a = new Carro(puertas, puertas, Nruedas, desplazamiento, puertas);
               a.puertas();
        }
           
           if (Nruedas==1 || Nruedas==3){
               System.out.println("No existe ningun vehiculo con ese numero de ruedas");
           }
        break;
        
        case 2: 
           System.out.println("Ingrese cuantos pasajeros puede transportar: ");
            int Npasajeros=entrada.nextInt();
             
            if (Npasajeros>=3){
                System.out.println("Ingrese su altura: ");
                int altura=entrada.nextInt();
               Barco B= new Barco(altura, Npasajeros, altura, desplazamiento, altura);
               B.MostrarDatos2();
            }
            entrada.nextLine();
            if (Npasajeros<=2){
                System.out.println("Ingrese que tipo de motor usa: ");
                String motor=entrada.nextLine();
                Lancha L = new Lancha(motor, Npasajeros, Npasajeros, desplazamiento, Npasajeros);
                L.MostrarDatos3();
            }
        break;
        
        case 3:
            System.out.println("Su vehiculo es de uso comercial"
                    + "\n 1.Sí"
                    + "\n 2.No");
            int estatus=entrada.nextInt();
             if( estatus==2){
                entrada.nextLine();
                System.out.println("Ingrese la compañia de su vehiculo");
                String compa = entrada.nextLine();
                Avion av = new Avion(compa, estatus, estatus, desplazamiento, estatus);
                av.MostrarDatos7();
            }
            if (estatus==1){
                System.out.println("Ingrese hasta que altura puede llegar su vehiculo(en metros): ");
                int altitud=entrada.nextInt();
                Helicoptero H = new Helicoptero(altitud, estatus, estatus, desplazamiento, estatus);
                H.MostrarDatos6();
            }
           
        break;
            
            
    }
        }
    }
}
