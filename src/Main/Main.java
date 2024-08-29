package Main;

import Analizador.ParseException;
import Analizador.Sintaxis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\chapu\\IdeaProjects\\Rust-Parser\\src\\Main\\test.txt";

        try {
            InputStream inputStream = new FileInputStream(filePath);
            Sintaxis parser = new Sintaxis(inputStream);

            try {
                parser.Program();
                System.out.println("La sintaxis del archivo es correcta.");
            } catch (ParseException e) {
                System.out.println("Error de sintaxis: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró");
        }
    }}