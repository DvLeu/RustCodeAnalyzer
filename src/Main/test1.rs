fn main() {
/* Este es un comentario multilínea
       que abarca varias líneas
       de código en Rust */

    let x = 10; /* También puedes incluir comentarios multilínea
                   al lado del código */

    /* Los comentarios multilínea
       pueden ser anidados
       /* como este */
       /*dentro de otros */

    println!("El valor de x es: {}", x);
    let mut sum = 0;
    for i in 1..=10 {
        if i % 2 == 0 {
            println!("{} es par", i);
        } else {
            println!("{} es impar", i);
        }
        sum += i;
    }
    println!("La suma de los números del 1 al 10 es: {}", sum);
}
let number = 10;

if number < 0 {
    println!("The number is negative");
} else if number == 0 {
    println!("The number is zero");
} else {
    println!("The number is positive");
}
fn add(a: i32, b: i32) -> i32 {
    return a + b;
    }
for i in 0..10 {
    println!("i is at {}", i);
}

