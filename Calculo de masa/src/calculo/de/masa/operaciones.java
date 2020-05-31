package calculo.de.masa;

import javax.swing.JOptionPane;

public class operaciones extends persona{

    public operaciones(double res, String nombre, int edad, String sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
        this.res = res;
    }
    double res;
    
    public void operacion(){
        
    res=(double) (peso/(altura*altura));
    
    if (res<=18.4){
         JOptionPane.showMessageDialog(null,"Usted esta bajo de peso, su masa es de: "+res);
    }
    if(res>18.5 && res<=24.9){
         JOptionPane.showMessageDialog(null,"Usted esta bien de peso, su masa es de: "+res);
    }
    if(res>=25 && res<=29.9){
         JOptionPane.showMessageDialog(null,"Usted esta en sobrepeso, su masa es de: "+res);
    }
    if (res>=30){
         JOptionPane.showMessageDialog(null,"Usted esta en obesidad, su masa es de: "+res);
    }
    
    
}
    
    
}
