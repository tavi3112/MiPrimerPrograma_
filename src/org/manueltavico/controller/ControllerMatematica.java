
package org.manueltavico.controller;


public class ControllerMatematica {
    
    public double calcularSalario
        (double h, double p) { return h * p; 
    }
    
    public double areaTriangulo
        (double b, double h) { return (b * h) / 2;
    }
    
    public double promedioAcademico
        (double n1, double n2, double n3) { return (n1 + n2 + n3) / 3;
    }
    
    public double celsiusAFahrenheit
        (double c) { return (c * 9 / 5) + 32; 
    }
    
}

