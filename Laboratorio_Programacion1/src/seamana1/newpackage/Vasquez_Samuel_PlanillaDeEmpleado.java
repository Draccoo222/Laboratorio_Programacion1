package seamana1.newpackage;
import java.util.Scanner;
// @author Samuel Josue Vasquez Fuentes

public class Vasquez_Samuel_PlanillaDeEmpleado {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        enter.useDelimiter("\n");
        float tPH,salr;
        int hrMes;
        String nom_Usuario; 
  
        System.out.println("Bienvenido a la Planilla Del Empleado");
        System.out.println("Introduzca su Nombre");
        nom_Usuario = enter.next();
        
        System.out.println("Introduzca sus Horas de Trabajo Mensuales");
        hrMes = enter.nextInt();
        System.out.println("Introduzca sus Tarifa por Hora");
        tPH = enter.nextFloat();
                 
        salr = (hrMes*tPH)/4;

        System.out.println("------- Boleta del Empleado -------");
        System.out.println("Nombre del Empleado: " + nom_Usuario);
        System.out.println("Hora de Trabajo Mensual: " + hrMes);
        System.out.println("Tarifa por Hora : " + tPH + " Lps.");
        System.out.println("Salario del Empleado Semanal: " + salr + " Lps.");
          
        enter.close();
    }
}
