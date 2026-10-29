/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String nombreProyecto1;
        String nombreProyecto2;
        String nombreProyecto3;
        double gasto1;
        double gasto2;
        double gasto3;
        double gastoMensual;
        
        System.out.println("Ingrese nombre del Proyecto 1");
        nombreProyecto1 = entrada.nextLine();
        System.out.println("Ingrese gasto mensual");
        gasto1 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese nombre del Proyecto 2");
        nombreProyecto2 = entrada.nextLine(); 
        System.out.println("Ingrese gasto mensual");
        gasto2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese nombre del Proyecto 3");
        nombreProyecto3 = entrada.nextLine(); 
        System.out.println("Ingrese gasto mensual");
        gasto3 = entrada.nextDouble();
        
        gastoMensual = gasto1 + gasto2 + gasto3; 
        
        System.out.printf("CONTROL DE GASTOS DE PROYECTOS\nProyectos\n-------------\n"
                + "1. %s: $%.2f\n2. %s: $%.2f\n3. %s: $%.2f\n---------\nGASTO MENSUAL TOTAL $%.2f\n ",
                nombreProyecto1,
                gasto1,
                nombreProyecto2,
                gasto2,
                nombreProyecto3,
                gasto3,
                gastoMensual);
        
        
        
        
       
    }
    
}
