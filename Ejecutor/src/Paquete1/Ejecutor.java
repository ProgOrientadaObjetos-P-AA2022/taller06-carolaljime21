package Paquete1;
import Paquete2.Ciudad;
import Paquete2.Medico;
import Paquete2.Enfermero;
import Paquete2.EntidadHospitalaria;
import java.util.Scanner;
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Datos hospital: ");
        System.out.println("Nombre del Hospital");
        String nomHosp = entrada.nextLine();

        System.out.println("Ingrese el nombre de la ciudad");
        String nomCiudad = entrada.nextLine();
        

        Medico[] medicos;
        Enfermero[] enfermeros;
        
        System.out.println("Direccion del Hospital");
        String direc = entrada.nextLine();

        System.out.println("Ingrese el nombre de la ciudad");
        String nombreCiu = entrada.nextLine();
        System.out.println("Ingrese la provincia");
        String nombreProv = entrada.nextLine();
        
        Ciudad ciudad = new Ciudad(nomCiudad, nombreProv);
        
        System.out.println("Numero de médicos: ");
        int nMedicos = entrada.nextInt();
        medicos = new Medico[nMedicos];
        entrada.nextLine();

        for (int i = 0; i < nMedicos; i++) {
            
            System.out.println("Nombre del médico: ");
            String nombreM = entrada.nextLine();
            System.out.println("Sueldo que recibe");
            double sueldoM = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Especialidad");
            String espM = entrada.nextLine();

            Medico medico = new Medico(nombreM, espM, sueldoM);

            medicos[i] = medico;
        }

        System.out.println("Numero enfermeros");
        int nEnfermeros = entrada.nextInt();
        enfermeros = new Enfermero[nEnfermeros];
        
        entrada.nextLine();

        for (int i = 0; i < nEnfermeros; i++) {
            System.out.println("Nombre del enfermero/a: ");
            String nombreE = entrada.nextLine();
            System.out.println("Sueldo");
            double sueldoE = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Tipo de contrato");
            String tipoContrato = entrada.nextLine();

            Enfermero enfermero = new Enfermero(nombreE, tipoContrato, sueldoE);
            enfermeros[i] = enfermero;
            
        }
        int nEspecialidades = nMedicos + nEnfermeros;

        EntidadHospitalaria hospital = new EntidadHospitalaria(nomHosp, direc, ciudad,
        nEspecialidades, medicos, enfermeros);
              
        System.out.printf("\n%s\n", hospital);
    }
    
}
