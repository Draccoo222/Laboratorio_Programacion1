/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana5;
import java.util.Scanner;
/**
 *
 * @author unwir
 */
public class Vasquez_Samuel_Examen1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opc;
        
        do{
        System.out.println("\n===== Bienvenido =====");
        System.out.println("[1] Piramide");
        System.out.println("[2] Clave");
        System.out.println("[3] Juego Piedra Papel y Tijera");
        System.out.println("[4] Adivinar");
        System.out.println("[5] Salir");
        System.out.println("======================");
        System.out.print("Introduzca la opcion que desea (representado en numeros): ");
        opc = entrada.nextInt();
        
            switch(opc){
                case 1:
                    System.out.println("--- Piramide ---");
                    System.out.print("Introduzca la cantidad de fila para la piramide: ");
                    int anch = entrada.nextInt(), suma = 0, num = 1;
                    for (int i = 1; i <= anch; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(num+ " ");
                            suma += num;
                            num += 2;
                        }
                        System.out.println("= " + suma);
                    }
                break;
                case 2:
                        
                case 3:
                    
                case 4:
                    
                case 5: 
                    System.out.println("\n>>>Fin del Programa");
                    break;
                default:
                    System.out.println("\n>>>>Error, porfavor ponga una opcion valida");
                    break;
            }
        
        
        }while(opc != 5);
        
    
    
    }
    
}
