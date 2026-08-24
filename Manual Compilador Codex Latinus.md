# Manual - Compilador Codex Latinus


## 1. Estructura del Lenguaje (Codex Latinus)

El lenguaje es estrictamente **case-sensitive** y sigue una estructura modular obligatoria dividida en hasta tres bloques principales.

### 1.1. Estructura General del Archivo (`.lat`)

Un archivo válido consta de:
1. **`VARIABILES >`** *(Opcional)*: Declaración de variables, arreglos (*series*) y estructuras (*structura*) globales.
2. **`MUNERA >`** *(Opcional)*: Definición de funciones con o sin retorno (`ratio` / `actio`).
3. **`MAIOR >>`** *(Obligatorio)*: Bloque de ejecución principal.
4. **`FINIS;`** *(Obligatorio)*: Cierre global del programa.

```latin
VARIABILES>
    esto vida numerus 100;

MUNERA>
    ratio numerus calcularDanio(esto base: numerus) {
        VARIABILES[
            esto extra numerus 10;
        ]
        reddere base + extra;
    } finis;

MAIOR>>
    >> "Iniciando operación...";
    vida = calcularDanio(vida);
    >> "Vida final: " >> vida;
FINIS;
```

---

## 2. Guía de Sintaxis y Tipos de Datos

### 2.1. Tipos de Datos Primitivos

| Tipo de Dato | Palabra Reservada | Descripción | Ejemplo de Literal |
| :--- | :--- | :--- | :--- |
| **Entero** | `numerus` | Números enteros | `10`, `0`, `42` |
| **Decimal** | `decimalis` | Números con punto flotante | `9.81`, `3.14159` |
| **Cadena** | `textum` | Cadenas de texto encerradas en comillas dobles | `"Resistencia"` |
| **Carácter** | `littera` | Un solo carácter encerrado en comillas simples | `'a'`, `'Z'` |
| **Booleano** | `bool` | Valores lógicos absolutos | `verum` (verdadero), `falsus` (falso) |

> **Declaración explícita e inferida de Booleanos:**
> - Inferida: `esto flag: verum;` o `esto flag: falsus;`
> - Explícita: `esto flag: bool verum;`

### 2.2. Declaración de Variables Globales y Locales

#### En sección `VARIABILES >` (Globales) o dentro de `VARIABILES[...]` (Funciones):
- **Con valor inicial:** `esto <id> : <tipo> <expresión>;`
- **Sin valor inicial (por defecto):** `esto <id> : <tipo>;`

```latin
esto fuerza : numerus 10;
esto nombre : textum "Comandante";
esto activo : bool verum;
```

### 2.3. Arreglos (`series`)

Los arreglos pueden ser de tipos primitivos o de estructuras personalizadas. Las posiciones se computan a partir del índice `0`.

```latin
// Con inicialización explícita
series mis_numeros [2] : numerus {1, 2};
series nombres [2] : textum {"Alpha", "Bravo"};

// Sin inicialización (vacío)
series datos [5] : decimalis;
```

### 2.4. Estructuras Personalizadas (`structura`)

Permiten agrupar múltiples atributos de cualquier tipo. Los atributos se delimitan por comas o por punto y coma.

```latin
// Definición de estructura
structura Escuadron {
    esto comandante: textum,
    esto miembros: numerus
} finis;

// Instanciación de una variable tipo estructura
esto alfa: Escuadron {
    comandante: "Marcus",
    miembros: 5
}

// Asignación de valores en arreglos de estructuras
mi_base.escuadrones[0] = {
    comandante: "Titus",
    miembros: 12
};
```

---

## 3. Reglas Semánticas y Jerarquía de Tipos

El compilador aplica **Type Checking** estricto durante la evaluación semántica:

1. **Tabla de Jerarquía Implícita de Tipos:**
   - **Nivel 5:** `textum` *(Mayor jerarquía)*
   - **Nivel 4:** `decimalis`
   - **Nivel 3:** `numerus`
   - **Nivel 2:** `littera`
   - **Nivel 1:** `bool` / `verum` / `falsus`

2. **Reglas de Promoción:**
   - Al operar tipos distintos (ej. `numerus + decimalis`), el resultado se promueve automáticamente al tipo de mayor jerarquía (`decimalis`).
   - El tipo `textum` es incompatible con la mayoría de operaciones aritméticas, **salvo la suma (`+`)**, que actúa exclusivamente como **concatenación**.

3. **Condicionales:** Las expresiones dentro de estructuras de control (`si`, `dum`, `facere dum`) **deben ser estrictamente de tipo booleano**. Un entero o decimal dentro de una condición provocará un error de *Corrupción de Flujo*.

---

## 4. Control de Flujo y Funciones

### 4.1. Condicionales (`si` / `aliter`)

```latin
si (fuerza > 50 && activo == verum) {
    >> "Ataque autorizado";
} aliter (fuerza > 20) {
    >> "Ataque cauteloso";
} aliter {
    >> "Retirada";
} finis;
```

### 4.2. Ciclos y Bucles

- **Ciclo `dum` (While):**
  ```latin
  dum (contador < 10) {
      contador++;
  } finis;
  ```

- **Ciclo `facere ... dum` (Do-While):**
  ```latin
  facere {
      contador++;
  } dum (contador < 10);
  ```

- **Ciclo `per` (For):**
  ```latin
  per (esto i: numerus 0; i < 10; i++) {
      >> i;
  }
  ```

- **Sentencias de Control de Salto:**
  - `interrumpe;` (*break*): Sale inmediatamente del ciclo.
  - `perge;` (*continue*): Salta a la siguiente iteración.

### 4.3. Funciones (`ratio` y `actio`)

- **`actio`**: Subrutina sin valor de retorno (tipo `void`).
- **`ratio`**: Función que retorna obligatoriamente un valor con la palabra reservada `reddere`.
- *Nota:* Las variables locales de una función deben declararse **únicamente al inicio** dentro del bloque `VARIABILES[...]`.

```latin
ratio numerus sumar(esto a: numerus, esto b: numerus) {
    VARIABILES[
        esto res: numerus a + b;
    ]
    reddere res;
} finis;

actio mostrarAlerta(esto msg: textum) {
    >> msg;
} finis;
```

### 4.4. Entradas y Salidas Especiales

- **Imprimir en consola (`>>`):** `>> "Valor de X: " >> x;`
- **Leer de consola (`<<`):**
  - `<<` *(Lee entrada pero no la asigna)*
  - `variable <<` *(Lee entrada y asigna el resultado a `variable`)*

---

## 5. Uso del Entorno y Herramientas del Sistema

La interfaz gráfica del software proporciona herramientas visuales completas para el análisis de compiladores:

1. **Gestión de Archivos:**
   - **Abrir / Guardar:** Permite cargar archivos con extensión `.lat`.

2. **Visor del Árbol Sintáctico Abstracto (AST):**
   - Muestra una representación gráfica del AST generado tras un análisis exitoso.


---

## 6. Reporte y Manejo de Errores

Si el sistema detecta anomalias durante la compilación, desplegará una tabla descriptiva:

- **Errores Léxicos:** Caracteres o símbolos no reconocidos por el lexer de Codex Latinus.
- **Errores Sintácticos:** Estructuras gramaticales mal formadas o tokens fuera de lugar.
- **Errores Semánticos:**
  - Incompatibilidad de tipos en asignaciones o expresiones.
  - Uso de expresiones no booleanas en condicionales/ciclos.
  - Funciones `ratio` que carecen de sentencia `reddere` en algún flujo.
  - Acceso a arreglos fuera de los límites o variables no declaradas.
