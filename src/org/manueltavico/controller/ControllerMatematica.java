
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
    
        public double perimetroCirculo
        (double r) { return 2 * Math.PI * r; 
        }
        
    public double volumenCilindro
        (double r, double h) { return Math.PI * Math.pow(r, 2) * h; 
        }
        
    public double hipotenusa
        (double a, double b) { return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        }
        
    public int diasAMinutos
        (int d) { return d * 24 * 60;
        }
    public int restoDivision
        (int n1, int n2) { return n1 % n2;
        }
        
    public int potenciaCubo
        (int n) { return (int) Math.pow(n, 3);
    }
}

