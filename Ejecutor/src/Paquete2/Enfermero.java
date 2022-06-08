package Paquete2;

public class Enfermero {
    String nombre;
    String tipo;
    double sueldo;
    
    public Enfermero(String nom, String tip, double suel){
        nombre = nom;
        tipo = tip;
        sueldo = suel;
    }
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerTipo(String x){
        tipo = x;
    }
    
    public void establecerSueldo(double x){
        sueldo = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
}
