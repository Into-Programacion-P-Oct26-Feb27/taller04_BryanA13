/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cliente;
        double precioNetflix;
        double precioYoutube;
        double precioDropbox;
        double precioSpotify;
        double descNetflix;
        double descYoutube;
        double descDropbox;
        double descSpotify;
        double finalNetflix;
        double finalYoutube;
        double finalDropbox;
        double finalSpotify;
        double costoSinDescuento;
        double ahorroTotal;
        double totalPagar;

        System.out.println("Ingrese nombre del cliente");
        cliente = entrada.nextLine();
        System.out.println("Ingrese precio mensual de Netflix");
        precioNetflix = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese precio mensual de YouTube Premium");
        precioYoutube = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese precio mensual de Dropbox");
     precioDropbox = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese precio mensual de Spotify");
        precioSpotify = entrada.nextDouble();

        descNetflix = precioNetflix * 0.23;
        descYoutube = precioYoutube * 0.23;
        descDropbox = precioDropbox * 0.45;
        descSpotify = 0;

        finalNetflix = precioNetflix - descNetflix;
        finalYoutube = precioYoutube - descYoutube;
        finalDropbox = precioDropbox - descDropbox;
        finalSpotify = precioSpotify - descSpotify;

        costoSinDescuento = precioNetflix + precioYoutube + precioDropbox + precioSpotify;
        ahorroTotal = descNetflix + descYoutube + descDropbox + descSpotify;
        totalPagar = finalNetflix + finalYoutube + finalDropbox + finalSpotify;

        System.out.printf("PLANILLA DE SERVICIOS DIGITALES\nCliente: %s\n"
            + "-------------------------\n"
            + "Servicio        Precio   Descuento   Final\n"
            + "Netflix:        $%.2f   $%.2f   $%.2f\n"
            + "YouTube:        $%.2f   $%.2f   $%.2f\n"
            + "Dropbox:        $%.2f   $%.2f   $%.2f\n"
            + "Spotify:        $%.2f   $%.2f   $%.2f\n"
            + "-------------------------\n"
            + "COSTO TOTAL SIN DESCUENTOS: $%.2f\nAHORRO MENSUAL TOTAL: $%.2f\n"
            + "TOTAL A PAGAR MENSUAL: $%.2f\n",
            cliente,
            precioNetflix,
            descNetflix,
            finalNetflix,
            precioYoutube,
            descYoutube,
            finalYoutube,
            precioDropbox,
            descDropbox,
            finalDropbox,
            precioSpotify,
            descSpotify,
            finalSpotify,
            costoSinDescuento,
            ahorroTotal,
            totalPagar);
    }
    
}
