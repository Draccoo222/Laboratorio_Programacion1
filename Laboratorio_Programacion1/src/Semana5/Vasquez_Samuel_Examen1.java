/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana5;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author unwir
 */
public class Vasquez_Samuel_Examen1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opc;
        Random compu = new Random();
        Random compuR = new Random();
        
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
                    System.out.println("\n--- Piramide ---");
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
                    System.out.println("\n--- Clave ---");
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
                    int opcCompu;
                    boolean otra = true;
                    String util;
                    System.out.println("\n--- PIEDRA PAPEL O TIJERAS ---");
                    
                    do{
                        while(true){
                            System.out.println("Introduzca que quiere usar (Piedra, Papel o Tijera): ");
                            util = entrada.next();
                            if(util.equalsIgnoreCase("Piedra") || util.equalsIgnoreCase("Papel") || util.equalsIgnoreCase("Tijera")){
                                break;
                            }else{
                                System.out.println(">>>ERROR, porfavor introduzca una opcion valida");
                            }
                        }

                        opcCompu = compu.nextInt(3) + 1;
                        
                        if(opcCompu == 1){
                            System.out.println("La computadora ha elegido PIEDRA");
                        }else if(opcCompu == 2){
                            System.out.println("La computadora ha elegido PAPEL"); 
                        }else if (opcCompu == 3){
                            System.out.println("La computadora ha elegido TIJERA");
                        
                        }
    
                        if((util.equalsIgnoreCase("Piedra") && opcCompu == 1)||(util.equalsIgnoreCase("Papel") && opcCompu == 2) || (util.equalsIgnoreCase("Tijera") && opcCompu == 3)){
                            System.out.println("\n******HAS EMPATADO******");
                        }else if((util.equalsIgnoreCase("Piedra") && opcCompu == 2)||(util.equalsIgnoreCase("Papel") && opcCompu == 3) || (util.equalsIgnoreCase("Tijera") && opcCompu == 1)){
                            System.out.println("\n******HAS PERDIDO******");
                        }else if((util.equalsIgnoreCase("Piedra") && opcCompu == 3)||(util.equalsIgnoreCase("Papel") && opcCompu == 1) || (util.equalsIgnoreCase("Tijera") && opcCompu == 2)){
                            System.out.println("\n******HAS GANADO******");
                        }
                        
                        while(true){
                            System.out.print("\nQuiere jugar otra vez? (si/no): ");
                            String devuelta = entrada.next();
                            if(devuelta.equalsIgnoreCase("si")){
                                otra = true;
                                entrada.nextLine();
                                break;
                            }else if(devuelta.equalsIgnoreCase("no")){
                                otra = false;
                                entrada.nextLine();
                                break;
                            }else{
                                System.out.println("\n>>> ERROR, porfavor solo indique si o no\n");
                            }
                        }
                        
                    }while(otra == true);
                    
                  break;
                case 4:
                    System.out.println("\n---- Adivinar ----");
                    int randNum = compuR.nextInt(101), intento = 0, guess = 0;
                    boolean gana = false;
                    System.out.println("La computadora ha generado un numero de 1 al 100, tiene 10 intentos para descifrarlo!");
                    for (int i = 1; i < 11; i++) {
                        System.out.print("Intento " + i + ": " );
                        guess = entrada.nextInt();
                        if(guess != randNum &&  guess > randNum){
                            System.out.println("Su intento es mayor a lo generado por la computadora");
                        }else if(guess != randNum &&  guess < randNum){
                            System.out.println("Su intento es menor a lo generado por la computadora");
                        }else{
                            gana = true;
                            intento = i;
                            break;
                        }
                    }
                    if(gana){
                        System.out.println("Bien Hecho! Ha adivinado correctamente!");
                        System.out.println("Lo hizo en el intento " + intento);
                    }else{
                       System.out.println("Ha perdido!!");
                       System.out.println("El generado numero es: " + randNum);
                    }
                    break;
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
