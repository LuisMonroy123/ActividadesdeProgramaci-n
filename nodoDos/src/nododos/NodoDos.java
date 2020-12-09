/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nododos;

import java.util.Scanner;

/**
 *
 * @author Monroy
 */
public class NodoDos {

    Scanner sc = new Scanner(System.in);

    /*En esta clase se crea los atributos del nodo*/
    static class Nodo {

        String dato;
        Nodo sig;
    }

    Nodo fin = null;
   
    /*Metodo para poder agregar un nodo*/
    public void agregar() {
         Nodo temp;
        String msg;
        System.out.println("agregar el dato ");
        if (fin == null) {
            fin = new Nodo();
            fin.dato = sc.nextLine();
            fin.sig = null;
        } else {
            temp = new Nodo();
            temp.dato = sc.nextLine();
            temp.sig = fin;
            fin = temp;
        }
    }

    /*Metodo para mostrar el nodo*/
    public void mostrar() {
        Nodo actual = new Nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                System.out.print(" DATO " + "[" + actual.dato + "]");
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }

    /*Metodo para eliminar el ultimo y el primer nodo*/
    public void eliminar() {
        
        if (fin != null) {
            //Le asignamos al Nodo Fin el valor null de fin.sig
            fin = fin.sig;
            /*Le asignamos un valor null a fin.sig para que elimine
            el primer dato*/
            fin.sig = null;
            
        } else {
            System.out.println("No hay elementos por eliminar");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        NodoDos n = new NodoDos();
        do {
            System.out.println("\n1 add \n"
                    + "2 mostrar \n"
                    + "3 eliminar\n"
                    + "4 salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;

                case 2:
                    n.mostrar();
                    break;

                case 3:
                    n.eliminar();
                    break;
                case 4:
                    
                    break;
                default:
                    System.err.println("Favor de ingresar una opción valida");
                    break;
            }
        } while (opt != 4);
    }
}
