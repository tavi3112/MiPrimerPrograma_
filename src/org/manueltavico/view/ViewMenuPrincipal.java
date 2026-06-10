package org.manueltavico.view;

import java.util.Scanner;

public class ViewMenuPrincipal {
    int opcionMenu = 0;
    Scanner leer = new Scanner(System.in);
    
    public void mostrarMenu() {
        
        while (opcionMenu == 0) {
            System.out.println("\n--- BIENVENIDO ---");
            System.out.println("1. Operaciones matemáticas");
            System.out.println("2. Operaciones de texto");
            System.out.println("3. Operaciones de lógica");
            System.out.println("4. Salir del sistema");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcionMenu = Integer.parseInt(leer.nextLine());
                
                switch (opcionMenu) {
                    case 1:
                        System.out.println("Has seleccionado: Operaciones matemáticas");
                        opcionMenu = 0;
                        break;
                    case 2:
                        System.out.println("Has seleccionado: Operaciones de texto");
                        opcionMenu = 0;
                        break;
                    case 3:
                        System.out.println("Has seleccionado: Operaciones de lógica");
                        opcionMenu = 0;
                        break;
                    case 4:
                        System.out.println("Saliendo del sistema... ¡Adiós!");
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                        opcionMenu = 0;
                        break;
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese un número válido.");
                opcionMenu = 0;
            }
        }
    }
}
