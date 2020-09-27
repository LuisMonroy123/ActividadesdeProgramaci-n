package pila_random;

import java.util.Scanner;

public class Pila_Random {

    public static Scanner sc = new Scanner(System.in);
    public static char letra, aux = 0, delete;
    public static int tope = 0, tam = 26, i;
    public static char pila[] = new char[tam];

    public static void llenar() {
        if (tope == 0) {
            /*Aqui lo que se usa es el metodo Math.random para que de esta forma
        genere el abecedario de forma aleatoria*/

            for (i = 0; i < tam; i++) {
                pila[i] = (char) (Math.random() * tam + 'a');/*Aqui declaramos que va a 
                                                   ser entre la z y a*/
                for (int j = 0; j < i; j++) {
                    if (pila[i] == pila[j]) {
                        i--;
                    }/*En este for lo que se hizo es evaluar que cuando una
                    letra se repita la omita y ponga otra*/
                }

            }
            for (int k = 0; k < 26; k++) {
                // por ultimo en este for se va a aumentar el valor de tope y letra
                tope++;
                letra++;
            }
            System.out.println("\nPila llena");
        } else {
/*En esta parte se rellena la pila, sin embargo no supe si hacer que
se rellenara sin repetir letras o que se pudieran repetir, yo opte por
            que se repitan letras
            */
            while (tope < 26) {
                for (i = tope; i < tam; i++) {

                    pila[i] = (char) (Math.random() * tam + 'a');/*Aqui declaramos que va a 
                                                   ser entre la z y a*/
                   
                    for (int k = tope; k < 26; k++) {
                        // por ultimo en este for se va a aumentar el valor de tope y letra
                        tope++;
                        letra++;
                    }

                }

                System.out.println("Pila rellenada");
            }
        }
    }

    public static void mostrar() {
        /*este for lo que hará es mostrar el abecedario eleatorio empezando por
        el ultimo valor*/
        for (i = tope - 1; i >= 0; i--) {
            System.out.print(pila[i] + " ");
        }
    }

    public static void eliminar() {
        /*Aquí se evalua si tope es diferente de 0 para que de esta forma se 
        pueda eliminar valores*/
        if (tope != 0) {
            System.out.println("Ultimo Valor Eliminado");
            tope--;
        } else {
            System.out.println("No hay elementos por eliminar");
        }
    }

    public static void agregar() {
        /*Aquí creamos una condicion de que solo se pueda agregar una letra
        Si es que tope es menor a 26
         */
        if (tope < tam) {
            System.out.println("¿Qué letra desea ingresar?");

            letra = sc.next().charAt(0);
            pila[tope] = letra;
            tope++;
            letra++;

        } else {
        }
    }

    public static void ordenar() {
        //Este es el metodo de burbuja para ordenar el abecedario
         
        for (i = 0; i < tam; i++) {
            for (int j = 0; j < (tam - 1); j++) {
                if (pila[j] > pila[j + 1]) {
                    aux = pila[j];
                    pila[j] = pila[j + 1];
                    pila[j + 1] = aux;
                }
            }
        }
        for (i = 0; i < tam; i++) {

        }

        System.out.println("Pila ordenada");
    }

    public static void borrar() {
        //aqui se identifica si la pila tiene elementos
        if (tope > 0) {
            System.out.println("¿A partir de que letra te gustaría eliminar?");
            delete = sc.next().charAt(0);
            //aqui hacemos que la pila se muestre hasta la letra que el usuario selecciono
            for (i = 0; i < tam; i++) {
                if (pila[i] == delete) {
                    tope = i;

                    System.out.println("¡Listo!");

                }
            }
        } else //si no tiene sale un mensaje de que esta vacia
        {
            System.out.println("Pila vacia");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.print("\n--------------------MENÚ--------------------"
                    + "\n1. Llenar"
                    + "\n2. Mostar"
                    + "\n3. Eliminar"
                    + "\n4. Agregar"
                    + "\n5. Ordenar"
                    + "\n6. Borrar apartir de un numero"
                    + "\n7. Salir"
                    + "\n--------------------------------------------"
                    + "\n Tu respuesta:");

            switch (opc = sc.nextInt()) {
                case 1:
                    llenar();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    agregar();
                    break;
                case 5:
                    ordenar();
                    break;
                case 6:
                    borrar();
                    break;
                case 7:
                    
                    break;
                default:
                    System.out.println("Por favor ingresar una opción valida");
                    break;
            }
        } while (opc != 7);
    }

}
