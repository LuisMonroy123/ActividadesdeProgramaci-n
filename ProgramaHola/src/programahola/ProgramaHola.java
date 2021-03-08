package programahola;

/**
 *
 * @author Monroy Vazquez Luis Antonio
 */
public class ProgramaHola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui creamos las variables para los datos
        String name = "Luis Antonio";
        String surname1 = "Monroy";
        String surname2 = "Vazquez";
        int age = 19;
        String sexo = "Masculino";
        int cp = 56567;
        String num = "5517856274";
        String carrera = "Ingenieria en sistemas computacionales";
        //Mandamos a imprimir
        System.out.println("Hola soy " + surname1 + " " + surname2 + " " + name);
        System.out.println("Tengo " + age + " años  \nY estos son mis datos:");
        System.out.println("Sexo: " + sexo + "\nCP: " + cp + "\nNumero de celular: " + num + "\nCarrera: " + carrera + "\n");

        //Metodos de las figuras
        rectangulo();
        triangulo();
        circulo();
    }
    //Metodo para crear el rectangulo
    public static void rectangulo() {
        System.out.println("Rectangulo con asateriscos");
        char matrizR[][] = new char[9][9];
        //Aqui usamos un arreglo bidimencional usando 2 ciclos for para hacer el rectangulo
        for (int i = 2; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                //Aqui creamos un if para decir donde poner los asteriscos
                if ((i == 2) || (i == matrizR.length - 1) || (j == 0) || (j == matrizR.length - 1)) {
                    matrizR[i][j] = '*';
                } else {
                    matrizR[i][j] = ' ';
                }
                System.out.print(matrizR[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    //Metodo para crear el circulo
    public static void circulo() {
        System.out.println("\nCirculo con asateriscos");
        char matrizC[][] = new char[13][13];
        //Aqui creamos el arreglo bidimencional
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                //Aqui declaramos en que lugares no debe haber asteriscos
                if (i + j <= 2 || i - j >= 10 || j - i >= 10 || (i + j >= 22)){
                    matrizC[i][j] = ' ';

                } else {
                    matrizC[i][j] = '*';
                }
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println("");
        }

    }
    //Metodo para crear el triangulo
    public static void triangulo() {
        System.out.println("\nTriangulo con asateriscos");
        char matrizT[][] = new char[5][9];
        //Esta variable nos servira para que definir en donde deberan ir los asteriscos
        int mitad = matrizT[0].length / 2;
        //Creamos el arreglo bidimencional 
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                if (i + j >= mitad && j - i <= mitad) {
                    matrizT[i][j] = '*';
                } else {
                    matrizT[i][j] = ' ';
                }
                System.out.print(matrizT[i][j] + "  ");
            }
            System.out.println(" \n ");
        }
    }
}
