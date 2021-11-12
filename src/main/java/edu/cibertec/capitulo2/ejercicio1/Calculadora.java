package edu.cibertec.capitulo2.ejercicio1;

public class Calculadora {
    
    int sumar(int opera1, int opera2)
    {
        return opera1 + opera2;
    }
    
    int restar(int opera1, int opera2)
    {
        return opera1 - opera2;
    }

    int multiplicar(int opera1, int opera2)
    {
        return opera1 * opera2;
    }
    
    int dividir(int opera1, int opera2)
    {
        return opera1 / opera2;
    }

    public static void main(String[] args) {
        int operando1 = 4;
        int operando2 = 3;
        
        Calculadora clase = new Calculadora();
        System.out.println("La suma es : " + 
                clase.sumar(operando1, operando2));
        System.out.println("La resta es : " + 
                clase.restar(operando1, operando2));
        System.out.println("La multiplicación es : " + 
                clase.multiplicar(operando1, operando2));
        System.out.println("La división es : " + 
                clase.dividir(operando1, operando2));
    }
    
}
