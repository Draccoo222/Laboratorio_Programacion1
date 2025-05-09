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
public class Vasquez_Samuel_Tiempo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int sec;
        
        System.out.println("*****Bienvenido*****");
        System.out.print("Introduzca la cantidad de segundos que quiere convertir(en numeros enteros): ");
        sec = entrada.nextInt();
        
      
        int h = (sec/3600);
        int min = (sec % 3600)/60;
        int res = sec % 60;
        
        String resul = (sec <=0) ? "Porfavor introduzca un numero mayor a 0" : "Su resultado seria " + String.format("%d", h) + " horas " + String.format("%d", min) + " minutos " + String.format("%d", res) + " segundos " ;
        System.out.println(resul);
    }
}
