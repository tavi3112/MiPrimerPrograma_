/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.manueltavico.controller;


public class ControllerTexto {
    public String concatenadorDeNombre
        (String nombre, String apellido) { return nombre + " " + apellido; 
    }
     
    public int contadorDeLongitud
        (String palabra) { return palabra.length(); 
        }
        
    public String inversorDeTexto
        (String palabra) { return new StringBuilder(palabra).reverse().toString(); 
        }
        
    public boolean detectorDeVocales
        (char caracter) { return "aeiouAEIOU".indexOf(caracter) != -1; 
        }
        
    public String extractorDeIniciales
        (String nombre, String apellido) { return "" + nombre.charAt(0) + apellido.charAt(0); 
        }
        
    public String normalizadorAMayusculas
        (String texto) { return texto.toUpperCase();
        }
        
    public String conversorBinario
        (String binario) { return (binario.length() % 2 == 0) ? "Par" : "Impar";
        }
        
    public String repetidorDePalabras
        (String palabra, int n) { return palabra.repeat(n);
    }
        
    public String validadorDePassword
        (String password) { return (password.length() > 8) ? "Segura" : "Insegura";
        }    
        
        public String generadorDeEmail(String nombre, String apellido, String dominio) { return nombre.toLowerCase() + "." + apellido.toLowerCase() + "@" + dominio;
        }
}


