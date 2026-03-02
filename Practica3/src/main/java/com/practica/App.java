package com.practica;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Por favor, ingrese el primer número:");
        double num1 = Double.parseDouble(System.console().readLine());
        System.out.println("Por favor, ingrese el segundo número:");
        double num2 = Double.parseDouble(System.console().readLine());

        Operacion operacion = new Operacion(num1, num2);

        System.out.println("Suma: " + operacion.suma());
        System.out.println("Resta: " + operacion.resta());
        System.out.println("Multiplicación: " + operacion.multiplicacion());
        System.out.println("División: " + operacion.division());
    }
}
