package espadas;
public class EspadadeFuego extends EspadaBase {
    //Esta clase hereda los atributos de la clase padre pero con un añadido extra para ser diferente
    
    private String quemar;
    
    public EspadadeFuego(int daño,int durabilidad, String textura, String quemar){
        
    super(daño,durabilidad,textura);
    this.quemar=quemar;
    
    }
    //Este metodo mostrará los datos en la clase principal
        public void MostrarDatos(){
        
        System.out.println("\nEsta espada tiene lo siguiente");
        System.out.println("Daño: "+getDaño());
        System.out.println("Durabilidad: "+getDurabilidad());
        System.out.println("Textura"+getTextura());
        System.out.println(""+quemar);
        }
}
