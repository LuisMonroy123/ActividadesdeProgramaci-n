package calculo.de.masa;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        
       JOptionPane.showMessageDialog(null,"Bienvenido al programa donde calculamos su masa corporal");
        
       String sexo=JOptionPane.showInputDialog(null,"Ingrese su sexo");
        
       String nombre=JOptionPane.showInputDialog(null,"Ingrese su nombre");
   
       int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad"));
       
      double peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su peso"));
      
       double altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su altura"));
       
        persona x = new persona (nombre, edad, sexo, peso, altura);
        x.MostrarDatos();
        operaciones y = new operaciones (peso, nombre, edad, sexo, peso, altura);
        y.operacion();
    }
    
}
