package seamana1.newpackage;
import java.util.Scanner;
// @author Samuel Vasquez

public class Vasquez_Samuel_Clics {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double clic100 = 100*0.25;
        double clic60 = 60*0.3;
        double clic20 = 20*0.8;
        
        double costoTot = clic100 + clic20 + clic60;
        double costoF = costoTot/180;
        double iSV = costoTot*0.16;
        
        double costoDef = costoTot+ iSV;
        
        String finalCostoDef = String.format("%.2f", costoDef);
        String finalCostoF = String.format("%.2f", costoF);
        
        System.out.println("Costo promedio: " + finalCostoF);
        System.out.println("Costo de todos los clics mas su ISV del 16%: " + finalCostoDef);
        
    
    }
}
