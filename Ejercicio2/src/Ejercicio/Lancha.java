package Ejercicio;
public class Lancha extends Vehiculo{
    
 String motor;

    public Lancha(String motor, int Npasajeros, int Nruedas, int desplazamiento, int estatus) {
        super(Npasajeros, Nruedas, desplazamiento, estatus);
        this.motor = motor;
    }
    
    public void MostrarDatos3(){
        System.out.println("Esto es una lancha y su motor es de: "+motor);
    }
}
