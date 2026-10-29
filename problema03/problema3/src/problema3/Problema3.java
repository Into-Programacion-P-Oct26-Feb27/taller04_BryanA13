/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String nombre;
        String direccion;
        double costoMinuto;
        double minutos;
        double gastoTotal;
        
        System.out.println("Ingrese un nombre");
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
        
    }
    
    
}
