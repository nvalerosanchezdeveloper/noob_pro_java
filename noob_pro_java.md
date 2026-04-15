# 🚀 JAVA: DE NOOB A PRO — Temario Completo Escalonado

**Tu misión:** Convertirte en un desarrollador Java de élite. Cada nivel construye sobre el anterior. No saltes niveles. El ejercicio al final de cada tema es OBLIGATORIO.

---

## 📌 ÍNDICE DE NIVELES

- 🟢 **NIVEL 1 — Novato Absoluto** (Fundamentos del lenguaje)  
- 🔵 **NIVEL 2 — Aprendiz** (Programación Orientada a Objetos)  
- 🟡 **NIVEL 3 — Intermedio** (Colecciones, Excepciones y E/S)  
- 🟠 **NIVEL 4 — Avanzado** (Concurrencia, Genéricos y Streams)  
- 🔴 **NIVEL 5 — Experto** (JVM internals, Patrones, Arquitectura)  
- ⚫ **NIVEL 6 — Pro Absoluto** (Rendimiento, Metaprogramación, Ecosistema)

---

## 🟢 NIVEL 1 — NOVATO ABSOLUTO

### Tema 1.1 — ¿Qué es Java? Entorno y herramientas

- Historia y filosofía: *"Write Once, Run Anywhere"*  
- JDK vs JRE vs JVM — diferencias fundamentales  
- Instalación de JDK (versión LTS recomendada: Java 21\)  
- Tu primer programa: `Hello, World!`  
- Compilar con `javac` y ejecutar con `java`  
- Estructura básica de un archivo `.java`

public class HolaMundo {

    public static void main(String\[\] args) {

        System.out.println("¡Hola, mundo Java\!");

    }

}

**🏋️ EJERCICIO 1.1:** Crea un programa que imprima tu nombre, tu edad y tu objetivo con Java, cada dato en una línea diferente. Compílalo y ejecútalo desde la terminal **sin IDE**.

---

### Tema 1.2 — Variables, Tipos de Datos y Operadores

