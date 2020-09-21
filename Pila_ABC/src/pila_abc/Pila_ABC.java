package pila_abc;

import java.util.Scanner;

public class Pila_ABC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tope = 0, full;
        int opc;
        char j = 'a', delete;

        char pila[] = new char[27];

        do {
            System.out.print("\n--------------------MENÚ--------------------"
                    + "\n1. Llenar"
                    + "\n2. Mostar"
                    + "\n3. Eliminar"
                    + "\n4. Agregar"
                    + "\n5. Eliminar desde una letra"
                    + "\n6. Salir"
                    + "\n--------------------------------------------"
                    + "\n Tu respuesta:");

            switch (opc = sc.nextInt()) {
                case 1:
                    if (tope == 0) {
                        //Aqui genera automaticamente el abecedario de la a a la z
                        while (j <= 'z') {
                            //aqui va lo va guardando hasta que el ciclo termine
                            pila[tope] = j;
                            tope++;
                            j++;
                        }
                        System.out.println("pila llena");
                    } else {
                        j = 'a';
                        while (tope < 26) {

                            pila[tope] = j;
                            tope++;
                            j++;
                        }
                        System.out.println("Pila rellenada");
                    }
                    break;

                case 2:
                    if (tope > 0) {
                        // Mostrar los elementos
                        System.out.println("Los elementos de la pila son:");
                        // Iniciamos con tope-1, porque el vector inicia en posición 0
                        for (int i = tope - 1; i >= 0; i--) {
                            System.out.print(pila[i] + " ");
                        }
                    } else {
                        System.out.println("Pila vacía...");
                    }

                    break;
                case 3:
                    if (tope != 0) {
                        // Tope nos indica la posición en la que vamos a guardar un valor
                        // Por eso le restamos una unidad para sobreescribir un elemento
                        System.out.println("Eliminando el último valor");
                        tope--;
                    } else {
                        System.out.println("No hay elementos para eliminar.");
                    }
                    break;
                case 4:
                    if (tope < 26) {
                        // Pedir dato
                        System.out.println("Ingrese dato: ");
                        // Dato se guarda en la posición de la variable tope
                        j = sc.next().charAt(0);
                        pila[tope] = j;
                        j++;
                        // Aumentamos una unidad a tope para guardar el siguiente valor en la siguiente posición
                        tope++;
                    } else {
                        System.out.println("Pila llena...");
                    }
                    break;
                case 5:
                    //aqui se identifica si la pila tiene elementos
                    if (tope > 0) {
                        System.out.println("¿A partir de que letra te gustaría eliminar?");
                        delete = sc.next().charAt(0);
                        //aqui hacemos que la pila se muestre hasta la letra que el usuario selecciono
                        for (int i = 0; i < 26; i++) {
                            if (pila[i] == delete) {
                                tope = i;
                                System.out.println("¡Listo!");

                            }
                        }
                    } else //si no tiene sale un mensaje de que esta vacia
                    {
                        System.out.println("Pila vacia");
                    }
                    break;
                case 6:
                        //Aqui es para que finalice el programa
                    break;
                default:
                    System.out.println("Por favor ingresa una opcion valida");
                    break;

            }

        } while (opc != 7);

    }

}
