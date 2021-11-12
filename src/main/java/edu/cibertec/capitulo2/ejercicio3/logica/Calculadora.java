/*
 * Clase encargada de la lógica de negocio de la calculadora
 */
package edu.cibertec.capitulo2.ejercicio3.logica;

/**
 * Clase calculadora que cuenta con las operaciones básicas
 * @author DCA - Cibertec
 */
public class Calculadora {

    /**
     * Método que suma 2 operadores enteros
     * @param opera1 - Operador1
     * @param opera2 - Operador2
     * @return - Número entero con el resultado de la suma
     */
    public int sumar(int opera1, int opera2)
    {
        return opera1 + opera2;
    }
    
    public int restar(int opera1, int opera2)
    {
        return opera1 - opera2;
    }

    public int multiplicar(int opera1, int opera2)
    {
        return opera1 * opera2;
    }
    
    public int dividir(int opera1, int opera2)
    {
        return opera1 / opera2;
    }
   
}
