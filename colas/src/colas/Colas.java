package colas;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas {
    /*En esta clase va a contener el ejercicio 1 de pila
    pero modificado a cola*/
    public static void cola1() {
        //Este es el metodo para crear una cola        
        Queue cola = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int opc1, tope = 0;
        char tam = 'Z';
        do {
            System.out.print("\n--------------EJERCICIO DE PILA 1 EN COLA--------------"
                    + "\n-------------------------MENÚ-------------------------"
                    + " \n1. Llenar"
                    + " 2. Mostar"
                    + " 3. Eliminar"
                    + " 4. Agregar"
                    + " 5. Salir"
                    + "\n------------------------------------------------------"
                    + "\n Tu respuesta:");

            switch (opc1 = sc.nextInt()) {

                case 1:
                    /*Este metodo sirve para que cuando el usuario
                    quiera llenar la cola mas de una vez, limpie lo que tiene y de 
                    nuevo pona unicamente el abecedario*/
                    cola.clear();

                    //Hacemos un ciclo for para generar el abecedario
                    for (char i = 'A'; i < tam; i++) {
                        //El .offer guarda los valores en la cola
                        cola.offer(i);
                    }
                    for (int i = 0; i < tam; i++) {
                        tope++;/*El tope nos va a servir para cuando ya no querramos
                        que la cola se siga llenando*/
                    }
                    System.out.println("Cola llena");
                    break;

                case 2:

                    System.out.print(cola + " ");

                    break;

                case 3:
                    //El .remove sirve para eliminar un valor de la cola
                    cola.remove();
                    tope--;
                    System.out.println("Letra eliminada");
                    break;

                case 4:
                    //Aqui el usuario puede meter una letra
                    if (tope < tam) {
                        System.out.println("Ingresa la letra que quiera agregar: ");
                        cola.offer(sc.next().charAt(0));
                        System.out.println("Letra agregada");
                    } else {
                        System.out.println("Cola llena");
                    }

                    break;

            }

        } while (opc1 != 5);

    }

    /*En esta clase va a contener el ejercicio 2 y 4 de pila
    pero modificado a cola*/
 /*Decidi juntar los 2 programas ya que basicamente son lo mismo
    lo que cambia es que el ejercicio de la pila 4 pide que ninguna letra
    se repita*/
    public static void cola2() {
        //Este es el metodo para crear una cola        
        LinkedList cola2 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int tam = 26;
        char aux = 0;
        int opc2, tope = 0;
        char cola[] = new char[tam];
        do {
            System.out.print("\n---------------EJERCICIO DE PILA 2/4 EN COLA----------------"
                    + "\n---------------------------MENÚ----------------------------"
                    + "\n1.Llenar"
                    + " 2.Mostar"
                    + " 3.Eliminar"
                    + " 4.Agregar"
                    + " 5.Ordenar"
                    + " 6.Salir"
                    + "\n-----------------------------------------------------------"
                    + "\n Tu respuesta:");

            switch (opc2 = sc.nextInt()) {

                case 1:
                    /*Este metodo nos sirve para cuando el usuario
                    quiera llenar la cola mas de 1 vez no pueda
                    como tambien para que se pueda generar un nuevo
                    abecedario aleatorio*/
                    cola2.clear();

                    /*Para la creación de esta cola tuve muchas dificultades, ya que no 
                    encontre un codigo o un video de referencia en la cual pudiera guiarme
                    Sin embargo use arreglos para la creacion del abecedario y posteriormente
                    lo guardaba en la cola, espero que igual cuente mi metodo ):*/
                    for (int i = 0; i < tam; i++) {
                        /*Aqui generamos el abecedario*/
                        cola[i] = (char) (Math.random() * tam + 'A');
                        tope++;
                        for (int j = 0; j < i; j++) {
                            if (cola[i] == cola[j]) {
                                i--;
                            }
                        }
                    }
                    /*Usamos este for para guardar el abecedario en la cola,
                    en la cola no va haber letras repetidas*/
                    for (int i = 0; i < tam; i++) {
                        cola2.offer(cola[i]);
                    }

                    System.out.println("Cola llena");
                    break;

                case 2:

                    if (cola2.isEmpty()) {
                        System.out.println("La cola esta vacia");
                    } else {
                        System.out.print(cola2 + " ");
                    }

                    break;

                case 3:
                    //Metodo para eliminar un valor de la cola
                    cola2.remove();
                    System.out.println("Letra eliminada");
                    break;

                case 4:
                    //Aqui evaluamos si pueden ingresas valores a la cola o no
                    if (tope < tam) {
                        System.out.println("Ingresa la letra que quiera agregar: ");
                        cola2.offer(sc.next().charAt(0));
                    } else {
                        System.out.println("Cola llena");
                    }
                    break;

                case 5:
                    //Usamos el metodo de ordenamiento
                    for (int i = 0; i < tam; i++) {
                        for (int j = 0; j < (tam - 1); j++) {
                            if (cola[j] > cola[j + 1]) {
                                aux = cola[j];
                                cola[j] = cola[j + 1];
                                cola[j + 1] = aux;
                            }

                        }
                    }
                    cola2.clear();//El .clear sirve para vaciar la cola}
                    /*Posteriormente ingresamos el abecedario de forma ordenada
                    en la cola*/
                    for (int j = 0; j < tam; j++) {
                        cola2.offer(cola[j]);
                    }
                    System.out.println("Cola ordenada");
                    break;
            }

        } while (opc2 != 6);
    }

    /*En esta clase va a contener el ejercicio 3 de pila
    pero modificado a cola*/
    public static void cola3() {

        Scanner sc = new Scanner(System.in);
        //Creamos las colas
        LinkedList cola1 = new LinkedList();
        LinkedList cola2 = new LinkedList();
        LinkedList cola3 = new LinkedList();

        int opc;

        System.out.println("De que tamañio quieres la cola: ");
        int tam;
        tam = sc.nextInt();

        /*Creamos los arreglos, esto nos va a servir para poder
        hacer la suma de las colas, ya que no encontre otro metodo
        para que las colas se puedan sumar*/
        int x[] = new int[tam];
        int y[] = new int[tam];
        int z[] = new int[tam];

        do {
            System.out.print("\n--------------------MENÚ--------------------"
                    + "\n1. Llenar colas a y b"
                    + "\n2. Mostar colas a y b"
                    + "\n3. Unir colas (cola c)"
                    + "\n4. Mostar cola c"
                    + "\n5. Vaciar colas"
                    + "\n6. Salir"
                    + "\n--------------------------------------------"
                    + "\n Tu respuesta:");

            switch (opc = sc.nextInt()) {

                case 1:
                    /*Metodo para que el usuario solo pueda llenar
                    unicamente la cola del tamaño que escogio 
                    primero, como tambien nos ayuda a generar
                    nuevos valores a la cola*/
                    cola1.clear();
                    cola2.clear();
                    //En estos for creamos los numeros aleatorios
                    for (int i = 0; i < tam; i++) {
                        x[i] = (int) (Math.random() * 100 + 1);
                        y[i] = (int) (Math.random() * (200 - 100) + 100);
                    }

                    /*Este for nos va a servir para guardar los numeros
                    en las colas*/
                    for (int i = 0; i < tam; i++) {
                        cola1.offer(x[i]);
                        cola2.offer(y[i]);
                    }
                    System.out.println("Colas llenas");
                    break;

                case 2:
                    
                    if (cola1.isEmpty() && cola2.isEmpty()) {
                        System.out.println("Debes crear primero la cola");
                    }else{
                    System.out.println(cola1 + " ");
                    System.out.println(cola2 + " ");
                    }
                    break;

                case 3:
                    //Aqui creamos la 3ra cola
                    for (int i = 0; i < tam; i++) {
                        z[i] = x[i] + y[i];
                        cola3.offer(z[i]);
                    }
                    System.out.println("Cola 3 creada");

                    break;

                case 4:
                    
                    if (cola3.isEmpty()) {
                        System.out.println("Debes crear primero unir las colas");
                    }else{
                    System.out.println(cola3 + " ");
                    }
                    break;

                case 5:
                    /*El metodo .clear nos va a ayudar a vaciar las colas
                    para que el usuario pueda iniciarlo de nuevo*/
                    for (int i = 0; i < tam; i++) {
                        cola1.clear();
                        cola2.clear();
                    }
                    System.out.println("Colas vacias");
                    break;

            }

        } while (opc != 6);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("------------MENÚ PRINCIPAL------------"
                    + "\n1. Pila 1 transformado a cola"
                    + "\n2. Pila 2 y 4 transformado a cola"
                    + "\n3. Pila 3 tranformado a cola"
                    + "\n4. Salir"
                    + "\n--------------------------------------");

            switch (opc = sc.nextInt()) {

                case 1:
                    cola1();
                    break;

                case 2:
                    cola2();
                    break;

                case 3:
                    cola3();
                    break;

            }

        } while (opc != 4);

    }

}
