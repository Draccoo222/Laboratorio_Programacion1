package seamana1.newpackage;
import java.util.Scanner;

//@author Samuel Vasquez
/*Cuotas: se requiere un algoritmo que le permita a un banco calcular el valor de la cuota de pago y 
el total a pagar por un prestamo otorgado a un cliente teniendo en cuenta el plazo de pago establecido (en meses), 
el interes mensual aplicado al prestamo(simple), la comision por cuota y el porcentaje de seguro mensual aplicado a la cuota.

    **** CUOTAS MENSUALES *******
    Cuota de Pago Mensual: HNL ###.##
    Total a Pagar: HNL ###.##

*/
public class Vasquez_Samuel_Cuotas {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        int plazoM;
        double valP, intsr, com, comC, seg, segM, intsrM, pagoM;
        double pagoFinal;
        System.out.println("Bienvenido al Calculador de Seguros");
        
        System.out.println("Ingrese el valor del prestamo");
        valP = enter.nextDouble();
        
        System.out.println("Ingrese el plazo mensual");
        plazoM = enter.nextInt();
        
        System.out.println("Ingrese comision por cuota (porcentaje)");
        comC = enter.nextInt();
        
        System.out.println("Ingrese su seguro mensual (porcentaje)");
        segM = enter.nextDouble();
        
        System.out.println("Ingrese el Interes (porcentaje)");
        intsr = enter.nextDouble();
        
        pagoM = valP/plazoM;
        intsrM = pagoM*(intsr/100);
        seg = pagoM*(segM/100);
        com = pagoM*(comC/100);
        
        pagoFinal = valP+intsrM+seg+com;
        
        System.out.println("******* CUOTAS MENSUALES *******");
        System.out.println("Cuota de Pago Mensual: " + pagoM + "HNL");
        System.out.println("Total a Pagar: " + pagoFinal + "HNL");
  
    }
}
