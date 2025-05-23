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
        System.out.println("\n=========== Bienvenido ===========");
        System.out.println("[1] Piramide");
        System.out.println("[2] Clave");
        System.out.println("[3] Juego Piedra Papel y Tijera");
        System.out.println("[4] Adivinar");
        System.out.println("[5] Salir");
        System.out.println("==================================");
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
                    System.out.println("--- Clave ---");
                    System.out.print("Introduzca la palabra a codificar: ");
                    String palabra = entrada.next();
                    
                    String resultado = "", resultado2 = "";
                    
                    for (int i = 0; i < palabra.length(); i++) {
                        char letra = palabra.charAt(i);
                        if(Character.isLetter(letra)){
                            if(letra >= 'a' && letra <= 'z'){
                                char cifrado = (char) ('z' - (letra - 'a'));
                                resultado +=  cifrado;
                            }else if(letra >= 'A' && letra <= 'Z'){
                               char cifrado = (char) ('Z' - (letra - 'A'));
                                resultado += cifrado;
                            }
                        }else{
                            resultado += letra;
                        }
                    }
                    System.out.println("Cifrado: " + resultado);
                    
                    
                    System.out.print("\nIntroduzca la palabra que quiere decodificar: ");
                    String palabra2 = entrada.next();
                    
                    for (int i = 0; i < palabra2.length(); i++) {
                        char letra = palabra2.charAt(i);
                        if(Character.isLetter(letra)){
                            if(letra >= 'a' && letra <= 'z'){
                                char cifrado = (char) ('a' - (letra - 'z'));
                                resultado2 +=  cifrado;
                            }else if(letra >= 'A' && letra <= 'Z'){
                               char cifrado = (char) ('A' - (letra - 'Z'));
                                resultado2 += cifrado;
                            }
                        }else{
                            resultado2 += letra;
                        }
                    }
                    System.out.println("Descifrado: " + resultado2);
                break;
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
