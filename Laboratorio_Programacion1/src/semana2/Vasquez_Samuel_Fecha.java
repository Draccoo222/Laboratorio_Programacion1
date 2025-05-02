/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;
import java.util.Scanner;
      
/**
 *
 * @author unwir
 */
public class Vasquez_Samuel_Fecha {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        String fecha1, fecha2;
        
        System.out.println("Introduzca la primera fecha en el siguiente formato (DD/MM/YYYY), ejemplo: 05/02/2006");
        fecha1 = entrada.next();
        System.out.println("Introduzca la segunda fecha en el siguiente formato (DD/MM/YYYY), ejemplo: 04/03/2007");
        fecha2 = entrada.next();
        
        String dia1 = fecha1.substring(0, 2);
        int diaUno = Integer.parseInt(dia1);
        String mes1 = fecha1.substring(3, 5);
        int mesUno = Integer.parseInt(mes1);
        String yy1 = fecha1.substring(6);
        int yyUno = Integer.parseInt(yy1);
        
        int diasT1 =  diaUno + (mesUno*30) + (yyUno*360);
        
        String dia2 = fecha2.substring(0, 2);
        int diaDos = Integer.parseInt(dia2);
        String mes2 = fecha2.substring(3, 5);
        int mesDos = Integer.parseInt(mes2);
        String yy2 = fecha2.substring(6);
        int yyDos = Integer.parseInt(yy2);
        
        int diasT2 = diaDos + (mesDos*30) + (yyDos*360);
        
        int restaFinal;
        
        if(diasT2 > diasT1){
            restaFinal = diasT2 - diasT1;
        
        }else{
            restaFinal = diasT1 - diasT2;
        
        }
        
      
        System.out.println("Al final la diferencia es de " + restaFinal + " dias");
        
       
        
   
   }
}
