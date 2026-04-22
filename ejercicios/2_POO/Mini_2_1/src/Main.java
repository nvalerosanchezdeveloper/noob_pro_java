

public class Main {
    public static void main(String[] args) {

        Persona nico = new Persona ("Nicolás", 26, 1.63);


        System.out.println(nico.name);
        System.out.println(nico.age);
        System.out.println(nico.height + "m");
        nico.greet();
        System.out.println(nico.isOver18());

        System.out.println(nico);
        System.out.println(nico.toString());
    }
}

