public class LibroTexto extends Libro {
private String curso;

public LibroTexto(String titulo, String autor, String curso) {
    super(titulo, autor);
    this.curso = curso;
    }

public String getCurso() {
    return curso;
    }

public void setCurso(String curso) {
    this.curso = curso;
    }

public void visualizar() {
    super.visualizar();
    System.out.println("Curso: " + curso);
    }
}