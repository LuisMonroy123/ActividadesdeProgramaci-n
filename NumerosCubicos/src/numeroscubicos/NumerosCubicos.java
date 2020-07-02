package numeroscubicos;
import javax.swing.JOptionPane;

public class NumerosCubicos {
    public static void main(String[] args) {
       
       
        double num,raiz;
        int ent;
        num=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero: "));
        
        raiz= Math.cbrt(num);
     
        ent = (int) raiz;
        
        if(raiz-ent==0){
            JOptionPane.showMessageDialog(null,"El numero "+num+" es cubico, y es el cubo del numero "+raiz);
        }
        
        else{
            JOptionPane.showMessageDialog(null,"El numero "+num+" no es cubico");
        } 
    }
    
}
