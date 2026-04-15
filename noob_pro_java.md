# 🚀 JAVA: DE NOOB A PRO — Guía Completa con Explicaciones Detalladas

> **Tu misión:** Convertirte en un desarrollador Java de élite. Cada nivel construye sobre el anterior. Cada tema está explicado desde cero, con ejemplos, analogías y ejercicios prácticos. No saltes niveles.

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

---

### Tema 1.1 — ¿Qué es Java? Entorno y herramientas

#### ¿Qué es Java y por qué aprenderlo?

Java es un lenguaje de programación creado en 1995 por James Gosling en Sun Microsystems (hoy Oracle). Su filosofía central es **"Write Once, Run Anywhere"** (escribe una vez, ejecuta en cualquier lugar). Esto significa que el código que escribes en tu ordenador puede ejecutarse en cualquier sistema operativo (Windows, Linux, macOS, Android...) sin modificarlo.

¿Por qué es tan popular? Java es el lenguaje detrás de miles de aplicaciones bancarias, sistemas empresariales, Android, y mucho más. Aprenderlo te abre muchísimas puertas laborales.

#### JDK vs JRE vs JVM — ¿Qué es cada cosa?

Esta es la primera confusión que tiene todo el mundo. Imagina una analogía:

- **JVM (Java Virtual Machine)** → Es como un "intérprete universal". Cuando tú escribes código Java, no se convierte directamente en instrucciones para tu procesador. Primero se convierte en un lenguaje intermedio llamado **bytecode**, y la JVM es quien lee ese bytecode y lo ejecuta en tu máquina. Por eso Java funciona en cualquier sistema: cada sistema tiene su propia JVM que sabe cómo ejecutar el mismo bytecode.

- **JRE (Java Runtime Environment)** → Es la JVM + las librerías estándar de Java. Es lo que necesitas para **ejecutar** un programa Java ya compilado. Si solo quieres usar una aplicación Java (como Minecraft), solo necesitas el JRE.

- **JDK (Java Development Kit)** → Es el JRE + herramientas para **desarrollar**. Incluye el compilador (`javac`), depurador, y mucho más. Si quieres **escribir y compilar** código Java, necesitas el JDK. **Tú necesitas el JDK.**

```
JDK (lo que instalarás)
├── JRE (para ejecutar)
│   ├── JVM (la máquina virtual)
│   └── Librerías estándar (java.util, java.io, etc.)
└── Herramientas de desarrollo
    ├── javac (compilador)
    ├── java (ejecutor)
    ├── javadoc (generador de documentación)
    └── jdb (depurador)
```

#### Cómo funciona el proceso de compilación

```
Tu código (.java)  →  javac (compilador)  →  Bytecode (.class)  →  JVM  →  Ejecución
```

1. Escribes código en un archivo `HolaMundo.java`
2. El compilador `javac HolaMundo.java` lo convierte a `HolaMundo.class` (bytecode)
3. La JVM ejecuta ese bytecode con `java HolaMundo`

#### Tu primer programa

```java
// Todo programa Java vive dentro de una clase
// El nombre de la clase DEBE coincidir con el nombre del archivo: HolaMundo.java
public class HolaMundo {

    // Este es el punto de entrada de cualquier programa Java
    // La JVM busca exactamente este método para empezar la ejecución
    // public = accesible desde cualquier lugar
    // static = pertenece a la clase, no a un objeto
    // void = no devuelve nada
    // main = nombre especial que reconoce la JVM
    // String[] args = los argumentos que se pasan al ejecutar desde terminal
    public static void main(String[] args) {

        // System.out.println imprime texto en la consola y salta de línea
        System.out.println("¡Hola, mundo Java!");

        // System.out.print hace lo mismo pero SIN saltar de línea
        System.out.print("Esto ");
        System.out.print("queda junto");

        // System.out.println() sin argumento solo imprime un salto de línea
        System.out.println();

        // System.out.printf permite formatear la salida (como en C)
        System.out.printf("Tengo %d años y me llamo %s%n", 25, "Ana");
    }
}
```

Para compilar y ejecutar desde la terminal:
```bash
javac HolaMundo.java   # Genera HolaMundo.class
java HolaMundo         # Ejecuta (sin la extensión .class)
```

**🏋️ EJERCICIO 1.1:**
Crea un programa que imprima tu nombre, tu edad y tu objetivo con Java, cada dato en una línea diferente. Compílalo y ejecútalo desde la terminal **sin IDE**. Experimenta con `println`, `print` y `printf`.

---

### Tema 1.2 — Variables, Tipos de Datos y Operadores

#### ¿Qué es una variable?

Una variable es como una **caja con nombre** donde guardas información. Esa caja tiene un tipo (qué tipo de cosa guarda), un nombre (para referenciarte a ella), y un valor (lo que hay dentro).

```
int edad = 25;
 │    │     │
 │    │     └── Valor inicial
 │    └── Nombre de la variable
 └── Tipo: esta caja solo puede guardar números enteros
```

#### Tipos primitivos — Los 8 tipos básicos

Java tiene 8 tipos de datos primitivos. Son los más básicos y eficientes porque viven directamente en la memoria (no son objetos).

```java
public class TiposPrimitivos {
    public static void main(String[] args) {

        // ── ENTEROS (sin decimales) ──────────────────────────────────────

        byte pequeño = 127;          // 8 bits. Rango: -128 a 127
                                     // Útil para ahorrar memoria en arrays grandes

        short mediano = 32767;       // 16 bits. Rango: -32,768 a 32,767
                                     // Poco usado en la práctica

        int normal = 2147483647;     // 32 bits. Rango: ~-2,100M a ~2,100M
                                     // EL tipo entero por defecto. Úsalo siempre

        long grande = 9999999999L;   // 64 bits. Rango: enormísimo
                                     // Nota la L al final: indica que es long
                                     // Úsalo cuando int se queda pequeño (IDs, timestamps)

        // ── DECIMALES ───────────────────────────────────────────────────

        float impreciso = 3.14f;     // 32 bits, ~7 dígitos de precisión
                                     // Nota la f al final: indica que es float
                                     // ¡CUIDADO! Puede perder precisión

        double preciso = 3.14159265358979; // 64 bits, ~15 dígitos de precisión
                                           // EL tipo decimal por defecto. Úsalo siempre

        // ── OTROS ───────────────────────────────────────────────────────

        char letra = 'A';            // Un único carácter Unicode (va entre comillas simples)
        char numero = '5';           // '5' como carácter, no como número
        char especial = '\n';        // Caracteres de escape: \n=nueva línea, \t=tabulación

        boolean verdadero = true;    // Solo puede ser true o false
        boolean falso = false;       // Fundamental para condiciones y bucles

        // Imprimir todo
        System.out.println("int: " + normal);
        System.out.println("double: " + preciso);
        System.out.println("char: " + letra);
        System.out.println("boolean: " + verdadero);
    }
}
```

#### String — El tipo "especial" para texto

`String` no es un tipo primitivo, es una clase. Pero se usa tanto que parece primitivo.

```java
// String va con mayúscula (es una clase, no un primitivo)
String nombre = "Juan";
String apellido = "García";

// Concatenación con +
String nombreCompleto = nombre + " " + apellido; // "Juan García"

// Métodos útiles de String
System.out.println(nombre.length());           // 4 (número de caracteres)
System.out.println(nombre.toUpperCase());      // "JUAN"
System.out.println(nombre.toLowerCase());      // "juan"
System.out.println(nombre.charAt(0));          // 'J' (carácter en posición 0)
System.out.println(nombre.contains("ua"));     // true
System.out.println(nombre.replace("J", "K")); // "Kuan"
System.out.println("  hola  ".trim());         // "hola" (elimina espacios extremos)
System.out.println(nombre.equals("Juan"));     // true (comparar strings SIEMPRE con equals)
System.out.println(nombre.isEmpty());          // false
System.out.println("".isEmpty());              // true

// ⚠️ TRAMPA CLÁSICA: nunca compares Strings con ==
String a = "hola";
String b = "hola";
System.out.println(a == b);      // Puede ser true o false (compara referencias)
System.out.println(a.equals(b)); // Siempre true (compara contenido) ← USA ESTO
```

#### Casting — Convertir entre tipos

```java
// Casting implícito (automático) — de "pequeño" a "grande", sin pérdida
int entero = 42;
long largo = entero;        // int → long: automático, sin problema
double decimal = entero;    // int → double: automático, 42 → 42.0

// Casting explícito (manual) — de "grande" a "pequeño", con posible pérdida
double pi = 3.14159;
int piEntero = (int) pi;    // double → int: pierdes los decimales → 3
System.out.println(piEntero); // 3 (no redondea, simplemente trunca)

long millon = 1000000L;
int convertido = (int) millon; // Puede perder datos si es muy grande
```

#### Operadores

```java
// ── ARITMÉTICOS ─────────────────────────────────────────────────────────
int a = 10, b = 3;
System.out.println(a + b);  // 13 — suma
System.out.println(a - b);  // 7  — resta
System.out.println(a * b);  // 30 — multiplicación
System.out.println(a / b);  // 3  — división ENTERA (¡no 3.33!)
System.out.println(a % b);  // 1  — módulo (resto de la división)

// Para división decimal, al menos uno debe ser double:
System.out.println(10.0 / 3);   // 3.3333...
System.out.println((double) a / b); // 3.3333... (casting)

// Incremento y decremento
int x = 5;
x++;         // x ahora es 6 (equivale a x = x + 1)
x--;         // x ahora es 5
++x;         // x ahora es 6 (pre-incremento: incrementa ANTES de usar el valor)
int y = x++; // y = 6, x = 7 (post-incremento: usa el valor ANTES de incrementar)

// ── RELACIONALES (devuelven boolean) ─────────────────────────────────────
System.out.println(5 > 3);   // true
System.out.println(5 < 3);   // false
System.out.println(5 >= 5);  // true
System.out.println(5 <= 4);  // false
System.out.println(5 == 5);  // true  (igual)
System.out.println(5 != 3);  // true  (diferente)

// ── LÓGICOS ─────────────────────────────────────────────────────────────
boolean sol = true;
boolean lluvia = false;
System.out.println(sol && lluvia); // false — AND: ambos deben ser true
System.out.println(sol || lluvia); // true  — OR: al menos uno debe ser true
System.out.println(!sol);          // false — NOT: invierte el valor

// Cortocircuito: Java no evalúa la segunda condición si con la primera ya sabe el resultado
// Si la primera parte de && es false, no evalúa la segunda (¡útil para evitar errores!)
String texto = null;
if (texto != null && texto.length() > 0) { // Si texto fuera null, texto.length() daría error
    System.out.println("Texto válido");     // Pero && cortocircuita y no llega a length()
}

// ── TERNARIO ─────────────────────────────────────────────────────────────
// condición ? valor_si_true : valor_si_false
int edad = 20;
String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
System.out.println(resultado); // "Mayor de edad"

// ── ASIGNACIÓN COMPUESTA ─────────────────────────────────────────────────
int n = 10;
n += 5;  // n = n + 5  → 15
n -= 3;  // n = n - 3  → 12
n *= 2;  // n = n * 2  → 24
n /= 4;  // n = n / 4  → 6
n %= 4;  // n = n % 4  → 2
```

#### `var` — Inferencia de tipos (Java 10+)

```java
// En lugar de escribir el tipo explícitamente, Java lo infiere del valor
var nombre = "Ana";        // Java infiere: String
var edad = 25;             // Java infiere: int
var precio = 9.99;         // Java infiere: double
var activo = true;         // Java infiere: boolean

// ⚠️ var solo funciona en variables locales (dentro de métodos), no en atributos de clase
// ⚠️ var no significa "sin tipo": el tipo se fija en la declaración y no puede cambiar
// var x = 5; x = "hola"; ← ERROR de compilación
```

**🏋️ EJERCICIO 1.2:**
Escribe un programa que calcule el área y perímetro de un rectángulo dado su base (8.5) y altura (4.2). Muestra los resultados con dos decimales usando `printf`. También calcula cuántos rectángulos enteros caben en un espacio de 100 unidades cuadradas (usa división entera).

---

### Tema 1.3 — Control de Flujo: Condicionales

#### ¿Por qué necesitamos condicionales?

Un programa que siempre hace lo mismo es inútil. Los condicionales permiten que el programa **tome decisiones** según los datos. "Si el usuario tiene 18 años o más, déjale entrar; si no, muéstrale un error."

#### `if` / `else if` / `else`

La estructura más básica de decisión. Funciona exactamente como en español:

```java
public class Condicionales {
    public static void main(String[] args) {

        int nota = 75;

        // if simple: solo ejecuta el bloque si la condición es true
        if (nota >= 50) {
            System.out.println("Aprobado");
        }

        // if-else: una cosa U otra
        if (nota >= 50) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspendido");
        }

        // if - else if - else: múltiples ramas
        // Java evalúa de arriba a abajo y ejecuta el PRIMER bloque cuya condición sea true
        // El else al final es el "por defecto" si ninguna condición se cumple
        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 70) {
            System.out.println("Notable");          // ← Este se ejecuta (75 >= 70)
        } else if (nota >= 60) {
            System.out.println("Bien");
        } else if (nota >= 50) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Suspenso");
        }

        // ⚠️ Si el bloque solo tiene UNA instrucción, las llaves son opcionales
        // Pero es una MALA práctica omitirlas (causa bugs difíciles de detectar)
        if (nota >= 50)
            System.out.println("Aprobado"); // ← Funciona, pero no hagas esto
    }
}
```

#### Condiciones compuestas

