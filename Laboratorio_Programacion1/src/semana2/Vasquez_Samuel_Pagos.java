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
public class Vasquez_Samuel_Pagos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        String nombre;
        int categoria, horas, horasE = 0, cod, beneficio;
        double salarioF, salarioB = 0;
        
        System.out.println("******* Bienvenido *******");
        System.out.print("Introduzca su nombre completo: ");
        nombre = entrada.next();
        System.out.print("Introduzca su codigo de empleado: ");
        cod = entrada.nextInt();
        System.out.print("Introduzca sus horas trabajadas: ");
        horas = entrada.nextInt();
        System.out.println("Finalmente, introduzca un numero para su categoria de trabajo \n1 para Categoria 1 - 40$ por horas extra\n2 para Categoria 2 - 50$ por horas extra\n3 para Categoria 3 - 85$ por horas extra\n4 para Categoria 4 - 0$ por horas extra");
        categoria = entrada.nextInt();
       
        
        switch(categoria){
            case 1:
                beneficio = 40;
                break;
            case 2:
                beneficio = 50;
                break;
            case 3:
                beneficio = 85;
                break;
            case 4:
                beneficio = 0;
                break;
            default:
                System.out.println("ERROR, solo se permiten numeros del 1 al 4 para las respectivas categorias, intentelo de nuevo");
                return;
        }
        
        if(horas > 40){
            horasE = horas - 40; 
            if(horasE <= 15){
                salarioB = horasE*beneficio;
            }
            else{
                salarioB =  15*beneficio;
            }
        }
        
        salarioF = (horas*35.99) + salarioB;
    
        System.out.println("*** DATOS DE SALARIO ***");
        System.out.println("Nombre del Empleado: " + nombre);
        System.out.println("Codigo del Empleado: " + cod);
        System.out.println("Horas Trabajadas: " + horas);
        System.out.println("Horas Extra: " + horasE);
        System.out.println("Categoria del Empleado: " + categoria);
        System.out.println("Beneficio por Categoria "+ beneficio + "$/horas extra");
        System.out.println("Salario por horas extra " + String.format("%.2f", salarioB) + "$");
        System.out.println("Salario Final " + String.format("%.2f", salarioF)+ "$");
    }
    
}
