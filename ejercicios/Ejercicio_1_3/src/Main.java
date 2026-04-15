//EJERCICIO 1.3:

// Crea un programa que lea una temperatura (hardcodeada) en Celsius y la clasifique como:
//Muy frío (<0), Frío (0-15), Agradable (16-25), Caluroso (26-35), Extremo (>35).
//Luego, usando switch expression, muestra qué ropa recomiendas para ese rango de temperatura.

import lib.in;

public class Main {
    public static void main(String[] args) {

        int temperature = 20;
        String category;

        if (temperature < 0) {
            category = "Freezing";
        } else if (temperature <= 15) {
            category = "Cold";
        } else if (temperature <= 25) {
            category = "Warm";
        } else if (temperature <= 35) {
            category = "Hot";
        } else category = "Extreme";

        String clothes = switch (category){
            case "Freezing"             -> System.out.println("Coat, hat and gloves");
            case "Cold"                 -> System.out.println("Coat");
            case "Warm"                 -> System.out.println("Chill");
            case "Hot"                  -> System.out.println("T-Shirt");
            case "Extreme"              -> System.out.println("Bruh, go to the beach please");
        }
        System.out.println(clothes);





    }
}