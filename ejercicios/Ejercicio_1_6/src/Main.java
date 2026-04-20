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

        sum();
        sub();
        multiplication();
        division();





    }
    //region SELECT
    public static int select(){
        String select = in.leerLine("Please, choose between (sum, sub, mult or div): ");
        if (select == sum()){
            sum();
        } else if (select == sub){
            sub();
        } else if (select == multiplication){
            multiplication();
        } else (select == division){
            division();
        }
    }
    //endregion
    //region INPUT
    public static int [] input (){

        int firstNumber = in.leerInt("Enter the first integer: ");
        int secNumber = in.leerInt("Enter the second integer: ");

        int numbers[] = {firstNumber, secNumber};

        return numbers;
    }
    //endregion
    //region SUM
    public static int sum(){

        int [] numbers = input();
        System.out.println(numbers[0]+numbers[1]);

        return numbers[0]+numbers[1];
    }
    //endregion
    //region SUBTRACTION
    public static int sub(){

        int [] numbers = input();
        System.out.println(numbers[0]-numbers[1]);

        return numbers[0]-numbers[1];
    }
    //endregion
    //region MULTIPLICATION
    public static int multiplication(){
        int [] numbers = input();
        System.out.println(numbers[0]*numbers[1]);

        return numbers[0]*numbers[1];
    }

    //endregion
    //region DIVISION
    public static int division(){
        int [] numbers = input();
        System.out.println(numbers[0]/numbers[1]);

        return numbers[0]/numbers[1];
    }
    //endregion
}