package Main;

import Analizador.ParseException;
import Analizador.Sintaxis;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        // Crear un explorador de archivos
        JFileChooser fileChooser = new JFileChooser();

        // Configurar para que abra en la raíz del proyecto
        File projectDir = new File(System.getProperty("user.dir"));
        fileChooser.setCurrentDirectory(projectDir);

        // Opcional: Filtrar por archivos .rs (Rust)
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Rust files", "rs");
        fileChooser.setFileFilter(filter);

        // Mostrar el diálogo de abrir archivo
        int result = fileChooser.showOpenDialog(null);

        // Si el usuario selecciona un archivo, obtener la ruta
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            try {
                InputStream inputStream = new FileInputStream(filePath);
                Sintaxis parser = new Sintaxis(inputStream);

                try {
                    parser.Program();
                    JOptionPane.showMessageDialog(null, "La sintaxis del archivo es correcta.");
                    System.out.println("La sintaxis del archivo es correcta.");
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(null, "Error de sintaxis: " + e.getMessage());
                    System.out.println("Error de sintaxis: " + e.getMessage());
                }
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "El archivo no se encontró");
                System.out.println("El archivo no se encontró");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo.");
            System.out.println("No se seleccionó ningún archivo.");
        }
    }
}