```java
int edad = 22;
boolean tieneDNI = true;
double saldo = 150.0;

// AND (&&): TODAS las condiciones deben ser true
if (edad >= 18 && tieneDNI && saldo > 100) {
    System.out.println("Puede realizar la operación");
}

// OR (||): al menos UNA condición debe ser true
if (edad < 18 || !tieneDNI) {
    System.out.println("No puede realizar la operación");
}

// Condiciones anidadas
if (edad >= 18) {
    if (tieneDNI) {
        System.out.println("Mayor de edad con DNI");
    } else {
        System.out.println("Mayor de edad sin DNI");
    }
}
```

#### `switch` — Múltiples casos sobre el mismo valor

Cuando tienes muchos `else if` comparando la misma variable contra valores fijos, `switch` es más limpio:

```java
int diaSemana = 3; // 1=Lunes, 2=Martes, ..., 7=Domingo

// switch CLÁSICO (funciona en todas las versiones de Java)
switch (diaSemana) {
    case 1:
        System.out.println("Lunes");
        break; // ⚠️ CRÍTICO: sin break, cae al siguiente case (fall-through)
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    case 6:
    case 7:
        System.out.println("Fin de semana"); // Múltiples cases, mismo bloque
        break;
    default:
        System.out.println("Día válido");    // Como el else: si nada coincide
}

// switch EXPRESSION (Java 14+) — Mucho más limpio y seguro
// No necesita break, no hay fall-through accidental
String nombreDia = switch (diaSemana) {
    case 1 -> "Lunes";
    case 2 -> "Martes";
    case 3 -> "Miércoles";    // ← Este se ejecuta
    case 4 -> "Jueves";
    case 5 -> "Viernes";
    case 6, 7 -> "Fin de semana"; // Múltiples casos con coma
    default -> "Día inválido";
};
System.out.println(nombreDia); // "Miércoles"

// switch expression con bloques (cuando necesitas más de una línea)
int resultado = switch (diaSemana) {
    case 1, 2, 3, 4, 5 -> {
        System.out.println("Es un día laboral");
        yield diaSemana * 8; // 'yield' devuelve el valor en bloques
    }
    default -> 0;
};
```

**🏋️ EJERCICIO 1.3:**
Crea un programa que lea una temperatura (hardcodeada) en Celsius y la clasifique como: `Muy frío (<0)`, `Frío (0-15)`, `Agradable (16-25)`, `Caluroso (26-35)`, `Extremo (>35)`. Luego, usando `switch expression`, muestra qué ropa recomiendas para ese rango de temperatura.

---

### Tema 1.4 — Control de Flujo: Bucles

#### ¿Para qué sirven los bucles?

Sin bucles, si quisieras imprimir los números del 1 al 100, tendrías que escribir 100 líneas de código. Los bucles permiten **repetir un bloque de código** mientras se cumpla una condición, o un número determinado de veces.

Hay tres tipos principales, y cada uno tiene su caso de uso ideal:

---

#### El bucle `for` — Cuando sabes cuántas veces quieres repetir

El `for` es perfecto cuando **conoces de antemano** cuántas iteraciones necesitas.

```java
// Anatomía del for:
// for (inicialización; condición; actualización) { ... }
//       │               │          │
//       │               │          └── Se ejecuta AL FINAL de cada iteración
//       │               └── Se comprueba ANTES de cada iteración
//       └── Se ejecuta UNA SOLA VEZ al principio

for (int i = 0; i < 5; i++) {
    System.out.println("Iteración número: " + i);
}
// Salida:
// Iteración número: 0
// Iteración número: 1
// Iteración número: 2
// Iteración número: 3
// Iteración número: 4

// ¿Cómo funciona paso a paso?
// 1. int i = 0  → Se crea la variable i con valor 0 (solo una vez)
// 2. i < 5      → ¿0 < 5? SÍ → ejecuta el bloque
// 3. i++        → i pasa a ser 1
// 4. i < 5      → ¿1 < 5? SÍ → ejecuta el bloque
// 5. i++        → i pasa a ser 2
// ... (continúa hasta que i < 5 sea false)
// 6. i < 5      → ¿5 < 5? NO → el bucle termina

// Contar hacia atrás
for (int i = 10; i >= 1; i--) {
    System.out.print(i + " ");
}
System.out.println(); // "10 9 8 7 6 5 4 3 2 1"

// Contar de 2 en 2
for (int i = 0; i <= 20; i += 2) {
    System.out.print(i + " "); // "0 2 4 6 8 10 12 14 16 18 20"
}

// Bucles for anidados (uno dentro de otro)
// El bucle interno se ejecuta COMPLETO por cada iteración del externo
for (int fila = 1; fila <= 3; fila++) {
    for (int columna = 1; columna <= 3; columna++) {
        System.out.print(fila + "x" + columna + "=" + (fila*columna) + "  ");
    }
    System.out.println(); // Saltar de línea al terminar cada fila
}
// Salida:
// 1x1=1  1x2=2  1x3=3
// 2x1=2  2x2=4  2x3=6
// 3x1=3  3x2=6  3x3=9
```

---

#### El bucle `while` — Cuando no sabes cuántas veces repetir

El `while` es ideal cuando la repetición depende de una condición que puede cambiar de formas impredecibles.

```java
// Anatomía:
// while (condición) { bloque }
// La condición se comprueba ANTES de cada iteración

int numero = 1;
while (numero <= 5) {
    System.out.println("Número: " + numero);
    numero++; // ⚠️ CRÍTICO: si olvidas actualizar la variable, bucle infinito
}

// Ejemplo más realista: dividir por 2 hasta llegar a 1
int valor = 100;
int pasos = 0;
while (valor > 1) {
    valor = valor / 2;
    pasos++;
    System.out.println("Paso " + pasos + ": valor = " + valor);
}
// No sabemos de antemano cuántos pasos tomará → while es perfecto aquí

// Simulando lectura de usuario (en un programa real usarías Scanner)
int intentos = 0;
int contrasenaCorrecta = 1234;
int intento = 0000; // Simulamos que el usuario introduce esto

while (intento != contrasenaCorrecta && intentos < 3) {
    intentos++;
    System.out.println("Intento " + intentos + " incorrecto");
    intento = 1234; // Simulamos que al tercer intento acierta
}
if (intento == contrasenaCorrecta) {
    System.out.println("¡Acceso concedido!");
} else {
    System.out.println("Cuenta bloqueada");
}
```

---

#### El bucle `do-while` — Ejecutar al menos una vez

La diferencia con `while`: en `do-while`, el bloque se ejecuta **primero**, y LUEGO se comprueba la condición. Garantiza al menos una ejecución.

```java
// Anatomía:
// do { bloque } while (condición);

int contador = 0;
do {
    System.out.println("Contador: " + contador);
    contador++;
} while (contador < 3);
// Salida: 0, 1, 2

// ¿Cuándo usar do-while? Cuando la primera ejecución siempre debe ocurrir
// Ejemplo típico: menú de aplicación que se muestra al menos una vez
int opcion;
do {
    System.out.println("=== MENÚ ===");
    System.out.println("1. Nueva partida");
    System.out.println("2. Cargar partida");
    System.out.println("3. Salir");
    opcion = 3; // Simulamos que el usuario elige 3 (salir)
} while (opcion != 3); // Si elige 3, el bucle termina
System.out.println("¡Hasta luego!");
```

---

#### El bucle `for-each` — Recorrer colecciones de forma elegante

Cuando quieres recorrer TODOS los elementos de un array o colección, el `for-each` es la forma más limpia:

```java
String[] frutas = {"manzana", "banana", "naranja", "kiwi"};

// for clásico (funciona pero es más verboso)
for (int i = 0; i < frutas.length; i++) {
    System.out.println(frutas[i]);
}

// for-each (más limpio cuando no necesitas el índice)
// "Para cada String llamado 'fruta' EN el array 'frutas'"
for (String fruta : frutas) {
    System.out.println(fruta);
}

// ⚠️ Limitación del for-each:
// - No tienes acceso al índice (posición)
// - No puedes modificar el array desde el propio bucle
// - Solo va hacia adelante
// Si necesitas cualquiera de esas cosas, usa el for clásico
```

---

#### `break` y `continue` — Controlar el flujo dentro del bucle

```java
// break: SALE del bucle completamente
System.out.println("--- Ejemplo break ---");
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        System.out.println("¡Encontré el 5! Saliendo del bucle.");
        break; // El bucle termina aquí, aunque i < 10 siga siendo true
    }
    System.out.println("i = " + i);
}
// Imprime 0, 1, 2, 3, 4 y luego el mensaje

// continue: SALTA esta iteración y pasa a la siguiente
System.out.println("--- Ejemplo continue ---");
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue; // Si i es par, salta el println y va al siguiente i
    }
    System.out.println("Número impar: " + i);
}
// Imprime solo 1, 3, 5, 7, 9

// Etiquetas (labels) — break/continue en bucles anidados
// Normalmente break solo sale del bucle más interno
// Con etiquetas puedes salir del bucle que quieras
externo: // Esta es la etiqueta del bucle externo
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        if (i == 2 && j == 3) {
            System.out.println("¡Encontrado en [" + i + "][" + j + "]!");
            break externo; // Sale del bucle EXTERNO (no solo del interno)
        }
    }
}
// Sin 'externo', break solo saldría del bucle j, no del i
```

---

#### Complejidad de bucles anidados — Por qué importa

```java
int n = 1000;

// Un solo bucle: n operaciones = 1.000 operaciones
for (int i = 0; i < n; i++) {
    // Este código se ejecuta 1.000 veces
}

// Dos bucles anidados: n² operaciones = 1.000.000 operaciones
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        // Este código se ejecuta 1.000 x 1.000 = 1.000.000 veces
    }
}

// Tres bucles anidados: n³ = 1.000.000.000 operaciones (¡un segundo de CPU!)
// Esto se convierte en un problema de rendimiento muy rápidamente
```

**🏋️ EJERCICIO 1.4:**

Parte A: Imprime la tabla de multiplicar del 1 al 10 formateada como una cuadrícula usando bucles anidados. La salida debe verse así:
```
    1    2    3   ...   10
    2    4    6   ...   20
    ...
   10   20   30  ...  100
```

Parte B: Usando un bucle `for` y `break`, determina si el número 97 es primo (un primo solo es divisible por 1 y por sí mismo). Muestra los divisores que encuentres.

Parte C: Usando `continue`, imprime todos los números del 1 al 50 que NO sean divisibles ni por 3 ni por 7.

---

### Tema 1.5 — Arrays

#### ¿Qué es un array?

Un array es una **secuencia de elementos del mismo tipo** guardados en posiciones contiguas de memoria. Piensa en él como una fila de casillas numeradas:

```
Posición:  [0]   [1]   [2]   [3]   [4]
Valor:      5     3     8     1     9
```

Clave fundamental: **los índices empiezan en 0**, no en 1. Un array de 5 elementos tiene posiciones del 0 al 4.

```java
public class Arrays {
    public static void main(String[] args) {

        // ── DECLARACIÓN E INICIALIZACIÓN ─────────────────────────────────

        // Forma 1: declarar y luego inicializar
        int[] numeros;           // Declaración: "numeros será un array de int"
        numeros = new int[5];    // Creación: array de 5 enteros (todos valen 0 por defecto)

        // Forma 2: declarar y crear en una línea
        int[] edades = new int[10]; // 10 enteros, todos a 0

        // Forma 3: declarar e inicializar con valores directamente
        int[] primos = {2, 3, 5, 7, 11, 13};
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

        // ── ACCESO A ELEMENTOS ───────────────────────────────────────────

        System.out.println(primos[0]); // 2 — primer elemento
        System.out.println(primos[5]); // 13 — último elemento (índice = longitud - 1)
        // primos[6] → ¡ERROR! ArrayIndexOutOfBoundsException — índice fuera de rango

        // Modificar un elemento
        primos[0] = 99;
        System.out.println(primos[0]); // 99

        // Longitud del array
        System.out.println(primos.length); // 6 (no es método, es atributo: sin paréntesis)

        // Último elemento: siempre en posición length - 1
        System.out.println(primos[primos.length - 1]); // 13

        // ── RECORRER UN ARRAY ────────────────────────────────────────────

        int[] valores = {10, 20, 30, 40, 50};

        // Con for clásico (cuando necesitas el índice)
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Posición " + i + ": " + valores[i]);
        }

        // Con for-each (cuando solo necesitas el valor)
        for (int v : valores) {
            System.out.print(v + " ");
        }

        // ── OPERACIONES ÚTILES ───────────────────────────────────────────

        // Calcular suma y promedio
        int suma = 0;
        for (int v : valores) {
            suma += v;
        }
        double promedio = (double) suma / valores.length;
        System.out.println("Suma: " + suma + ", Promedio: " + promedio);

        // Encontrar el máximo
        int maximo = valores[0]; // Empezamos asumiendo que el primero es el mayor
        for (int v : valores) {
            if (v > maximo) {
                maximo = v;
            }
        }
        System.out.println("Máximo: " + maximo);

        // ── CLASE java.util.Arrays ──────────────────────────────────────
        // (necesitas: import java.util.Arrays; al inicio del archivo)

        int[] desordenado = {5, 2, 8, 1, 9, 3};

        java.util.Arrays.sort(desordenado);           // Ordena el array (modifica el original)
        System.out.println(java.util.Arrays.toString(desordenado)); // [1, 2, 3, 5, 8, 9]

        int[] copia = java.util.Arrays.copyOf(desordenado, 4);  // Copia los primeros 4 elementos
        System.out.println(java.util.Arrays.toString(copia));   // [1, 2, 3, 5]

        java.util.Arrays.fill(copia, 0); // Rellena todo con 0
        System.out.println(java.util.Arrays.toString(copia)); // [0, 0, 0, 0]

        // ── ARRAYS MULTIDIMENSIONALES (MATRICES) ─────────────────────────

        // Una matriz es un "array de arrays"
        int[][] matriz = {
            {1, 2, 3},   // Fila 0
            {4, 5, 6},   // Fila 1
            {7, 8, 9}    // Fila 2
        };

        System.out.println(matriz[0][0]); // 1 — fila 0, columna 0
        System.out.println(matriz[1][2]); // 6 — fila 1, columna 2
        System.out.println(matriz[2][2]); // 9 — fila 2, columna 2

        // Recorrer una matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.printf("%3d", matriz[fila][col]);
            }
            System.out.println();
        }
    }
}
```

