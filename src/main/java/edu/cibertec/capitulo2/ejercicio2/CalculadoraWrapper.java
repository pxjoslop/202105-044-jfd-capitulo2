package edu.cibertec.capitulo2.ejercicio2;

public class CalculadoraWrapper {

    Integer sumar(Integer opera1, Integer opera2)
    {
        return opera1 + opera2;
    }
    
    Long restar (Long opera1, Long opera2)
    {
        return opera1 - opera2;
    }
    
    Float multiplicar (Float opera1, Float opera2)
    {
        return opera1 * opera2;
    }
    
    Double dividir (Double opera1, Double opera2)
    {
        return opera1 / opera2;
    }

    public static void main(String[] args) {
        Double operando1 = 12.34;
        Double operando2 = 43.21;
        
        StringBuilder sb = new StringBuilder();
        
        CalculadoraWrapper clase = new CalculadoraWrapper();
        sb.append("La suma es = ").append(
                clase.sumar(operando1.intValue() , 
                        operando2.intValue()));
        sb.append("\n");
        sb.append("La resta es = ").append(
                clase.restar(operando1.longValue(), 
                        operando2.longValue()));
        sb.append("\n");
        sb.append("La multiplicación es = ").append(
                clase.multiplicar(operando1.floatValue(), 
                        operando2.floatValue()));
        sb.append("\n");
        sb.append("La división es = ").append(
                clase.dividir(operando1, operando2));
        System.out.println(sb);
    }
    
}
