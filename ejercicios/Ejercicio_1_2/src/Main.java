//        EJERCICIO 1.2: Escribe un programa que calcule el área y perímetro de un rectángulo dado
//        su base (8.5) y altura (4.2). Muestra los resultados con dos decimales usando printf.También calcula cuántos
//        rectángulos enteros caben en un espacio de 100 unidades cuadradas (usa división entera).


public class Main {
    public static void main(String[] args) {

        double base = 8.5, height = 4.2;

        double area = base * height;
        double perimeter = 2*(base + height);

        System.out.print("Área del rectángulo: " + area + "\n" +
                         "Perímetro del rectángulo: " + perimeter);




    }
}