**🏋️ EJERCICIO 1.5:**
Sin usar `Arrays.sort()`, implementa el algoritmo **Bubble Sort** manualmente sobre este array: `{64, 34, 25, 12, 22, 11, 90}`. El Bubble Sort compara pares adyacentes y los intercambia si están en el orden incorrecto, repitiendo hasta que el array esté ordenado. Muestra el array después de cada "pasada" completa para ver el progreso.

---

### Tema 1.6 — Métodos (Funciones)

#### ¿Qué es un método y por qué existen?

Un método es un **bloque de código con nombre** que realiza una tarea específica. Sin métodos, si necesitas calcular el área de un círculo en 10 lugares distintos de tu programa, copiarías la fórmula 10 veces. Con métodos, la escribes una vez y la llamas 10 veces.

Beneficios: **reutilización**, **legibilidad** y **mantenibilidad** (si cambia la fórmula, solo la cambias en un lugar).

```java
public class Metodos {

    // ── ANATOMÍA DE UN MÉTODO ────────────────────────────────────────────
    //
    // [modificadores] [tipo_retorno] [nombre]([parámetros]) { [cuerpo] }
    //
    //   public static     double       calcularArea  (double radio)
    //       │               │               │              │
    //       │               │               │              └── Parámetros (entrada)
    //       │               │               └── Nombre descriptivo (verbo + sustantivo)
    //       │               └── Tipo de dato que DEVUELVE (double, int, String, void...)
    //       └── Modificadores (public=accesible, static=sin necesitar objeto)

    // Método que recibe un parámetro y devuelve un valor
    public static double calcularAreaCirculo(double radio) {
        double area = Math.PI * radio * radio; // Math.PI ≈ 3.14159...
        return area; // 'return' envía el resultado de vuelta a quien llamó el método
    }

    // Método void: no devuelve nada, solo hace una acción
    public static void imprimirLinea(String mensaje) {
        System.out.println(">>> " + mensaje + " <<<");
        // No hay return (o puedes escribir 'return;' vacío para salir antes)
    }

    // Método con múltiples parámetros
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método que devuelve un String
    public static String clasificarIMC(double imc) {
        if (imc < 18.5) return "Bajo peso";
        else if (imc < 25.0) return "Normal";
        else if (imc < 30.0) return "Sobrepeso";
        else return "Obesidad";
    }

    public static void main(String[] args) {

        // ── LLAMAR A UN MÉTODO ───────────────────────────────────────────

        // Llamar y guardar el resultado en una variable
        double area = calcularAreaCirculo(5.0);
        System.out.println("Área: " + area); // 78.53981633974483

        // Llamar directamente dentro de otra expresión
        System.out.println("Área de radio 3: " + calcularAreaCirculo(3.0));

        // Llamar un método void
        imprimirLinea("Hola desde un método");

        // Encadenar resultados
        double peso = 70.0;
        double altura = 1.75;
        double imc = calcularIMC(peso, altura);
        String clasificacion = clasificarIMC(imc);
        System.out.printf("IMC: %.2f → %s%n", imc, clasificacion);
    }
}
```

#### Paso por valor vs paso por referencia

Este es uno de los conceptos más importantes y malentendidos de Java:

```java
public class PasoPorValor {

    public static void intentarCambiarEntero(int numero) {
        numero = 999; // Solo cambia la COPIA local
    }

    public static void cambiarArray(int[] arr) {
        arr[0] = 999; // Cambia el array ORIGINAL (pasamos la referencia)
    }

    public static void main(String[] args) {

        // PRIMITIVOS: se pasa una COPIA del valor
        int x = 42;
        intentarCambiarEntero(x);
        System.out.println(x); // Sigue siendo 42 — el método recibió una copia

        // OBJETOS Y ARRAYS: se pasa la REFERENCIA (la dirección de memoria)
        int[] numeros = {1, 2, 3};
        cambiarArray(numeros);
        System.out.println(numeros[0]); // Ahora es 999 — el método modificó el original

        // Analogía:
        // Primitivo: te doy una FOTOCOPIA de mi documento. Puedes escribir en la copia,
        //            pero el original sigue intacto.
        // Objeto:    te doy la LLAVE de mi casa. Puedes entrar y cambiar cosas dentro.
    }
}
```

#### Sobrecarga de métodos (Overloading)

Puedes tener varios métodos con el **mismo nombre** pero **diferente firma** (diferente número o tipo de parámetros):

```java
public class Sobrecarga {

    // Tres versiones del mismo método, Java elige la correcta según los argumentos
    public static double sumar(int a, int b) {
        System.out.println("Sumando dos enteros");
        return a + b;
    }

    public static double sumar(double a, double b) {
        System.out.println("Sumando dos decimales");
        return a + b;
    }

    public static double sumar(int a, int b, int c) {
        System.out.println("Sumando tres enteros");
        return a + b + c;
    }

    public static void main(String[] args) {
        sumar(3, 4);        // → "Sumando dos enteros"
        sumar(3.5, 4.2);    // → "Sumando dos decimales"
        sumar(1, 2, 3);     // → "Sumando tres enteros"
    }
}
```

#### Recursividad — Un método que se llama a sí mismo

La recursividad es una técnica donde un método **se llama a sí mismo** para resolver un problema más pequeño. Toda función recursiva necesita:
1. **Caso base**: la condición de parada (sin esto, bucle infinito y StackOverflow)
2. **Caso recursivo**: la llamada a sí mismo con un problema más pequeño

```java
public class Recursividad {

    // Factorial: n! = n × (n-1) × (n-2) × ... × 1
    // factorial(5) = 5 × factorial(4)
    //              = 5 × 4 × factorial(3)
    //              = 5 × 4 × 3 × factorial(2)
    //              = 5 × 4 × 3 × 2 × factorial(1)
    //              = 5 × 4 × 3 × 2 × 1 = 120
    public static long factorial(int n) {
        // Caso base: si n es 0 o 1, el factorial es 1
        if (n <= 1) {
            return 1;
        }
        // Caso recursivo: n × factorial del número anterior
        return n * factorial(n - 1);
    }

    // Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    // Cada número es la suma de los dos anteriores
    public static int fibonacci(int n) {
        if (n <= 0) return 0; // Caso base 1
        if (n == 1) return 1; // Caso base 2
        return fibonacci(n - 1) + fibonacci(n - 2); // Caso recursivo
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // 120
        System.out.println(factorial(10)); // 3628800

        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        // 0 1 1 2 3 5 8 13 21 34 55
    }
}
```

**🏋️ EJERCICIO 1.6:**
Implementa una calculadora con métodos separados: `sumar`, `restar`, `multiplicar`, `dividir` (que devuelva un `String` con mensaje de error si el divisor es 0 en lugar de lanzar excepción). Añade:
- Un método recursivo para calcular la **potencia** (`base^exponente`) sin usar `Math.pow()`
- Un método que determine si un número es **perfecto** (un número perfecto es igual a la suma de sus divisores propios: 6 = 1+2+3)
- Un método `esPalindromo(String texto)` que determine si una palabra se lee igual al revés

---

---

## 🔵 NIVEL 2 — APRENDIZ (POO)

---

### Tema 2.1 — Clases y Objetos

#### ¿Qué es la Programación Orientada a Objetos?

La POO es una forma de organizar el código modelando el mundo real. En lugar de tener funciones sueltas que operan sobre datos sueltos, agrupas los **datos** (atributos) y las **funciones** que operan sobre esos datos (métodos) en una misma unidad llamada **clase**.

- **Clase**: el molde, el plano, la plantilla. Define qué atributos y métodos tienen los objetos.
- **Objeto**: una instancia concreta de una clase. El "objeto de verdad" creado a partir del molde.

Analogía: La clase `Coche` es el plano de un coche. Los objetos son coches concretos: tu Toyota, el BMW de tu vecino. Todos comparten el mismo plano (mismos atributos: marca, color, velocidad) pero tienen valores distintos.

```java
// ── DEFINICIÓN DE LA CLASE ───────────────────────────────────────────────

public class Persona {

    // ATRIBUTOS: los datos que "sabe" cada persona
    // Son variables que pertenecen a la clase (campos o fields)
    String nombre;    // Por defecto null
    int edad;         // Por defecto 0
    double altura;    // Por defecto 0.0

    // CONSTRUCTOR: método especial que se ejecuta al crear un objeto con 'new'
    // - Mismo nombre que la clase
    // - Sin tipo de retorno (ni void)
    // - Puede recibir parámetros para inicializar los atributos
    public Persona(String nombre, int edad, double altura) {
        // 'this' se refiere al objeto que se está creando
        // Necesario cuando el parámetro tiene el mismo nombre que el atributo
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Constructor sobrecargado (sin altura, con valor por defecto)
    public Persona(String nombre, int edad) {
        this(nombre, edad, 1.70); // Llama al otro constructor con altura por defecto
    }

    // MÉTODOS: las acciones que puede hacer una persona

    // Método que no devuelve nada
    public void saludar() {
        // Dentro de un método, 'this.nombre' y 'nombre' son equivalentes
        // (cuando no hay ambigüedad con parámetros)
        System.out.println("Hola, soy " + this.nombre + " y tengo " + this.edad + " años.");
    }

    // Método que devuelve un valor calculado
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    // Método que recibe parámetros
    public void cumplirAnios(int años) {
        this.edad += años;
        System.out.println(this.nombre + " ahora tiene " + this.edad + " años.");
    }

    // toString(): método especial que Java usa cuando imprime un objeto
    // Si no lo defines, imprime algo como "Persona@1b6d3586" (dirección de memoria)
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + ", altura=" + altura + "}";
    }

    // equals(): para comparar si dos objetos son "iguales"
    // Sin esto, == compara referencias (si son el mismo objeto en memoria), no valores
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;               // Son exactamente el mismo objeto
        if (obj == null) return false;               // El otro es null
        if (!(obj instanceof Persona)) return false; // El otro no es una Persona
        Persona otra = (Persona) obj;
        return this.nombre.equals(otra.nombre) && this.edad == otra.edad;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {

        // ── CREAR OBJETOS ────────────────────────────────────────────────

        // 'new' crea un nuevo objeto usando el constructor
        Persona ana = new Persona("Ana", 28, 1.65);
        Persona pedro = new Persona("Pedro", 17); // Usa el constructor sin altura

        // ── ACCEDER A ATRIBUTOS Y MÉTODOS ────────────────────────────────

        System.out.println(ana.nombre);       // "Ana"
        System.out.println(ana.edad);         // 28
        ana.saludar();                        // "Hola, soy Ana y tengo 28 años."
        System.out.println(ana.esMayorDeEdad()); // true
        pedro.cumplirAnios(1);                // "Pedro ahora tiene 18 años."

        // toString() se llama automáticamente al imprimir el objeto
        System.out.println(ana);  // "Persona{nombre='Ana', edad=28, altura=1.65}"

        // ── COMPARAR OBJETOS ─────────────────────────────────────────────

        Persona ana2 = new Persona("Ana", 28, 1.65);

        System.out.println(ana == ana2);       // false: son objetos distintos en memoria
        System.out.println(ana.equals(ana2));  // true: tienen los mismos datos

        // ── LOS OBJETOS SON REFERENCIAS ──────────────────────────────────

        Persona referencia = ana; // referencia apunta AL MISMO objeto que ana
        referencia.edad = 99;
        System.out.println(ana.edad); // 99 — ¡ana también cambió! Son el mismo objeto
    }
}
```

**🏋️ EJERCICIO 2.1:**
Modela una clase `CuentaBancaria` con atributos `titular` (String), `saldo` (double) y `numeroCuenta` (String). Implementa: constructor que inicialice los tres atributos, métodos `depositar(double cantidad)` y `retirar(double cantidad)` (imprime un mensaje de error si no hay saldo suficiente, sin lanzar excepción aún), `mostrarEstado()` que imprima todos los datos formateados, y `toString()`. Crea 3 instancias y realiza transferencias entre ellas (retirar de una y depositar en otra).

---

### Tema 2.2 — Encapsulamiento

#### ¿Por qué encapsular?

En el ejemplo anterior, los atributos de `Persona` eran públicos. Eso significa que cualquiera puede hacer `ana.edad = -500`, poniendo la edad en un valor imposible. El **encapsulamiento** protege los datos internos del objeto y controla cómo se accede a ellos.

Regla de oro: **los atributos deben ser `private`, el acceso mediante métodos `public`**.

