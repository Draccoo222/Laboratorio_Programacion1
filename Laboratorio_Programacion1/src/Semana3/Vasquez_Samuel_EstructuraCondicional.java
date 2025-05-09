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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int opc, cant1 = 0, cant2 = 0, cant3 = 0, cant4 = 0;
        //Declaracion de variables a usar, la opcion y el contador de cada opcion, tambien se incluyen el objeto Scanner y Random.

        do {
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
            switch (opc) {
                case 1:
                    int cantP;
                    String palabra;
                    System.out.print("Introduzca el numero de palabras: ");
                    cantP = entrada.nextInt();
                    
                    String resultados = "";
                    int longMayor = 0;
                    for (int i = 1; i <= cantP; i++) {
                        System.out.println("Escriba la palabra " + i);
                        palabra = entrada.next().toLowerCase();
                        String palabraRevez = "";
                        //Revertir la palabra
                        for (int j = palabra.length()-1; j >= 0; j--) {
                            palabraRevez += palabra.charAt(j);
                        }
                        String isPalin = palabra.equals(palabraRevez) ? " Es palindromo ":" No es palindromo";
                        System.out.println("Palabra Al revez "+palabraRevez);
                        if(palabra.length()> longMayor){
                            resultados = "\n" + palabra +isPalin;
                            longMayor = palabra.length();
                        }else if( palabra.length() == longMayor){
                            resultados +="\n" + palabra+isPalin;
                        }
                    }
                    System.out.println(resultados);
                    cant1++;
                    break;
                case 2:
                    System.out.println("Introduzca un numero entero");
                    int div = entrada.nextInt();
                    int num,
                     suma = 0,
                     dv;
                    dv = div / 2;
                    for (int i = 1; i < div; i++) { //Se usa para sumar los factores del numero introducido
                        if (i % 2 == 0) { //Suma los factores que son multiplos de 2
                            suma += i;
                        }
                    }
                    if (div == suma) { //Si los factores terminan dando el numero introdicido es un numero perfecto
                        System.out.println("Es un numero perfecto ");
                    } else {
                        System.out.println("No es un numero perfecto ");
                    }
                    cant2++;
                    break;
                case 3:
                    int numGen = rand.nextInt(1, 100); //Se genera un numero aleatorio del 1 al 100
                    String divisores = ""; //Se crea la variable que almacenara los divisores
                    System.out.println("Se ha generado: " + numGen);
                    for (int i = 1; i <= numGen; i++) { // Por medio de este for, se obtienen los divisores
                        if (numGen % i == 0) { // Se usa el mod para obtener los divisores legitimos
                            divisores += ", " + i; // Los divisores que den residuo de 0 seran agragados a la lista de divisores       
                        }
                    }
                    String det = (numGen % 2 != 0) ? "Es un numero Primo\n" : "No es un numero primo \n"; // Se  crea un ternario donde se identifica si es un numero primo
                    System.out.println(det + "Los divisores: " + divisores.substring(2, divisores.length()));
                    cant3++;
                    break;
                case 4:
                    //Se le pregunta al usuario cuantos votantes hay
                    System.out.print("Introduzca la cantidad de votantes: ");
                    int cantVot = entrada.nextInt();
                    int cantAzul = 0,
                     cantRojo = 0,
                     cantNegro = 0,
                     cantAmarillo = 0,
                     cantAnul = 0,
                     votVal = 0;
                    int cand;
                    for (int i = 1; i <= cantVot; i++) {   //Segun esa cantidad se crea el ciclo for
                        System.out.println("Opciones de candidatos (1. Azul,2. Rojo, 3. Negro,4. Amarillo)");
                        System.out.print("A continuacion, introduzca el numero correspondiente a la opcion que desea el votante #" + i + ": ");
                        cand = entrada.nextInt();
                        switch (cand) { // Se crea el switch que ayudara en almacenar el conteo de votos de cada tipo, generales y anulados. Dependiendo lo que pida el usuario
                            case 1:
                                cantAzul++;
                                break;
                            case 2:
                                cantRojo++;
                                break;
                            case 3:
                                cantNegro++;
                                ;
                                break;
                            case 4:
                                cantAmarillo++;
                                break;
                            default:
                                System.out.println("Voto a sido anulado");
                                cantAnul++;
                                break;
                        }

                    }
                    int votosVal = cantVot - cantAnul;
                    double porcentValido = (votosVal * 100.0) / cantVot;
                    if (porcentValido < 60) { // Se valida el porcentaje, si es menor a 60, la votacion es invalida
                        System.out.println("La votacion es invalida, pues el porcentaje de votos valido es menor al 60%");
                    } else { // Si es mayor a 60, suponiendo que no hay empates, se escoge al ganador si su cantidad de votos es mayor a los demas candidatos
                        if (cantAzul > cantRojo && cantAzul > cantNegro && cantAzul > cantAmarillo) {
                            System.out.println("Ha ganado el Azul con: " + cantAzul + " votos");
                            System.out.println("Ha ganado por " + (cantVot - cantAzul));
                        } else if (cantRojo > cantAzul && cantRojo > cantNegro && cantRojo > cantAmarillo) {
                            System.out.println("Ha ganado el Rojo con: " + cantRojo + " votos");
                            System.out.println("Ha ganado por " + (cantVot - cantRojo));
                        } else if (cantNegro > cantRojo && cantNegro > cantAzul && cantNegro > cantAmarillo) {
                            System.out.println("Ha ganado el Negro con: " + cantNegro + " votos");
                            System.out.println("Ha ganado por " + (cantVot - cantNegro));
                        } else if (cantAmarillo > cantRojo && cantAmarillo > cantNegro && cantAmarillo > cantAzul) {
                            System.out.println("Ha ganado el Amarillo con: " + cantAmarillo + " votos");
                            System.out.println("Ha ganado por " + (cantVot - cantAmarillo));
                        }
                    }
                    cant4++;
                    break;
                case 5:
                    System.out.println("Fin del Programa");
                    break;
                default:
                    System.out.println("\n-----Porfavor, introduzca un numero que este dentro del rango-----\n");
            }
        } while (opc != 5);
    }
}
