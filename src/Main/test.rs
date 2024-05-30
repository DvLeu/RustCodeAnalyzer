fn main() {
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
