fn main() {
    let mut count = 0;
    let name = "Mundo";
    greet(name);
    if count == 0 {
        println!("El contador está en cero");
    }
    while count < 5 {
        println!("Contador: {}", count);
        count += 1;
    }

    for number in 0..5 {
        println!("Número: {}", number);
    }

    let sum_result = sum(5, 3);
    println!("La suma de 5 y 3 es: {}", sum_result);
}

fn greet(name: &str) {
    println!("Hola, {}!", name);
}

fn sum(a: i32, b: i32) -> i32 {
    a + b
}
