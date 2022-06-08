package Paquete2;

public class Medico {
    String nombre;
    String especialidad;
    double sueldo;
    
    public Medico(String nom, String esp, double suel){
        nombre = nom;
        especialidad = esp;
        sueldo = suel;
    }
    
    public void establecerNombre(String x){
        nombre = x;
    }
    
    public void establecerEspecialidad(String x){
        especialidad = x;
    }
    
    public void establecerSueldo(double x){
        sueldo = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerEspecialidad(){
        return especialidad;
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
}
