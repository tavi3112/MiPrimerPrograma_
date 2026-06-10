
package org.manueltavico.view;

import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class ViewMenuPrincipal {
    //global
    int opcionMenu = 0;
    Scanner leer = new Scanner (System.in);
    
    public void mostrarMenu(){
        
          while (opcionMenu == 0){
               System.out.println("Bienvenidos, Seleccione una opcion");
               System.out.println("1. operaciones matematicas ");
               System.out.println("2. operaciones de texto");
               System.out.println("3. operaciones de lógica");
               System.out.println("4. salir del sistema");
               
         try {
                opcionMenu = Integer.parseInt(leer.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese un numero valido.");
                continue;
            }      
     S