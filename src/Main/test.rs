fn main() {
    let x: i32 = 10;
    let y: f64 = 20.5;
    let is_true: bool = true;

    if x < 20 {
        println!("x is less than 20");
    } else {
        println!("x is greater than or equal to 20");
    }

    print_values(x, y, is_true);
}

fn print_values(a: i32, b: f64, c: bool) {
    println!("Integer value: {}", a);
    println!("Float value: {}", b);
    println!("Boolean value: {}", c);
}
