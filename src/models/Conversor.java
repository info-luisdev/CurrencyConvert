package models;

import java.util.Scanner;

import APIs.ConsultarValorMoneda;
import records.DivisaRecord;

public class Conversor {

    public void ConvertirDivisa(String valorDeVenta, String valorDeCompra){  
        
        Scanner lectura = new Scanner(System.in);
        ConsultarValorMoneda consultar = new ConsultarValorMoneda();


        System.out.println("\nIngrese el Importe que deseas convertir: \n");
        double importe = lectura.nextDouble();

        if (importe > 0) {
            DivisaRecord divisa = consultar.convertirDivisas(valorDeVenta, valorDeCompra, importe);
            System.out.println("\nEl valor " + "[" + divisa.base_code() + "]" + " corresponde al valor final de =>>> " + divisa.conversion_result() + " [" + divisa.target_code() + "]");
       
        } else {
            System.out.println("\nError: Ingrese un importe valido -> ");
            ConvertirDivisa(valorDeVenta, valorDeCompra);
        }
    
    }

}
