
package org.manueltavico.controller;


public class controllerLogica {
    
public boolean verificadorDeEdad
        (int edad) { return edad >= 18;
}

    public boolean numeroPar
        (int numero) { return numero % 2 == 0; 
    }
    
    public String semaforo(String color) { 
        if (color.equalsIgnoreCase("rojo")) return "Detenerse";
        if (color.equalsIgnoreCase("amarillo")) return "Precaución";
        return "Avanzar";
    }
    
    public boolean rangoNumerico
        (int numero, int min, int max) { return numero >= min && numero <= max; 
    }
        
    public boolean loginSimple
        (String usuario, String pass) { return usuario.equals("admin") && pass.equals("1234");
        }
        
    public int mayorDeDos
        (int n1, int n2) { return (n1 > n2) ? n1 : n2; 
    }
        
    public boolean añoBisiesto
        (int anio) { return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        }
        
    public boolean aprobadoReprobado
        (double nota) { return nota >= 60;
        }
        
    public boolean validadorDeTriangulo
        (double l1, double l2, double l3) { return (l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1); 
        }
        
        
}
