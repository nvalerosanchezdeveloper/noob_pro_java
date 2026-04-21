//EJERCICIO 1.6:

//Implementa una calculadora con métodos separados: sumar, restar, multiplicar,
//dividir (que devuelva un String con mensaje de error si el divisor es 0 en lugar de
//        lanzar excepción). Añade:- Un método recursivo para calcular la potencia (base^exponente)
//        sin usar Math.pow()- Un método que determine si un número es perfecto (un número perfecto es igual a la suma de
//        sus divisores propios: 6 = 1+2+3)- Un método esPalindromo(String texto) que determine si una palabra se lee igual al
//        revés.

import lib.in;

public class Main {
    public static void main(String[] args) {
        select();
    }

    //region SELECT
    public static void select(){
        String select = in.leerLine("Please, choose between (sum, sub, mult, div, pow, perfect or palindrome): ");

        if (select.equals("sum")){
            System.out.println(sum());
        } else if (select.equals("sub")){
            System.out.println(sub());
        } else if (select.equals("mult")){
            System.out.println(multiplication());
        } else if (select.equals("div")){
            System.out.println(division());
        } else if (select.equals("pow")) {
            int base = in.leerInt("Enter base: ");
            int exp = in.leerInt("Enter exponent: ");
            System.out.println(power(base, exp));
        } else if (select.equals("perfect")) {
            int numero = in.leerInt("Enter a number: ");
            System.out.println(isPerfect(numero) ? numero + " es perfecto" : numero + " no es perfecto");
        } else if (select.equals("palindrome")) {
            String texto = in.leerLine("Enter a word: ");
            System.out.println(isPalindrome(texto) ? texto + " es palíndromo" : texto + " no es palíndromo");
        } else {
            System.out.println("Opción no válida");
        }
    }
    //endregion

    //region INPUT
    public static int[] input(){
        int firstNumber = in.leerInt("Enter the first integer: ");
        int secNumber = in.leerInt("Enter the second integer: ");
        int[] numbers = {firstNumber, secNumber};
        return numbers;
    }
    //endregion

    //region SUM
    public static int sum(){
        int[] numbers = input();
        return numbers[0] + numbers[1];
    }
    //endregion

    //region SUBTRACTION
    public static int sub(){
        int[] numbers = input();
        return numbers[0] - numbers[1];
    }
    //endregion

    //region MULTIPLICATION
    public static int multiplication(){
        int[] numbers = input();
        return numbers[0] * numbers[1];
    }
    //endregion

    //region DIVISION
    public static String division(){
        int[] numbers = input();
        if (numbers[1] == 0){
            return "Error: división por cero";
        } else {
            return String.valueOf(numbers[0] / numbers[1]);
        }
    }
    //endregion

    //region POWER
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
    //endregion

    //region PERFECT NUMBER
    public static boolean isPerfect(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }
    //endregion

    //region PALINDROME
    public static boolean isPalindrome (String texto) {
        String reversed = new StringBuilder(texto).reverse().toString();
        return texto.equals(reversed);
    }
    //endregion
}