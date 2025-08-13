// ELIANA CASTAÑO MORENO 
//ANALISIS

/* DESCRIPCION:
La calculadora deberá pedirle al usuario 2 números, y con esos 2 números
realizar: sumas, restas, multiplicación, división y la operación módulo.

INPUTS: 2
1. Number 1
2. Number 2
Ambos inputs son ingresados por el usuario 

OUTPUTS: 5 una por cada resultado de la operación aritmética*/

import java.util.Scanner;

public class Calculadora{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double number1,number2;
        System.out.println("Ingrese su primer numero: ");
        number1 = input.nextDouble();
        input.nextLine();
       // System.out.println("El primer numero que ingresaste es: " + number1);
       
        System.out.println("Ingrese su segundo numero: ");
        number2 = input.nextDouble();
        input.nextLine();
       
        double suma, resta, multiplicacion, modulo, division; // Declaracion variables
        suma = sumar(number1, number2);
        resta = restar(number1, number2);
        multiplicacion = multiplicar(number1, number2);
        modulo = modular(number1, number2);
        division = dividir(number1, number2);

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado del modulo es: " + modulo);
        System.out.println("El resultado de la division es: " + division);
    }

    public static double sumar(double a, double b) {
        double suma = a + b;
        return suma; 
    }
    
    public static double restar(double a, double b) {
        double resta = a - b;
        return resta; 
    }

    public static double multiplicar(double a, double b) {
        double multiplicacion = a * b;
        return multiplicacion; 
    }
    public static double modular(double a, double b) {
        double modulo = a % b;
        return modulo; 
    }

    public static double dividir(double a, double b) {
        double division = a / b;
        return division; 
    }

}