```java
public class CuentaBancaria {

    // ATRIBUTOS PRIVADOS: nadie fuera de esta clase puede accederlos directamente
    private String titular;
    private double saldo;
    private String numeroCuenta;
    private int intentosRetiroFallido; // Campo interno, nunca lo exponemos

    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        // Validamos en el constructor también
        if (saldoInicial < 0) throw new IllegalArgumentException("Saldo inicial no puede ser negativo");
        this.saldo = saldoInicial;
        this.intentosRetiroFallido = 0;
    }

    // ── GETTERS: métodos para LEER atributos privados ────────────────────

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        // Podemos transformar el dato antes de devolverlo
        return "****" + numeroCuenta.substring(numeroCuenta.length() - 4);
    }

    // ── SETTERS: métodos para MODIFICAR atributos privados ───────────────
    // No todos los atributos necesitan setter. Si no quieres que se cambie, no lo hagas.

    public void setTitular(String titular) {
        // Validación: el setter controla qué valores son aceptables
        if (titular == null || titular.isBlank()) {
            System.out.println("Error: el titular no puede estar vacío");
            return;
        }
        this.titular = titular;
    }

    // saldo NO tiene setter público: solo se modifica mediante depositar/retirar
    // numeroCuenta NO tiene setter: una vez creada, no se cambia

    // ── MÉTODOS DE NEGOCIO ───────────────────────────────────────────────

    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a depositar debe ser positiva");
            return;
        }
        saldo += cantidad;
        System.out.printf("Depósito de %.2f€. Nuevo saldo: %.2f€%n", cantidad, saldo);
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a retirar debe ser positiva");
            return false;
        }
        if (cantidad > saldo) {
            intentosRetiroFallido++;
            System.out.printf("Error: saldo insuficiente (saldo: %.2f€, intento: %.2f€)%n",
                              saldo, cantidad);
            return false;
        }
        saldo -= cantidad;
        intentosRetiroFallido = 0;
        System.out.printf("Retirado %.2f€. Nuevo saldo: %.2f€%n", cantidad, saldo);
        return true;
    }

    @Override
    public String toString() {
        return String.format("Cuenta[%s | Titular: %s | Saldo: %.2f€]",
                             getNumeroCuenta(), titular, saldo);
    }
}
```

#### Clases inmutables — El siguiente nivel del encapsulamiento

Una clase inmutable no puede ser modificada después de crearse. Sus ventajas son enormes: thread-safe, sin efectos secundarios, fácil de razonar. `String` en Java es inmutable.

```java
// Clase inmutable: todos los campos son final y no hay setters
public final class Punto { // 'final' evita que se pueda heredar de ella

    private final double x; // 'final': solo se puede asignar una vez
    private final double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    // En vez de modificar, devolvemos un NUEVO objeto con el valor cambiado
    public Punto moverX(double dx) {
        return new Punto(this.x + dx, this.y); // Nuevo Punto, el original no cambia
    }

    public double distanciaA(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
```

**🏋️ EJERCICIO 2.2:**
Refactoriza la `CuentaBancaria` del ejercicio anterior para que sea completamente encapsulada (todos los campos `private`). Añade validaciones en setters y métodos. Luego crea una clase `Transferencia` con atributos `origen`, `destino` (ambos `CuentaBancaria`) y `cantidad`, y un método `ejecutar()` que realice la transferencia de forma segura.

---

### Tema 2.3 — Herencia

#### ¿Qué es la herencia?

La herencia permite crear una clase nueva basada en una clase existente, **heredando** todos sus atributos y métodos. La nueva clase puede añadir sus propios elementos o modificar los heredados.

- **Clase padre (superclase)**: la clase original, más general.
- **Clase hija (subclase)**: la clase nueva, más específica. Usa `extends`.

```java
// ── CLASE PADRE ──────────────────────────────────────────────────────────

public class Animal {
    private String nombre;
    private int edad;
    private double peso;

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }

    // Método que las subclases pueden sobreescribir
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico");
    }

    public void comer(String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    @Override
    public String toString() {
        return String.format("%s(nombre=%s, edad=%d, peso=%.1fkg)",
                             getClass().getSimpleName(), nombre, edad, peso);
    }
}
```

```java
// ── CLASE HIJA ───────────────────────────────────────────────────────────

public class Perro extends Animal { // Hereda todo de Animal

    // Atributo propio de Perro (no existe en Animal)
    private String raza;
    private boolean estaAdiestrado;

    // El constructor de la hija DEBE llamar al constructor del padre
    public Perro(String nombre, int edad, double peso, String raza) {
        super(nombre, edad, peso); // 'super(...)' llama al constructor de Animal
        // DEBE ser la primera instrucción del constructor
        this.raza = raza;
        this.estaAdiestrado = false;
    }

    public String getRaza() { return raza; }

    public void adiestrar() {
        estaAdiestrado = true;
        System.out.println(getNombre() + " ha sido adiestrado.");
    }

    // @Override: sobreescribimos el método del padre con comportamiento específico
    // @Override es opcional pero MUY recomendable: el compilador verifica que
    // realmente estás sobreescribiendo algo (evita errores de typo en el nombre)
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau guau!");
    }

    // Podemos llamar al método del padre con super.metodo()
    public void presentarse() {
        super.hacerSonido(); // Llama al hacerSonido() de Animal
        hacerSonido();       // Llama al hacerSonido() de Perro
        System.out.println("Soy un " + raza + " y " +
                           (estaAdiestrado ? "estoy adiestrado" : "no estoy adiestrado"));
    }
}
```

```java
public class Gato extends Animal {
    private boolean esInterior;

    public Gato(String nombre, int edad, double peso, boolean esInterior) {
        super(nombre, edad, peso);
        this.esInterior = esInterior;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    public void ronronear() {
        System.out.println(getNombre() + " está ronroneando... purrrr");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {

        Perro rex = new Perro("Rex", 3, 25.5, "Pastor Alemán");
        Gato misu = new Gato("Misu", 5, 4.2, true);

        // Los objetos tienen acceso a los métodos heredados
        rex.comer("croquetas");    // Método de Animal
        rex.hacerSonido();         // Método de Perro (sobreescrito)
        rex.adiestrar();           // Método propio de Perro

        misu.comer("atún");        // Método de Animal
        misu.hacerSonido();        // Método de Gato (sobreescrito)
        misu.ronronear();           // Método propio de Gato

        System.out.println(rex);   // toString() de Animal, pero con "Perro" como clase

        // instanceof: comprobar si un objeto es de un tipo determinado
        System.out.println(rex instanceof Perro);  // true
        System.out.println(rex instanceof Animal); // true (Perro ES UN Animal)
        System.out.println(rex instanceof Gato);   // false

        // POLIMORFISMO: una variable de tipo Animal puede apuntar a un Perro o Gato
        Animal animal1 = new Perro("Buddy", 2, 15.0, "Labrador");
        Animal animal2 = new Gato("Luna", 3, 3.5, false);

        animal1.hacerSonido(); // Llama al de Perro: "Buddy dice: ¡Guau guau!"
        animal2.hacerSonido(); // Llama al de Gato: "Luna dice: ¡Miau!"
        // Java decide en TIEMPO DE EJECUCIÓN qué método llamar (vinculación dinámica)

        // Para usar métodos específicos de Perro, necesitas casting:
        if (animal1 instanceof Perro perro) { // Pattern matching (Java 16+)
            perro.adiestrar(); // Ahora puedes usar métodos de Perro
        }
    }
}
```

**🏋️ EJERCICIO 2.3:**
Crea la jerarquía: `Vehiculo` (atributos: marca, velocidadMaxima, año; métodos: `arrancar()`, `frenar()`, `describir()`) → `Coche` (atributos: numeroPuertas, tipoCombustible), `Moto` (atributos: tieneSidecar), `Camion` (atributos: capacidadCargaToneladas, numeroejes). Sobreescribe `describir()` en cada subclase. Crea un array `Vehiculo[]` con objetos de los tres tipos, recórrelo llamando a `describir()` en cada uno.

---

### Tema 2.4 — Interfaces y Clases Abstractas

#### Clases abstractas — La plantilla incompleta

Una clase abstracta es una clase que **no se puede instanciar directamente**. Es una clase a medias, que obliga a sus subclases a completarla. Si en tu jerarquía tienes conceptos que nunca existen solos (un "Animal" genérico sin especie no tiene mucho sentido), úsala.

```java
// 'abstract': no se puede hacer 'new Figura()'
public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() { return color; }

    // MÉTODO ABSTRACTO: declarado pero sin implementación
    // Cada subclase DEBE implementarlo o también será abstracta
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    // MÉTODO CONCRETO: implementado, las subclases lo heredan tal cual
    public void mostrarInfo() {
        System.out.printf("Figura %s (color: %s) | Área: %.2f | Perímetro: %.2f%n",
                          getClass().getSimpleName(), color,
                          calcularArea(), calcularPerimetro());
    }
}

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

public class Rectangulo extends Figura {
    private double base, altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() { return base * altura; }

    @Override
    public double calcularPerimetro() { return 2 * (base + altura); }
}
```

#### Interfaces — El contrato puro

Una interfaz define **qué debe hacer** una clase, sin decir cómo. Es un contrato: "Cualquier clase que implemente esta interfaz GARANTIZA que tiene estos métodos."

La diferencia clave con la clase abstracta:
- Una clase puede **heredar de UNA SOLA** clase abstracta
- Una clase puede **implementar MÚLTIPLES** interfaces

```java
// Una interfaz define capacidades / comportamientos
public interface Volable {
    // Los métodos son public abstract por defecto (no hace falta escribirlo)
    void despegar();
    void aterrizar();
    double getAltitudMaxima();

    // Desde Java 8: métodos 'default' con implementación
    default void volar() {
        System.out.println("Volando a " + getAltitudMaxima() + " metros");
    }

    // Desde Java 8: métodos 'static' en interfaces
    static boolean esCapazDeVolar(Object obj) {
        return obj instanceof Volable;
    }
}

public interface Nadable {
    void nadar();
    double getVelocidadNado();
}

// Una clase puede implementar múltiples interfaces
public class Pato extends Animal implements Volable, Nadable {

    public Pato(String nombre) {
        super(nombre, 1, 1.5);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + ": ¡Cuac cuac!");
    }

    // Implementando Volable
    @Override
    public void despegar() { System.out.println(getNombre() + " alza el vuelo"); }

    @Override
    public void aterrizar() { System.out.println(getNombre() + " aterriza"); }

    @Override
    public double getAltitudMaxima() { return 500.0; }

    // Implementando Nadable
    @Override
    public void nadar() { System.out.println(getNombre() + " nada en el lago"); }

    @Override
    public double getVelocidadNado() { return 2.5; }
}
```

```java
public class Main {
    public static void main(String[] args) {

        Pato donald = new Pato("Donald");

        // Puedes usar la variable como Animal, Volable, Nadable o Pato
        Animal a = donald;         a.hacerSonido();     // Cuac cuac
        Volable v = donald;        v.volar();            // Volando...
        Nadable n = donald;        n.nadar();            // Nada...
        Pato p = donald;           p.despegar();         // Alza el vuelo

        // Polimorfismo con interfaces: muy usado en el mundo real
        List<Volable> seresVoladores = new ArrayList<>();
        seresVoladores.add(new Pato("Daisy"));
        // seresVoladores.add(new Avion("Boeing")); // Si Avion implementa Volable
        for (Volable ser : seresVoladores) {
            ser.volar(); // No importa qué tipo concreto sea
        }
    }
}
```

**🏋️ EJERCICIO 2.4:**
Crea un sistema de figuras: clase abstracta `Figura` con métodos abstractos `calcularArea()` y `calcularPerimetro()`. Implementa `Circulo`, `Rectangulo` y `Triangulo`. Crea también una interfaz `Dibujable` con método `dibujar()` (que imprima una representación ASCII simple). Implementa `Dibujable` en `Rectangulo` y `Circulo`. Finalmente, calcula el área total de una lista de figuras y muestra las que también son dibujables.

---

### Tema 2.5 — Enumeraciones y Records

#### Enumeraciones (`enum`) — Conjuntos de constantes con superpoderes

Un `enum` define un conjunto **fijo y cerrado** de valores. Mucho mejor que usar enteros o strings mágicos (`1 = PENDIENTE`, `2 = ENVIADO`...).

```java
// Enum simple
public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

// Enum con atributos y métodos (el verdadero poder)
public enum EstadoPedido {

    PENDIENTE("Pendiente de procesar", false),
    PROCESANDO("En preparación", false),
    ENVIADO("En camino", false),
    ENTREGADO("Entregado al cliente", true),  // true = estado final
    CANCELADO("Pedido cancelado", true);       // true = estado final

    // Los enums pueden tener atributos
    private final String descripcion;
    private final boolean esFinal;

    // Constructor del enum (siempre privado)
    EstadoPedido(String descripcion, boolean esFinal) {
        this.descripcion = descripcion;
        this.esFinal = esFinal;
    }

    public String getDescripcion() { return descripcion; }
    public boolean esFinal() { return esFinal; }

    // Los enums pueden tener métodos
    public EstadoPedido siguienteEstado() {
        return switch (this) {
            case PENDIENTE   -> PROCESANDO;
            case PROCESANDO  -> ENVIADO;
            case ENVIADO     -> ENTREGADO;
            case ENTREGADO, CANCELADO -> throw new IllegalStateException(
                "No hay siguiente estado desde " + this
            );
        };
    }
}
```

```java
public class Main {
    public static void main(String[] args) {

        EstadoPedido estado = EstadoPedido.PENDIENTE;

        System.out.println(estado);                    // PENDIENTE
        System.out.println(estado.getDescripcion());   // "Pendiente de procesar"
        System.out.println(estado.esFinal());          // false
        System.out.println(estado.name());             // "PENDIENTE" (nombre del enum)
        System.out.println(estado.ordinal());          // 0 (posición, empieza en 0)

        // Avanzar al siguiente estado
        estado = estado.siguienteEstado();
        System.out.println(estado); // PROCESANDO

        // switch con enum (muy elegante)
        String mensaje = switch (estado) {
            case PENDIENTE   -> "Tu pedido espera confirmación";
            case PROCESANDO  -> "Estamos preparando tu pedido";
            case ENVIADO     -> "Tu pedido está en camino";
            case ENTREGADO   -> "¡Pedido entregado!";
            case CANCELADO   -> "Pedido cancelado";
        };

        // Obtener todos los valores de un enum
        for (EstadoPedido e : EstadoPedido.values()) {
            System.out.println(e.name() + " → " + e.getDescripcion());
        }

        // Convertir String a enum
        EstadoPedido desde_string = EstadoPedido.valueOf("ENVIADO");
    }
}
```

