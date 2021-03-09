
package tiposdatos;
/**
 *
 * @author Monroy Vazquez Luis Antonio
 */
public class TiposDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Estos son datos para numeros enteros
        byte b1=64,b2=63;
        byte resB = (byte) (b1+b2);
        short s1=16383,s2=16384;
        short resS = (short) (s1+s2);
        int i1=1073741824,i2=1073741823;
        int resI = i1+i2;
        //Al poner numeros grandes debe poner 'L' al final del numero
        long l1=4611686018427387904L,l2=4611686018427387903L;
        long resL=l1+l2;
        //Estos son datos para numeros con decimal
        float f1=10.25f,f2=10.25f;
        float resF=f1+f2;
        double d1=10.252525,d2=10.252525;
        double resD=d1+d2;
        //Este dato tiene 2 valores, verdadero o falso
        boolean bo = false;
        //Este dato sirve para caracteres
        char c='a';
        //Los resultados de las sumas es el valor maximo que puede almacenar los datos
        System.out.println("Resultado de la suma de bytes: "+resB);
        System.out.println("Resultado de la suma de shorts: "+resS);
        System.out.println("Resultado de la suma de ints: "+resI);
        System.out.println("Resultado de la suma de longs: "+resL);
        //Resultado de los datos decimales
        System.out.println("Resultado de la suma de floats: "+resF);
        System.out.println("Resultado de la suma de doubles: "+resD);
        //valor predeterminado de un dooble
        System.out.println("Valor predeterminado de un boolen: "+bo);
        //Los char solo pueden almacenar una letra
        System.out.println("Puedes almacenar unicamente una letra en char, como: "+c);
    }
    
}
