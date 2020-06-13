package Ejercicio;
public class Moto extends Vehiculo {
    String modelo;
    public Moto(String modelo, int Npasajeros, int Nruedas, int desplazamiento, int estatus) {
        super(Npasajeros, Nruedas, desplazamiento, estatus);
        this.modelo = modelo;
    }
   
    public void MostrarDatos5(){
        System.out.println("Este vehiculo es una moto y su modelo es: "+modelo);
    }
}