#### Records (Java 16+) — DTOs inmutables sin boilerplate

Un `Record` es una forma concisa de crear clases inmutables para transportar datos. Genera automáticamente: constructor, getters, `equals()`, `hashCode()` y `toString()`.

```java
// Sin record: clase boilerplate de 50 líneas
// Con record: una línea
public record Producto(String nombre, double precio, int stock) {
    // Automáticamente genera:
    // - Constructor: Producto(String nombre, double precio, int stock)
    // - Getters: nombre(), precio(), stock() (sin "get" delante)
    // - equals(), hashCode(), toString()

    // Puedes añadir validaciones en el constructor compacto
    public Producto {
        if (precio < 0) throw new IllegalArgumentException("Precio no puede ser negativo");
        if (stock < 0) throw new IllegalArgumentException("Stock no puede ser negativo");
        nombre = nombre.trim(); // Podemos transformar los valores
    }

    // Puedes añadir métodos propios
    public double precioConIVA() {
        return precio * 1.21;
    }

    public boolean tieneStock() {
        return stock > 0;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop Pro", 999.99, 50);

        System.out.println(laptop.nombre());        // "Laptop Pro" (getter sin "get")
        System.out.println(laptop.precio());        // 999.99
        System.out.println(laptop.precioConIVA());  // 1209.99...
        System.out.println(laptop);
        // "Producto[nombre=Laptop Pro, precio=999.99, stock=50]"

        // Records son inmutables: no hay setters
        // laptop.precio = 500; ← ERROR de compilación
    }
}
```

**🏋️ EJERCICIO 2.5:**
Crea un sistema de pedidos: `enum EstadoPedido` con estados y transiciones válidas, `record Producto(String nombre, double precio)`, `record LineaPedido(Producto producto, int cantidad)` con método `subtotal()`, y una clase `Pedido` con lista de líneas, método `total()`, método `añadirProducto()` y gestión de estado. Demuestra creando un pedido, añadiendo productos y avanzando su estado.

---

---

## 🟡 NIVEL 3 — INTERMEDIO

---

### Tema 3.1 — Manejo de Excepciones

#### ¿Qué es una excepción?

Una excepción es un **evento anormal** que ocurre durante la ejecución del programa y que interrumpe el flujo normal. Sin manejo de excepciones, un error en cualquier parte del programa lo hace caer por completo con un feo mensaje de error.

Con manejo de excepciones, puedes **capturar** ese error, reaccionar inteligentemente, y continuar (o terminar limpiamente).

#### Jerarquía de excepciones en Java

```
Throwable
├── Error (no manejes estos: OutOfMemoryError, StackOverflowError)
│   └── Son problemas graves de la JVM, no hay mucho que hacer
└── Exception
    ├── RuntimeException (Unchecked — NO obligatorio manejarlas)
    │   ├── NullPointerException      → Usaste null como si fuera un objeto
    │   ├── ArrayIndexOutOfBoundsException → Índice fuera de rango
    │   ├── ClassCastException        → Cast inválido
    │   ├── IllegalArgumentException  → Argumento inválido pasado a método
    │   ├── IllegalStateException     → Estado inválido del objeto
    │   └── NumberFormatException     → "abc" no se puede convertir a int
    └── Otras (Checked — SÍ obligatorio manejarlas o declararlas)
        ├── IOException               → Problemas de entrada/salida
        ├── FileNotFoundException     → Archivo no encontrado
        └── SQLException             → Error de base de datos
```

#### `try-catch-finally` — La estructura básica

```java
public class ManejoExcepciones {

    public static void main(String[] args) {

        // ── TRY-CATCH BÁSICO ─────────────────────────────────────────────

        // El bloque 'try' contiene el código que PODRÍA lanzar una excepción
        // Si ocurre una excepción, el flujo SALTA INMEDIATAMENTE al catch
        // El código después de la excepción (dentro del try) NO se ejecuta
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // ← Lanza ArrayIndexOutOfBoundsException
            System.out.println("Esta línea NUNCA se ejecuta si hay excepción arriba");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 'e' es el objeto de la excepción, contiene info sobre el error
            System.out.println("Error: índice fuera de rango");
            System.out.println("Mensaje: " + e.getMessage());
            // e.printStackTrace(); // Imprime el stack trace completo (útil para debug)
        }

        System.out.println("El programa continúa aquí después del try-catch");

        // ── MÚLTIPLES CATCH ──────────────────────────────────────────────

        String[] datos = {"42", "hola", null, "100"};

        for (String dato : datos) {
            try {
                int numero = Integer.parseInt(dato);  // Puede lanzar NumberFormatException
                System.out.println(100 / numero);     // Puede lanzar ArithmeticException (div/0)
                System.out.println(dato.length());    // Puede lanzar NullPointerException
            } catch (NumberFormatException e) {
                System.out.println("'" + dato + "' no es un número válido");
            } catch (ArithmeticException e) {
                System.out.println("División por cero");
            } catch (NullPointerException e) {
                System.out.println("El dato es null");
            }
            // Java evalúa los catch de arriba a abajo y ejecuta el PRIMER que coincida
        }

        // ── MULTI-CATCH (Java 7+) ────────────────────────────────────────
        // Si tratas las excepciones igual, agrúpalas con |

        try {
            String texto = null;
            int[] arr = new int[3];
            System.out.println(texto.length()); // NPE
            System.out.println(arr[10]);         // AIOOBE
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de acceso: " + e.getMessage());
        }

        // ── FINALLY ──────────────────────────────────────────────────────
        // El bloque 'finally' se ejecuta SIEMPRE: haya excepción o no
        // Útil para liberar recursos (cerrar archivos, conexiones, etc.)

        System.out.println("--- Ejemplo finally ---");
        try {
            System.out.println("Intentando operación...");
            int resultado = 10 / 2;
            System.out.println("Resultado: " + resultado);
            // No hay excepción aquí
        } catch (ArithmeticException e) {
            System.out.println("División por cero");
        } finally {
            System.out.println("Finally: esto se ejecuta SIEMPRE");
            // Aquí cerrarías archivos, conexiones de base de datos, etc.
        }
        // Salida:
        // Intentando operación...
        // Resultado: 5
        // Finally: esto se ejecuta SIEMPRE
    }
}
```

#### `throw` y `throws` — Lanzar excepciones

```java
// 'throws' en la firma del método: avisa que PUEDE lanzar esa excepción checked
// Para excepciones checked (no RuntimeException), el llamador DEBE manejarlas
public static int dividir(int a, int b) throws ArithmeticException {
    if (b == 0) {
        // 'throw' lanza la excepción (crea el objeto y lo lanza)
        throw new ArithmeticException("No se puede dividir por cero");
    }
    return a / b;
}

public static void main(String[] args) {
    try {
        System.out.println(dividir(10, 2));  // 5
        System.out.println(dividir(10, 0));  // Lanza excepción
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
```

#### `try-with-resources` — El cierre automático de recursos

```java
// Cuando trabajas con recursos (archivos, conexiones), DEBES cerrarlos.
// Sin try-with-resources, tienes que cerrarlos en finally (propenso a errores)

// Versión antigua (mala práctica):
BufferedReader reader = null;
try {
    reader = new BufferedReader(new FileReader("archivo.txt"));
    String linea = reader.readLine();
} catch (IOException e) {
    e.printStackTrace();
} finally {
    if (reader != null) {
        try {
            reader.close(); // ¡Esto también puede lanzar IOException!
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Con try-with-resources (Java 7+):
// Cualquier objeto que implemente AutoCloseable se cierra automáticamente al salir del bloque
try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {
    String linea = reader.readLine();
    System.out.println(linea);
} catch (IOException e) {
    System.out.println("Error al leer el archivo: " + e.getMessage());
}
// reader.close() se llama automáticamente, haya o no excepción
```

#### Excepciones personalizadas

```java
// Crear tus propias excepciones para dominio específico
public class SaldoInsuficienteException extends RuntimeException {
    // Unchecked (extends RuntimeException): el llamador no está obligado a manejarla

    private final double saldoActual;
    private final double cantidadSolicitada;

    public SaldoInsuficienteException(double saldoActual, double cantidadSolicitada) {
        super(String.format(
            "Saldo insuficiente. Disponible: %.2f€, Solicitado: %.2f€",
            saldoActual, cantidadSolicitada
        ));
        this.saldoActual = saldoActual;
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public double getSaldoActual() { return saldoActual; }
    public double getCantidadSolicitada() { return cantidadSolicitada; }
    public double getFaltante() { return cantidadSolicitada - saldoActual; }
}

// Uso:
public void retirar(double cantidad) {
    if (cantidad > saldo) {
        throw new SaldoInsuficienteException(saldo, cantidad);
    }
    saldo -= cantidad;
}

// Captura:
try {
    cuenta.retirar(1000.0);
} catch (SaldoInsuficienteException e) {
    System.out.println(e.getMessage());
    System.out.println("Te faltan: " + e.getFaltante() + "€");
}
```

**🏋️ EJERCICIO 3.1:**
Crea un sistema de validación para registro de usuarios. Define excepciones personalizadas: `EmailInvalidoException`, `ContrasenaDebildException` (con campo que indique qué falta: longitud, mayúscula, número, símbolo), y `EdadInvalidaException`. Implementa `validarUsuario(String email, String contrasena, int edad)` que las lance cuando corresponda. Maneja todas desde el `main` mostrando mensajes claros al usuario.

---

### Tema 3.2 — El Framework de Colecciones

#### ¿Por qué no siempre usar arrays?

Los arrays tienen limitaciones graves: tamaño fijo, no se pueden insertar elementos en el medio fácilmente, no tienen métodos de búsqueda... Las **colecciones** resuelven todo esto.

```
Collection (interfaz)
├── List (interfaz) — Secuencia ordenada, permite duplicados
│   ├── ArrayList   → Array dinámico. Rápido para acceder por índice
│   └── LinkedList  → Lista de nodos enlazados. Rápido para insertar/eliminar
├── Set (interfaz) — No permite duplicados
│   ├── HashSet     → Sin orden garantizado, muy rápido
│   ├── LinkedHashSet → Mantiene orden de inserción
│   └── TreeSet     → Ordenado automáticamente (orden natural o Comparator)
└── Queue (interfaz) — Cola FIFO
    └── ArrayDeque  → Cola o pila eficiente

Map (interfaz, NO hereda de Collection)
├── HashMap         → Sin orden, muy rápido
├── LinkedHashMap   → Mantiene orden de inserción
└── TreeMap         → Ordenado por clave
```

#### `ArrayList` — Tu colección más usada

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        // Crear ArrayList (la interfaz List es el tipo recomendado para la variable)
        List<String> nombres = new ArrayList<>(); // <String>: solo acepta Strings (genérico)

        // ── AÑADIR ELEMENTOS ─────────────────────────────────────────────
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beatriz");
        nombres.add("Ana");          // Los duplicados sí están permitidos
        nombres.add(1, "David");     // Insertar en posición 1 (desplaza los demás)

        System.out.println(nombres); // [Ana, David, Carlos, Beatriz, Ana]
        System.out.println("Tamaño: " + nombres.size()); // 5 (.size() no .length)

        // ── ACCEDER ──────────────────────────────────────────────────────
        System.out.println(nombres.get(0));   // "Ana" (índice 0)
        System.out.println(nombres.get(nombres.size() - 1)); // Último elemento

        // ── BUSCAR ───────────────────────────────────────────────────────
        System.out.println(nombres.contains("Carlos"));  // true
        System.out.println(nombres.indexOf("Ana"));      // 0 (primera ocurrencia)
        System.out.println(nombres.lastIndexOf("Ana"));  // 4 (última ocurrencia)

        // ── MODIFICAR ────────────────────────────────────────────────────
        nombres.set(0, "Alicia"); // Reemplaza el elemento en posición 0

        // ── ELIMINAR ─────────────────────────────────────────────────────
        nombres.remove("Carlos");      // Elimina por valor (la primera ocurrencia)
        nombres.remove(0);             // Elimina por índice
        // ⚠️ Con Integer: nombres.remove(Integer.valueOf(2)) elimina el valor 2,
        //                 nombres.remove(2) elimina el índice 2

        // ── RECORRER ─────────────────────────────────────────────────────
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // ── ORDENAR ──────────────────────────────────────────────────────
        Collections.sort(nombres);                    // Orden alfabético
        Collections.sort(nombres, Collections.reverseOrder()); // Orden inverso
        nombres.sort((a, b) -> a.length() - b.length()); // Por longitud (lambda)

        // ── OTRAS OPERACIONES ────────────────────────────────────────────
        List<String> sublista = nombres.subList(0, 2); // Sublista [0, 2) — posiciones 0 y 1
        List<String> copia = new ArrayList<>(nombres); // Copia independiente
        nombres.clear(); // Vaciar la lista
        System.out.println(nombres.isEmpty()); // true
    }
}
```

#### `HashMap` — El diccionario de Java

```java
import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {

        // Map<Clave, Valor>
        Map<String, Integer> edades = new HashMap<>();

        // ── AÑADIR / ACTUALIZAR ──────────────────────────────────────────
        edades.put("Ana", 28);
        edades.put("Carlos", 32);
        edades.put("Beatriz", 25);
        edades.put("Ana", 29);  // Sobreescribe el valor anterior de "Ana"

        System.out.println(edades); // {Ana=29, Carlos=32, Beatriz=25} (orden no garantizado)
        System.out.println("Tamaño: " + edades.size()); // 3

        // ── ACCEDER ──────────────────────────────────────────────────────
        System.out.println(edades.get("Carlos"));         // 32
        System.out.println(edades.get("Inexistente"));    // null (no lanza excepción)
        System.out.println(edades.getOrDefault("X", 0)); // 0 (valor por defecto si no existe)

        // ── BUSCAR ───────────────────────────────────────────────────────
        System.out.println(edades.containsKey("Ana"));   // true
        System.out.println(edades.containsValue(25));    // true

        // ── ELIMINAR ─────────────────────────────────────────────────────
        edades.remove("Beatriz");
        edades.remove("Carlos", 99); // Solo elimina si el valor es 99 (no elimina, es 32)

        // ── RECORRER ─────────────────────────────────────────────────────

        // Por claves
        for (String clave : edades.keySet()) {
            System.out.println("Clave: " + clave);
        }

        // Por valores
        for (int valor : edades.values()) {
            System.out.println("Valor: " + valor);
        }

        // Por entradas (la forma más útil)
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.println(entrada.getKey() + " tiene " + entrada.getValue() + " años");
        }

        // ── OPERACIONES ÚTILES ───────────────────────────────────────────

        // putIfAbsent: solo añade si la clave no existe
        edades.putIfAbsent("Diana", 30);
        edades.putIfAbsent("Ana", 99); // No hace nada, "Ana" ya existe

        // merge: combina el valor existente con el nuevo
        Map<String, Integer> frecuencias = new HashMap<>();
        String[] palabras = {"hola", "mundo", "hola", "java", "hola"};
        for (String palabra : palabras) {
            // Si la clave no existe, pone 1; si existe, suma 1 al valor actual
            frecuencias.merge(palabra, 1, Integer::sum);
        }
        System.out.println(frecuencias); // {hola=3, mundo=1, java=1}
    }
}
```

#### `HashSet` — Colección sin duplicados

```java
import java.util.HashSet;
import java.util.Set;

