package espadas;
public class Espadas {
    public static void main(String[] args) {
        
        //Aqui llamaeramos a las clases y pondremos la información de cada uno
        
        EspadadeHielo espa = new EspadadeHielo(8, 2000, "", "congela");
        EspadadeFuego espad = new EspadadeFuego(9, 2100, "", "quema");
        EspadaBase esp = new EspadaBase(5, 2000, "");
        esp.MostrarDatos();
        espa.MostrarDatos();
        espad.MostrarDatos();
    }
    
}
