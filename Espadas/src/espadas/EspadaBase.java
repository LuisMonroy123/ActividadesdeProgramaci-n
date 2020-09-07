package espadas;
public class EspadaBase {
    //Estos son los atributos que tendra el objeto
    private int daño;
    private int durabilidad;
    private String textura;
    
public EspadaBase(int daño,int durabilidad, String textura){
    this.daño=daño;
    this.durabilidad=durabilidad;
    this.textura=textura;
    
}
//Estos son los metodos que tendra el objeto
    public int getDaño() {
        return daño;
    }
    public int getDurabilidad() {
        return durabilidad;
    }
    public String getTextura() {
        return textura;
    }
    //Este es un metodo para mostrar los datos en la clase principal
    public void MostrarDatos(){
        
        System.out.println("\nEsta espada tiene lo siguiente");
        System.out.println("Daño: "+daño);
        System.out.println("Durabilidad: "+durabilidad);
        System.out.println("Textura"+textura);   
    }
}