Set<String> conjunto = new HashSet<>();
conjunto.add("manzana");
conjunto.add("pera");
conjunto.add("manzana"); // Ignorado: ya existe
conjunto.add("naranja");

System.out.println(conjunto.size());           // 3 (no 4)
System.out.println(conjunto.contains("pera")); // true

// Operaciones de conjuntos
Set<Integer> setA = new HashSet<>(Set.of(1, 2, 3, 4, 5));
Set<Integer> setB = new HashSet<>(Set.of(3, 4, 5, 6, 7));

// Intersección (elementos comunes)
Set<Integer> interseccion = new HashSet<>(setA);
interseccion.retainAll(setB);
System.out.println("Intersección: " + interseccion); // [3, 4, 5]

// Unión (todos los elementos)
Set<Integer> union = new HashSet<>(setA);
union.addAll(setB);
System.out.println("Unión: " + union); // [1, 2, 3, 4, 5, 6, 7]

// Diferencia (en A pero no en B)
Set<Integer> diferencia = new HashSet<>(setA);
diferencia.removeAll(setB);
System.out.println("Diferencia: " + diferencia); // [1, 2]
```

**🏋️ EJERCICIO 3.2:**
Implementa un sistema de inventario de una tienda usando `HashMap<String, Integer>` (producto → cantidad). Implementa métodos: `añadirProducto`, `actualizarStock`, `eliminarProducto`, `buscarProducto` (que devuelva `Optional<Integer>`), `productosConStockBajo(int umbral)`, y `top3ProductosMasStock()`. Usa `TreeMap` para mostrar el inventario ordenado alfabéticamente.

---

### Tema 3.3 — Lambdas y Programación Funcional

#### ¿Qué es una expresión lambda?

Una lambda es una **función anónima** — una función sin nombre que puedes tratar como un valor: guardarla en una variable, pasarla como parámetro, devolverla desde un método.

Antes de lambdas (Java 7), tenías que crear clases anónimas para pasar comportamiento. Con lambdas (Java 8+), el código es mucho más conciso.

```java
// ANTES de lambdas: clase anónima (verboso y feo)
Comparator<String> comparadorAntiguo = new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
};

// CON lambda: mucho más limpio
Comparator<String> comparadorNuevo = (a, b) -> a.compareTo(b);

// Aún más conciso con referencia a método:
Comparator<String> comparadorRef = String::compareTo;
```

#### Interfaces funcionales — El fundamento de las lambdas

Una lambda solo puede usarse donde se espera una **interfaz funcional** (interfaz con un único método abstracto).

```java
import java.util.function.*;

public class InterfacesFuncionales {
    public static void main(String[] args) {

        // ── Function<T, R>: recibe T, devuelve R ─────────────────────────
        Function<String, Integer> longitud = s -> s.length();
        Function<String, Integer> longitudRef = String::length; // Referencia a método
        System.out.println(longitud.apply("Hola"));    // 4
        System.out.println(longitudRef.apply("Java")); // 4

        // Composición de funciones
        Function<String, String> mayusculas = String::toUpperCase;
        Function<String, Integer> longitudMayuscula = mayusculas.andThen(longitud);
        // andThen: primero aplica mayusculas, luego longitud al resultado
        System.out.println(longitudMayuscula.apply("hola")); // 4

        // ── Predicate<T>: recibe T, devuelve boolean ──────────────────────
        Predicate<String> esVacio = String::isEmpty;
        Predicate<String> esLargo = s -> s.length() > 5;
        Predicate<String> esLargoYNoVacio = esLargo.and(Predicate.not(esVacio));
        Predicate<String> esVacioOLargo = esVacio.or(esLargo);
        Predicate<String> noEsVacio = esVacio.negate();

        System.out.println(esLargo.test("Hola"));            // false
        System.out.println(esLargo.test("Hola mundo"));      // true
        System.out.println(esVacioOLargo.test(""));          // true (es vacío)
        System.out.println(esVacioOLargo.test("Hola mundo")); // true (es largo)

        // ── Consumer<T>: recibe T, no devuelve nada (efecto secundario) ───
        Consumer<String> imprimir = System.out::println;
        Consumer<String> imprimirMayus = s -> System.out.println(s.toUpperCase());
        Consumer<String> ambos = imprimir.andThen(imprimirMayus);

        imprimir.accept("Hola");        // "Hola"
        ambos.accept("Hola");           // "Hola" y luego "HOLA"

        // ── Supplier<T>: no recibe nada, devuelve T ───────────────────────
        Supplier<String> saludo = () -> "¡Hola, mundo!";
        Supplier<Double> random = Math::random;

        System.out.println(saludo.get());  // "¡Hola, mundo!"
        System.out.println(random.get());  // número aleatorio

        // ── BiFunction<T, U, R>: recibe T y U, devuelve R ────────────────
        BiFunction<String, Integer, String> repetir = (s, n) -> s.repeat(n);
        System.out.println(repetir.apply("Java! ", 3)); // "Java! Java! Java! "

        // ── UnaryOperator<T>: recibe T, devuelve T (Function especializada) ──
        UnaryOperator<String> trim = String::trim;
        UnaryOperator<Integer> doble = n -> n * 2;

        // ── BinaryOperator<T>: recibe dos T, devuelve T ────────────────────
        BinaryOperator<Integer> suma = (a, b) -> a + b;
        BinaryOperator<String> concatenar = String::concat;

        System.out.println(suma.apply(3, 4));        // 7
        System.out.println(concatenar.apply("Ho", "la")); // "Hola"
    }
}
```

**🏋️ EJERCICIO 3.3:**
Sin usar bucles `for`/`while`, usando solo lambdas y métodos de List: procesa una lista de 20 nombres de personas. Usando `Predicate`, filtra los que tienen más de 5 letras. Usando `Function`, transforma los nombres a formato "APELLIDO, Nombre". Usando `Consumer`, imprime cada resultado. Además, implementa un validador de contraseñas que combine múltiples `Predicate<String>` con `and()`.

---

---

## 🟠 NIVEL 4 — AVANZADO

---

### Tema 4.1 — Stream API

#### ¿Qué es un Stream?

Un Stream es una **secuencia de elementos sobre la que puedes aplicar operaciones encadenadas** de forma declarativa (dices QUÉ quieres, no CÓMO hacerlo). No almacena datos: es una pipeline de transformaciones.

Características clave:
- **Lazy** (perezoso): las operaciones intermedias no se ejecutan hasta que hay una operación terminal
- **Consumible**: un stream solo puede usarse una vez
- **No modifica la fuente**: no cambia la lista/array original

```
Fuente → [Op. Intermedia] → [Op. Intermedia] → [Op. Terminal]
  │             │                   │                  │
  │         filter()             map()            collect()
  │       (devuelve Stream)   (devuelve Stream)  (consume el stream)
  └── List, array, archivo, generador...
```

```java
import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {

        List<String> nombres = List.of("Ana", "Carlos", "Beatriz", "David",
                                       "Elena", "Carlos", "Fernando", "Ana");

        // ── CREAR STREAMS ─────────────────────────────────────────────────
        Stream<String> desde_lista = nombres.stream();
        Stream<Integer> desde_valores = Stream.of(1, 2, 3, 4, 5);
        IntStream rango = IntStream.rangeClosed(1, 100); // 1 a 100 inclusive
        Stream<String> infinito = Stream.generate(() -> "hola"); // ¡Necesita limit()!
        Stream<Integer> iterado = Stream.iterate(0, n -> n + 2).limit(10); // 0,2,4,6,...

        // ── OPERACIONES INTERMEDIAS (devuelven Stream) ────────────────────

        // filter: mantiene solo los elementos que cumplen el Predicate
        nombres.stream()
               .filter(n -> n.length() > 4) // Solo nombres con más de 4 letras
               .forEach(System.out::println); // Ana: 3 letras → fuera. Carlos: 6 → pasa

        // map: transforma cada elemento (cambia el tipo o valor)
        nombres.stream()
               .map(String::toUpperCase)     // String → String (en mayúsculas)
               .map(n -> n + "!")            // Añade "!" al final
               .forEach(System.out::println);

        // map que cambia el tipo
        nombres.stream()
               .map(String::length)          // Stream<String> → Stream<Integer>
               .forEach(n -> System.out.print(n + " ")); // 3 6 7 5 5 6 8 3

        // distinct: elimina duplicados (usa equals/hashCode)
        nombres.stream()
               .distinct()
               .forEach(System.out::println); // Ana, Carlos, Beatriz, David, Elena, Fernando

        // sorted: ordena (orden natural o con Comparator)
        nombres.stream()
               .sorted()                             // Orden alfabético
               .forEach(System.out::println);

        nombres.stream()
               .sorted(Comparator.comparingInt(String::length).reversed()) // Por longitud desc
               .forEach(System.out::println);

        // limit y skip: paginación
        nombres.stream()
               .skip(2)   // Salta los 2 primeros
               .limit(3)  // Toma los siguientes 3
               .forEach(System.out::println);

        // flatMap: "aplana" streams de streams (cuando map devuelve Stream)
        List<List<Integer>> listaDelistas = List.of(
            List.of(1, 2, 3),
            List.of(4, 5),
            List.of(6, 7, 8, 9)
        );
        listaDelistas.stream()
                     .flatMap(Collection::stream) // Cada List<Integer> se "aplana" en su Stream
                     .forEach(n -> System.out.print(n + " ")); // 1 2 3 4 5 6 7 8 9

        // peek: para depuración (efecto secundario sin consumir el stream)
        List<Integer> resultado = IntStream.rangeClosed(1, 10)
            .boxed()
            .filter(n -> n % 2 == 0)
            .peek(n -> System.out.println("Pasó filter: " + n))
            .map(n -> n * n)
            .peek(n -> System.out.println("Después de map: " + n))
            .collect(Collectors.toList());

        // ── OPERACIONES TERMINALES (consumen el stream) ───────────────────

        // collect: recopila en una colección
        List<String> lista = nombres.stream()
                                    .filter(n -> n.length() > 4)
                                    .collect(Collectors.toList()); // o toUnmodifiableList()

        Set<String> conjunto = nombres.stream()
                                      .collect(Collectors.toSet()); // Sin duplicados

        String unido = nombres.stream()
                              .distinct()
                              .collect(Collectors.joining(", ", "[", "]")); // "[Ana, Carlos, ...]"

        Map<Integer, List<String>> porLongitud = nombres.stream()
            .collect(Collectors.groupingBy(String::length)); // Agrupa por longitud
        // {3=[Ana, Ana], 6=[Carlos, Carlos], 7=[Beatriz], 5=[David, Elena], 8=[Fernando]}

        Map<Boolean, List<String>> particion = nombres.stream()
            .collect(Collectors.partitioningBy(n -> n.length() > 4));
        // {false=[Ana, Ana], true=[Carlos, Beatriz, David, Elena, Carlos, Fernando]}

        // reduce: combina todos los elementos en uno
        int sumaTotal = IntStream.rangeClosed(1, 100).sum(); // Suma 1 a 100 = 5050
        Optional<String> masLargo = nombres.stream()
                                           .reduce((a, b) -> a.length() >= b.length() ? a : b);

        // count, min, max, anyMatch, allMatch, noneMatch, findFirst, findAny
        long cantidad = nombres.stream().filter(n -> n.startsWith("A")).count(); // 2
        Optional<String> primero = nombres.stream().filter(n -> n.length() > 6).findFirst();
        boolean algunoLargo = nombres.stream().anyMatch(n -> n.length() > 7); // true (Fernando)
        boolean todosCortos = nombres.stream().allMatch(n -> n.length() < 10); // true

        System.out.println("Nombres con A: " + cantidad);
        primero.ifPresent(n -> System.out.println("Primero con >6 letras: " + n));
    }
}
```

**🏋️ EJERCICIO 4.1:**
Dado un `List<Empleado>` donde `Empleado` tiene nombre, departamento, salario y años de experiencia, usando **SOLO Stream API**: calcula salario promedio por departamento, top 3 mejores pagados, departamento con más empleados, empleados con >5 años y salario<30000 (candidatos a aumento), y genera un informe en String con `Collectors.joining`.

---

### Tema 4.2 — Optional

#### El problema del NullPointerException

El NPE es el error más común en Java. `Optional<T>` es un contenedor que puede o no contener un valor, forzándote a manejar el caso de "sin valor" explícitamente.

```java
import java.util.Optional;

