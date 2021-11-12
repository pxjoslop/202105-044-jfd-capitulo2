package edu.cibertec.capitulo2.ejercicio3.ejecucion;
/*
    Tener cuidado con la clase "Calculadora" que se importa!
    Debe venir del paquete ejercicio3.logica
*/
import edu.cibertec.capitulo2.ejercicio3.logica.Calculadora;
import java.util.Scanner;
/**
 * Clase ejecutora de la calculadora
 * @author DCA - Cibertec
 */
public class Ejecutora {
    
    public static void main(String[] args) {
        int operador1 = 15;
        int operador2 = 25;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el operador 1:");
        operador1 = scanner.nextInt();
        System.out.println("Ingrese el operador 2:");
        operador2 = scanner.nextInt();
        scanner.close();
        
        //Creamos una instancia de la clase Calculadora para poder
        //    ejecutar sus métodos
        Calculadora clase = new Calculadora();
        System.out.println("La suma es = "+
                clase.sumar(operador1, operador2));
        System.out.println("La resta es = "+
                clase.restar(operador1, operador2));
        System.out.println("La multiplicación es = "+
                clase.multiplicar(operador1, operador2));
        System.out.println("La división es = "+
                clase.dividir(operador1, operador2));
    }
    
}
