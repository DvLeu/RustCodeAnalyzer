# RustParser

RustParser es un proyecto desarrollado en IntelliJ IDEA para analizar y validar la sintaxis de código Rust utilizando JavaCC. Este proyecto incluye la definición léxica y gramatical de varios constructos del lenguaje Rust, como declaraciones de variables, funciones, estructuras de control, y más.

## Características

- Análisis y validación de sintaxis de Rust
- Soporte para declaraciones de variables y funciones
- Soporte para estructuras de control (`if`, `else`, `while`, `for`)
- Manejo de comentarios de una línea y multilínea
- Soporte para expresiones aritméticas y lógicas

## Requisitos

- Java Development Kit (JDK)
- IntelliJ IDEA
- JavaCC

## Instalación

1. Clona el repositorio en tu máquina local:
    ```sh
    git clone https://github.com/tuusuario/RustParser.git
    ```

2. Abre el proyecto en IntelliJ IDEA:
    - Selecciona `File > Open...`
    - Navega hasta el directorio del proyecto clonado y ábrelo.

3. Configura JavaCC en IntelliJ IDEA:
    - Descarga y configura el plugin de JavaCC en IntelliJ si aún no lo tienes.

## Uso

1. Compila el archivo JavaCC para generar el analizador léxico y sintáctico:
    - En IntelliJ IDEA, navega hasta el archivo `Gramatica.jj`.
    - Haz clic derecho y selecciona `Compile JavaCC`.

2. Ejecuta el programa principal:
    - Navega hasta el archivo `main.java` en el paquete `Main`.
    - Haz clic derecho en `main.java` y selecciona `Run 'main.main()'`.

3. Prueba el análisis de código Rust:
    - Modifica el archivo `test.txt` con el código Rust que deseas analizar.
    - Ejecuta el programa principal para ver los resultados del análisis.

## Estructura del Proyecto

- `src/`
  - `Analizador/`
    - `Sintaxis.java`: Archivo generado por JavaCC que contiene el analizador léxico y sintáctico.
    - `Gramatica.jj`: Definición léxica y gramatical del lenguaje Rust.
  - `Main/`
    - `main.java`: Programa principal que ejecuta el analizador sintáctico.
  - `test.txt`: Archivo de prueba con el código Rust a analizar.

## Ejemplo de Código

Ejemplo de un archivo `test.txt` para probar el analizador:

```rust
fn main() {
    // Hola soy un comentario
    let x: i32 = 123;
    let z: f64 = 3.1415;
    let es_verdadero: bool = true;

    if x < 20 {
        println!("pequeño");
    } else if x < 100 {
        println!("muy grande");
    } else {
        println!("enorme");
    }
}