public class EjemploOptional {

    // ── CREAR Optional ────────────────────────────────────────────────────

    Optional<String> conValor = Optional.of("Hola");           // Con valor (no puede ser null)
    Optional<String> nullable = Optional.ofNullable(null);     // Puede ser null → Optional.empty()
    Optional<String> vacio = Optional.empty();                  // Vacío explícitamente

    // Optional.of(null) lanza NullPointerException
    // Optional.ofNullable(null) → Optional.empty()

    public static void main(String[] args) {

        Optional<String> opt = Optional.of("Java");

        // ── VERIFICAR Y OBTENER ───────────────────────────────────────────

        opt.isPresent();   // true: tiene valor
        opt.isEmpty();     // false: no está vacío (Java 11+)

        // get() devuelve el valor, pero lanza NoSuchElementException si está vacío
        // ¡Nunca uses get() sin verificar antes con isPresent()!
        String valor = opt.get(); // "Java" — seguro porque sabemos que no está vacío

        opt.orElse("Valor por defecto");       // Si vacío, devuelve "Valor por defecto"
        opt.orElseGet(() -> "Calculado");      // Si vacío, ejecuta el Supplier (lazy)
        opt.orElseThrow();                     // Si vacío, lanza NoSuchElementException
        opt.orElseThrow(() -> new RuntimeException("¡Sin valor!")); // Excepción personalizada

        // ── TRANSFORMAR ──────────────────────────────────────────────────

        Optional<Integer> longitud = opt.map(String::length); // Optional.of(4)
        Optional<String> mayusculas = opt.map(String::toUpperCase); // Optional.of("JAVA")

        // flatMap: cuando map devuelve Optional<Optional<T>>, flatMap aplana
        Optional<Optional<String>> doble = opt.map(s -> Optional.of(s.toUpperCase()));
        Optional<String> plano = opt.flatMap(s -> Optional.of(s.toUpperCase())); // Mejor

        Optional<String> filtrado = opt.filter(s -> s.length() > 3); // Optional.of("Java")
        Optional<String> filtradoVacio = opt.filter(s -> s.length() > 10); // Optional.empty()

        // ── EFECTOS SECUNDARIOS ──────────────────────────────────────────

        opt.ifPresent(s -> System.out.println("Valor: " + s)); // Ejecuta si hay valor

        opt.ifPresentOrElse(
            s -> System.out.println("Valor: " + s),
            () -> System.out.println("Sin valor") // Java 9+
        );

        // ── USO EN CADENA (el patrón más poderoso) ────────────────────────

        // Sin Optional (propenso a NPE):
        // String ciudad = usuario.getDireccion().getCiudad().toUpperCase();

        // Con Optional (seguro):
        Optional<String> ciudadMayus = Optional.ofNullable(getUsuario())
            .map(u -> u.getDireccion())
            .map(d -> d.getCiudad())
            .map(String::toUpperCase);

        System.out.println(ciudadMayus.orElse("Ciudad desconocida"));

        // ── CUÁNDO NO USAR Optional ──────────────────────────────────────
        // ❌ Como campo de una clase: private Optional<String> nombre; — usa null o ""
        // ❌ Como parámetro de método: método(Optional<String> opt) — usa sobrecarga
        // ❌ En colecciones: List<Optional<String>> — usa filter() antes
        // ✅ Como tipo de retorno de métodos que pueden no encontrar un resultado
    }
}
```

**🏋️ EJERCICIO 4.2:**
Implementa un repositorio de libros en memoria (`List<Libro>` donde `Libro` tiene isbn, título, autor, año). Todos los métodos de búsqueda deben retornar `Optional<Libro>` o `List<Libro>`. Implementa: `buscarPorIsbn`, `buscarPorTitulo`, `buscarPorAutor`. Encadena: buscar un libro por ISBN → obtener su autor → buscar otros libros del autor → devolver el más reciente. Todo sin un solo `null` explícito.

---

### Tema 4.3 — Concurrencia: Hilos y `java.util.concurrent`

#### ¿Por qué concurrencia?

Tu CPU tiene múltiples núcleos. Sin concurrencia, tu programa usa solo uno. La concurrencia permite aprovechar todos los núcleos y no bloquear el programa mientras espera (E/S, red, etc.).

```java
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class Concurrencia {

    // ── CREAR HILOS ───────────────────────────────────────────────────────

    // Forma 1: extender Thread (no recomendada)
    static class MiHilo extends Thread {
        @Override
        public void run() {
            System.out.println("Hilo " + getName() + " ejecutándose");
        }
    }

    // Forma 2: implementar Runnable (mejor)
    static class MiTarea implements Runnable {
        private final String nombre;
        public MiTarea(String nombre) { this.nombre = nombre; }

        @Override
        public void run() {
            System.out.println("Tarea " + nombre + " en hilo " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simular trabajo (pausa 1 segundo)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restaurar el flag de interrupción
            }
        }
    }

    public static void main(String[] args) throws Exception {

        // Crear y arrancar hilos manualmente (NO hagas esto en producción)
        Thread hilo1 = new Thread(new MiTarea("A"));
        Thread hilo2 = new Thread(new MiTarea("B"));
        hilo1.start(); // Arranca el hilo (llama a run() en nuevo hilo)
        hilo2.start();
        hilo1.join();  // Espera a que hilo1 termine
        hilo2.join();

        // ── EXECUTOR SERVICE (la forma correcta) ─────────────────────────
        // Pool de hilos: reutiliza hilos en vez de crear/destruir cada vez

        ExecutorService executor = Executors.newFixedThreadPool(4); // 4 hilos

        // submit con Runnable (sin retorno)
        executor.submit(() -> System.out.println("Tarea lambda en pool"));

        // submit con Callable (CON retorno)
        Future<Integer> futuro = executor.submit(() -> {
            Thread.sleep(500); // Simular trabajo
            return 42; // Este valor se devuelve
        });

        System.out.println("Haciendo otras cosas mientras el hilo trabaja...");
        Integer resultado = futuro.get(); // Bloquea hasta que el Future tenga resultado
        System.out.println("Resultado: " + resultado); // 42

        executor.shutdown(); // Deja terminar las tareas pendientes y cierra el pool
        executor.awaitTermination(10, TimeUnit.SECONDS); // Espera máximo 10 segundos

        // ── COMPLETABLE FUTURE (programación asíncrona moderna) ───────────

        CompletableFuture<String> futuro1 = CompletableFuture
            .supplyAsync(() -> {        // Ejecuta en hilo del pool
                simularTrabajo(500);
                return "Datos del servidor A";
            })
            .thenApply(datos -> datos.toUpperCase()) // Transforma el resultado
            .thenApply(datos -> "Procesado: " + datos)
            .exceptionally(ex -> "Error: " + ex.getMessage()); // Manejo de error

        // Combinar dos futuros en paralelo
        CompletableFuture<String> futuroA = CompletableFuture.supplyAsync(() -> {
            simularTrabajo(300); return "Resultado A";
        });
        CompletableFuture<String> futuroB = CompletableFuture.supplyAsync(() -> {
            simularTrabajo(200); return "Resultado B";
        });

        // thenCombine: espera a los DOS y combina sus resultados
        CompletableFuture<String> combinado = futuroA.thenCombine(
            futuroB,
            (a, b) -> a + " + " + b
        );
        System.out.println(combinado.get()); // "Resultado A + Resultado B"

        // ── TIPOS ATÓMICOS: operaciones thread-safe sin synchronized ──────

        AtomicInteger contador = new AtomicInteger(0);

        // Lanzar 100 hilos que incrementen el contador
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            pool.submit(() -> contador.incrementAndGet()); // Thread-safe
        }
        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Contador final: " + contador.get()); // Siempre 100

        // Sin AtomicInteger, usando int normal: puede ser <100 por condición de carrera
    }

    static void simularTrabajo(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
```

**🏋️ EJERCICIO 4.3:**
Implementa un buscador que consulte 5 fuentes simuladas en paralelo usando `CompletableFuture`. Cada fuente tarda un tiempo aleatorio (0-2 segundos). Combina todos los resultados, maneja las que fallen con un valor por defecto, y mide cuánto tiempo tardó en total vs cuánto habría tardado secuencialmente.

---

## 🔴 NIVEL 5 — EXPERTO

---

### Tema 5.1 — Patrones de Diseño

Los patrones de diseño son **soluciones probadas a problemas recurrentes** en el diseño de software. No son código que copiar, sino guías de cómo estructurar tus clases.

#### Patrón Builder — Construir objetos complejos paso a paso

Usado cuando un objeto tiene muchos parámetros opcionales. Evita constructores con 10 parámetros.

```java
// El objeto a construir (inmutable, muchos campos)
public class Pedido {
    private final String cliente;
    private final List<String> productos;
    private final String direccionEnvio;
    private final String tipoPago;
    private final boolean envioExpress;
    private final String cuponDescuento;
    private final String notas;

    // Constructor privado: solo el Builder puede crearlo
    private Pedido(Builder builder) {
        this.cliente = builder.cliente;
        this.productos = List.copyOf(builder.productos);
        this.direccionEnvio = builder.direccionEnvio;
        this.tipoPago = builder.tipoPago;
        this.envioExpress = builder.envioExpress;
        this.cuponDescuento = builder.cuponDescuento;
        this.notas = builder.notas;
    }

    // Getters...
    public String getCliente() { return cliente; }
    // ...

    @Override
    public String toString() {
        return String.format("Pedido[cliente=%s, productos=%s, express=%s, cupon=%s]",
                             cliente, productos, envioExpress, cuponDescuento);
    }

    // Clase Builder estática anidada
    public static class Builder {
        // Campos obligatorios
        private final String cliente;
        private final List<String> productos = new ArrayList<>();
        private final String direccionEnvio;

        // Campos opcionales con valores por defecto
        private String tipoPago = "Tarjeta";
        private boolean envioExpress = false;
        private String cuponDescuento = null;
        private String notas = "";

        // Constructor del Builder con los campos OBLIGATORIOS
        public Builder(String cliente, String direccionEnvio) {
            if (cliente == null || cliente.isBlank())
                throw new IllegalArgumentException("Cliente requerido");
            this.cliente = cliente;
            this.direccionEnvio = direccionEnvio;
        }

        // Métodos fluidos: cada uno devuelve 'this' para encadenar
        public Builder producto(String producto) {
            this.productos.add(producto);
            return this;
        }

        public Builder tipoPago(String tipoPago) {
            this.tipoPago = tipoPago;
            return this;
        }

        public Builder envioExpress() {
            this.envioExpress = true;
            return this;
        }

        public Builder cupon(String cupon) {
            this.cuponDescuento = cupon;
            return this;
        }

        public Builder notas(String notas) {
            this.notas = notas;
            return this;
        }

        // build(): crea el objeto final
        public Pedido build() {
            if (productos.isEmpty())
                throw new IllegalStateException("El pedido debe tener al menos un producto");
            return new Pedido(this);
        }
    }
}

// Uso: API fluida y legible
Pedido pedido = new Pedido.Builder("Ana García", "Calle Mayor 1, Madrid")
    .producto("Laptop")
    .producto("Ratón")
    .tipoPago("PayPal")
    .envioExpress()
    .cupon("DESCUENTO10")
    .notas("Dejar en portería si no hay nadie")
    .build();

System.out.println(pedido);
```

#### Patrón Strategy — Algoritmos intercambiables

```java
// Interfaz Strategy: define el "contrato" del algoritmo
public interface EstrategiaEnvio {
    double calcularCosto(double peso, double distanciaKm);
    String getNombre();
}

// Diferentes implementaciones del algoritmo
public class EnvioEstandar implements EstrategiaEnvio {
    @Override
    public double calcularCosto(double peso, double distanciaKm) {
        return 2.0 + peso * 0.5 + distanciaKm * 0.01;
    }
    @Override public String getNombre() { return "Estándar (3-5 días)"; }
}

public class EnvioExpress implements EstrategiaEnvio {
    @Override
    public double calcularCosto(double peso, double distanciaKm) {
        return 10.0 + peso * 1.0 + distanciaKm * 0.05;
    }
    @Override public String getNombre() { return "Express (24h)"; }
}

public class EnvioDron implements EstrategiaEnvio {
    @Override
    public double calcularCosto(double peso, double distanciaKm) {
        if (peso > 2.0 || distanciaKm > 10.0)
            throw new IllegalArgumentException("El dron solo soporta <2kg y <10km");
        return 5.0 + peso * 2.0;
    }
    @Override public String getNombre() { return "Dron (2h)"; }
}

// El "contexto" que usa la estrategia
public class Carrito {
    private EstrategiaEnvio estrategia;
    private List<String> productos = new ArrayList<>();

    public void setEstrategiaEnvio(EstrategiaEnvio estrategia) {
        this.estrategia = estrategia; // Cambiamos la estrategia en tiempo de ejecución
    }

    public double calcularEnvio(double pesoTotal, double distancia) {
        return estrategia.calcularCosto(pesoTotal, distancia);
    }
}

// Uso:
Carrito carrito = new Carrito();

carrito.setEstrategiaEnvio(new EnvioEstandar());
System.out.println(carrito.calcularEnvio(1.5, 100)); // Barato

carrito.setEstrategiaEnvio(new EnvioExpress());
System.out.println(carrito.calcularEnvio(1.5, 100)); // Más caro

// Con lambdas (Strategy funcional):
EstrategiaEnvio gratis = (peso, distancia) -> 0.0;
carrito.setEstrategiaEnvio(gratis);
```

#### Patrón Observer — Eventos y suscripciones

```java
// El "evento" que se notifica
public record EventoPedido(String tipoPedidoId, String tipo, String descripcion) {}

// Interfaz Observer: quien quiere ser notificado
public interface ObservadorPedido {
    void onEvento(EventoPedido evento);
}

// Implementaciones de observadores
public class NotificacionEmail implements ObservadorPedido {
    @Override
    public void onEvento(EventoPedido e) {
        System.out.println("[EMAIL] Pedido " + e.tipoPedidoId() + ": " + e.descripcion());
    }
}

public class NotificacionSMS implements ObservadorPedido {
    @Override
    public void onEvento(EventoPedido e) {
        System.out.println("[SMS] " + e.tipo() + " - " + e.descripcion());
    }
}

// El "sujeto" que lanza eventos
public class SistemaPedidos {
    private final List<ObservadorPedido> observadores = new ArrayList<>();

    public void suscribir(ObservadorPedido obs) { observadores.add(obs); }
    public void desuscribir(ObservadorPedido obs) { observadores.remove(obs); }

    private void notificar(EventoPedido evento) {
        observadores.forEach(obs -> obs.onEvento(evento));
    }

    public void crearPedido(String id) {
        // Lógica de negocio...
        notificar(new EventoPedido(id, "CREADO", "Nuevo pedido recibido"));
    }

    public void enviarPedido(String id) {
        notificar(new EventoPedido(id, "ENVIADO", "Pedido en camino"));
    }
}

// Uso:
SistemaPedidos sistema = new SistemaPedidos();
sistema.suscribir(new NotificacionEmail());
sistema.suscribir(new NotificacionSMS());
sistema.suscribir(evento -> System.out.println("[LOG] " + evento)); // Lambda como Observer

sistema.crearPedido("PED-001");
sistema.enviarPedido("PED-001");
```

**🏋️ EJERCICIO 5.1:**
Construye un sistema de e-commerce completo que use: **Builder** para `Pedido`, **Strategy** para calcular descuentos (sin descuento, porcentaje, cantidad fija, 2x1), **Observer** para notificaciones (email, SMS, log). El sistema debe gestionar el ciclo completo de un pedido.

---

### Tema 5.2 — Testing con JUnit 5 y Mockito

#### ¿Por qué testear?

El código sin tests es código que no sabes si funciona. Los tests automáticos te permiten refactorizar con confianza, detectar regresiones y documentar el comportamiento esperado.

```java
// Dependencias en pom.xml:
// junit-jupiter (JUnit 5), mockito-core, assertj-core

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.*;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

// La clase de test
class CuentaBancariaTest {

    // @Mock: crea un "doble de prueba" de la dependencia
    // No llama código real, solo simula comportamiento
    @Mock
    private NotificacionService notificaciones;

    // @InjectMocks: crea la clase bajo test, inyectando los @Mock automáticamente
    @InjectMocks
    private CuentaBancaria cuenta;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Inicializa los mocks
        // O usa @ExtendWith(MockitoExtension.class) a nivel de clase
        cuenta = new CuentaBancaria("Ana", "ES123", 100.0, notificaciones);
    }

    // ── TESTS BÁSICOS ─────────────────────────────────────────────────────

    @Test
    @DisplayName("Depositar cantidad positiva aumenta el saldo")
    void depositarCantidadPositivaAumentaSaldo() {
        // Given (preparación)
        double saldoInicial = cuenta.getSaldo();

        // When (acción)
        cuenta.depositar(50.0);

        // Then (verificación) — AssertJ: assertions fluidas y legibles
        assertThat(cuenta.getSaldo()).isEqualTo(saldoInicial + 50.0);
    }

    @Test
    @DisplayName("Retirar más del saldo lanza SaldoInsuficienteException")
    void retirarMasSaldoLanzaExcepcion() {
        assertThatThrownBy(() -> cuenta.retirar(200.0))
            .isInstanceOf(SaldoInsuficienteException.class)
            .hasMessageContaining("100.0"); // El mensaje menciona el saldo disponible
    }

    @Test
    @DisplayName("Depositar cantidad negativa lanza IllegalArgumentException")
    void depositarNegativoLanzaExcepcion() {
        assertThatThrownBy(() -> cuenta.depositar(-50.0))
            .isInstanceOf(IllegalArgumentException.class);
    }

    // ── TESTS CON MOCKITO ─────────────────────────────────────────────────

    @Test
    @DisplayName("Al depositar, se notifica al servicio de notificaciones")
    void depositarNotificaAlServicio() {
        // When
        cuenta.depositar(50.0);

        // Then: verifica que se llamó el método del mock con los argumentos correctos
        verify(notificaciones).enviarNotificacion(
            eq("Ana"),
            contains("50.0") // El mensaje contiene "50.0"
        );
    }

    @Test
    @DisplayName("Si falla el servicio de notificaciones, el depósito igual se realiza")
    void depositarFuncionaAunqueFalleNotificacion() {
        // Configurar el mock para que lance excepción
        doThrow(new RuntimeException("Servicio caído"))
            .when(notificaciones).enviarNotificacion(any(), any());

        // El depósito debe funcionar igual
        assertThatCode(() -> cuenta.depositar(50.0)).doesNotThrowAnyException();
        assertThat(cuenta.getSaldo()).isEqualTo(150.0);
    }

    // ── TESTS PARAMETRIZADOS ──────────────────────────────────────────────

    @ParameterizedTest
    @ValueSource(doubles = {-1.0, 0.0, -100.0})
    @DisplayName("Depositar cantidades no positivas lanza excepción")
    void depositarCantidadesNoPositivasLanzaExcepcion(double cantidad) {
        assertThatThrownBy(() -> cuenta.depositar(cantidad))
            .isInstanceOf(IllegalArgumentException.class);
    }

    // ── TESTS ANIDADOS ────────────────────────────────────────────────────

    @Nested
    @DisplayName("Cuando el saldo es cero")
    class CuandoSaldoCero {

        @BeforeEach
        void vaciarCuenta() {
            cuenta.retirar(100.0);
        }

        @Test
        @DisplayName("Cualquier retiro lanza excepción")
        void retiroLanzaExcepcion() {
            assertThatThrownBy(() -> cuenta.retirar(0.01))
                .isInstanceOf(SaldoInsuficienteException.class);
        }

        @Test
        @DisplayName("Depositar funciona normalmente")
        void depositarFunciona() {
            assertThatCode(() -> cuenta.depositar(50.0)).doesNotThrowAnyException();
        }
    }
}
```

**🏋️ EJERCICIO 5.2:**
Usando TDD (escribe el test ANTES del código): implementa `CarritoCompraService` con métodos para añadir/eliminar productos, calcular total, aplicar descuentos y calcular IVA por país. Escribe los tests primero (verán fallar en rojo), luego implementa para que pasen (verde), luego refactoriza. Alcanza >85% de cobertura.

---

## ⚫ NIVEL 6 — PRO ABSOLUTO

---

### Tema 6.1 — Virtual Threads (Java 21+)

#### El problema con los hilos de plataforma

Los hilos de plataforma son caros: cada uno consume ~1MB de memoria de stack. Un servidor con 10.000 conexiones simultáneas necesitaría 10GB solo en stacks de hilos. Por eso Spring WebFlux y la programación reactiva existen: para no bloquear hilos.

Los **Virtual Threads** resuelven esto a nivel de JVM: son hilos gestionados por la JVM, ultraligeros (KB, no MB), que se pueden crear por millones.

```java
import java.util.concurrent.*;

