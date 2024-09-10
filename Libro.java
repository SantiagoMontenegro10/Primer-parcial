public class Libro {
    private String titulo;
    private String autor;
    private int precio;


public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = 0;
    }


public String getTitulo() {
        return titulo;
    }

public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

public String getAutor() {
        return autor;
    }

public void setAutor(String autor) {
        this.autor = autor;
    }

public int getPrecio() {
        return precio;
    }

public void setPrecio(int precio) {
        this.precio = precio;
    }


public void visualizar() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Precio: " + precio);
    }


}

