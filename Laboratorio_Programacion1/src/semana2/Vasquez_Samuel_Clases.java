/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;
import java.util.Scanner;

public class Vasquez_Samuel_Clases {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        String fecha, dia, numDia, nuMes, examOpc;
        int alumA, alumR, alumF;
        double asist;
        
        System.out.println("--------Bienvenido a la Academia de Ingles--------");
        System.out.print("Porfavor, fecha en el siguiente formato (Dia, DD/MM), ejemplo: Lunes, 11/12: ");
        fecha = entrada.next().toLowerCase();
        
        if(fecha.contains(", ") && fecha.contains("/")){
            dia = fecha.substring(0, fecha.indexOf(","));
            numDia = fecha.substring(fecha.indexOf(" ") + 1, fecha.indexOf("/"));
            nuMes = fecha.substring(fecha.indexOf("/") + 1);
        }
        else{
            System.out.println("ERROR, porfavor introduzca la informacion en el formato solicitado!");
            return;
        }
        
        if(Integer.parseInt(numDia) > 31){
            System.out.println("ERROR, ha superado el numero de dias permitido (31), porfavor, intente de nuevo");
            return;
        }
        else if (Integer.parseInt(nuMes) > 12){
            System.out.println("ERROR, ha superado el numero de mes permitido (12), porfavor, intente de nuevo");
            return;
        }
       
        
        if (dia.toLowerCase().equals("lunes") || dia.toLowerCase().equals("martes") || dia.toLowerCase().equals("miercoles") || dia.toLowerCase().equals("jueves") || dia.toLowerCase().equals("viernes") ){
            if(dia.toLowerCase().equals("lunes") || dia.toLowerCase().equals("martes") || dia.toLowerCase().equals("miercoles"))
            {
                System.out.println("Por lo visto, usted introducio: "+ dia);
                System.out.print("Dejo algun examen ese dia? (Si o No): ");
                examOpc = entrada.next().toLowerCase();
                if(examOpc.toLowerCase().equals("si")){
                    System.out.println("Introduzca el porcentaje de sus alumnos aprovados");
                    alumA = entrada.nextInt();
                    System.out.println("Introduzca la cantidad de alumnos que no");
                    alumR = entrada.nextInt();
                    
                    alumF = (alumA * 100)/(alumA + alumR);
                    if(alumF > 50){
                        System.out.println("Ha aprobado el: "+ alumF + "%");
                        System.out.println("La mayoria ha aprobado");
                        System.out.println("*******FIN DEL PROGRAMA*******");
                    }
                    else{
                        System.out.println("Ha aprobado el: "+ alumF + "%");
                        System.out.println("La minoria ha aprobado");
                        System.out.println("*******FIN DEL PROGRAMA*******");
                    }
                }
                else if(examOpc.toLowerCase().equals("no")){
                    System.out.println("*******FIN DEL PROGRAMA*******");
                }
                else{
                    System.out.println("Solo hay dos opciones, intentelo de nuevo");
                   
                }
            }
            else if(dia.toLowerCase().equals("jueves")){
                
                System.out.println("Al ser el dia:" + dia);
                System.out.print("Introduzca el porcentaje de asistencia de los alumnos: ");
                asist = entrada.nextDouble();
                String asisDe = (asist > 50) ? "La mayoria ha asistido" : "No asistio la mayoria" ; 
                System.out.println(asisDe);  
            }
            else{
               if(Integer.parseInt(numDia) == 1 && Integer.parseInt(nuMes) == 7){
                   System.out.println("Comienzo Nuevo Ciclo");
                   System.out.print("Ingrese cantidad de alumnos del nuevo ciclo");
                   int alumNC = entrada.nextInt();
                   System.out.println("Ingrese el precio en $ por cada alumno");
                   double precio = entrada.nextInt();
                   
                   double fN = alumNC*precio;
                   System.out.println("Esto es lo que cobrara:"+ String.format("%.2f", fN) + "$");
               }    
            }
        }
        else{
            System.out.println("ERROR, porfavor introduzca uno de los 5 dias de la semana porfavor");
            
        }
    }
    
}