public class VirtualThreads {
    public static void main(String[] args) throws Exception {

        // Crear un virtual thread
        Thread vt = Thread.ofVirtual().start(() -> {
            System.out.println("Hola desde virtual thread: " + Thread.currentThread());
        });
        vt.join();

        // ExecutorService con virtual threads (el más importante en producción)
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            // Crear 10.000 tareas concurrentes — con hilos normales esto sería desastroso
            List<Future<String>> futuros = new ArrayList<>();
            for (int i = 0; i < 10_000; i++) {
                final int id = i;
                futuros.add(executor.submit(() -> {
                    Thread.sleep(Duration.ofMillis(100)); // Simular I/O bloqueante
                    return "Resultado " + id;
                }));
            }
            // Esperar todos los resultados
            for (Future<String> f : futuros) {
                f.get();
            }
        }
        System.out.println("¡10.000 tareas completadas con virtual threads!");

        // Structured Concurrency (Java 21+)
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Future<String> usuario = scope.fork(() -> buscarUsuario("123"));
            Future<String> pedidos = scope.fork(() -> buscarPedidos("123"));

            scope.join().throwIfFailed(); // Espera ambos; si uno falla, cancela el otro

            System.out.println(usuario.get() + " | " + pedidos.get());
        }
    }

    static String buscarUsuario(String id) throws Exception {
        Thread.sleep(200); return "Usuario " + id;
    }
    static String buscarPedidos(String id) throws Exception {
        Thread.sleep(300); return "3 pedidos de " + id;
    }
}
```

**🏋️ EJERCICIO 6.1:**
Implementa un servidor de "procesamiento de solicitudes" que maneje 1.000 solicitudes simultáneas usando virtual threads. Compara el tiempo y uso de memoria con un pool de 100 hilos de plataforma. Analiza los resultados.

---

### Tema 6.2 — Spring Boot (Introducción al Ecosistema)

Spring Boot es el framework más usado en el ecosistema Java empresarial. Convierte lo que serían 500 líneas de configuración en unas pocas anotaciones.

```java
// Dependencias básicas en pom.xml:
// spring-boot-starter-web, spring-boot-starter-data-jpa, spring-boot-starter-test

// ── ENTIDAD JPA ───────────────────────────────────────────────────────────
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private double precio;

    // Constructor, getters, setters...
}

// ── REPOSITORIO ───────────────────────────────────────────────────────────
// Spring Data genera automáticamente las implementaciones de estos métodos
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombreContainingIgnoreCase(String nombre);
    List<Producto> findByPrecioBetween(double min, double max);
    Optional<Producto> findFirstByOrderByPrecioDesc(); // El más caro
}

// ── SERVICIO ──────────────────────────────────────────────────────────────
@Service // Spring lo gestiona como un bean singleton
@Transactional
public class ProductoService {

    private final ProductoRepository repo;

    // Inyección de dependencias por constructor (la forma recomendada)
    public ProductoService(ProductoRepository repo) {
        this.repo = repo;
    }

    public List<Producto> buscarPorNombre(String nombre) {
        return repo.findByNombreContainingIgnoreCase(nombre);
    }

    public Producto crear(Producto producto) {
        if (producto.getPrecio() < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");
        return repo.save(producto);
    }
}

// ── CONTROLADOR REST ──────────────────────────────────────────────────────
@RestController // @Controller + @ResponseBody
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @GetMapping                           // GET /api/productos
    public List<Producto> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")                  // GET /api/productos/42
    public ResponseEntity<Producto> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                      .map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping                          // POST /api/productos
    @ResponseStatus(HttpStatus.CREATED)
    public Producto crear(@RequestBody @Valid Producto producto) {
        return service.crear(producto);
    }

    @DeleteMapping("/{id}")               // DELETE /api/productos/42
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}

// ── CLASE PRINCIPAL ───────────────────────────────────────────────────────
@SpringBootApplication // Combina @Configuration + @EnableAutoConfiguration + @ComponentScan
public class MiAplicacion {
    public static void main(String[] args) {
        SpringApplication.run(MiAplicacion.class, args);
        // ¡Eso es todo! Spring Boot configura Tomcat, JPA, etc. automáticamente
    }
}
```

**🏋️ EJERCICIO 6.2 — PROYECTO FINAL:**
Construye una API REST de gestión de tareas con Spring Boot que incluya: entidades `Usuario` y `Tarea`, repositorios Spring Data, capa de servicio con validaciones, controladores REST con manejo de errores global (`@ControllerAdvice`), y tests de integración. Documenta la API con comentarios describiendo cada endpoint.

---

## 📚 RECURSOS RECOMENDADOS

### Libros (en orden de lectura)
1. *Head First Java* — Sierra & Bates (Niveles 1-2)
2. *Effective Java* — Joshua Bloch (Niveles 3-5) ← **LA BIBLIA del desarrollador Java**
3. *Clean Code* — Robert C. Martin (Nivel 3+)
4. *Java Concurrency in Practice* — Goetz et al. (Nivel 4-5)
5. *Designing Data-Intensive Applications* — Kleppmann (Nivel 6)
6. *Domain-Driven Design* — Eric Evans (Nivel 6)

### Plataformas de práctica
- **LeetCode** / **HackerRank** — algoritmos y estructuras de datos
- **Exercism.io** — track de Java con mentores reales
- **Codewars** — katas progresivos con comunidad

### Documentación oficial
- https://docs.oracle.com/en/java/javase/21/
- https://openjdk.org/jeps/ — Java Enhancement Proposals (novedades del lenguaje)

---

## 🗺️ HOJA DE RUTA (dedicación seria, no turismo)

| Nivel | Tiempo estimado |
|-------|-----------------|
| 🟢 Nivel 1 | 2-3 semanas |
| 🔵 Nivel 2 | 3-4 semanas |
| 🟡 Nivel 3 | 4-5 semanas |
| 🟠 Nivel 4 | 4-6 semanas |
| 🔴 Nivel 5 | 6-8 semanas |
| ⚫ Nivel 6 | 3-6 meses (aprendizaje continuo) |

> **Regla de oro:** No avances hasta que puedas explicar el tema anterior sin mirar notas. Si no puedes explicarlo simplemente, no lo has entendido del todo.

---

*"First, solve the problem. Then, write the code."* — John Johnson

*"Any fool can write code that a computer can understand. Good programmers write code that humans can understand."* — Martin Fowler