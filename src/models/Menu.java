package models;

import java.util.Scanner;

public class Menu {

    private String mensaje;

    public void imprimirMenu(){
        mensaje = """

                +------------------------------------------+
                |         MENU CONVERSOR DE MONEDA         |
                +------------------------------------------+
                | 1) Dolar =>> Peso Argentino              |
                | 2) Peso Argentino =>> Dolar              |
                | 3) Dolar =>> Real Brasileño              |
                | 4) Real Brasileño =>> Dolar              |
                | 5) Dolar =>> Peso Colombiano             |
                | 6) Peso Colombiano =>> Dolar             | 
                | 7) Dolar =>> Peso Dominicano             | 
                | 8) Peso Dominicano =>> Dolar             | 
                | 9) Salir                                 |                             
                +------------------------------------------+
                | Elija una opcion valida:                 |
                +------------------------------------------+
                
                """;
        System.out.print(mensaje);
    }

    public void limpiarConsola(int opcion){

        if (opcion !=9) {
            
            Scanner lectura = new Scanner(System.in);
            System.out.println("\nPresione Enter para continuar...");
            lectura.nextLine();
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
               System.out.println("Error en la Operacion");
            }
        }
           

    }

}
