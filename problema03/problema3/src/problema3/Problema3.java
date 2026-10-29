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
        
        String titular;
        String direccion;
        double costoMinuto;
        int minutos;
        double valorTotal;

        System.out.println("Ingrese nombre del titular");
        titular = entrada.nextLine();
        System.out.println("Ingrese direccion");
        direccion = entrada.nextLine();
        System.out.println("Ingrese costo por minuto");
        costoMinuto = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese minutos consumidos");
        minutos = entrada.nextInt();

        valorTotal = costoMinuto * minutos;

        System.out.printf("=========================\nPLANILLA DE SERVICIO TELEFÓNICO\n==========================\n"
            + "Titular: %s\nDirección: %s\n-------------------------------------\n"
            + "Costo por minuto: $%.2f\nMinutos consumidos: %d\n-------------------------------------\n"
            + "VALOR TOTAL A PAGAR:  $%.2f\n===================================\n",
            titular,
            direccion,
            costoMinuto,
            minutos,
            valorTotal);
        
    }
    
    
}
