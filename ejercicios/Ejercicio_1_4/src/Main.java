//EJERCICIO 1.4:

//a) Imprime la tabla de multiplicar del 1 al 10 formateada como una cuadrícula usando bucles anidados.
//La salida debe verse así:

//        1    2    3   ...   10
//        2    4    6   ...   20
//        ...
//        10   20   30  ...  100

//b) Usando un bucle for y break, determina si el número 97 es primo (un primo solo es divisible por 1 y por sí mismo).
//Muestra los divisores que encuentres.

//c) Usando continue, imprime todos los números del 1 al 50 que NO sean divisibles ni por 3 ni por 7.

public class Main {
    public static void main(String[] args) {

        //a)

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {

                System.out.printf(" %2d " , i * j);
            }

            System.out.println();
        }



    }
}