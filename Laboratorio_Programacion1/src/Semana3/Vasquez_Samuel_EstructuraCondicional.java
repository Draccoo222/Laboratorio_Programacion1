/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author unwir
 */
public class Vasquez_Samuel_EstructuraCondicional {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int opc, primo, div;
        String voto, palabra;
        //Declaracion de variables a usar
        
        do{
            //Se imrpime el  menu de opciones
            System.out.println("****************Bienvenido****************");
            System.out.println("Introduzca uno de los siguientes numeros para ver que desea hacer");
            System.out.println("1. Detector de Palindromos");
            System.out.println("2. Determinar numero Perfecto");
            System.out.println("3. Determinar numero Primo");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir");
            System.out.println("=============================");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    int cantP, cantL = 0;
                    char letra;
                        String palabraM = "", palabra2 = "", reversa = "", resul = "", resul2 = ""; 
                        char letra1, letra2;
                        boolean verificador = false, verific = false;
                        System.out.print("Introduzca el numero de palabras");
                         cantP = entrada.nextInt();

                        for (int i = 1; i <= cantP; i++) {
                            System.out.println("Escriba la palabra "+ i);
                            palabra = entrada.next().toLowerCase();
                            int len = palabra.length() - 1;
                            int lenM = palabraM.length() - 1;
                            int len2 = palabra2.length() - 1;
                            //Arma la reversa de la palabra
                            for (int j = 0; j <= len; j++) {
                                letra = palabra.charAt(len - j);
                                reversa += letra;        
                             }
                            //Conseguir la palabra con mas caracteres
                        if(cantL < palabra.length()){
                            cantL = palabra.length();
                            palabraM = palabra;                  
                        }
                        // Verificar si hay mas de una palabra tiene la misma duracion
                        if (palabraM.length() == palabra.length()) {
                            palabra2 = palabra;
                            verific = true;
                        }

                        for (int j = 0; j <= lenM;  j++) {
                              letra1 = palabraM.charAt(j); //Conseguir de la primera hasta la ultima
                              letra2 = palabraM.charAt(palabraM.length()- 1 - j); // Consigue desde la ultima hasta la primera
                              if (letra1 != letra2) {
                                 verificador = false;
                                  break;
                              }
                              else{verificador = true;}               
                          }              
                            System.out.println("Alrevez: " + reversa);
                            reversa = "";
                        } 
                        resul = (verificador == true) ? "Si es un palindromo" : "No es un palindromo";
                        if (verific == true) {
                            System.out.println("Las palabras son " + palabraM + " " + palabra2);
                        }
                        else{
                         System.out.println("La palabra con mas caracteres es " + palabraM + " " + palabra2 + " y " + resul);
                        }
                case 2:
                    System.out.println("Introduzca un numero entero");
                    div = entrada.nextInt();
                    int num, suma = 0, dv;
                    dv = div/2;
                    for (int i = 1; i < div; i++ ){ //Se usa para sumar los factores del numero introducido
                        if (i % 2 == 0) { //Suma los factores que son multiplos de 2
                            suma += i;
                        } 
                    }
                    if(div == suma){ //Si los factores terminan dando el numero introdicido es un numero perfecto
                        System.out.println("Es un numero perfecto ");
                    }
                    else{ System.out.println("No es un numero perfecto ");}
                    break;
                case 3:
                    int numGen = rand.nextInt(1, 100); //Se genera un numero aleatorio del 1 al 100
                    String divisores = ""; //Se crea la variable que almacenara los divisores
                    System.out.println("Se ha generado: " + numGen);
                    for (int i = 1; i <= numGen; i++) { // Por medio de este for, se obtienen los divisores
                        if(numGen % i == 0){ // Se usa el mod para obtener los divisores legitimos
                            divisores += ", " + i; // Los divisores que den residuo de 0 seran agragados a la lista de divisores
                           
                        }
                        
                    }
                    String det = (numGen %2 != 0)? "Es un numero Primo\n" : "No es un numero primo \n" ; // Se  crea un ternario donde se identifica si es un numero primo
                    System.out.println(det + "Los divisores: " + divisores.substring(2, divisores.length()));
                    break;
                case 4:
                
                    
                case 5:
                    System.out.println("Fin del Programa");
                    break;
                default:
                    System.out.println("\n-----Porfavor, introduzca un numero que este dentro del rango-----\n");
            }
            
        }while(opc != 5);
       
        
    
    
    
    
    }
    
}
