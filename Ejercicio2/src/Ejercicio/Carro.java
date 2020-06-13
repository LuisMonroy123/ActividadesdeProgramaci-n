package Ejercicio;
public class Carro extends Vehiculo{

    int puertas;

    public Carro(int puertas, int Npasajeros, int Nruedas, int desplazamiento, int estatus) {
        super(Npasajeros, Nruedas, desplazamiento, estatus);
        this.puertas = puertas;
    }

    
    public void puertas(){
        System.out.println("Esto es un carro en la cual posee: "+puertas+" puertas");
    }

}
