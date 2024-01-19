/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.medac;

/**
 *
 * @author Daniel Ojados
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancias de libros, revistas, usuarios y la biblioteca
        Libro libro = new Libro("123456", "Java Programming", "John Doe", 2020, 500);
        Revista revista = new Revista("789012", "Science Journal", "Jane Smith", 2021, 30);

        Usuario estudiante = new Estudiante("Juan", "Perez", "ID123", "Grado");
        Usuario profesor = new Profesor("Maria", "Gomez", "ID456", "Departamento de Informática");

        Biblioteca biblioteca = new Biblioteca();

        // Realizar préstamos y devoluciones
        biblioteca.prestarMaterial(libro, estudiante, LocalDate.now());
        biblioteca.prestarMaterial(revista, profesor, LocalDate.now());

        biblioteca.mostrarInformacionPrestamos();

        biblioteca.devolverMaterial(libro, LocalDate.now());

        biblioteca.mostrarInformacionPrestamos();
    }
    
}
