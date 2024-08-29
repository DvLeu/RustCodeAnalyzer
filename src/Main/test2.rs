fn main() {
    let temperature = 5;

    if temperature < 0 {
        println!("Temperatura bajo 0 grados");
    } else if temperature == 0 {
        println!("Temperatura en los 0 grados");
    } else {
        println!("Temperatura arriba de los 0 grados");
    }
}
