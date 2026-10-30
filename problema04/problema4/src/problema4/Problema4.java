/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String cliente;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double costoBase;
        double costoOperacional;
        double costoFinal;

        System.out.println("Ingrese nombre del cliente");
        cliente = entrada.nextLine();
        System.out.println("Ingrese costo del CPU");
        cpu = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese costo del teclado");
        teclado = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese costo del raton");
        raton = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese costo de la pantalla");
        pantalla = entrada.nextDouble();

        costoBase = cpu + teclado + raton + pantalla;
        costoOperacional = costoBase * 0.15;
        costoFinal = costoBase + costoOperacional;

        System.out.printf("Reporte:\nNombres de cliente: %s\nValores iniciales:\n"
            + "CPU:  $ %.2f\nTeclado: $ %.2f\nRatón: $ %.2f\nPantalla: $ %.2f\n\n"
            + "Costo base: $ %.2f\nCosto adicional del 15%%: %.2f\n"
            + "Costo final: $ %.2f\n",
            cliente,
            cpu,
            teclado,
            raton,
            pantalla,
            costoBase,
            costoOperacional,
            costoFinal);
    }
    
}
