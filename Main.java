public class Main {
public static void main(String[] args) {

    Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
    libro.setPrecio(50000);
    libro.visualizar();
    
    System.out.println();
    
    
    LibroTexto libroTexto = new LibroTexto("Matemáticas Avanzadas", "James Stewart", "Cálculo");
    libroTexto.setPrecio(60000);
    libroTexto.visualizar();
    
    System.out.println();
    
    
    LibroTextoIUAJC libroTextoIU = new LibroTextoIUAJC("Física", "Enrico Fermi", "Física", "Ingeniería");
    libroTextoIU.setPrecio(65000);
    libroTextoIU.visualizar();
    
    System.out.println();
    
    
    Novela novela = new Novela("1984", "George Orwell", "Ciencia Ficción");
    novela.setPrecio(40000);
    novela.visualizar();
    
    
    }
    }
    