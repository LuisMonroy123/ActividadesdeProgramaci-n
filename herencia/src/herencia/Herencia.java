package herencia;
import java.util.Scanner;
public class Herencia {

    public static void main(String[] args) {
        Dog[] dogs = insertDog();
        printDogsOnConsole(dogs);
        feed(dogs);
        System.out.println("------------After eating------------" + dogs.length);
        printDogsOnConsole(dogs);
    }

    private static void feed(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            double weightBeforefeeding = dogs[i].getWeight();
            dogs[i].setWeight(weightBeforefeeding + 0.5);
        }
    }

    private static void printDogsOnConsole(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].printToConsole();
        }
    }

    private static Dog2[] insertDog() {
        Scanner teclado=new Scanner(System.in);
         int Numdog;
          System.out.println("Ingresa el numero de perros: ");
            Numdog= teclado.nextInt();
        
        Dog2[] dogs = new Dog2[Numdog];
        
        String [] names = new String[Numdog];
        String [] colours = new String[Numdog];
        double [] weight = new double[Numdog];
        double [] portion = new double[Numdog];

        ///Asigna los nombres
        teclado.nextLine();
        for (int i = 0; i < dogs.length; i++) {
          System.out.println("Ingrese el nombre del perro " + i);
          String nombre = teclado.nextLine();
          names[i]=nombre;  
        }

        ///Asigna los colores
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Ingrese el color del perro " + i);
            String color = teclado.nextLine();
            colours[i]=color; 
        }

        ///Asigna el peso
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Ingrese el peso del perro " + i);
            double peso = teclado.nextDouble();
            weight[i]=peso; 
        }

        ///Asigna la porcion 
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Ingrese el portion del perro " + i);
            double porcion = teclado.nextDouble();
            portion[i]=porcion; 
        }

        for (int i = 0; i < dogs.length; i++) {
            Dog2 dog = new Dog2();
            dog.setName(names[i]);
            dog.setColour(colours[i]);
            dog.setWeight(weight[i]);
            dog.setPortion(portion[i]);
            dogs[i] = dog;
        }
        return dogs;
    }
}