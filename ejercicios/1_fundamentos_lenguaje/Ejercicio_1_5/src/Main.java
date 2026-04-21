//EJERCICIO 1.5: Sin usar Arrays.sort(), implementa el algoritmo Bubble Sort manualmente sobre este array:
//{64, 34, 25, 12, 22, 11, 90}. El Bubble Sort compara pares adyacentes y los intercambia si están en el orden incorrecto,
//repitiendo hasta que el array esté ordenado.
//Muestra el array después de cada "pasada" completa para ver el progreso.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int [] numbers = {64, 34, 25, 12, 22, 11, 90};

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length-1; j++) {

                if (numbers [j] > numbers [j+1]){

                    int aux = numbers [j];
                    numbers [j] = numbers [j+1];
                    numbers [j+1] = aux;

                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}