- Tipos primitivos: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`  
- Tipos referencia: `String`, arrays  
- Declaración, inicialización y asignación  
- Literales y conversión de tipos (casting implícito/explícito)  
- Operadores: aritméticos, relacionales, lógicos, bit a bit, ternario  
- `var` (inferencia de tipo local — Java 10+)

int edad \= 25;

double salario \= 1500.50;

boolean activo \= true;

String nombre \= "Java";

var ciudad \= "Madrid"; // infiere String

**🏋️ EJERCICIO 1.2:** Escribe un programa que calcule el área y perímetro de un rectángulo dado su base y altura (hardcodeadas). Muestra los resultados con dos decimales usando `printf`.

---

### Tema 1.3 — Control de Flujo: Condicionales

- `if`, `if-else`, `else if`  
- Operador ternario `? :`  
- `switch` clásico y `switch expression` (Java 14+)  
- Evaluación de condiciones y cortocircuito (`&&`, `||`)

int nota \= 75;

String resultado \= switch (nota / 10\) {

    case 10, 9 \-\> "Sobresaliente";

    case 8     \-\> "Notable";

    case 7, 6  \-\> "Bien";

    default    \-\> "Suspenso";

};

**🏋️ EJERCICIO 1.3:** Crea un programa que lea una temperatura (hardcodeada) en Celsius y la clasifique como: `Muy frío (<0)`, `Frío (0-15)`, `Agradable (16-25)`, `Caluroso (26-35)`, `Extremo (>35)`. Usa `switch expression`.

---

### Tema 1.4 — Control de Flujo: Bucles

- `for` clásico  
- `while` y `do-while`  
- `for-each` (enhanced for)  
- `break`, `continue` y etiquetas (labels)  
- Bucles anidados y su complejidad

**🏋️ EJERCICIO 1.4:** Imprime la tabla de multiplicar del 1 al 10 formateada como una cuadrícula. Luego, usando un bucle, determina si un número hardcodeado es primo.

---

### Tema 1.5 — Arrays

- Arrays unidimensionales: declaración, inicialización, acceso  
- Arrays multidimensionales (matrices)  
- `Arrays` utility class: `sort()`, `fill()`, `copyOf()`, `toString()`  
- Recorrido con `for-each`  
- Limitaciones de los arrays vs colecciones

int\[\] numeros \= {5, 3, 8, 1, 9, 2};

Arrays.sort(numeros);

System.out.println(Arrays.toString(numeros)); // \[1, 2, 3, 5, 8, 9\]

**🏋️ EJERCICIO 1.5:** Sin usar `Arrays.sort()`, implementa el algoritmo **Bubble Sort** manualmente sobre un array de 10 enteros. Muestra el array en cada iteración para visualizar el proceso.

---

### Tema 1.6 — Métodos (Funciones)

- Definición de métodos: modificadores, tipo de retorno, parámetros  
- `return` y métodos `void`  
- Paso por valor (primitivos) vs paso por referencia (objetos)  
- Sobrecarga de métodos (Method Overloading)  
- Recursividad: casos base y recursivos  
- Métodos `static` vs de instancia

**🏋️ EJERCICIO 1.6:** Implementa una calculadora con métodos separados para `sumar`, `restar`, `multiplicar`, `dividir` (con manejo de división por cero). Añade un método recursivo para calcular el **factorial** y otro para la secuencia de **Fibonacci**.

---

## 🔵 NIVEL 2 — APRENDIZ (POO)

### Tema 2.1 — Clases y Objetos

- Paradigma OOP vs programación procedural  
- Definición de clases: atributos y métodos  
- Constructores: por defecto, parametrizados, sobrecargados  
- La referencia `this`  
- Instanciación con `new` y gestión de memoria (heap vs stack)  
- `toString()`, `equals()`, `hashCode()` — por qué importan

public class Persona {

    private String nombre;

    private int edad;

    public Persona(String nombre, int edad) {

        this.nombre \= nombre;

        this.edad \= edad;

    }

    @Override

    public String toString() {

        return "Persona{nombre='" \+ nombre \+ "', edad=" \+ edad \+ "}";

    }

}

**🏋️ EJERCICIO 2.1:** Modela una clase `CuentaBancaria` con atributos `titular`, `saldo` y `numeroCuenta`. Implementa métodos `depositar(double cantidad)`, `retirar(double cantidad)` (con validación de saldo suficiente) y `mostrarEstado()`. Crea 3 instancias y realiza operaciones entre ellas.

---

### Tema 2.2 — Encapsulamiento

- Modificadores de acceso: `public`, `private`, `protected`, package-private  
- Getters y setters — cuándo usarlos y cuándo no  
- Inmutabilidad: la palabra clave `final`  
- Clases inmutables — diseño y ventajas  
- Principio de mínimo privilegio

**🏋️ EJERCICIO 2.2:** Refactoriza la clase `CuentaBancaria` del ejercicio anterior para que sea completamente encapsulada. Luego crea una versión inmutable `CuentaBancariaInmutable` donde saldo y titular nunca puedan cambiar tras la creación.

---

### Tema 2.3 — Herencia

- `extends` y la jerarquía de clases  
- `super` — llamada al constructor y métodos del padre  
- Sobrescritura de métodos (`@Override`)  
- La clase `Object` como raíz de toda jerarquía  
- `instanceof` y pattern matching (Java 16+)  
- Herencia vs composición — el dilema eterno

public class Animal {

    public void hacerSonido() { System.out.println("..."); }

}

public class Perro extends Animal {

    @Override

    public void hacerSonido() { System.out.println("¡Guau\!"); }

}

**🏋️ EJERCICIO 2.3:** Crea una jerarquía: `Vehiculo` (base) → `Coche`, `Moto`, `Camion` (hijos). Cada vehículo tiene `marca`, `velocidadMaxima` y un método `describir()`. El `Camion` tiene además `capacidadCarga`. Implementa `@Override` en cada hijo y demuestra polimorfismo creando un array de `Vehiculo[]`.

---

### Tema 2.4 — Polimorfismo

- Polimorfismo en tiempo de compilación (sobrecarga)  
- Polimorfismo en tiempo de ejecución (sobreescritura \+ herencia)  
- Vinculación dinámica (dynamic binding)  
- Casting de objetos y `ClassCastException`  
- Pattern matching con `instanceof` (Java 16+)

**🏋️ EJERCICIO 2.4:** Crea un sistema de figuras geométricas: `Figura` (base abstracta con método `calcularArea()`) → `Circulo`, `Rectangulo`, `Triangulo`. Almacénalas en un `List<Figura>` y calcula el área total de todas sin conocer el tipo específico de cada una.

---

### Tema 2.5 — Clases Abstractas e Interfaces

- Clases `abstract`: cuándo y por qué  
- Métodos abstractos y concretos en clases abstractas  
- `interface`: contrato puro  
- `default` y `static` en interfaces (Java 8+)  
- Interfaces funcionales (`@FunctionalInterface`)  
- Diferencia clave: clase abstracta vs interfaz  
- Implementación múltiple de interfaces

public interface Volable {

    void volar(); // abstracto por defecto

    default String descripcion() {

        return "Soy un ser volador";

    }

}

**🏋️ EJERCICIO 2.5:** Diseña un sistema con: interfaz `Pagable` (método `pagar(double cantidad)`), interfaz `Notificable` (método `notificar(String mensaje)`). Crea clases `TarjetaCredito` y `PayPal` que implementen ambas interfaces de forma diferente. Demuestra el uso polimórfico.

---

### Tema 2.6 — Clases Especiales

- Clases internas (`inner classes`): estáticas y no estáticas  
- Clases anónimas  
- **Enumeraciones (`enum`)**: valores, constructores, métodos  
- **Records** (Java 16+): DTOs inmutables compactos  
- **Sealed classes** (Java 17+): jerarquías controladas

public record Punto(double x, double y) {

    // Genera constructor, getters, equals, hashCode y toString automáticamente

}

public enum DiaSemana {

    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    public boolean esFinDeSemana() {

        return this \== SABADO || this \== DOMINGO;

    }

}

**🏋️ EJERCICIO 2.6:** Crea un `enum EstadoPedido` con estados `PENDIENTE`, `PROCESANDO`, `ENVIADO`, `ENTREGADO`, `CANCELADO`. Cada estado debe tener una descripción y un método que indique si es un estado final. Usa un `Record` para modelar un `Pedido` con id, producto y estado.

---

## 🟡 NIVEL 3 — INTERMEDIO

### Tema 3.1 — Manejo de Excepciones

- Jerarquía: `Throwable` → `Error` / `Exception` → `RuntimeException` / checked  
- `try-catch-finally`  
- `try-with-resources` (AutoCloseable)  
- `throw` vs `throws`  
- Excepciones checked vs unchecked — el debate  
- Creación de excepciones personalizadas  
- Multi-catch y mejores prácticas

public class SaldoInsuficienteException extends RuntimeException {

    private final double saldoActual;

    public SaldoInsuficienteException(double saldoActual) {

        super("Saldo insuficiente. Saldo actual: " \+ saldoActual);

        this.saldoActual \= saldoActual;

    }

    public double getSaldoActual() { return saldoActual; }

}

**🏋️ EJERCICIO 3.1:** Crea un sistema de validación para un formulario de registro con excepciones personalizadas: `EmailInvalidoException`, `ContraseñaDebilException`, `EdadInvalidaException`. Implementa un método `validarUsuario(String email, String password, int edad)` que lance las excepciones apropiadas y manéjalas con mensajes específicos.

---

### Tema 3.2 — El Framework de Colecciones (Collections Framework)

- Jerarquía: `Collection` → `List`, `Set`, `Queue` / `Map` (aparte)  
- **List**: `ArrayList` vs `LinkedList` — complejidades Big-O  
- **Set**: `HashSet`, `LinkedHashSet`, `TreeSet` — unicidad y orden  
- **Map**: `HashMap`, `LinkedHashMap`, `TreeMap` — pares clave-valor  
- **Queue/Deque**: `ArrayDeque`, `PriorityQueue`  
- Métodos de `Collections` utility class  
- Cuándo usar cada estructura — decisiones de diseño

// Cheatsheet de complejidades

// ArrayList: get O(1), add O(1) amortizado, remove O(n)

// LinkedList: get O(n), add/remove extremos O(1)

// HashMap: get/put O(1) promedio, O(n) peor caso

// TreeMap: get/put O(log n), ordenado por clave

**🏋️ EJERCICIO 3.2:** Implementa un sistema de inventario de una tienda usando `HashMap<String, Integer>` (producto → cantidad). Implementa: agregar producto, actualizar stock, eliminar producto, buscar los 3 productos con más stock (usa `TreeMap` para ordenar), y detectar productos con stock bajo (\<5 unidades).

---

### Tema 3.3 — Generics (Tipos Genéricos)

- ¿Por qué generics? Type safety en tiempo de compilación  
- Clases genéricas: `class Caja<T>`  
- Métodos genéricos  
- Wildcards: `<?>`, `<? extends T>`, `<? super T>` (PECS: Producer Extends, Consumer Super)  
- Borrado de tipos (type erasure) — cómo funciona la JVM  
- Bounded type parameters

public class Par\<A, B\> {

    private final A primero;

    private final B segundo;

    public Par(A primero, B segundo) {

        this.primero \= primero;

        this.segundo \= segundo;

    }

    // getters...

}

// PECS en acción

public static \<T\> void copiar(List\<? super T\> destino, List\<? extends T\> origen) {

    destino.addAll(origen);

}

**🏋️ EJERCICIO 3.3:** Implementa una clase genérica `Pila<T>` (Stack) desde cero sin usar `Stack` de Java. Debe tener: `push(T)`, `pop()` (con excepción si vacía), `peek()`, `isEmpty()`, `size()`. Luego crea un método genérico estático `<T extends Comparable<T>> T encontrarMaximo(List<T> lista)`.

---

### Tema 3.4 — Entrada/Salida (I/O)

- Streams de bytes vs streams de caracteres  
- `InputStream`/`OutputStream` y sus implementaciones  
- `Reader`/`Writer` y sus implementaciones  
- `BufferedReader`/`BufferedWriter` — importancia del buffering  
- `Scanner` para leer entrada del usuario  
- `FileInputStream`, `FileOutputStream`, `FileReader`, `FileWriter`  
- Serialización: `Serializable`, `ObjectInputStream`/`ObjectOutputStream`

**🏋️ EJERCICIO 3.4:** Crea un programa que: (1) Lea un archivo de texto con una lista de nombres (uno por línea), (2) cuente las ocurrencias de cada nombre usando un `Map`, (3) ordene los resultados por frecuencia descendente, y (4) escriba el resultado en un nuevo archivo. Usa `try-with-resources` en todo.

---

### Tema 3.5 — NIO.2 y la API `java.nio.file`

- `Path` vs `File` — por qué NIO.2 es superior  
- `Files`: métodos utilitarios modernos  
- `Paths` y `Path` operations  
- Lectura/escritura moderna: `Files.readAllLines()`, `Files.write()`  
- `WatchService` — monitoreo de cambios en el sistema de archivos  
- Atributos y metadatos de archivos

Path ruta \= Path.of("datos", "archivo.txt");

List\<String\> lineas \= Files.readAllLines(ruta, StandardCharsets.UTF\_8);

Files.write(ruta, lineas, StandardCharsets.UTF\_8, StandardOpenOption.APPEND);

**🏋️ EJERCICIO 3.5:** Implementa una utilidad de línea de comandos que acepte una ruta de directorio y genere un informe en texto con: número de archivos y carpetas, tamaño total, extensión más común, y los 5 archivos más grandes. Usa exclusivamente la API NIO.2.

---

### Tema 3.6 — Programación Funcional y Lambdas

- Interfaces funcionales: `Function`, `Predicate`, `Consumer`, `Supplier`, `BiFunction`...  
- Expresiones lambda: sintaxis y reglas  
- Referencias a métodos: `Clase::metodo`, `instancia::metodo`, `Clase::new`  
- Composición funcional: `andThen()`, `compose()`, `and()`, `or()`, `negate()`  
- Closures y variables efectivamente finales  
- Currying en Java

Function\<String, Integer\> longitud \= String::length;

Function\<Integer, Boolean\> esPar \= n \-\> n % 2 \== 0;

Function\<String, Boolean\> longitudEsPar \= longitud.andThen(esPar);

Predicate\<String\> noVacio \= Predicate.not(String::isEmpty);

**🏋️ EJERCICIO 3.6:** Sin usar bucles `for`/`while`, implementa usando lambdas y functional interfaces: un validador de contraseñas que combine múltiples `Predicate<String>` (mínimo 8 chars, tiene mayúscula, tiene número, tiene símbolo), y una pipeline funcional que transforme una lista de strings: filtrar vacíos → convertir a mayúsculas → ordenar → eliminar duplicados.

---

## 🟠 NIVEL 4 — AVANZADO

### Tema 4.1 — Stream API

- ¿Qué es un Stream? Lazy evaluation y pipeline  
- Operaciones intermedias: `filter`, `map`, `flatMap`, `distinct`, `sorted`, `limit`, `skip`, `peek`  
- Operaciones terminales: `collect`, `forEach`, `reduce`, `count`, `min`, `max`, `anyMatch`, `allMatch`, `findFirst`  
- `Collectors`: `toList()`, `toMap()`, `groupingBy()`, `partitioningBy()`, `joining()`, `counting()`  
- Streams paralelos: cuándo usarlos y sus peligros  
- `IntStream`, `LongStream`, `DoubleStream` — evitar autoboxing

Map\<String, Long\> frecuenciaPorLetraInicial \= nombres.stream()

    .filter(n \-\> \!n.isBlank())

    .map(String::trim)

    .collect(Collectors.groupingBy(

        n \-\> String.valueOf(n.charAt(0)).toUpperCase(),

        Collectors.counting()

    ));

**🏋️ EJERCICIO 4.1:** Dado un archivo CSV de empleados (nombre, departamento, salario, años de experiencia), usando **solo Stream API** (sin bucles): (1) salario promedio por departamento, (2) top 3 empleados mejor pagados, (3) departamento con más empleados, (4) empleados con \>5 años y salario\<30000 (posibles candidatos a aumento), (5) informe en String formateado usando `Collectors.joining`.

---

### Tema 4.2 — Optional

- El problema del `NullPointerException` — el error del billón de dólares  
- `Optional<T>`: creación con `of()`, `ofNullable()`, `empty()`  
- Métodos: `isPresent()`, `isEmpty()`, `get()`, `orElse()`, `orElseGet()`, `orElseThrow()`  
- Transformaciones: `map()`, `flatMap()`, `filter()`  
- `ifPresent()` e `ifPresentOrElse()`  
- Cuándo NO usar Optional (campos, parámetros, colecciones)

Optional\<Usuario\> usuario \= repositorio.buscarPorEmail(email);

String nombre \= usuario

    .filter(u \-\> u.isActivo())

    .map(Usuario::getNombre)

    .map(String::toUpperCase)

    .orElse("USUARIO\_DESCONOCIDO");

**🏋️ EJERCICIO 4.2:** Implementa un sistema de búsqueda de libros en una "base de datos" (List). Los métodos de búsqueda deben retornar `Optional<Libro>` o `Optional<List<Libro>>`. Encadena operaciones: buscar libro → obtener su autor → buscar otros libros del autor → obtener el más vendido. Todo sin un solo `null` ni `NullPointerException`.

---

### Tema 4.3 — Concurrencia y Multithreading

- Procesos vs Hilos (threads) — conceptos base  
- Crear hilos: `Thread` y `Runnable`  
- Ciclo de vida de un hilo  
- Problemas: condiciones de carrera, deadlocks, starvation, livelock  
- `synchronized`: bloques y métodos  
- `volatile` y visibilidad de memoria  
- `wait()`, `notify()`, `notifyAll()`  
- El modelo de memoria de Java (JMM) — happens-before

public class ContadorSeguro {

    private int valor \= 0;

    private final Object lock \= new Object();

    public void incrementar() {

        synchronized (lock) { valor++; }

    }

    public int getValor() {

        synchronized (lock) { return valor; }

    }

}

**🏋️ EJERCICIO 4.3:** Implementa el problema **Productor-Consumidor** con un buffer limitado usando `wait()`/`notify()`. El productor genera números aleatorios, el consumidor los procesa. Demuestra qué pasa sin sincronización (race condition) y luego corrígelo.

---

### Tema 4.4 — Concurrencia Avanzada: `java.util.concurrent`

- `ExecutorService` y el pool de hilos: `newFixedThreadPool`, `newCachedThreadPool`, `newSingleThreadExecutor`  
- `Callable` vs `Runnable` — retorno de valores  
- `Future` y `CompletableFuture`  
- Tipos atómicos: `AtomicInteger`, `AtomicLong`, `AtomicReference`  
- `ReentrantLock`, `ReadWriteLock`  
- `CountDownLatch`, `CyclicBarrier`, `Semaphore`  
- Colecciones concurrentes: `ConcurrentHashMap`, `CopyOnWriteArrayList`, `BlockingQueue`

CompletableFuture\<String\> futuro \= CompletableFuture

    .supplyAsync(() \-\> llamarAPI())

    .thenApply(respuesta \-\> procesarRespuesta(respuesta))

    .thenApply(String::toUpperCase)

    .exceptionally(ex \-\> "ERROR: " \+ ex.getMessage());

**🏋️ EJERCICIO 4.4:** Implementa un **web scraper simulado** que haga 10 "peticiones HTTP" (simuladas con `Thread.sleep` random). Usa `CompletableFuture` para lanzarlas todas en paralelo, combinar los resultados, manejar las que fallen, y medir el tiempo total vs secuencial. Usa `ExecutorService` con un pool de 4 hilos.

---

### Tema 4.5 — Fecha y Hora: `java.time` (Java 8+)

- Problemas de `Date` y `Calendar` legacy  
- `LocalDate`, `LocalTime`, `LocalDateTime` — inmutables y thread-safe  
- `ZonedDateTime` y `ZoneId` — zonas horarias correctamente  
- `Instant` — tiempo Unix para sistemas  
- `Duration` vs `Period`  
- `DateTimeFormatter` — formateo y parseo  
- `TemporalAdjusters` — "el próximo lunes", "el último día del mes"

**🏋️ EJERCICIO 4.5:** Crea un sistema de agenda que: calcule los días laborables entre dos fechas (excluyendo fines de semana), encuentre el próximo lunes de cada semana en un rango, convierta reuniones entre zonas horarias (Madrid, Nueva York, Tokio), y calcule la edad exacta en años/meses/días de una persona.

---

### Tema 4.6 — Reflexión (Reflection API)

- `Class<?>` y cómo obtenerla: `.class`, `getClass()`, `Class.forName()`  
- Inspeccionar campos, métodos y constructores en tiempo de ejecución  
- Invocar métodos y acceder a campos privados  
- Anotaciones personalizadas (`@interface`)  
- Procesamiento de anotaciones con reflection  
- Usos reales: frameworks (Spring, JUnit, Jackson)  
- Costes de rendimiento y cuándo evitarlo

**🏋️ EJERCICIO 4.6:** Implementa un mini-framework de inyección de dependencias: crea una anotación `@Inyectar` y un `Contenedor` que, dado una clase, instancie automáticamente todos sus campos anotados con `@Inyectar` usando reflexión. Añade también una anotación `@Validar` con una expresión regex, y un validador que verifique campos `String` anotados.

---

## 🔴 NIVEL 5 — EXPERTO

### Tema 5.1 — Patrones de Diseño (Design Patterns)

#### Patrones Creacionales

- **Singleton** (y cómo hacerlo thread-safe con `enum`)  
- **Factory Method** y **Abstract Factory**  
- **Builder** — construcción de objetos complejos  
- **Prototype** — clonación

#### Patrones Estructurales

- **Adapter** — compatibilidad entre interfaces  
- **Decorator** — añadir comportamiento sin herencia  
- **Proxy** — control de acceso  
- **Facade** — simplificar subsistemas complejos  
- **Composite** — estructuras árbol

#### Patrones de Comportamiento

- **Strategy** — algoritmos intercambiables  
- **Observer** — eventos y suscripciones  
- **Command** — encapsular acciones  
- **Template Method** — esqueleto de algoritmo  
- **Chain of Responsibility** — cadena de manejadores  
- **State** — máquinas de estado

**🏋️ EJERCICIO 5.1:** Diseña un sistema de procesamiento de pedidos e-commerce usando: **Builder** para construir `Pedido`s complejos, **Strategy** para calcular el envío (estándar/express/drone), **Observer** para notificar cambios de estado (email, SMS, push), **Decorator** para añadir servicios al pedido (seguro, regalo, urgente), **Chain of Responsibility** para validar el pedido (stock, fraude, dirección).

---

### Tema 5.2 — Principios SOLID y Clean Code

- **S** — Single Responsibility Principle  
- **O** — Open/Closed Principle  
- **L** — Liskov Substitution Principle  
- **I** — Interface Segregation Principle  
- **D** — Dependency Inversion Principle  
- DRY, KISS, YAGNI  
- Nombres significativos, funciones pequeñas, comentarios útiles  
- Code smells y refactoring  
- Métricas de código: cohesión, acoplamiento, complejidad ciclomática

**🏋️ EJERCICIO 5.2:** Toma este código violador de SOLID (se te proporcionará en clase) y refactorízalo aplicando los 5 principios. Documenta qué principio viola cada parte y cómo lo resuelves. El código base: un `GestorUsuarios` que valida, guarda en BD, envía emails, genera PDFs y registra logs todo en un mismo método de 200 líneas.

---

### Tema 5.3 — Testing Profesional

- Pirámide de testing: unitarios, integración, E2E  
- **JUnit 5**: `@Test`, `@BeforeEach`, `@AfterEach`, `@ParameterizedTest`, `@Nested`  
- **Mockito**: `@Mock`, `@InjectMocks`, `when()`, `verify()`, `ArgumentCaptor`  
- **AssertJ**: assertions fluidas y legibles  
- TDD (Test Driven Development) — ciclo Red-Green-Refactor  
- BDD con **Cucumber** (introducción)  
- Cobertura de código con JaCoCo  
- Testing de concurrencia

@ExtendWith(MockitoExtension.class)

class CuentaBancariaTest {

    @Mock

    private NotificacionService notificaciones;

    @InjectMocks

    private CuentaBancaria cuenta;

    @Test

    @DisplayName("Retirar más del saldo disponible lanza excepción")

    void retirarMasDelSaldoLanzaExcepcion() {

        cuenta.depositar(100.0);

        assertThatThrownBy(() \-\> cuenta.retirar(200.0))

            .isInstanceOf(SaldoInsuficienteException.class)

            .hasMessageContaining("100.0");

    }

}

**🏋️ EJERCICIO 5.3:** Usando TDD (escribe el test ANTES del código), implementa un servicio `CarritoCompraService` con: añadir/eliminar productos, calcular total con descuentos, aplicar cupones, y calcular impuestos por país. Alcanza \>90% de cobertura. Usa mocks para las dependencias externas (repositorio, servicio de descuentos).

---

### Tema 5.4 — JVM Internals

- Arquitectura de la JVM: ClassLoader, JIT compiler, Garbage Collector  
- Áreas de memoria: Heap (Young Gen, Old Gen, Metaspace), Stack, Program Counter  
- Garbage Collection: Serial, Parallel, CMS, **G1GC**, **ZGC**, **Shenandoah**  
- `System.gc()` — por qué casi nunca debes llamarlo  
- Memory leaks en Java — cómo ocurren y cómo detectarlos  
- JVM flags importantes: `-Xms`, `-Xmx`, `-XX:+UseG1GC`  
- Herramientas: `jps`, `jstat`, `jmap`, `jstack`, VisualVM, JMC

**🏋️ EJERCICIO 5.4:** Crea un programa que deliberadamente cause un memory leak (guardando referencias en una colección estática). Monitoréalo con `jstat` y VisualVM, observa cómo crece el heap y el comportamiento del GC. Luego corrígelo y compara las métricas.

---

### Tema 5.5 — Módulos (Java Platform Module System — JPMS)

- El problema pre-módulos: el classpath hell  
- `module-info.java`: `requires`, `exports`, `opens`, `uses`, `provides`  
- Módulos nombrados, automáticos y sin nombre  
- Visibilidad y encapsulación fuerte  
- `jlink` — crear runtimes mínimos personalizados  
- Migrar proyectos legacy a módulos

**🏋️ EJERCICIO 5.5:** Convierte una aplicación de 3 capas (dominio, servicio, presentación) en un proyecto multi-módulo JPMS. Define qué cada módulo expone y qué oculta. Genera un runtime mínimo con `jlink` que solo incluya los módulos necesarios.

---

## ⚫ NIVEL 6 — PRO ABSOLUTO

### Tema 6.1 — Rendimiento y Optimización

- Benchmarking con **JMH** (Java Microbenchmark Harness)  
- Profiling: CPU profiling, memory profiling, flame graphs  
- Optimizaciones de la JVM: inlining, escape analysis, loop unrolling  
- Evitar boxing/unboxing innecesario  
- String optimization: `StringBuilder` vs `String.format` vs `+`  
- Caché-friendly data structures  
- Off-heap memory con `ByteBuffer`  
- Project Valhalla preview: Value types

**🏋️ EJERCICIO 6.1:** Implementa tres versiones de un algoritmo de procesamiento de datos masivo (1M+ registros): versión naive, versión optimizada con streams paralelos, versión con tipos primitivos y arrays. Benchmárkea las 3 con JMH y analiza los resultados. Identifica dónde el JIT ayuda más.

---

### Tema 6.2 — Programación Reactiva

- ¿Qué es la programación reactiva? El Reactive Manifesto  
- **Project Reactor**: `Mono<T>` y `Flux<T>`  
- Operadores: `map`, `flatMap`, `filter`, `zip`, `merge`, `concat`  
- Backpressure — el concepto fundamental  
- Error handling reactivo: `onErrorReturn`, `onErrorResume`, `retry`  
- Hot vs Cold publishers  
- **Spring WebFlux** — aplicaciones no bloqueantes  
- Testing reactivo con `StepVerifier`

Flux\<Integer\> numeros \= Flux.range(1, 100\)

    .filter(n \-\> n % 2 \== 0\)

    .map(n \-\> n \* n)

    .take(10)

    .log();

numeros.subscribe(

    valor \-\> System.out.println("Recibido: " \+ valor),

    error \-\> System.err.println("Error: " \+ error),

    () \-\> System.out.println("Completado")

);

**🏋️ EJERCICIO 6.2:** Implementa un pipeline reactivo que: consuma datos de múltiples fuentes simuladas (con delays aleatorios), combine los resultados con `zip` y `merge`, aplique transformaciones, maneje errores con reintentos y fallbacks, e implemente backpressure. Usa `StepVerifier` para testearlo.

---

### Tema 6.3 — Virtual Threads y Project Loom (Java 21+)

- El problema del modelo thread-per-request  
- Hilos virtuales vs hilos de plataforma  
- `Thread.ofVirtual()` y `Executors.newVirtualThreadPerTaskExecutor()`  
- Structured Concurrency: `StructuredTaskScope`  
- Scoped Values (sucesor de ThreadLocal)  
- Cuándo virtual threads NO son la solución  
- Impacto en el diseño de aplicaciones: del reactivo al imperativo-escalable

try (var scope \= new StructuredTaskScope.ShutdownOnFailure()) {

    Future\<String\> usuario \= scope.fork(() \-\> buscarUsuario(id));

    Future\<List\<Pedido\>\> pedidos \= scope.fork(() \-\> buscarPedidos(id));

    scope.join().throwIfFailed();

    return new Respuesta(usuario.get(), pedidos.get());

}

**🏋️ EJERCICIO 6.3:** Implementa un servidor HTTP "desde cero" (usando `ServerSocket`) que maneje 10.000 conexiones simultáneas usando virtual threads. Compáralo con un servidor usando el thread pool tradicional en términos de throughput, latencia y consumo de memoria.

---

### Tema 6.4 — Ecosistema y Herramientas Pro

#### Build Tools

- **Maven**: ciclo de vida, plugins, gestión de dependencias, repositorios  
- **Gradle**: Groovy vs Kotlin DSL, tasks, performance con daemon y caché

#### Frameworks

- **Spring Boot**: IoC, DI, auto-configuración, starters, Actuator  
- **Quarkus** y **Micronaut**: GraalVM native images, startup ultrarrápido  
- **Hibernate/JPA**: ORM, JPQL, Criteria API, lazy vs eager loading, N+1 problem

#### Otras herramientas

- **Docker** y **Kubernetes** para aplicaciones Java  
- **GraalVM Native Image**: compilación ahead-of-time  
- **Lombok**: reducir boilerplate (y cuándo NO usarlo)  
- **MapStruct**: mapeo de objetos en tiempo de compilación

**🏋️ EJERCICIO 6.4:** Construye una API REST completa con Spring Boot que incluya: autenticación JWT, base de datos con JPA/Hibernate, caché con Redis, documentación con OpenAPI/Swagger, tests de integración con Testcontainers, y empaquetada en Docker. Despliégala localmente con Docker Compose.

---

### Tema 6.5 — Metaprogramación: Procesadores de Anotaciones

- APT (Annotation Processing Tool) — cómo funciona  
- Implementar un `AbstractProcessor`  
- Generación de código en tiempo de compilación con **JavaPoet**  
- Casos reales: Lombok, MapStruct, Dagger  
- `javax.annotation.processing` API  
- Integración con Maven/Gradle

**🏋️ EJERCICIO 6.5:** Crea tu propio procesador de anotaciones que genere automáticamente clases Builder para cualquier clase anotada con `@AutoBuilder`. El procesador debe generar código Java válido en tiempo de compilación, similar a lo que hace Lombok con `@Builder`.

---

### Tema 6.6 — Arquitectura de Software

- Arquitectura en capas vs hexagonal (Ports & Adapters)  
- **DDD** (Domain-Driven Design): entidades, value objects, agregados, repositorios, servicios de dominio  
- **CQRS** (Command Query Responsibility Segregation)  
- **Event Sourcing**  
- **Microservicios** vs Monolito modular  
- Patrones de resiliencia: Circuit Breaker, Retry, Bulkhead (Resilience4j)  
- API Design: REST vs GraphQL vs gRPC

**🏋️ EJERCICIO 6.6 — PROYECTO FINAL:** Diseña e implementa un sistema de e-commerce con arquitectura hexagonal y DDD que incluya: dominio rico (no anemic model), puertos y adaptadores bien definidos, CQRS para operaciones de lectura/escritura, eventos de dominio con un bus de eventos, al menos 3 microservicios (usuarios, inventario, pedidos) comunicándose de forma asíncrona, circuit breakers, y una suite de tests completa (unitarios, integración, contrato). Este es tu proyecto final: demuestra que eres un Pro.

---

## 📚 RECURSOS RECOMENDADOS

### Libros (en orden de lectura)

1. *Head First Java* — Sierra & Bates (nivel 1-2)  
2. *Effective Java* — Joshua Bloch (nivel 3-5) ← **BIBLIA del desarrollador Java**  
3. *Clean Code* — Robert C. Martin (nivel 3+)  
4. *Java Concurrency in Practice* — Goetz et al. (nivel 4-5)  
5. *Designing Data-Intensive Applications* — Kleppmann (nivel 6\)  
6. *Domain-Driven Design* — Eric Evans (nivel 6\)

### Plataformas de práctica

- **LeetCode** / **HackerRank** — algoritmos y estructuras de datos  
- **Exercism.io** — track de Java con mentores  
- **Codewars** — katas progresivos

### Documentación oficial

- [https://docs.oracle.com/en/java/javase/21/](https://docs.oracle.com/en/java/javase/21/)  
- [https://openjdk.org/jeps/](https://openjdk.org/jeps/) — Java Enhancement Proposals

---

## 🗺️ HOJA DE RUTA TEMPORAL (estimada)

| Nivel | Tiempo estimado (dedicación seria) |
| :---- | :---- |
| 🟢 Nivel 1 | 2-3 semanas |
| 🔵 Nivel 2 | 3-4 semanas |
| 🟡 Nivel 3 | 4-5 semanas |
| 🟠 Nivel 4 | 4-6 semanas |
| 🔴 Nivel 5 | 6-8 semanas |
| ⚫ Nivel 6 | 3-6 meses (aprendizaje continuo) |

**Recuerda:** La velocidad no importa. La comprensión sí. No avances hasta que puedas explicar el tema anterior sin mirar notas.

---

*"First, solve the problem. Then, write the code."* — John Johnson

*"Any fool can write code that a computer can understand. Good programmers write code that humans can understand."* — Martin Fowler  
