package vocal;

import java.util.Scanner;

public class Vocal {
    public static void main(String[] args) {
        
      Scanner x = new Scanner(System.in);
      
      int vocal=0;
      String frase;
      
        System.out.println("Ingrese su palabra o frase: ");
        frase=x.nextLine();
        
        
        for(int i=0; i<frase.length(); i++){
            
            if((frase.charAt(i)=='a') || (frase.charAt(i)=='e')|| 
               (frase.charAt(i)=='i') || (frase.charAt(i)=='o') || (frase.charAt(i)=='u') ||
                    (frase.charAt(i)=='A') || (frase.charAt(i)=='E') || (frase.charAt(i)=='I') ||
                    (frase.charAt(i)=='O') || (frase.charAt(i)=='U')){
                
                vocal++;
            } 
        }
        System.out.println("La palabra o frase '"+frase+"' contiene "+vocal+" vocales");
    }
    
}
