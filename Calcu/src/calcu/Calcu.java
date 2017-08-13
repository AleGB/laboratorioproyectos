/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calcu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 String operacion;
        int num1=0;
        int num2=0;
        operaciones objoperaciones = new operaciones();

        Scanner leer = new Scanner(System.in);
        System.out.println("Suma");
        System.out.println("Resta");
        System.out.println("Multiplicacion");
        System.out.println("Division");
        System.out.println("Elige la operacion que quieres realizar");
        operacion = leer.next();
        System.out.println("Ingresa el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        num2 = leer.nextInt();
        objoperaciones.suma(operacion, num1, num2);
        objoperaciones.multi(operacion, num1, num2);
        objoperaciones.division(operacion, num1, num2);
        objoperaciones.resta(operacion, num1, num2);
      }
    
}
