fn main() {
    for number in 1..=10 {
        if number % 2 == 0 {
            println!("{} es par", number);
        } else {
            println!("{} es impar", number);
        }
    }
}
