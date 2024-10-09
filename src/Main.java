import models.Conversor;
import models.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        Conversor conversor = new Conversor();
        Menu menu = new Menu();


        int opcion = 0;
        
        try {
            while (opcion != 9) {
                menu.imprimirMenu();
                opcion = lectura.nextInt();
                switch (opcion) {
                    case 1:
                        conversor.ConvertirDivisa("USD", "ARS");
                        break;
                    case 2:
                        conversor.ConvertirDivisa("ARS", "USD");
                        break;
                    case 3:
                        conversor.ConvertirDivisa("USD", "BRL");
                        break;
                    case 4:
                        conversor.ConvertirDivisa("BRL", "USD");
                        break;
                    case 5: 
                        conversor.ConvertirDivisa("USD", "COP");
                        break;
                    case 6:
                        conversor.ConvertirDivisa("COP", "USD");
                        break;
                    case 7:
                        conversor.ConvertirDivisa("USD", "DOP");
                        break;
                    case 8:
                        conversor.ConvertirDivisa("DOP", "USD");
                        break;
                    case 9:
                        System.out.println("Has salido del sistema exitosamente. ¡Hasta pronto!");
                        break;    
                    default:
                            System.out.println("\nError: Seleccione una opcion valida");
                        break;
                    }
                    menu.limpiarConsola(opcion);
            }
        }
        catch (InputMismatchException error) {
            System.out.println("Error de validación de entrada: La información ingresada no es válida. Verifica los datos e inténtalo de nuevo.");
        }
        lectura.close();
    }
}