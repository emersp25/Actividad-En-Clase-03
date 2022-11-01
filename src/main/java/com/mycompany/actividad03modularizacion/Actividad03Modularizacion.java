package com.mycompany.actividad03modularizacion;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class Actividad03Modularizacion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int operacion;
        float numeroUno, numeroDos, res;
        
        operacion = 0;
        numeroUno = numeroDos = res = 0.0f;
        
        System.out.println("Calculadora");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Division");
        System.out.print("Ingrese la operación que desea realizar: ");
        
        operacion = scan.nextInt();

        System.out.print("Ingrese el primer operando: ");
        numeroUno = scan.nextFloat();
        System.out.print("Ingrese el segundo operando: ");
        numeroDos = scan.nextFloat();
        
        switch (operacion) {
            case 1: res = suma(numeroUno, numeroDos);
                    break;
            case 2: res = resta(numeroUno, numeroDos);
                    break;
            case 3: res = multiplicacion(numeroUno, numeroDos);
                    break;
            case 4: res = division(numeroUno, numeroDos);
                    break;
        }
         System.out.println("El resultado de la operación es: " + res);
    }
    //Aquí creamos los nuevos métodos
    //Parámetros
    public static float suma(float operandoUno, float operandoDos) {
        float resultado;
        resultado = 0.0f;
        resultado = operandoUno + operandoDos;
        return resultado;
    }
    
    public static float resta(float operandoUno, float operandoDos) {
        float resultado;
        resultado = 0.0f;
        resultado = operandoUno - operandoDos;
        return resultado;
    }
    
    public static float multiplicacion(float operandoUno, float operandoDos) {
        float resultado;
        resultado = 0.0f;
        resultado = operandoUno * operandoDos;
        return resultado;
    }
    
    public static float division(float operandoUno, float operandoDos) {
        float resultado;
        resultado = 0.0f;
        resultado = operandoUno / operandoDos;
        return resultado;
    }
}
