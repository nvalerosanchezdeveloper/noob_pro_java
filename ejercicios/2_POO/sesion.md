# 📓 Resumen de sesión — Java de Noob a Pro

## ¿Dónde estamos?

Estamos en el **Nivel 2 — POO**, Tema 2.1 — Clases y Objetos.

---

## ✅ Nivel 1 — Completado

Se completaron todos los ejercicios del nivel 1, incluyendo:

- **Ejercicio 1.5** — Bubble Sort (arrays, bucles, swap de variables)
- **Ejercicio 1.6** — Calculadora completa con:
  - `sum()`, `sub()`, `multiplication()`, `division()` — operaciones básicas
  - `power(int base, int exponent)` — método **recursivo** sin usar `Math.pow()`
  - `esPerfecto(int numero)` — detecta números perfectos (6 = 1+2+3)
  - `esPalindromo(String texto)` — usa `StringBuilder.reverse()`
  - Menú de selección con `select()` que enruta a cada operación

---

## 🔵 Nivel 2 — POO (en progreso)

### Acuerdo de trabajo:
- Explicaciones súper simples, con analogías
- Mini-ejercicios pequeños antes del ejercicio grande de cada tema
- Ladrillo a ladrillo, sin prisas

---

### Tema 2.1 — Clases y Objetos (en progreso)

#### ✅ Mini-ejercicios completados:

**Mini-ejercicio 1** — Crear `Persona.java` con tres atributos:
```java
public class Persona {
    String name;
    int age;
    double height;
}
```

**Mini-ejercicio 2** — Crear un objeto con `new` y asignar atributos con el punto:
```java
Persona nico = new Persona();
nico.name = "Nicolás";
nico.age = 26;
nico.height = 1.63;
```

**Mini-ejercicio 3** — Añadir constructor con `this`:
```java
public Persona(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
}
```
- `this.name` = atributo del objeto
- `name` = parámetro que recibe el constructor
- Desde `Main` se usa `nico.name`, desde dentro de la clase se usa `this.name`

**Mini-ejercicio 4** — Añadir método `void` (no devuelve nada, solo imprime):
```java
public void greet() {
    System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
}
```
Llamado desde Main con `nico.greet()`

**Mini-ejercicio 5** — Añadir método con `return` (devuelve un valor):
```java
public boolean isOver18() {
    if (this.age >= 18) {
        return true;
    } else {
        return false;
    }
}
```
Llamado desde Main con `System.out.println(nico.isOver18())`

---

#### 🔜 Siguiente paso: Mini-ejercicio 6 — `toString()`

Probar `System.out.println(nico)` sin atributos — imprimirá algo como `Persona@4d7e1886`.
Luego añadir `toString()` a `Persona.java` para controlar qué se imprime al hacer `System.out.println(objeto)`.

---

## Estado actual de los archivos

**Persona.java:**
```java
public class Persona {
    String name;
    int age;
    double height;

    public Persona(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void greet() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
    }

    public boolean isOver18() {
        if (this.age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
```

**Main.java:**
```java
public class Main {
    public static void main(String[] args) {
        Persona nico = new Persona("Nicolás", 26, 1.63);
        System.out.println(nico.name);
        System.out.println(nico.age);
        System.out.println(nico.height + "m");
        nico.greet();
        System.out.println(nico.isOver18());
    }
}
```

---

## 🧠 Cosas que le cuestan más a Nico

- Off-by-one errors en bucles (`<` vs `<=`)
- Conceptos muy abstractos sin ejemplo visual concreto
- La recursión le cuesta un poco al principio
- Confunde `void` y `boolean` a la vez (no puede haber los dos)
- `True` en mayúscula (en Java es `true`)
- `static` en métodos de clase (los métodos de instancia no llevan `static`)

## 💡 Cosas que le funcionan bien

- Analogías visuales y tablas paso a paso
- Mini-ejercicios incrementales
- Que le den el código cuando ya entiende el concepto y quiere avanzar
- Inglés para nombrar variables y métodos

---

## 📁 Archivos importantes
- Guía completa: adjuntar `noob_pro_java.md` al inicio de cada sesión
- El filesystem de Claude se resetea entre sesiones — adjuntar siempre la guía
