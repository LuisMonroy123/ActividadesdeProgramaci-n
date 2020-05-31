package calculo.de.masa;

import javax.swing.JOptionPane;

public class persona {
    
    String nombre;
    int edad;
    String sexo;
    double peso;
    double altura;

    public persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null,"Hola "+nombre+"\nEres "+sexo+"\nTienes: "+edad+" años \nY de acuerdo con tu peso y tu altura");
    }
    
}
