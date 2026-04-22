public class Persona {
    String name;
    int age;
    double height;


    //CONSTRUCTORES/ ATRIBUTOS
    public Persona(String name, int age, double height){

        this.name = name;
        this.age = age;
        this.height = height;

    }
    //MÉTODOS
    public void greet(){
        System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
    }
    public boolean isOver18(){

        if (this.age >= 18){
            return true;
        } else return false;
    }

    public String toString() {
        return "Nombre: " + name + ", Edad: " + age + ", Altura: " + height + "m";
    }



}
