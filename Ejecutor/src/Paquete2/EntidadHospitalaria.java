package Paquete2;

public class EntidadHospitalaria {

    private String nombre;
    private Ciudad ciudad;
    private int nEspecialidades;
    private Medico[] listaMedicos;
    private Enfermero[] listaEnfermeros;
    private double sueldo;
    private String direccion;
    
    public EntidadHospitalaria(String nom, String dir, Ciudad ciu, int esp, Medico[] med,
            Enfermero[] enf){
        nombre = nom;
        direccion = dir;
        ciudad = ciu;
        nEspecialidades = esp;
        listaMedicos = med;
        listaEnfermeros = enf;
    }

    public void establecerNombreHospital(String c) {
        nombre = c;
    }

    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }

    public void calcularNumeroE() {
        nEspecialidades = obtenerMedicos().length + obtenerEnfermeros().length;
    }

    public void establecerMedicos(Medico[] c) {
        listaMedicos = c;
    }

    public void establecerEnfermeros(Enfermero[] c) {
        listaEnfermeros = c;
    }

    public void establecerSueldo() {
        double sumM = 0, sumE = 0;
        for (int i = 0; i < obtenerMedicos().length; i++) {
            sumM = sumM + obtenerMedicos()[i].obtenerSueldo();
        }
        
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            sumE = sumE + obtenerEnfermeros()[i].obtenerSueldo();
        }
        
        sueldo = sumE + sumM;
    }

    public void establecerDireccion(String c) {
        direccion = c;
    }

    public String obtenerNombreHospital() {
        return nombre;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroEnfermeros() {
        return nEspecialidades;
    }

    public Medico[] obtenerMedicos() {
        return listaMedicos;
    }

    public Enfermero[] obtenerEnfermeros() {
        return listaEnfermeros;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("HOSPITAL %s\n"
                + "Dirección: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Número de especialidades: %d\n",
                obtenerNombreHospital().toUpperCase(),
                obtenerDireccion(),
                obtenerCiudad().obtenerNombreCiudad(),
                obtenerCiudad().obtenerNombreProvincia(),
                obtenerNumeroEnfermeros());

        cadena = String.format("%s\nListado de médicos\n", cadena);

        for (int i = 0; i < obtenerMedicos().length; i++) {
            cadena = String.format("%s-%s  - sueldo: %.2f   - %s\n",
                    cadena,
                    obtenerMedicos()[i].obtenerNombre(),
                    obtenerMedicos()[i].obtenerSueldo(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }

        cadena = String.format("%s\nListado de enfermeros\n", cadena);
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s-%s  - sueldo: %.2f  - %s\n",
                    cadena,
                    obtenerEnfermeros()[i].obtenerNombre(),
                    obtenerEnfermeros()[i].obtenerSueldo(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }

        cadena = String.format("%s\n\nTotal de sueldos a pagar por mes: %.2f", 
                cadena, obtenerSueldo());

        return cadena;

    }
  }

