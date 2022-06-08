package Paquete2;

public class Ciudad {
    
    String nombreCiudad;
    String nombreProvincia;
    
    public Ciudad(String nCiudad, String pro){
        nombreCiudad = nCiudad;
        nombreProvincia = pro;
    }
    
    public void establecerNombreCiudad(String x){
        nombreCiudad = x;
    }
    
    public void establecerNombreProvincia(String x){
        nombreProvincia = x;
    }
    
    public String obtenerNombreCiudad(){
        return nombreCiudad;
    }
    
    public String obtenerNombreProvincia(){
        return nombreProvincia;
    }
}
