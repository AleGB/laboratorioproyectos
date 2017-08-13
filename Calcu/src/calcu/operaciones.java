/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

/**
 *
 * @author Usuario
 */
public class operaciones {
     public void suma(String operacion, int num1, int num2) {
        String suma = "suma";
        int resultado;
        if (suma.equalsIgnoreCase(operacion)) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma de los dos numeros es: " + resultado);
        }
    }

    public void resta(String operacion, int num1, int num2) {
        String resta = "resta";
        int resultado;
        if (resta.equalsIgnoreCase(operacion)) {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta de los dos numeros es: " + resultado);
        }
    }

    public void division(String operacion, int num1, int num2) {
        String divi = "division";
        int resultado;
        if (divi.equalsIgnoreCase(operacion)) {
            resultado = num1 / num2;
            System.out.println("El resultado de la division de los dos numeros es: " + resultado);
        }
    }

    public void multi(String operacion, int num1, int num2) {
        String multi = "multiplicacion";
        int resultado;
        if (multi.equalsIgnoreCase(operacion)) {
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicacion de los dos numeros es: " + resultado);
        }
    }
}
