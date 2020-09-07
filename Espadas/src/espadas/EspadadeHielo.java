package espadas;
public class EspadadeHielo extends EspadaBase{
    
     //Esta clase hereda los atributos de la clase padre pero con un añadido extra para ser diferente
    
    private String congelar;
    
    public EspadadeHielo(int daño,int durabilidad, String textura, String congelar){
        
    super(daño,durabilidad,textura);
    this.congelar=congelar;
    }
    //Este metodo mostrará los datos en la clase principal
        public void MostrarDatos(){
        
        System.out.println("\nEsta espada tiene lo siguiente");
        System.out.println("Daño: "+getDaño());
        System.out.println("Durabilidad: "+getDurabilidad());
        System.out.println("Textura"+getTextura());
        System.out.println(""+congelar);
        
    }
    
}
